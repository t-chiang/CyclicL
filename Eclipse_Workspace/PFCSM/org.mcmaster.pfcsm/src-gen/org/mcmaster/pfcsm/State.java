/**
 */
package org.mcmaster.pfcsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.State#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.State#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.State#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.pfcsm.PfcsmPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Transition}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getState_Outgoing()
	 * @see org.mcmaster.pfcsm.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.pfcsm.Transition}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.pfcsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getState_Incoming()
	 * @see org.mcmaster.pfcsm.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getState_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.State#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getState_IsInitial()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.State#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see org.mcmaster.pfcsm.PfcsmPackage#getState_IsFinal()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link org.mcmaster.pfcsm.State#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

} // State
