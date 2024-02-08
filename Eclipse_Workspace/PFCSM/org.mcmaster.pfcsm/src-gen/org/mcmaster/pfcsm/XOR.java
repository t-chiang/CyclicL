/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XOR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.XOR#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.XOR#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getXOR()
 * @model
 * @generated
 */
public interface XOR extends Reference {

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesClass#getXorfrom <em>Xorfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(DesClass)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getXOR_Tgt()
	 * @see org.mcmaster.pfcsm.DesClass#getXorfrom
	 * @model opposite="xorfrom" required="true"
	 * @generated
	 */
	DesClass getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.XOR#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(DesClass value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesClass#getXorto <em>Xorto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(DesClass)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getXOR_Src()
	 * @see org.mcmaster.pfcsm.DesClass#getXorto
	 * @model opposite="xorto" required="true"
	 * @generated
	 */
	DesClass getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.XOR#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(DesClass value);
} // XOR
