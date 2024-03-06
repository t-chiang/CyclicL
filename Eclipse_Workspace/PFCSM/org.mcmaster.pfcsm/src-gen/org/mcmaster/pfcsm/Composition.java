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
 *   <li>{@link org.mcmaster.pfcsm.Composition#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Composition#getTgt <em>Tgt</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesignEntity#getOwnerof <em>Ownerof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(DesignEntity)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getComposition_Src()
	 * @see org.mcmaster.pfcsm.DesignEntity#getOwnerof
	 * @model opposite="ownerof" required="true"
	 * @generated
	 */
	DesignEntity getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Composition#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(DesignEntity value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesignEntity#getOwnedby <em>Ownedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(DesignEntity)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getComposition_Tgt()
	 * @see org.mcmaster.pfcsm.DesignEntity#getOwnedby
	 * @model opposite="ownedby" required="true"
	 * @generated
	 */
	DesignEntity getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Composition#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(DesignEntity value);
} // Composition
