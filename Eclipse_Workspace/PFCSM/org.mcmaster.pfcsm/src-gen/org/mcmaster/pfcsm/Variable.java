/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Variable#getType <em>Type</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Variable#getStructure <em>Structure</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mcmaster.pfcsm.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mcmaster.pfcsm.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mcmaster.pfcsm.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mcmaster.pfcsm.DataStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' attribute.
	 * @see org.mcmaster.pfcsm.DataStructure
	 * @see #setStructure(DataStructure)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getVariable_Structure()
	 * @model required="true"
	 * @generated
	 */
	DataStructure getStructure();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Variable#getStructure <em>Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' attribute.
	 * @see org.mcmaster.pfcsm.DataStructure
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(DataStructure value);

} // Variable
