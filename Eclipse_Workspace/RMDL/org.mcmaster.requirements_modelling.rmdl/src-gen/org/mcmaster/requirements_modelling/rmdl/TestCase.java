/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getID <em>ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getType <em>Type</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_root <em>Requirement root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#isHasPassed <em>Has Passed</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mcmaster.requirements_modelling.rmdl.TestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestType
	 * @see #setType(TestType)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_Type()
	 * @model required="true"
	 * @generated
	 */
	TestType getType();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestType
	 * @see #getType()
	 * @generated
	 */
	void setType(TestType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Requirement root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement root</em>' container reference.
	 * @see #setRequirement_root(Requirement_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_Requirement_root()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getTestcase
	 * @model opposite="testcase" required="true" transient="false"
	 * @generated
	 */
	Requirement_Root getRequirement_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_root <em>Requirement root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement root</em>' container reference.
	 * @see #getRequirement_root()
	 * @generated
	 */
	void setRequirement_root(Requirement_Root value);

	/**
	 * Returns the value of the '<em><b>Has Passed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Passed</em>' attribute.
	 * @see #setHasPassed(boolean)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_HasPassed()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isHasPassed();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#isHasPassed <em>Has Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Passed</em>' attribute.
	 * @see #isHasPassed()
	 * @generated
	 */
	void setHasPassed(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirements}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_Requirements()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getTestcase
	 * @model opposite="testcase" required="true"
	 * @generated
	 */
	EList<Requirements> getRequirements();

} // TestCase
