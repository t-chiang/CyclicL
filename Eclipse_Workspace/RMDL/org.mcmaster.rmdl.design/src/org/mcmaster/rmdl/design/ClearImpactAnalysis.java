package org.mcmaster.rmdl.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.mcmaster.requirements_modelling.rmdl.DesignElement;

public class ClearImpactAnalysis extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selection) {
		/*
		 * This section makes sure that the user selection is either the model root, or a set of DesignElement nodes
		 */
		if(selection.toArray()[0] instanceof DSemanticDiagram) {
			return true;
		}
		else {
			for(EObject s: selection) {
				if (!(((DSemanticDecorator) s).getTarget() instanceof DesignElement)) {
					return false;
				}
				else {
					continue;
				}
			}
		}
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selection, Map<String, Object> arg1) {
		/*
		 * This is the core execution of the class. It will again check the user selection and perform two different actions.
		 * If model root is selected (DSemanticDiagram) it will reset all DesignElement nodes to their default border.
		 * If a singular DesignElement node is selected it will reset just that DesignElement node to default border.
		 * If a set of DesignElement nodes have been selected it will reset the entire set to default border.
		 */
		System.out.println("-------------Start Clear Impact Analysis-------------");
		RGBValues newBorderColor = RGBValues.create(0, 0, 0);
		if(selection.toArray()[0] instanceof DSemanticDiagram) {
			var root = selection.toArray()[0];
			EList<DDiagramElement> dElements = ((DSemanticDiagram) root).getDiagramElements();
			for(DDiagramElement e: dElements) {
				var tempObj = (DSemanticDecorator) e;
				if(tempObj.getTarget() instanceof DesignElement) {
					((DNode) tempObj).getOwnedStyle().setBorderColor(newBorderColor);
					((DNode) tempObj).getOwnedStyle().setBorderSize(0);
					((DNode) tempObj).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
					((DNode) tempObj).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
				}
			}
		}
		else {
			if(selection.size() == 1 && ((DSemanticDecorator) selection.toArray()[0]).getTarget() instanceof DesignElement) {
				var dElement = (DSemanticDecorator) selection.toArray()[0];
				((DNode) dElement).getOwnedStyle().setBorderColor(newBorderColor);
				((DNode) dElement).getOwnedStyle().setBorderSize(0);
				((DNode) dElement).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
				((DNode) dElement).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
			}
			else {
				for (EObject s: selection) {
					if(((DSemanticDecorator) s).getTarget() instanceof DesignElement) {
						var dElement = (DSemanticDecorator) s;
						((DNode) dElement).getOwnedStyle().setBorderColor(newBorderColor);
						((DNode) dElement).getOwnedStyle().setBorderSize(0);
						((DNode) dElement).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
						((DNode) dElement).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
					}
					else {
						//If for whatever reason a type that isn't DesignElement gets through, this will throw exception to user.
						throw new IllegalArgumentException("Clear Impact Analysis does not work on type " + ((DSemanticDecorator) s).getTarget().eClass().getName());
					}
				}
			}
		}
		System.out.println("-------------End Clear Impact Analysis-------------");
	}

}
