/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.Operation#getState <em>State</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Operation#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Operation#isPublic <em>Public</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Operation#getOperationvariable <em>Operationvariable</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Operation#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.Operation#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Element {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperation_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperation_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mcmaster.pfcsm.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see org.mcmaster.pfcsm.PrimitiveType
	 * @see #setReturnType(PrimitiveType)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperation_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getReturnType();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Operation#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see org.mcmaster.pfcsm.PrimitiveType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' attribute.
	 * @see #setPublic(boolean)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperation_Public()
	 * @model required="true"
	 * @generated
	 */
	boolean isPublic();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.Operation#isPublic <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' attribute.
	 * @see #isPublic()
	 * @generated
	 */
	void setPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Operationvariable</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.OperationVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationvariable</em>' containment reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperation_Operationvariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationVariable> getOperationvariable();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.ClassVariable}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.ClassVariable#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperation_Uses()
	 * @see org.mcmaster.pfcsm.ClassVariable#getInput
	 * @model opposite="input"
	 * @generated
	 */
	EList<ClassVariable> getUses();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.ClassVariable}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.ClassVariable#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getOperation_Produces()
	 * @see org.mcmaster.pfcsm.ClassVariable#getOutput
	 * @model opposite="output"
	 * @generated
	 */
	EList<ClassVariable> getProduces();

} // Operation
