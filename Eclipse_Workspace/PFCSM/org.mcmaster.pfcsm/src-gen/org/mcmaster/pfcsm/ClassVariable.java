/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.ClassVariable#isPublic <em>Public</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.ClassVariable#getInput <em>Input</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.ClassVariable#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getClassVariable()
 * @model
 * @generated
 */
public interface ClassVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' attribute.
	 * @see #setPublic(boolean)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClassVariable_Public()
	 * @model required="true"
	 * @generated
	 */
	boolean isPublic();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.ClassVariable#isPublic <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' attribute.
	 * @see #isPublic()
	 * @generated
	 */
	void setPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Operation}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Operation#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClassVariable_Input()
	 * @see org.mcmaster.pfcsm.Operation#getUses
	 * @model opposite="uses"
	 * @generated
	 */
	EList<Operation> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Operation}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Operation#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getClassVariable_Output()
	 * @see org.mcmaster.pfcsm.Operation#getProduces
	 * @model opposite="produces"
	 * @generated
	 */
	EList<Operation> getOutput();

} // ClassVariable
