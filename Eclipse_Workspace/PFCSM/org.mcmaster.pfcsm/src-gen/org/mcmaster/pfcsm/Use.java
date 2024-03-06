/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Use#getSrcMult <em>Src Mult</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Use#getTgtMult <em>Tgt Mult</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Use#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Use#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getUse()
 * @model
 * @generated
 */
public interface Use extends Reference {
	/**
	 * Returns the value of the '<em><b>Src Mult</b></em>' attribute.
	 * The default value is <code>"1..1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Mult</em>' attribute.
	 * @see #setSrcMult(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getUse_SrcMult()
	 * @model default="1..1"
	 * @generated
	 */
	String getSrcMult();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Use#getSrcMult <em>Src Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Mult</em>' attribute.
	 * @see #getSrcMult()
	 * @generated
	 */
	void setSrcMult(String value);

	/**
	 * Returns the value of the '<em><b>Tgt Mult</b></em>' attribute.
	 * The default value is <code>"1..1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt Mult</em>' attribute.
	 * @see #setTgtMult(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getUse_TgtMult()
	 * @model default="1..1"
	 * @generated
	 */
	String getTgtMult();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Use#getTgtMult <em>Tgt Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt Mult</em>' attribute.
	 * @see #getTgtMult()
	 * @generated
	 */
	void setTgtMult(String value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesClass#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(DesClass)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getUse_Tgt()
	 * @see org.mcmaster.pfcsm.DesClass#getUses
	 * @model opposite="uses" required="true"
	 * @generated
	 */
	DesClass getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Use#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(DesClass value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesClass#getUsedby <em>Usedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(DesClass)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getUse_Src()
	 * @see org.mcmaster.pfcsm.DesClass#getUsedby
	 * @model opposite="usedby" required="true"
	 * @generated
	 */
	DesClass getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Use#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(DesClass value);

} // Use
