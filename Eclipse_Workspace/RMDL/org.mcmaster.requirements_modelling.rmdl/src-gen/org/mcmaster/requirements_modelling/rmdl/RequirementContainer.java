/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getOwnedRequirements <em>Owned Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getRequirement_canvas <em>Requirement canvas</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementContainer()
 * @model
 * @generated
 */
public interface RequirementContainer extends Requirements {
	/**
	 * Returns the value of the '<em><b>Owned Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.RequirementType}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementContainer <em>Requirement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirements</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementContainer_OwnedRequirements()
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementContainer
	 * @model opposite="requirementContainer" containment="true" lower="2"
	 * @generated
	 */
	EList<RequirementType> getOwnedRequirements();

	/**
	 * Returns the value of the '<em><b>Requirement canvas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirementcontainer <em>Requirementcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement canvas</em>' container reference.
	 * @see #setRequirement_canvas(Requirement_Canvas)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementContainer_Requirement_canvas()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirementcontainer
	 * @model opposite="requirementcontainer" transient="false"
	 * @generated
	 */
	Requirement_Canvas getRequirement_canvas();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getRequirement_canvas <em>Requirement canvas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement canvas</em>' container reference.
	 * @see #getRequirement_canvas()
	 * @generated
	 */
	void setRequirement_canvas(Requirement_Canvas value);

} // RequirementContainer
