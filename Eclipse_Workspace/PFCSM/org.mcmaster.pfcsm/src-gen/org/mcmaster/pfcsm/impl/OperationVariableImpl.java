/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcmaster.pfcsm.OperationVariable;
import org.mcmaster.pfcsm.PfcsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationVariableImpl#isLocal <em>Local</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationVariableImpl#getAssignedValue <em>Assigned Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationVariableImpl extends VariableImpl implements OperationVariable {
	/**
	 * The default value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected boolean local = LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignedValue() <em>Assigned Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedValue() <em>Assigned Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedValue()
	 * @generated
	 * @ordered
	 */
	protected String assignedValue = ASSIGNED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.OPERATION_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(boolean newLocal) {
		boolean oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.OPERATION_VARIABLE__LOCAL, oldLocal,
					local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignedValue() {
		return assignedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedValue(String newAssignedValue) {
		String oldAssignedValue = assignedValue;
		assignedValue = newAssignedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.OPERATION_VARIABLE__ASSIGNED_VALUE,
					oldAssignedValue, assignedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PfcsmPackage.OPERATION_VARIABLE__LOCAL:
			return isLocal();
		case PfcsmPackage.OPERATION_VARIABLE__ASSIGNED_VALUE:
			return getAssignedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PfcsmPackage.OPERATION_VARIABLE__LOCAL:
			setLocal((Boolean) newValue);
			return;
		case PfcsmPackage.OPERATION_VARIABLE__ASSIGNED_VALUE:
			setAssignedValue((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PfcsmPackage.OPERATION_VARIABLE__LOCAL:
			setLocal(LOCAL_EDEFAULT);
			return;
		case PfcsmPackage.OPERATION_VARIABLE__ASSIGNED_VALUE:
			setAssignedValue(ASSIGNED_VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PfcsmPackage.OPERATION_VARIABLE__LOCAL:
			return local != LOCAL_EDEFAULT;
		case PfcsmPackage.OPERATION_VARIABLE__ASSIGNED_VALUE:
			return ASSIGNED_VALUE_EDEFAULT == null ? assignedValue != null
					: !ASSIGNED_VALUE_EDEFAULT.equals(assignedValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (local: ");
		result.append(local);
		result.append(", assignedValue: ");
		result.append(assignedValue);
		result.append(')');
		return result.toString();
	}

} //OperationVariableImpl
