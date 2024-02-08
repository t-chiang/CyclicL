package org.mcmaster.pfcsm.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.mcmaster.pfcsm.Association;
import org.mcmaster.pfcsm.Composition;
import org.mcmaster.pfcsm.DesClass;
import org.mcmaster.pfcsm.Inheritance;
import org.mcmaster.pfcsm.Reference;
import org.mcmaster.pfcsm.XOR;

public class ClassChangeImpactAnalysis extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selection) {
		// TODO Auto-generated method stub
		if(selection.size() == 1) {
			if(((DSemanticDecorator) selection.toArray()[0]).getTarget() instanceof DesClass) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			for(EObject s: selection) {
				if(!(((DSemanticDecorator) s).getTarget() instanceof DesClass)){
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selection, Map<String, Object> arg1) {
		// TODO Auto-generated method stub
		System.out.println("-------------Start Change Impact Analysis-------------");
		for(EObject s: selection) {
			if(((DSemanticDecorator) s).getTarget() instanceof DesClass){
				Collection<Reference> refTgtList = ((DesClass) ((DSemanticDecorator) s).getTarget()).getReferenceTo();
				Collection<Reference> refSrcList = ((DesClass) ((DSemanticDecorator) s).getTarget()).getReferenceFrom();
				List<Association> assocTgtList = new ArrayList<>();
				List<Association> assocSrcList = new ArrayList<>();
				List<Inheritance> inheritParentOfList = new ArrayList<>();
				List<Composition> composParentOfList = new ArrayList<>();
				List<Composition> composChildOfList = new ArrayList<>();
				List<XOR> xorList = new ArrayList<>();
				for(Reference r : refSrcList) {
					switch(r.eClass().getName()) {
						case "Association":
							assocSrcList.add((Association) r);
							break;
//						case "Inheritance":
//							inheritList.add((Inheritance) r);
//							break;
						case "Composition":
							composChildOfList.add((Composition) r);
							break;
						case "XOR":
							xorList.add((XOR) r);
							break;
					}
				}
				for(Reference r : refTgtList) {
					switch(r.eClass().getName()) {
						case "Association":
							assocTgtList.add((Association) r);
							break;
						case "Inheritance":
							inheritParentOfList.add((Inheritance) r);
							break;
						case "Composition":
							composParentOfList.add((Composition) r);
							break;
						case "XOR":
							xorList.add((XOR) r);
							break;
					}
				}
//				System.out.println(assocSrcList);
				Iterator<? extends Association> assocSrcIt = assocSrcList.iterator();
				RGBValues newBorderColor = RGBValues.create(255, 0, 0);
				while(assocSrcIt.hasNext()) {
					DesClass tempObj = assocSrcIt.next().getSource();
					System.out.println(tempObj);
					Collection<EObject> tempClass = new EObjectQuery(tempObj).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
					System.out.println(tempClass.toArray()[0]);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderSize(3);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
					
				
				}
				
				
			}
			else {
				throw new IllegalArgumentException("Change Impact Analysis does not work on type " + ((DSemanticDecorator) s).getTarget().eClass().getName());
			}
		}
		
		
		
		System.out.println("-------------End Change Impact Analysis-------------");
	}

}
