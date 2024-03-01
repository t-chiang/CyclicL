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
import org.mcmaster.pfcsm.Uses;
import org.mcmaster.pfcsm.Composition;
import org.mcmaster.pfcsm.DesignEntity;
import org.mcmaster.pfcsm.Inheritance;
import org.mcmaster.pfcsm.XOR;

public class BackwardChangeImpactAnalysis extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selection) {
		// TODO Auto-generated method stub
		if(selection.size() == 1) {
			if(((DSemanticDecorator) selection.toArray()[0]).getTarget() instanceof DesignEntity) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			for(EObject s: selection) {
				if(!(((DSemanticDecorator) s).getTarget() instanceof DesignEntity)){
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selection, Map<String, Object> arg1) {
		// TODO Auto-generated method stub
		System.out.println("-------------Start Backward Change Impact Analysis-------------");
//		System.out.println(selection.toArray()[0].getClass().getName() == "org.eclipse.sirius.diagram.model.business.internal.spec.DNodeListSpec");
		RGBValues newBorderColor = RGBValues.create(255, 0, 0);
		for(EObject s: selection) {
			if(((DSemanticDecorator) s).getTarget() instanceof DesignEntity){
				List<Uses> assocSrcList = ((DesignEntity) ((DSemanticDecorator) s).getTarget()).getUses();
//				List<Inheritance> inheritChildrenList = ((DesignEntity) ((DSemanticDecorator) s).getTarget()).getChildren();
//				List<Composition> composOwnerOfList = ((DesignEntity) ((DSemanticDecorator) s).getTarget()).getOwnerof();
//				Composition composOwnedBy = ((DesignEntity) ((DSemanticDecorator) s).getTarget()).getOwnedby();
//				List<XOR> xorList = new ArrayList<>();
				
				Iterator<? extends Uses> assocSrcListIt = assocSrcList.iterator();
				
				while(assocSrcListIt.hasNext()) {
					DesignEntity tempObj = assocSrcListIt.next().getSrc();
					Collection<EObject> tempClass = new EObjectQuery(tempObj).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().setBorderSize(3);
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
					((DDiagramElementContainer) tempClass.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
					backwardImpactAnalysis(tempObj);
				}
			}
			else {
				throw new IllegalArgumentException("Change Impact Analysis does not work on type " + ((DSemanticDecorator) s).getTarget().eClass().getName());
			}
		}
		System.out.println("-------------End Backward Change Impact Analysis-------------");
	}

	public void backwardImpactAnalysis(DesignEntity entity) {
		// TODO Auto-generated method stub
		RGBValues newBorderColor = RGBValues.create(255, 0, 0);
		if(entity instanceof DesignEntity) {
			List<Uses> assocSrcList = entity.getUses();
//			List<Inheritance> inheritChildrenList = entity.getChildren();
//			List<Composition> composOwnerOfList = entity.getOwnerof();
//			Composition composOwnedBy = entity.getOwnedby();
//			List<XOR> xorList = new ArrayList<>();
			
			Iterator<? extends Uses> assocSrcListIt = assocSrcList.iterator();
			while(assocSrcListIt.hasNext()) {
				DesignEntity tempObj = assocSrcListIt.next().getSrc();
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

}
