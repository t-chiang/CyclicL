/**
 */
package org.mcmaster.pfcsm.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mcmaster.pfcsm.ClassVariable;
import org.mcmaster.pfcsm.Operation;
import org.mcmaster.pfcsm.PfcsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.ClassVariableImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ClassVariableImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ClassVariableImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassVariableImpl extends VariableImpl implements ClassVariable {
	/**
	 * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean public_ = PUBLIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.CLASS_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublic() {
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic(boolean newPublic) {
		boolean oldPublic = public_;
		public_ = newPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.CLASS_VARIABLE__PUBLIC, oldPublic,
					public_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList.ManyInverse<Operation>(Operation.class, this,
					PfcsmPackage.CLASS_VARIABLE__INPUT, PfcsmPackage.OPERATION__USES);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOutput() {
		if (output == null) {
			output = new EObjectWithInverseResolvingEList.ManyInverse<Operation>(Operation.class, this,
					PfcsmPackage.CLASS_VARIABLE__OUTPUT, PfcsmPackage.OPERATION__PRODUCES);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.CLASS_VARIABLE__INPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInput()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.CLASS_VARIABLE__OUTPUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutput()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.CLASS_VARIABLE__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.CLASS_VARIABLE__OUTPUT:
			return ((InternalEList<?>) getOutput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PfcsmPackage.CLASS_VARIABLE__PUBLIC:
			return isPublic();
		case PfcsmPackage.CLASS_VARIABLE__INPUT:
			return getInput();
		case PfcsmPackage.CLASS_VARIABLE__OUTPUT:
			return getOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PfcsmPackage.CLASS_VARIABLE__PUBLIC:
			setPublic((Boolean) newValue);
			return;
		case PfcsmPackage.CLASS_VARIABLE__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Operation>) newValue);
			return;
		case PfcsmPackage.CLASS_VARIABLE__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends Operation>) newValue);
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
		case PfcsmPackage.CLASS_VARIABLE__PUBLIC:
			setPublic(PUBLIC_EDEFAULT);
			return;
		case PfcsmPackage.CLASS_VARIABLE__INPUT:
			getInput().clear();
			return;
		case PfcsmPackage.CLASS_VARIABLE__OUTPUT:
			getOutput().clear();
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
		case PfcsmPackage.CLASS_VARIABLE__PUBLIC:
			return public_ != PUBLIC_EDEFAULT;
		case PfcsmPackage.CLASS_VARIABLE__INPUT:
			return input != null && !input.isEmpty();
		case PfcsmPackage.CLASS_VARIABLE__OUTPUT:
			return output != null && !output.isEmpty();
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
		result.append(" (public: ");
		result.append(public_);
		result.append(')');
		return result.toString();
	}

} //ClassVariableImpl
