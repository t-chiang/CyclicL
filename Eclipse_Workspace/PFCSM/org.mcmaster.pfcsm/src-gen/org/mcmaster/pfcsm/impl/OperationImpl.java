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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.pfcsm.ClassVariable;
import org.mcmaster.pfcsm.Operation;
import org.mcmaster.pfcsm.OperationVariable;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.PrimitiveType;
import org.mcmaster.pfcsm.State;
import org.mcmaster.pfcsm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#getState <em>State</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#isPublic <em>Public</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#getOperationvariable <em>Operationvariable</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.OperationImpl#getProduces <em>Produces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType RETURN_TYPE_EDEFAULT = PrimitiveType.STRING;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType returnType = RETURN_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getOperationvariable() <em>Operationvariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationvariable()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationVariable> operationvariable;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassVariable> uses;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassVariable> produces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, PfcsmPackage.OPERATION__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this,
					PfcsmPackage.OPERATION__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(PrimitiveType newReturnType) {
		PrimitiveType oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.OPERATION__RETURN_TYPE, oldReturnType,
					returnType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.OPERATION__PUBLIC, oldPublic, public_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationVariable> getOperationvariable() {
		if (operationvariable == null) {
			operationvariable = new EObjectContainmentEList<OperationVariable>(OperationVariable.class, this,
					PfcsmPackage.OPERATION__OPERATIONVARIABLE);
		}
		return operationvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassVariable> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList.ManyInverse<ClassVariable>(ClassVariable.class, this,
					PfcsmPackage.OPERATION__USES, PfcsmPackage.CLASS_VARIABLE__INPUT);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassVariable> getProduces() {
		if (produces == null) {
			produces = new EObjectWithInverseResolvingEList.ManyInverse<ClassVariable>(ClassVariable.class, this,
					PfcsmPackage.OPERATION__PRODUCES, PfcsmPackage.CLASS_VARIABLE__OUTPUT);
		}
		return produces;
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
		case PfcsmPackage.OPERATION__USES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUses()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.OPERATION__PRODUCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProduces()).basicAdd(otherEnd, msgs);
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
		case PfcsmPackage.OPERATION__STATE:
			return ((InternalEList<?>) getState()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.OPERATION__TRANSITION:
			return ((InternalEList<?>) getTransition()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.OPERATION__OPERATIONVARIABLE:
			return ((InternalEList<?>) getOperationvariable()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.OPERATION__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.OPERATION__PRODUCES:
			return ((InternalEList<?>) getProduces()).basicRemove(otherEnd, msgs);
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
		case PfcsmPackage.OPERATION__STATE:
			return getState();
		case PfcsmPackage.OPERATION__TRANSITION:
			return getTransition();
		case PfcsmPackage.OPERATION__RETURN_TYPE:
			return getReturnType();
		case PfcsmPackage.OPERATION__PUBLIC:
			return isPublic();
		case PfcsmPackage.OPERATION__OPERATIONVARIABLE:
			return getOperationvariable();
		case PfcsmPackage.OPERATION__USES:
			return getUses();
		case PfcsmPackage.OPERATION__PRODUCES:
			return getProduces();
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
		case PfcsmPackage.OPERATION__STATE:
			getState().clear();
			getState().addAll((Collection<? extends State>) newValue);
			return;
		case PfcsmPackage.OPERATION__TRANSITION:
			getTransition().clear();
			getTransition().addAll((Collection<? extends Transition>) newValue);
			return;
		case PfcsmPackage.OPERATION__RETURN_TYPE:
			setReturnType((PrimitiveType) newValue);
			return;
		case PfcsmPackage.OPERATION__PUBLIC:
			setPublic((Boolean) newValue);
			return;
		case PfcsmPackage.OPERATION__OPERATIONVARIABLE:
			getOperationvariable().clear();
			getOperationvariable().addAll((Collection<? extends OperationVariable>) newValue);
			return;
		case PfcsmPackage.OPERATION__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends ClassVariable>) newValue);
			return;
		case PfcsmPackage.OPERATION__PRODUCES:
			getProduces().clear();
			getProduces().addAll((Collection<? extends ClassVariable>) newValue);
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
		case PfcsmPackage.OPERATION__STATE:
			getState().clear();
			return;
		case PfcsmPackage.OPERATION__TRANSITION:
			getTransition().clear();
			return;
		case PfcsmPackage.OPERATION__RETURN_TYPE:
			setReturnType(RETURN_TYPE_EDEFAULT);
			return;
		case PfcsmPackage.OPERATION__PUBLIC:
			setPublic(PUBLIC_EDEFAULT);
			return;
		case PfcsmPackage.OPERATION__OPERATIONVARIABLE:
			getOperationvariable().clear();
			return;
		case PfcsmPackage.OPERATION__USES:
			getUses().clear();
			return;
		case PfcsmPackage.OPERATION__PRODUCES:
			getProduces().clear();
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
		case PfcsmPackage.OPERATION__STATE:
			return state != null && !state.isEmpty();
		case PfcsmPackage.OPERATION__TRANSITION:
			return transition != null && !transition.isEmpty();
		case PfcsmPackage.OPERATION__RETURN_TYPE:
			return returnType != RETURN_TYPE_EDEFAULT;
		case PfcsmPackage.OPERATION__PUBLIC:
			return public_ != PUBLIC_EDEFAULT;
		case PfcsmPackage.OPERATION__OPERATIONVARIABLE:
			return operationvariable != null && !operationvariable.isEmpty();
		case PfcsmPackage.OPERATION__USES:
			return uses != null && !uses.isEmpty();
		case PfcsmPackage.OPERATION__PRODUCES:
			return produces != null && !produces.isEmpty();
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
		result.append(" (returnType: ");
		result.append(returnType);
		result.append(", public: ");
		result.append(public_);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
