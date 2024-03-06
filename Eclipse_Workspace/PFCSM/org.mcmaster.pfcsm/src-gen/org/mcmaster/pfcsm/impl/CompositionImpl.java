/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mcmaster.pfcsm.Composition;
import org.mcmaster.pfcsm.DesignEntity;
import org.mcmaster.pfcsm.PfcsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.CompositionImpl#getTgtMult <em>Tgt Mult</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.CompositionImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.CompositionImpl#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends ReferenceImpl implements Composition {
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
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected DesignEntity src;
	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected DesignEntity tgt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.COMPOSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.COMPOSITION__TGT_MULT, oldTgtMult,
					tgtMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignEntity getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (DesignEntity) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.COMPOSITION__SRC, oldSrc,
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
	public DesignEntity basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(DesignEntity newSrc, NotificationChain msgs) {
		DesignEntity oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.COMPOSITION__SRC, oldSrc, newSrc);
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
	public void setSrc(DesignEntity newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, PfcsmPackage.DESIGN_ENTITY__OWNEROF,
						DesignEntity.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, PfcsmPackage.DESIGN_ENTITY__OWNEROF,
						DesignEntity.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.COMPOSITION__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignEntity getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (DesignEntity) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.COMPOSITION__TGT, oldTgt,
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
	public DesignEntity basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(DesignEntity newTgt, NotificationChain msgs) {
		DesignEntity oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.COMPOSITION__TGT, oldTgt, newTgt);
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
	public void setTgt(DesignEntity newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, PfcsmPackage.DESIGN_ENTITY__OWNEDBY,
						DesignEntity.class, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, PfcsmPackage.DESIGN_ENTITY__OWNEDBY,
						DesignEntity.class, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.COMPOSITION__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.COMPOSITION__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, PfcsmPackage.DESIGN_ENTITY__OWNEROF,
						DesignEntity.class, msgs);
			return basicSetSrc((DesignEntity) otherEnd, msgs);
		case PfcsmPackage.COMPOSITION__TGT:
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, PfcsmPackage.DESIGN_ENTITY__OWNEDBY,
						DesignEntity.class, msgs);
			return basicSetTgt((DesignEntity) otherEnd, msgs);
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
		case PfcsmPackage.COMPOSITION__SRC:
			return basicSetSrc(null, msgs);
		case PfcsmPackage.COMPOSITION__TGT:
			return basicSetTgt(null, msgs);
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
		case PfcsmPackage.COMPOSITION__TGT_MULT:
			return getTgtMult();
		case PfcsmPackage.COMPOSITION__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
		case PfcsmPackage.COMPOSITION__TGT:
			if (resolve)
				return getTgt();
			return basicGetTgt();
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
		case PfcsmPackage.COMPOSITION__TGT_MULT:
			setTgtMult((String) newValue);
			return;
		case PfcsmPackage.COMPOSITION__SRC:
			setSrc((DesignEntity) newValue);
			return;
		case PfcsmPackage.COMPOSITION__TGT:
			setTgt((DesignEntity) newValue);
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
		case PfcsmPackage.COMPOSITION__TGT_MULT:
			setTgtMult(TGT_MULT_EDEFAULT);
			return;
		case PfcsmPackage.COMPOSITION__SRC:
			setSrc((DesignEntity) null);
			return;
		case PfcsmPackage.COMPOSITION__TGT:
			setTgt((DesignEntity) null);
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
		case PfcsmPackage.COMPOSITION__TGT_MULT:
			return TGT_MULT_EDEFAULT == null ? tgtMult != null : !TGT_MULT_EDEFAULT.equals(tgtMult);
		case PfcsmPackage.COMPOSITION__SRC:
			return src != null;
		case PfcsmPackage.COMPOSITION__TGT:
			return tgt != null;
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
		result.append(" (tgtMult: ");
		result.append(tgtMult);
		result.append(')');
		return result.toString();
	}

} //CompositionImpl
