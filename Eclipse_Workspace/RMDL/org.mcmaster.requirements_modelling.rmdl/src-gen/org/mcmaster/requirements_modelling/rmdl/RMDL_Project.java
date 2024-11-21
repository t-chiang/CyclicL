/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RMDL Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Project#getFeature_model <em>Feature model</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Project#getRequirement_canvas <em>Requirement canvas</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRMDL_Project()
 * @model
 * @generated
 */
public interface RMDL_Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature model</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature_Model}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getRmdl_project <em>Rmdl project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature model</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRMDL_Project_Feature_model()
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model#getRmdl_project
	 * @model opposite="rmdl_project" containment="true"
	 * @generated
	 */
	EList<Feature_Model> getFeature_model();

	/**
	 * Returns the value of the '<em><b>Requirement canvas</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRmdl_project <em>Rmdl project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement canvas</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRMDL_Project_Requirement_canvas()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRmdl_project
	 * @model opposite="rmdl_project" containment="true"
	 * @generated
	 */
	EList<Requirement_Canvas> getRequirement_canvas();

} // RMDL_Project
