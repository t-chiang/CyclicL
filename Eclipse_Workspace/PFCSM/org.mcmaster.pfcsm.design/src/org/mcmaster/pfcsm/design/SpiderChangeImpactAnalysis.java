package org.mcmaster.pfcsm.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
import org.mcmaster.pfcsm.XOR;

public class SpiderChangeImpactAnalysis extends AbstractExternalJavaAction {
	
	int forwardCounter = 0;
	int backwardCounter = 0;

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
		System.out.println(selection.toArray()[0].getClass().getName() == "org.eclipse.sirius.diagram.model.business.internal.spec.DNodeListSpec");
		RGBValues newBorderColor = RGBValues.create(255, 0, 0);
		for(EObject s: selection) {
			if(((DSemanticDecorator) s).getTarget() instanceof DesClass){
				List<Association> assocTgtList = ((DesClass) ((DSemanticDecorator) s).getTarget()).getUsedby();
				List<Association> assocSrcList = ((DesClass) ((DSemanticDecorator) s).getTarget()).getUses();
				List<Inheritance> inheritChildrenList = ((DesClass) ((DSemanticDecorator) s).getTarget()).getChildren();
				List<Composition> composOwnerOfList = ((DesClass) ((DSemanticDecorator) s).getTarget()).getOwnerof();
				Composition composOwnedBy = ((DesClass) ((DSemanticDecorator) s).getTarget()).getOwnedby();
				List<XOR> xorList = new ArrayList<>();
				
				Iterator<? extends Association> assocSrcListIt = assocSrcList.iterator();
				Iterator<? extends Association> assocTgtListIt = assocTgtList.iterator();
				
				while(assocSrcListIt.hasNext()) {
					DesClass tempObj = assocSrcListIt.next().getSrc();
					Collection<EObject> tempClass = new EObjectQuery(tempObj).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderSize(3);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
					backwardImpactAnalysis(tempObj);
				}
				while(assocTgtListIt.hasNext()) {
					DesClass tempObj = assocTgtListIt.next().getTgt();
					Collection<EObject> tempClass = new EObjectQuery(tempObj).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderSize(3);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
					forwardImpactAnalysis(tempObj);
				}
				
				
			}
			else {
				throw new IllegalArgumentException("Change Impact Analysis does not work on type " + ((DSemanticDecorator) s).getTarget().eClass().getName());
			}

//			Collection<EObject> test = new EObjectQuery(s).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
//			System.out.println(((DDiagramElementContainer) test.toArray()[0]).getOwnedStyle().getBorderColor());
//			if(((DDiagramElementContainer) test.toArray()[0]).getOwnedStyle().getBorderColor() == newBorderColor )	
			
			
		}
		System.out.println("-------------End Change Impact Analysis-------------");
	}
	
	private void backwardImpactAnalysis(DesClass entity) {
		RGBValues newBorderColor = RGBValues.create(255, 0, 0);
		if(entity instanceof DesClass) {
			List<Association> assocSrcList = entity.getUses();
			List<Inheritance> inheritChildrenList = entity.getChildren();
			List<Composition> composOwnerOfList = entity.getOwnerof();
			Composition composOwnedBy = entity.getOwnedby();
			List<XOR> xorList = new ArrayList<>();
			
			Iterator<? extends Association> assocSrcListIt = assocSrcList.iterator();
			while(assocSrcListIt.hasNext()) {
				DesClass tempObj = assocSrcListIt.next().getSrc();
				System.out.println("Entity is: " + entity);
				System.out.println("tempObj is: " + tempObj);
				Collection<EObject> tempClass = new EObjectQuery(tempObj).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
				((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
				((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderSize(3);
				((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
				((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
				backwardImpactAnalysis(tempObj);
			}
		}
		else {
			throw new IllegalArgumentException("Change Impact Analysis does not work on type " + entity.eClass().getName());
		}
	}

	private void forwardImpactAnalysis(DesClass entity) {
		RGBValues newBorderColor = RGBValues.create(255, 0, 0);
		if(entity instanceof DesClass) {
			List<Association> assocTgtList = entity.getUsedby();
			List<Inheritance> inheritChildrenList = entity.getChildren();
			List<Composition> composOwnerOfList = entity.getOwnerof();
			Composition composOwnedBy = entity.getOwnedby();
			List<XOR> xorList = new ArrayList<>();
			
			Iterator<? extends Association> assocTgtListIt = assocTgtList.iterator();
			while(assocTgtListIt.hasNext()) {
				DesClass tempObj = assocTgtListIt.next().getTgt();
				Collection<EObject> tempClass = new EObjectQuery(tempObj).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
				((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
				((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderSize(3);
				((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
				((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
				forwardImpactAnalysis(tempObj);
			}
		}
		else {
			throw new IllegalArgumentException("Change Impact Analysis does not work on type " + entity.eClass().getName());
		}
	}
	

	
}
