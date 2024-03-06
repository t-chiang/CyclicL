/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mcmaster.pfcsm.Attribute;
import org.mcmaster.pfcsm.Operation;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Produces;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Produces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.ProducesImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ProducesImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ProducesImpl#getSrcMult <em>Src Mult</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ProducesImpl#getTgtMult <em>Tgt Mult</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProducesImpl extends ReferenceImpl implements Produces {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * The default value of the '{@link #getSrcMult() <em>Src Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcMult()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_MULT_EDEFAULT = "1..1";
	/**
	 * The cached value of the '{@link #getSrcMult() <em>Src Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcMult()
	 * @generated
	 * @ordered
	 */
	protected String srcMult = SRC_MULT_EDEFAULT;
	/**
	 * The default value of the '{@link #getTgtMult() <em>Tgt Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgtMult()
	 * @generated
	 * @ordered
	 */
	protected static final String TGT_MULT_EDEFAULT = "1..1";
	/**
	 * The cached value of the '{@link #getTgtMult() <em>Tgt Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgtMult()
	 * @generated
	 * @ordered
	 */
	protected String tgtMult = TGT_MULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProducesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.PRODUCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject) operation;
			operation = (Operation) eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.PRODUCES__OPERATION,
							oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.PRODUCES__OPERATION, oldOperation, newOperation);
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
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject) operation).eInverseRemove(this, PfcsmPackage.OPERATION__PRODUCES,
						Operation.class, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject) newOperation).eInverseAdd(this, PfcsmPackage.OPERATION__PRODUCES,
						Operation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.PRODUCES__OPERATION, newOperation,
					newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject) attribute;
			attribute = (Attribute) eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.PRODUCES__ATTRIBUTE,
							oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.PRODUCES__ATTRIBUTE, oldAttribute, newAttribute);
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
	public void setAttribute(Attribute newAttribute) {
		if (newAttribute != attribute) {
			NotificationChain msgs = null;
			if (attribute != null)
				msgs = ((InternalEObject) attribute).eInverseRemove(this, PfcsmPackage.ATTRIBUTE__PRODUCES,
						Attribute.class, msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject) newAttribute).eInverseAdd(this, PfcsmPackage.ATTRIBUTE__PRODUCES,
						Attribute.class, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.PRODUCES__ATTRIBUTE, newAttribute,
					newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcMult() {
		return srcMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcMult(String newSrcMult) {
		String oldSrcMult = srcMult;
		srcMult = newSrcMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.PRODUCES__SRC_MULT, oldSrcMult,
					srcMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTgtMult() {
		return tgtMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTgtMult(String newTgtMult) {
		String oldTgtMult = tgtMult;
		tgtMult = newTgtMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.PRODUCES__TGT_MULT, oldTgtMult,
					tgtMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.PRODUCES__OPERATION:
			if (operation != null)
				msgs = ((InternalEObject) operation).eInverseRemove(this, PfcsmPackage.OPERATION__PRODUCES,
						Operation.class, msgs);
			return basicSetOperation((Operation) otherEnd, msgs);
		case PfcsmPackage.PRODUCES__ATTRIBUTE:
			if (attribute != null)
				msgs = ((InternalEObject) attribute).eInverseRemove(this, PfcsmPackage.ATTRIBUTE__PRODUCES,
						Attribute.class, msgs);
			return basicSetAttribute((Attribute) otherEnd, msgs);
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
		case PfcsmPackage.PRODUCES__OPERATION:
			return basicSetOperation(null, msgs);
		case PfcsmPackage.PRODUCES__ATTRIBUTE:
			return basicSetAttribute(null, msgs);
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
		case PfcsmPackage.PRODUCES__OPERATION:
			if (resolve)
				return getOperation();
			return basicGetOperation();
		case PfcsmPackage.PRODUCES__ATTRIBUTE:
			if (resolve)
				return getAttribute();
			return basicGetAttribute();
		case PfcsmPackage.PRODUCES__SRC_MULT:
			return getSrcMult();
		case PfcsmPackage.PRODUCES__TGT_MULT:
			return getTgtMult();
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
		case PfcsmPackage.PRODUCES__OPERATION:
			setOperation((Operation) newValue);
			return;
		case PfcsmPackage.PRODUCES__ATTRIBUTE:
			setAttribute((Attribute) newValue);
			return;
		case PfcsmPackage.PRODUCES__SRC_MULT:
			setSrcMult((String) newValue);
			return;
		case PfcsmPackage.PRODUCES__TGT_MULT:
			setTgtMult((String) newValue);
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
		case PfcsmPackage.PRODUCES__OPERATION:
			setOperation((Operation) null);
			return;
		case PfcsmPackage.PRODUCES__ATTRIBUTE:
			setAttribute((Attribute) null);
			return;
		case PfcsmPackage.PRODUCES__SRC_MULT:
			setSrcMult(SRC_MULT_EDEFAULT);
			return;
		case PfcsmPackage.PRODUCES__TGT_MULT:
			setTgtMult(TGT_MULT_EDEFAULT);
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
		case PfcsmPackage.PRODUCES__OPERATION:
			return operation != null;
		case PfcsmPackage.PRODUCES__ATTRIBUTE:
			return attribute != null;
		case PfcsmPackage.PRODUCES__SRC_MULT:
			return SRC_MULT_EDEFAULT == null ? srcMult != null : !SRC_MULT_EDEFAULT.equals(srcMult);
		case PfcsmPackage.PRODUCES__TGT_MULT:
			return TGT_MULT_EDEFAULT == null ? tgtMult != null : !TGT_MULT_EDEFAULT.equals(tgtMult);
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
		result.append(" (srcMult: ");
		result.append(srcMult);
		result.append(", tgtMult: ");
		result.append(tgtMult);
		result.append(')');
		return result.toString();
	}

} //ProducesImpl
