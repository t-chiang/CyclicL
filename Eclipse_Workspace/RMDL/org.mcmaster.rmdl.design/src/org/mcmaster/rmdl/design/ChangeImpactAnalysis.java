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
		// TODO Auto-generated method stub
		System.out.println("-------------Start Change Impact Analysis-------------");
		for(EObject s: selection) {
			EList<DesignElement> dElements = ((Requirements) ((DSemanticDecorator) s).getTarget()).getTraceto();
			for (DesignElement d : dElements) {
				Collection<EObject> tempNode = new EObjectQuery(d).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
				RGBValues newBorderColor = RGBValues.create(255, 0, 0);
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
		System.out.println("-------------End Change Impact Analysis-------------");
	}

}
