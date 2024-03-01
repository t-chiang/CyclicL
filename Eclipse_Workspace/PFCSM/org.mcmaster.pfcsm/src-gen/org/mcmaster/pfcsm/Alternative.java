/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Alternative#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Alternative#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Alternative#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Reference {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"0..4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAlternative_Cardinality()
	 * @model default="0..4"
	 * @generated
	 */
	String getCardinality();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Alternative#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesignEntity#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(DesignEntity)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAlternative_Src()
	 * @see org.mcmaster.pfcsm.DesignEntity#getAlternative
	 * @model opposite="alternative"
	 * @generated
	 */
	DesignEntity getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Alternative#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(DesignEntity value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.DesignEntity#getAlternativeto <em>Alternativeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(DesignEntity)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAlternative_Tgt()
	 * @see org.mcmaster.pfcsm.DesignEntity#getAlternativeto
	 * @model opposite="alternativeto"
	 * @generated
	 */
	DesignEntity getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Alternative#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(DesignEntity value);

} // Alternative
