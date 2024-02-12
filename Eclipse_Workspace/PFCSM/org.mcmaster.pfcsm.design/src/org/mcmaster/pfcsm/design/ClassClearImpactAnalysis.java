package org.mcmaster.pfcsm.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.mcmaster.pfcsm.DesClass;

public class ClassClearImpactAnalysis extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selection, Map<String, Object> arg1) {
		// TODO Auto-generated method stub
		RGBValues newBorderColor = RGBValues.create(0, 0, 0);
		var root = selection.toArray()[0];
		EList<DDiagramElement> dElements = ((DSemanticDiagram) root).getDiagramElements();
		for(DDiagramElement e: dElements) {
			var tempObj = (DSemanticDecorator) e;
			if(tempObj.getTarget() instanceof DesClass) {
				((DDiagramElementContainer)  tempObj).getOwnedStyle().setBorderColor(newBorderColor);
				((DDiagramElementContainer) tempObj).getOwnedStyle().setBorderSize(1);
				((DDiagramElementContainer)  tempObj).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
				((DDiagramElementContainer)  tempObj).getOwnedStyle().getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE.getName());
			}
		}
	}

}
