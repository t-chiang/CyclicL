/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mcmaster.pfcsm.Association;
import org.mcmaster.pfcsm.Element;
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
 *   <li>{@link org.mcmaster.pfcsm.impl.AssociationImpl#getAscSrc <em>Asc Src</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.AssociationImpl#getAscTgt <em>Asc Tgt</em>}</li>
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
	 * The cached value of the '{@link #getAscSrc() <em>Asc Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscSrc()
	 * @generated
	 * @ordered
	 */
	protected Element ascSrc;
	/**
	 * The cached value of the '{@link #getAscTgt() <em>Asc Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscTgt()
	 * @generated
	 * @ordered
	 */
	protected Element ascTgt;

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
	public Element getAscSrc() {
		if (ascSrc != null && ascSrc.eIsProxy()) {
			InternalEObject oldAscSrc = (InternalEObject) ascSrc;
			ascSrc = (Element) eResolveProxy(oldAscSrc);
			if (ascSrc != oldAscSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.ASSOCIATION__ASC_SRC,
							oldAscSrc, ascSrc));
			}
		}
		return ascSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetAscSrc() {
		return ascSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAscSrc(Element newAscSrc, NotificationChain msgs) {
		Element oldAscSrc = ascSrc;
		ascSrc = newAscSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.ASSOCIATION__ASC_SRC, oldAscSrc, newAscSrc);
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
	public void setAscSrc(Element newAscSrc) {
		if (newAscSrc != ascSrc) {
			NotificationChain msgs = null;
			if (ascSrc != null)
				msgs = ((InternalEObject) ascSrc).eInverseRemove(this, PfcsmPackage.ELEMENT__ASSOCIATION_TO,
						Element.class, msgs);
			if (newAscSrc != null)
				msgs = ((InternalEObject) newAscSrc).eInverseAdd(this, PfcsmPackage.ELEMENT__ASSOCIATION_TO,
						Element.class, msgs);
			msgs = basicSetAscSrc(newAscSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.ASSOCIATION__ASC_SRC, newAscSrc,
					newAscSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getAscTgt() {
		if (ascTgt != null && ascTgt.eIsProxy()) {
			InternalEObject oldAscTgt = (InternalEObject) ascTgt;
			ascTgt = (Element) eResolveProxy(oldAscTgt);
			if (ascTgt != oldAscTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.ASSOCIATION__ASC_TGT,
							oldAscTgt, ascTgt));
			}
		}
		return ascTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetAscTgt() {
		return ascTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAscTgt(Element newAscTgt, NotificationChain msgs) {
		Element oldAscTgt = ascTgt;
		ascTgt = newAscTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.ASSOCIATION__ASC_TGT, oldAscTgt, newAscTgt);
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
	public void setAscTgt(Element newAscTgt) {
		if (newAscTgt != ascTgt) {
			NotificationChain msgs = null;
			if (ascTgt != null)
				msgs = ((InternalEObject) ascTgt).eInverseRemove(this, PfcsmPackage.ELEMENT__ASSOCIATION_FROM,
						Element.class, msgs);
			if (newAscTgt != null)
				msgs = ((InternalEObject) newAscTgt).eInverseAdd(this, PfcsmPackage.ELEMENT__ASSOCIATION_FROM,
						Element.class, msgs);
			msgs = basicSetAscTgt(newAscTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.ASSOCIATION__ASC_TGT, newAscTgt,
					newAscTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.ASSOCIATION__ASC_SRC:
			if (ascSrc != null)
				msgs = ((InternalEObject) ascSrc).eInverseRemove(this, PfcsmPackage.ELEMENT__ASSOCIATION_TO,
						Element.class, msgs);
			return basicSetAscSrc((Element) otherEnd, msgs);
		case PfcsmPackage.ASSOCIATION__ASC_TGT:
			if (ascTgt != null)
				msgs = ((InternalEObject) ascTgt).eInverseRemove(this, PfcsmPackage.ELEMENT__ASSOCIATION_FROM,
						Element.class, msgs);
			return basicSetAscTgt((Element) otherEnd, msgs);
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
		case PfcsmPackage.ASSOCIATION__ASC_SRC:
			return basicSetAscSrc(null, msgs);
		case PfcsmPackage.ASSOCIATION__ASC_TGT:
			return basicSetAscTgt(null, msgs);
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
		case PfcsmPackage.ASSOCIATION__ASC_SRC:
			if (resolve)
				return getAscSrc();
			return basicGetAscSrc();
		case PfcsmPackage.ASSOCIATION__ASC_TGT:
			if (resolve)
				return getAscTgt();
			return basicGetAscTgt();
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
		case PfcsmPackage.ASSOCIATION__ASC_SRC:
			setAscSrc((Element) newValue);
			return;
		case PfcsmPackage.ASSOCIATION__ASC_TGT:
			setAscTgt((Element) newValue);
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
		case PfcsmPackage.ASSOCIATION__ASC_SRC:
			setAscSrc((Element) null);
			return;
		case PfcsmPackage.ASSOCIATION__ASC_TGT:
			setAscTgt((Element) null);
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
		case PfcsmPackage.ASSOCIATION__ASC_SRC:
			return ascSrc != null;
		case PfcsmPackage.ASSOCIATION__ASC_TGT:
			return ascTgt != null;
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
