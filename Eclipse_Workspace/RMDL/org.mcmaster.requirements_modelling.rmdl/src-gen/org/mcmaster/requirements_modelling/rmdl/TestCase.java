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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getVerificationSrc <em>Verification Src</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getId <em>Id</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getType <em>Type</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getModelroot <em>Modelroot</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Verification Src</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Verification}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Verification#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Src</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_VerificationSrc()
	 * @see org.mcmaster.requirements_modelling.rmdl.Verification#getTestcase
	 * @model opposite="testcase"
	 * @generated
	 */
	EList<Verification> getVerificationSrc();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * Returns the value of the '<em><b>Modelroot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelroot</em>' container reference.
	 * @see #setModelroot(ModelRoot)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getTestCase_Modelroot()
	 * @see org.mcmaster.requirements_modelling.rmdl.ModelRoot#getTestcase
	 * @model opposite="testcase" required="true" transient="false"
	 * @generated
	 */
	ModelRoot getModelroot();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getModelroot <em>Modelroot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelroot</em>' container reference.
	 * @see #getModelroot()
	 * @generated
	 */
	void setModelroot(ModelRoot value);

} // TestCase
