package org.mcmaster.rmdl.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.mcmaster.requirements_modelling.rmdl.*;
import org.mcmaster.requirements_modelling.rmdl.Package;

public class ChangeImpactAnalysis extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selection) {
		// TODO Auto-generated method stub
		for(EObject s: selection) {
//			System.out.println(s.getClass());
			if (s instanceof DSemanticDiagram) {
				return false;
			}
			var obj = (DSemanticDecorator) s;
//			System.out.println(obj.getTarget() instanceof DesignElement);
			if(obj.getTarget() instanceof DesignElement) {
				return false;
			}
			if(obj.getTarget() instanceof TestCase) {
				return false;
			}
			if(obj.getTarget() instanceof Review) {
				return false;
			}
			if(obj.getTarget() instanceof Package) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selection, Map<String, Object> arg1) {
		// TODO Auto-generated method stub
		for(EObject s: selection) {
			EList<DesignElement> dElements = ((Requirements) ((DSemanticDecorator) s).getTarget()).getTraceto();
			EList<Review> reviews = ((Requirements) ((DSemanticDecorator) s).getTarget()).getReview();
			EList<TestCase> testcases = ((Requirements) ((DSemanticDecorator) s).getTarget()).getTestcase();
			for (DesignElement d : dElements) {
				System.out.println(d);
				Collection<EObject> tempNode = new EObjectQuery(d).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
//				DSemanticDecorator tempNode = (DSemanticDecorator) d;
				System.out.println(tempNode.toArray()[0]);
				RGBValues newBorderColor = RGBValues.create(255, 0, 0);
				//			DNode tempNode = (DNode) d;
				((DNode) tempNode.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
				((DNode) tempNode.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
			}
		}
//		Iterator<? extends EObject> iter = selections.iterator();
//		while(iter.hasNext()) {
//			var tempObj = ((DSemanticDecorator) iter.next()).getTarget();
//			((Requirements) tempObj).changeImpactAnalysis();
//		}
//		EList<DesignElement> dElements = this.traceto;
//		EList<Review> reviews = this.review;
//		EList<TestCase> testcases = this.testcase;
//		for (DesignElement d : dElements) {
//			System.out.println(d);
//			Collection<EObject> tempNode = new EObjectQuery(d).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
////			DSemanticDecorator tempNode = (DSemanticDecorator) d;
//			System.out.println(tempNode.toArray()[0]);
//			RGBValues newBorderColor = RGBValues.create(255, 0, 0);
//			//			DNode tempNode = (DNode) d;
//			((DNode) tempNode.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
//			((DNode) tempNode.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
//		}
	}

}
