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
import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.Review;
import org.mcmaster.requirements_modelling.rmdl.TestCase;

public class ReqChangeImpactAnalysis extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selection) {
		/*
		 * This section makes sure that the user selection is of type Requirements
		 */
		if (selection.toArray()[0] instanceof DSemanticDiagram) {
			return false;
		}
		else {
			for(EObject s: selection) {
				if (!(((DSemanticDecorator) s).getTarget() instanceof Requirements)) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selection, Map<String, Object> arg1) {
		/*
		 * This is the core execution of the class.
		 * If somehow an element in selection is not of type Requirement, it will throw an exception
		 * Otherwise the execution will get a list of all DesignElement nodes connected to a changed requirement.
		 * It will then iterate through the list to change all the borders to red to denote a potentially impacted node.
		 * It will then iterate through all requirements attached to a DesignElement and iterate through those requirements
		 * to change their attached TestCases and Reviews to false for global compliance of DesignElements to Requirements.
		 * This is a naive syntactic analysis for CIA. No semantic analysis performed here. 
		 */
		System.out.println("-------------Start Change Impact Analysis-------------");
		for(EObject s: selection) {
			if(((DSemanticDecorator) s).getTarget() instanceof Requirements) {
				EList<DesignElement> dElements = ((Requirements) ((DSemanticDecorator) s).getTarget()).getTraceto();
				for (DesignElement d : dElements) {
					Collection<EObject> tempNode = new EObjectQuery(d).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
					RGBValues newBorderColor = RGBValues.create(255, 0, 0);
					System.out.println(tempNode.toArray()[0]);
					((DNode) tempNode.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
					((DNode) tempNode.toArray()[0]).getOwnedStyle().setBorderSize(3);
					((DNode) tempNode.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
					((DNode) tempNode.toArray()[0]).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
				
					EList<Requirements> reqsList = d.getTracefrom();
					for(Requirements r: reqsList) {
						EList<Review> revList = r.getReview();
						EList<TestCase> testcaseList = r.getTestcase();
						for(Review rL: revList) {
							rL.setIsApproved(false);
						}
						for(TestCase t: testcaseList) {
							t.setHasPassed(false);
						}
					}
				}
			}
			else {
				throw new IllegalArgumentException("Change Impact Analysis does not work on type " + ((DSemanticDecorator) s).getTarget().eClass().getName());
			}
		}
		System.out.println("-------------End Change Impact Analysis-------------");
	}

}
