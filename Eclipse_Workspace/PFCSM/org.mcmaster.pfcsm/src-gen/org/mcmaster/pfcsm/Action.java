/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Action#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAction_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Action#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Action
