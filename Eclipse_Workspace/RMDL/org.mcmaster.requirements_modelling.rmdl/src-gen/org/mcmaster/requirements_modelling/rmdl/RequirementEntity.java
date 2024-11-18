/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getID <em>ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getReview <em>Review</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getTraceto <em>Traceto</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementEntity()
 * @model abstract="true"
 * @generated
 */
public interface RequirementEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementEntity_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementEntity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Review</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review</em>' reference.
	 * @see #setReview(Review)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementEntity_Review()
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getRequirements
	 * @model opposite="requirements"
	 * @generated
	 */
	Review getReview();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getReview <em>Review</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review</em>' reference.
	 * @see #getReview()
	 * @generated
	 */
	void setReview(Review value);

	/**
	 * Returns the value of the '<em><b>Testcase</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcase</em>' reference.
	 * @see #setTestcase(TestCase)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementEntity_Testcase()
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirements
	 * @model opposite="requirements"
	 * @generated
	 */
	TestCase getTestcase();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getTestcase <em>Testcase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testcase</em>' reference.
	 * @see #getTestcase()
	 * @generated
	 */
	void setTestcase(TestCase value);

	/**
	 * Returns the value of the '<em><b>Traceto</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getTracefrom <em>Tracefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceto</em>' reference.
	 * @see #setTraceto(DesignElement)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirementEntity_Traceto()
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getTracefrom
	 * @model opposite="tracefrom"
	 * @generated
	 */
	DesignElement getTraceto();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.RequirementEntity#getTraceto <em>Traceto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceto</em>' reference.
	 * @see #getTraceto()
	 * @generated
	 */
	void setTraceto(DesignElement value);

} // RequirementEntity
