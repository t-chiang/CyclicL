/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementContainer <em>Requirement Container</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getReplacedBy <em>Replaced By</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#isStartingReq <em>Starting Req</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirement_canvas <em>Requirement canvas</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementOrigin <em>Requirement Origin</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementVariant <em>Requirement Variant</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType()
 * @model abstract="true"
 * @generated
 */
public interface RequirementType extends Requirements {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_Specification()
	 * @model
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

	/**
	 * Returns the value of the '<em><b>Requirement Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getOwnedRequirements <em>Owned Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Container</em>' container reference.
	 * @see #setRequirementContainer(RequirementContainer)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_RequirementContainer()
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getOwnedRequirements
	 * @model opposite="ownedRequirements" transient="false"
	 * @generated
	 */
	RequirementContainer getRequirementContainer();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementContainer <em>Requirement Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Container</em>' container reference.
	 * @see #getRequirementContainer()
	 * @generated
	 */
	void setRequirementContainer(RequirementContainer value);

	/**
	 * Returns the value of the '<em><b>Replaced By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaced By</em>' reference.
	 * @see #setReplacedBy(RequirementType)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_ReplacedBy()
	 * @model
	 * @generated
	 */
	RequirementType getReplacedBy();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getReplacedBy <em>Replaced By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaced By</em>' reference.
	 * @see #getReplacedBy()
	 * @generated
	 */
	void setReplacedBy(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Starting Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Req</em>' attribute.
	 * @see #setStartingReq(boolean)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_StartingReq()
	 * @model
	 * @generated
	 */
	boolean isStartingReq();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#isStartingReq <em>Starting Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Req</em>' attribute.
	 * @see #isStartingReq()
	 * @generated
	 */
	void setStartingReq(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirement canvas</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement canvas</em>' container reference.
	 * @see #setRequirement_canvas(Requirement_Canvas)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_Requirement_canvas()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirements
	 * @model opposite="requirements" transient="false"
	 * @generated
	 */
	Requirement_Canvas getRequirement_canvas();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirement_canvas <em>Requirement canvas</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement canvas</em>' container reference.
	 * @see #getRequirement_canvas()
	 * @generated
	 */
	void setRequirement_canvas(Requirement_Canvas value);

	/**
	 * Returns the value of the '<em><b>Requirement Origin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementVariant <em>Requirement Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Origin</em>' reference.
	 * @see #setRequirementOrigin(RequirementType)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_RequirementOrigin()
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementVariant
	 * @model opposite="requirementVariant"
	 * @generated
	 */
	RequirementType getRequirementOrigin();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementOrigin <em>Requirement Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Origin</em>' reference.
	 * @see #getRequirementOrigin()
	 * @generated
	 */
	void setRequirementOrigin(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Requirement Variant</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.RequirementType}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementOrigin <em>Requirement Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Variant</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_RequirementVariant()
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementOrigin
	 * @model opposite="requirementOrigin"
	 * @generated
	 */
	EList<RequirementType> getRequirementVariant();

} // RequirementType
