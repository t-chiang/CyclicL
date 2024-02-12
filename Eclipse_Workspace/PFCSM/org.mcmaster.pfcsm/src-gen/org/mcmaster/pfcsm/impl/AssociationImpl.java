/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mcmaster.pfcsm.Association;
import org.mcmaster.pfcsm.DesClass;
import org.mcmaster.pfcsm.PfcsmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.AssociationImpl#getSrcMult <em>Src Mult</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.AssociationImpl#getTgtMult <em>Tgt Mult</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.AssociationImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.AssociationImpl#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends ReferenceImpl implements Association {
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
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected DesClass tgt;
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected DesClass src;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.ASSOCIATION__SRC_MULT, oldSrcMult,
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.ASSOCIATION__TGT_MULT, oldTgtMult,
					tgtMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesClass getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (DesClass) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.ASSOCIATION__TGT, oldTgt,
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
	public DesClass basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTgt(DesClass newTgt, NotificationChain msgs) {
		DesClass oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.ASSOCIATION__TGT, oldTgt, newTgt);
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
	public void setTgt(DesClass newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, PfcsmPackage.DES_CLASS__USES, DesClass.class, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, PfcsmPackage.DES_CLASS__USES, DesClass.class, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.ASSOCIATION__TGT, newTgt, newTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesClass getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (DesClass) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.ASSOCIATION__SRC, oldSrc,
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
	public DesClass basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrc(DesClass newSrc, NotificationChain msgs) {
		DesClass oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.ASSOCIATION__SRC, oldSrc, newSrc);
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
	public void setSrc(DesClass newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, PfcsmPackage.DES_CLASS__USEDBY, DesClass.class,
						msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, PfcsmPackage.DES_CLASS__USEDBY, DesClass.class,
						msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.ASSOCIATION__SRC, newSrc, newSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.ASSOCIATION__TGT:
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, PfcsmPackage.DES_CLASS__USES, DesClass.class, msgs);
			return basicSetTgt((DesClass) otherEnd, msgs);
		case PfcsmPackage.ASSOCIATION__SRC:
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, PfcsmPackage.DES_CLASS__USEDBY, DesClass.class,
						msgs);
			return basicSetSrc((DesClass) otherEnd, msgs);
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
		case PfcsmPackage.ASSOCIATION__TGT:
			return basicSetTgt(null, msgs);
		case PfcsmPackage.ASSOCIATION__SRC:
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
		case PfcsmPackage.ASSOCIATION__SRC_MULT:
			return getSrcMult();
		case PfcsmPackage.ASSOCIATION__TGT_MULT:
			return getTgtMult();
		case PfcsmPackage.ASSOCIATION__TGT:
			if (resolve)
				return getTgt();
			return basicGetTgt();
		case PfcsmPackage.ASSOCIATION__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
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
		case PfcsmPackage.ASSOCIATION__SRC_MULT:
			setSrcMult((String) newValue);
			return;
		case PfcsmPackage.ASSOCIATION__TGT_MULT:
			setTgtMult((String) newValue);
			return;
		case PfcsmPackage.ASSOCIATION__TGT:
			setTgt((DesClass) newValue);
			return;
		case PfcsmPackage.ASSOCIATION__SRC:
			setSrc((DesClass) newValue);
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
		case PfcsmPackage.ASSOCIATION__SRC_MULT:
			setSrcMult(SRC_MULT_EDEFAULT);
			return;
		case PfcsmPackage.ASSOCIATION__TGT_MULT:
			setTgtMult(TGT_MULT_EDEFAULT);
			return;
		case PfcsmPackage.ASSOCIATION__TGT:
			setTgt((DesClass) null);
			return;
		case PfcsmPackage.ASSOCIATION__SRC:
			setSrc((DesClass) null);
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
		case PfcsmPackage.ASSOCIATION__SRC_MULT:
			return SRC_MULT_EDEFAULT == null ? srcMult != null : !SRC_MULT_EDEFAULT.equals(srcMult);
		case PfcsmPackage.ASSOCIATION__TGT_MULT:
			return TGT_MULT_EDEFAULT == null ? tgtMult != null : !TGT_MULT_EDEFAULT.equals(tgtMult);
		case PfcsmPackage.ASSOCIATION__TGT:
			return tgt != null;
		case PfcsmPackage.ASSOCIATION__SRC:
			return src != null;
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

} //AssociationImpl
