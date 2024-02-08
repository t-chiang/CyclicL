/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Association#getSrcMult <em>Src Mult</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Association#getTgtMult <em>Tgt Mult</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Association#getAscSrc <em>Asc Src</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Association#getAscTgt <em>Asc Tgt</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Association#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Association#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Reference {

	/**
	 * Returns the value of the '<em><b>Src Mult</b></em>' attribute.
	 * The default value is <code>"1..1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Mult</em>' attribute.
	 * @see #setSrcMult(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation_SrcMult()
	 * @model default="1..1"
	 * @generated
	 */
	String getSrcMult();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Association#getSrcMult <em>Src Mult</em>}' attribute.
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
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation_TgtMult()
	 * @model default="1..1"
	 * @generated
	 */
	String getTgtMult();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Association#getTgtMult <em>Tgt Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt Mult</em>' attribute.
	 * @see #getTgtMult()
	 * @generated
	 */
	void setTgtMult(String value);

	/**
	 * Returns the value of the '<em><b>Asc Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Element#getUsedby <em>Usedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asc Src</em>' reference.
	 * @see #setAscSrc(Element)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation_AscSrc()
	 * @see org.mcmaster.pfcsm.Element#getUsedby
	 * @model opposite="usedby" required="true"
	 * @generated
	 */
	Element getAscSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Association#getAscSrc <em>Asc Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asc Src</em>' reference.
	 * @see #getAscSrc()
	 * @generated
	 */
	void setAscSrc(Element value);

	/**
	 * Returns the value of the '<em><b>Asc Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Element#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asc Tgt</em>' reference.
	 * @see #setAscTgt(Element)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation_AscTgt()
	 * @see org.mcmaster.pfcsm.Element#getUses
	 * @model opposite="uses" required="true"
	 * @generated
	 */
	Element getAscTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Association#getAscTgt <em>Asc Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asc Tgt</em>' reference.
	 * @see #getAscTgt()
	 * @generated
	 */
	void setAscTgt(Element value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesClass#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(DesClass)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation_Tgt()
	 * @see org.mcmaster.pfcsm.DesClass#getUses
	 * @model opposite="uses" required="true"
	 * @generated
	 */
	DesClass getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Association#getTgt <em>Tgt</em>}' reference.
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
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation_Src()
	 * @see org.mcmaster.pfcsm.DesClass#getUsedby
	 * @model opposite="usedby" required="true"
	 * @generated
	 */
	DesClass getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Association#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(DesClass value);
} // Association
