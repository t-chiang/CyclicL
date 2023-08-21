/**
 */
package org.mcmaster.pfcsm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.OperationVariable#isLocal <em>Local</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.OperationVariable#getAssignedValue <em>Assigned Value</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperationVariable()
 * @model
 * @generated
 */
public interface OperationVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(boolean)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperationVariable_Local()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.OperationVariable#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

	/**
	 * Returns the value of the '<em><b>Assigned Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Value</em>' attribute.
	 * @see #setAssignedValue(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperationVariable_AssignedValue()
	 * @model
	 * @generated
	 */
	String getAssignedValue();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.OperationVariable#getAssignedValue <em>Assigned Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Value</em>' attribute.
	 * @see #getAssignedValue()
	 * @generated
	 */
	void setAssignedValue(String value);

} // OperationVariable
