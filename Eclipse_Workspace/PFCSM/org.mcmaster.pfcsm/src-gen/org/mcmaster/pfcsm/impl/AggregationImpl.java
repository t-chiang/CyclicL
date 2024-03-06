/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcmaster.pfcsm.Aggregation;
import org.mcmaster.pfcsm.Hardware;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Software;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.AggregationImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.AggregationImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.AggregationImpl#getSrcMult <em>Src Mult</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationImpl extends ReferenceImpl implements Aggregation {
	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected Hardware tgt;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Software src;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (Hardware) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.AGGREGATION__TGT, oldTgt,
							tgt));
			}
		}
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(Hardware newTgt, NotificationChain msgs) {
		Hardware oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.AGGREGATION__TGT, oldTgt, newTgt);
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
	public void setTgt(Hardware newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, PfcsmPackage.HARDWARE__RUNS, Hardware.class, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, PfcsmPackage.HARDWARE__RUNS, Hardware.class, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.AGGREGATION__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (Software) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.AGGREGATION__SRC, oldSrc,
							src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(Software newSrc, NotificationChain msgs) {
		Software oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.AGGREGATION__SRC, oldSrc, newSrc);
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
	public void setSrc(Software newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, PfcsmPackage.SOFTWARE__RUNSON, Software.class,
						msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, PfcsmPackage.SOFTWARE__RUNSON, Software.class,
						msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.AGGREGATION__SRC, newSrc, newSrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.AGGREGATION__SRC_MULT, oldSrcMult,
					srcMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.AGGREGATION__TGT:
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, PfcsmPackage.HARDWARE__RUNS, Hardware.class, msgs);
			return basicSetTgt((Hardware) otherEnd, msgs);
		case PfcsmPackage.AGGREGATION__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, PfcsmPackage.SOFTWARE__RUNSON, Software.class,
						msgs);
			return basicSetSrc((Software) otherEnd, msgs);
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
		case PfcsmPackage.AGGREGATION__TGT:
			return basicSetTgt(null, msgs);
		case PfcsmPackage.AGGREGATION__SRC:
			return basicSetSrc(null, msgs);
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
		case PfcsmPackage.AGGREGATION__TGT:
			if (resolve)
				return getTgt();
			return basicGetTgt();
		case PfcsmPackage.AGGREGATION__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case PfcsmPackage.AGGREGATION__SRC_MULT:
			return getSrcMult();
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
		case PfcsmPackage.AGGREGATION__TGT:
			setTgt((Hardware) newValue);
			return;
		case PfcsmPackage.AGGREGATION__SRC:
			setSrc((Software) newValue);
			return;
		case PfcsmPackage.AGGREGATION__SRC_MULT:
			setSrcMult((String) newValue);
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
		case PfcsmPackage.AGGREGATION__TGT:
			setTgt((Hardware) null);
			return;
		case PfcsmPackage.AGGREGATION__SRC:
			setSrc((Software) null);
			return;
		case PfcsmPackage.AGGREGATION__SRC_MULT:
			setSrcMult(SRC_MULT_EDEFAULT);
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
		case PfcsmPackage.AGGREGATION__TGT:
			return tgt != null;
		case PfcsmPackage.AGGREGATION__SRC:
			return src != null;
		case PfcsmPackage.AGGREGATION__SRC_MULT:
			return SRC_MULT_EDEFAULT == null ? srcMult != null : !SRC_MULT_EDEFAULT.equals(srcMult);
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
		result.append(')');
		return result.toString();
	}

} //AggregationImpl
