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
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Element#getAssociationTo <em>Association To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asc Src</em>' reference.
	 * @see #setAscSrc(Element)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation_AscSrc()
	 * @see org.mcmaster.pfcsm.Element#getAssociationTo
	 * @model opposite="associationTo" required="true"
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
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Element#getAssociationFrom <em>Association From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asc Tgt</em>' reference.
	 * @see #setAscTgt(Element)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAssociation_AscTgt()
	 * @see org.mcmaster.pfcsm.Element#getAssociationFrom
	 * @model opposite="associationFrom" required="true"
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
} // Association
