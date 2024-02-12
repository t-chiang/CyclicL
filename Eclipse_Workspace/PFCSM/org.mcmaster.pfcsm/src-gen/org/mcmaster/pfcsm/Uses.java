/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Uses#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Uses#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getUses()
 * @model
 * @generated
 */
public interface Uses extends Association {

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Attribute#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getUses_Attribute()
	 * @see org.mcmaster.pfcsm.Attribute#getUses
	 * @model opposite="uses" required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Uses#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Operation#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getUses_Operation()
	 * @see org.mcmaster.pfcsm.Operation#getUses
	 * @model opposite="uses" required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Uses#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);
} // Uses
