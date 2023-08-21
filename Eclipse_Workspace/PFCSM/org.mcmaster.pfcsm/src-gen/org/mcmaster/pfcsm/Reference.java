/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Reference#getSource <em>Source</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Reference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Class#getReferenceTo <em>Reference To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.mcmaster.pfcsm.Class)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getReference_Source()
	 * @see org.mcmaster.pfcsm.Class#getReferenceTo
	 * @model opposite="referenceTo" required="true"
	 * @generated
	 */
	org.mcmaster.pfcsm.Class getSource();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Reference#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.mcmaster.pfcsm.Class value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Class#getReferenceFrom <em>Reference From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(org.mcmaster.pfcsm.Class)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getReference_Target()
	 * @see org.mcmaster.pfcsm.Class#getReferenceFrom
	 * @model opposite="referenceFrom" required="true"
	 * @generated
	 */
	org.mcmaster.pfcsm.Class getTarget();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Reference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(org.mcmaster.pfcsm.Class value);

} // Reference
