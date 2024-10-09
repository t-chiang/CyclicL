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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementcontainer <em>Requirementcontainer</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getReplacedby <em>Replacedby</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#isStartingReq <em>Starting Req</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirement_canvas <em>Requirement canvas</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getDependson <em>Dependson</em>}</li>
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
	 * Returns the value of the '<em><b>Requirementcontainer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getOwnedrequirements <em>Ownedrequirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirementcontainer</em>' container reference.
	 * @see #setRequirementcontainer(RequirementContainer)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_Requirementcontainer()
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getOwnedrequirements
	 * @model opposite="ownedrequirements" transient="false"
	 * @generated
	 */
	RequirementContainer getRequirementcontainer();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementcontainer <em>Requirementcontainer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirementcontainer</em>' container reference.
	 * @see #getRequirementcontainer()
	 * @generated
	 */
	void setRequirementcontainer(RequirementContainer value);

	/**
	 * Returns the value of the '<em><b>Replacedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacedby</em>' reference.
	 * @see #setReplacedby(RequirementType)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_Replacedby()
	 * @model
	 * @generated
	 */
	RequirementType getReplacedby();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getReplacedby <em>Replacedby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacedby</em>' reference.
	 * @see #getReplacedby()
	 * @generated
	 */
	void setReplacedby(RequirementType value);

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
	 * Returns the value of the '<em><b>Dependson</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependson</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementType_Dependson()
	 * @model
	 * @generated
	 */
	EList<FeatureEntity> getDependson();

} // RequirementType
