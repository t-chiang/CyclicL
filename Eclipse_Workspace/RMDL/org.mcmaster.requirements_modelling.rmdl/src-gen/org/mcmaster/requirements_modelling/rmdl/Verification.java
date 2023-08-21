/**
 */
package org.mcmaster.requirements_modelling.rmdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Verification#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Verification#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getVerification()
 * @model
 * @generated
 */
public interface Verification extends Reference {
	/**
	 * Returns the value of the '<em><b>Testcase</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getVerificationSrc <em>Verification Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcase</em>' reference.
	 * @see #setTestcase(TestCase)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getVerification_Testcase()
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getVerificationSrc
	 * @model opposite="verificationSrc" required="true"
	 * @generated
	 */
	TestCase getTestcase();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Verification#getTestcase <em>Testcase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testcase</em>' reference.
	 * @see #getTestcase()
	 * @generated
	 */
	void setTestcase(TestCase value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Entity#getVerificationTgt <em>Verification Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getVerification_Entity()
	 * @see org.mcmaster.requirements_modelling.rmdl.Entity#getVerificationTgt
	 * @model opposite="verificationTgt" required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Verification#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Verification
