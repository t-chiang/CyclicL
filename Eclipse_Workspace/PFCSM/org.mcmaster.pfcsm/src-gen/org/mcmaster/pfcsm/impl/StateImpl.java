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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.pfcsm.Action;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.State;
import org.mcmaster.pfcsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.StateImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.StateImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.StateImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					PfcsmPackage.STATE__OUTGOING, PfcsmPackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this,
					PfcsmPackage.STATE__INCOMING, PfcsmPackage.TRANSITION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PfcsmPackage.STATE__ACTION,
					oldAction, newAction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject) action).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PfcsmPackage.STATE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject) newAction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PfcsmPackage.STATE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.STATE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInitial() {
		return isInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.STATE__IS_INITIAL, oldIsInitial,
					isInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.STATE__IS_FINAL, oldIsFinal, isFinal));
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
		case PfcsmPackage.STATE__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.STATE__INCOMING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncoming()).basicAdd(otherEnd, msgs);
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
		case PfcsmPackage.STATE__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.STATE__INCOMING:
			return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.STATE__ACTION:
			return basicSetAction(null, msgs);
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
		case PfcsmPackage.STATE__OUTGOING:
			return getOutgoing();
		case PfcsmPackage.STATE__INCOMING:
			return getIncoming();
		case PfcsmPackage.STATE__NAME:
			return getName();
		case PfcsmPackage.STATE__IS_INITIAL:
			return isIsInitial();
		case PfcsmPackage.STATE__IS_FINAL:
			return isIsFinal();
		case PfcsmPackage.STATE__ACTION:
			return getAction();
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
		case PfcsmPackage.STATE__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends Transition>) newValue);
			return;
		case PfcsmPackage.STATE__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends Transition>) newValue);
			return;
		case PfcsmPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case PfcsmPackage.STATE__IS_INITIAL:
			setIsInitial((Boolean) newValue);
			return;
		case PfcsmPackage.STATE__IS_FINAL:
			setIsFinal((Boolean) newValue);
			return;
		case PfcsmPackage.STATE__ACTION:
			setAction((Action) newValue);
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
		case PfcsmPackage.STATE__OUTGOING:
			getOutgoing().clear();
			return;
		case PfcsmPackage.STATE__INCOMING:
			getIncoming().clear();
			return;
		case PfcsmPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PfcsmPackage.STATE__IS_INITIAL:
			setIsInitial(IS_INITIAL_EDEFAULT);
			return;
		case PfcsmPackage.STATE__IS_FINAL:
			setIsFinal(IS_FINAL_EDEFAULT);
			return;
		case PfcsmPackage.STATE__ACTION:
			setAction((Action) null);
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
		case PfcsmPackage.STATE__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
		case PfcsmPackage.STATE__INCOMING:
			return incoming != null && !incoming.isEmpty();
		case PfcsmPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PfcsmPackage.STATE__IS_INITIAL:
			return isInitial != IS_INITIAL_EDEFAULT;
		case PfcsmPackage.STATE__IS_FINAL:
			return isFinal != IS_FINAL_EDEFAULT;
		case PfcsmPackage.STATE__ACTION:
			return action != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isInitial: ");
		result.append(isInitial);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(')');
		return result.toString();
	}

} //StateImpl
