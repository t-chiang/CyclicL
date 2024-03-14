/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RMDL Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Root#getFeature_model <em>Feature model</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Root#getRequirement_diagram <em>Requirement diagram</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRMDL_Root()
 * @model
 * @generated
 */
public interface RMDL_Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature model</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Feature_Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature model</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRMDL_Root_Feature_model()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature_Model> getFeature_model();

	/**
	 * Returns the value of the '<em><b>Requirement diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement diagram</em>' containment reference.
	 * @see #setRequirement_diagram(Requirement_Diagram)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRMDL_Root_Requirement_diagram()
	 * @model containment="true"
	 * @generated
	 */
	Requirement_Diagram getRequirement_diagram();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Root#getRequirement_diagram <em>Requirement diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement diagram</em>' containment reference.
	 * @see #getRequirement_diagram()
	 * @generated
	 */
	void setRequirement_diagram(Requirement_Diagram value);

} // RMDL_Root
