/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Aggregation#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Aggregation#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Aggregation#getSrcMult <em>Src Mult</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getAggregation()
 * @model
 * @generated
 */
public interface Aggregation extends Reference {

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Hardware#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(Hardware)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAggregation_Tgt()
	 * @see org.mcmaster.pfcsm.Hardware#getRuns
	 * @model opposite="runs" required="true"
	 * @generated
	 */
	Hardware getTgt();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Aggregation#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(Hardware value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Software#getRunson <em>Runson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Software)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAggregation_Src()
	 * @see org.mcmaster.pfcsm.Software#getRunson
	 * @model opposite="runson" required="true"
	 * @generated
	 */
	Software getSrc();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Aggregation#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Software value);

	/**
	 * Returns the value of the '<em><b>Src Mult</b></em>' attribute.
	 * The default value is <code>"1..1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Mult</em>' attribute.
	 * @see #setSrcMult(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getAggregation_SrcMult()
	 * @model default="1..1"
	 * @generated
	 */
	String getSrcMult();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Aggregation#getSrcMult <em>Src Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Mult</em>' attribute.
	 * @see #getSrcMult()
	 * @generated
	 */
	void setSrcMult(String value);
} // Aggregation
