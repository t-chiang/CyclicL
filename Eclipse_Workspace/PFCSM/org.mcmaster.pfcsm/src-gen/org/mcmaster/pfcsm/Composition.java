/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Composition#getTgtMult <em>Tgt Mult</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Reference {

	/**
	 * Returns the value of the '<em><b>Tgt Mult</b></em>' attribute.
	 * The default value is <code>"1..1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt Mult</em>' attribute.
	 * @see #setTgtMult(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getComposition_TgtMult()
	 * @model default="1..1"
	 * @generated
	 */
	String getTgtMult();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Composition#getTgtMult <em>Tgt Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt Mult</em>' attribute.
	 * @see #getTgtMult()
	 * @generated
	 */
	void setTgtMult(String value);
} // Composition
