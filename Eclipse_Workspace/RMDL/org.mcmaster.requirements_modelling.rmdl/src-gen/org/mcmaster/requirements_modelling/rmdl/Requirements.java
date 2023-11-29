/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getID <em>ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getVerifyMethod <em>Verify Method</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getRequirement_root <em>Requirement root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getSatisfiedby <em>Satisfiedby</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getReview <em>Review</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getTestcase <em>Testcase</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements()
 * @model abstract="true"
 * @generated
 */
public interface Requirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Method</em>' attribute.
	 * @see #setVerifyMethod(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements_VerifyMethod()
	 * @model required="true"
	 * @generated
	 */
	String getVerifyMethod();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getVerifyMethod <em>Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Method</em>' attribute.
	 * @see #getVerifyMethod()
	 * @generated
	 */
	void setVerifyMethod(String value);

	/**
	 * Returns the value of the '<em><b>Requirement root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement root</em>' container reference.
	 * @see #setRequirement_root(Requirement_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements_Requirement_root()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getRequirements
	 * @model opposite="requirements" required="true" transient="false"
	 * @generated
	 */
	Requirement_Root getRequirement_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getRequirement_root <em>Requirement root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement root</em>' container reference.
	 * @see #getRequirement_root()
	 * @generated
	 */
	void setRequirement_root(Requirement_Root value);

	/**
	 * Returns the value of the '<em><b>Satisfiedby</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.DesignElement}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfiedby</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements_Satisfiedby()
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getSatisfies
	 * @model opposite="satisfies" required="true"
	 * @generated
	 */
	EList<DesignElement> getSatisfiedby();

	/**
	 * Returns the value of the '<em><b>Review</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Review}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements_Review()
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getRequirements
	 * @model opposite="requirements" required="true"
	 * @generated
	 */
	EList<Review> getReview();

	/**
	 * Returns the value of the '<em><b>Testcase</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.TestCase}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcase</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getRequirements_Testcase()
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirements
	 * @model opposite="requirements" required="true"
	 * @generated
	 */
	EList<TestCase> getTestcase();

} // Requirements
