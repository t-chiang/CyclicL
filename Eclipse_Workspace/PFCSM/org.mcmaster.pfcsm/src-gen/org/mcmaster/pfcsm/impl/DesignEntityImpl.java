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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.pfcsm.Alternative;
import org.mcmaster.pfcsm.Composition;
import org.mcmaster.pfcsm.DesignEntity;
import org.mcmaster.pfcsm.Element;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Uses;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getUsedby <em>Usedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getOwnerof <em>Ownerof</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getOwnedby <em>Ownedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesignEntityImpl#getAlternativeto <em>Alternativeto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignEntityImpl extends MinimalEObjectImpl.Container implements DesignEntity {
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
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> element;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedby() <em>Usedby</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedby()
	 * @generated
	 * @ordered
	 */
	protected EList<Uses> usedby;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Uses> uses;

	/**
	 * The cached value of the '{@link #getOwnerof() <em>Ownerof</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerof()
	 * @generated
	 * @ordered
	 */
	protected EList<Composition> ownerof;

	/**
	 * The cached value of the '{@link #getOwnedby() <em>Ownedby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedby()
	 * @generated
	 * @ordered
	 */
	protected Composition ownedby;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected DesignEntity parent;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignEntity> children;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<Alternative> alternative;

	/**
	 * The cached value of the '{@link #getAlternativeto() <em>Alternativeto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeto()
	 * @generated
	 * @ordered
	 */
	protected EList<Alternative> alternativeto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.DESIGN_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DESIGN_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, PfcsmPackage.DESIGN_ENTITY__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DESIGN_ENTITY__IS_ABSTRACT,
					oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uses> getUsedby() {
		if (usedby == null) {
			usedby = new EObjectWithInverseResolvingEList<Uses>(Uses.class, this, PfcsmPackage.DESIGN_ENTITY__USEDBY,
					PfcsmPackage.USES__TGT);
		}
		return usedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uses> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList<Uses>(Uses.class, this, PfcsmPackage.DESIGN_ENTITY__USES,
					PfcsmPackage.USES__SRC);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getOwnerof() {
		if (ownerof == null) {
			ownerof = new EObjectWithInverseResolvingEList<Composition>(Composition.class, this,
					PfcsmPackage.DESIGN_ENTITY__OWNEROF, PfcsmPackage.COMPOSITION__SRC);
		}
		return ownerof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition getOwnedby() {
		if (ownedby != null && ownedby.eIsProxy()) {
			InternalEObject oldOwnedby = (InternalEObject) ownedby;
			ownedby = (Composition) eResolveProxy(oldOwnedby);
			if (ownedby != oldOwnedby) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.DESIGN_ENTITY__OWNEDBY,
							oldOwnedby, ownedby));
			}
		}
		return ownedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition basicGetOwnedby() {
		return ownedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedby(Composition newOwnedby, NotificationChain msgs) {
		Composition oldOwnedby = ownedby;
		ownedby = newOwnedby;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.DESIGN_ENTITY__OWNEDBY, oldOwnedby, newOwnedby);
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
	public void setOwnedby(Composition newOwnedby) {
		if (newOwnedby != ownedby) {
			NotificationChain msgs = null;
			if (ownedby != null)
				msgs = ((InternalEObject) ownedby).eInverseRemove(this, PfcsmPackage.COMPOSITION__TGT,
						Composition.class, msgs);
			if (newOwnedby != null)
				msgs = ((InternalEObject) newOwnedby).eInverseAdd(this, PfcsmPackage.COMPOSITION__TGT,
						Composition.class, msgs);
			msgs = basicSetOwnedby(newOwnedby, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DESIGN_ENTITY__OWNEDBY, newOwnedby,
					newOwnedby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignEntity getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (DesignEntity) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.DESIGN_ENTITY__PARENT,
							oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignEntity basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(DesignEntity newParent, NotificationChain msgs) {
		DesignEntity oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.DESIGN_ENTITY__PARENT, oldParent, newParent);
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
	public void setParent(DesignEntity newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, PfcsmPackage.DESIGN_ENTITY__CHILDREN,
						DesignEntity.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, PfcsmPackage.DESIGN_ENTITY__CHILDREN,
						DesignEntity.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DESIGN_ENTITY__PARENT, newParent,
					newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignEntity> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<DesignEntity>(DesignEntity.class, this,
					PfcsmPackage.DESIGN_ENTITY__CHILDREN, PfcsmPackage.DESIGN_ENTITY__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alternative> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectWithInverseResolvingEList<Alternative>(Alternative.class, this,
					PfcsmPackage.DESIGN_ENTITY__ALTERNATIVE, PfcsmPackage.ALTERNATIVE__SRC);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alternative> getAlternativeto() {
		if (alternativeto == null) {
			alternativeto = new EObjectWithInverseResolvingEList<Alternative>(Alternative.class, this,
					PfcsmPackage.DESIGN_ENTITY__ALTERNATIVETO, PfcsmPackage.ALTERNATIVE__TGT);
		}
		return alternativeto;
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
		case PfcsmPackage.DESIGN_ENTITY__USEDBY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsedby()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__USES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUses()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__OWNEROF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnerof()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__OWNEDBY:
			if (ownedby != null)
				msgs = ((InternalEObject) ownedby).eInverseRemove(this, PfcsmPackage.COMPOSITION__TGT,
						Composition.class, msgs);
			return basicSetOwnedby((Composition) otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__PARENT:
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, PfcsmPackage.DESIGN_ENTITY__CHILDREN,
						DesignEntity.class, msgs);
			return basicSetParent((DesignEntity) otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__CHILDREN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildren()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAlternative()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVETO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAlternativeto()).basicAdd(otherEnd, msgs);
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
		case PfcsmPackage.DESIGN_ENTITY__ELEMENT:
			return ((InternalEList<?>) getElement()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__USEDBY:
			return ((InternalEList<?>) getUsedby()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__OWNEROF:
			return ((InternalEList<?>) getOwnerof()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__OWNEDBY:
			return basicSetOwnedby(null, msgs);
		case PfcsmPackage.DESIGN_ENTITY__PARENT:
			return basicSetParent(null, msgs);
		case PfcsmPackage.DESIGN_ENTITY__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVE:
			return ((InternalEList<?>) getAlternative()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVETO:
			return ((InternalEList<?>) getAlternativeto()).basicRemove(otherEnd, msgs);
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
		case PfcsmPackage.DESIGN_ENTITY__NAME:
			return getName();
		case PfcsmPackage.DESIGN_ENTITY__ELEMENT:
			return getElement();
		case PfcsmPackage.DESIGN_ENTITY__IS_ABSTRACT:
			return isIsAbstract();
		case PfcsmPackage.DESIGN_ENTITY__USEDBY:
			return getUsedby();
		case PfcsmPackage.DESIGN_ENTITY__USES:
			return getUses();
		case PfcsmPackage.DESIGN_ENTITY__OWNEROF:
			return getOwnerof();
		case PfcsmPackage.DESIGN_ENTITY__OWNEDBY:
			if (resolve)
				return getOwnedby();
			return basicGetOwnedby();
		case PfcsmPackage.DESIGN_ENTITY__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case PfcsmPackage.DESIGN_ENTITY__CHILDREN:
			return getChildren();
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVE:
			return getAlternative();
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVETO:
			return getAlternativeto();
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
		case PfcsmPackage.DESIGN_ENTITY__NAME:
			setName((String) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends Element>) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__USEDBY:
			getUsedby().clear();
			getUsedby().addAll((Collection<? extends Uses>) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Uses>) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__OWNEROF:
			getOwnerof().clear();
			getOwnerof().addAll((Collection<? extends Composition>) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__OWNEDBY:
			setOwnedby((Composition) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__PARENT:
			setParent((DesignEntity) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends DesignEntity>) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVE:
			getAlternative().clear();
			getAlternative().addAll((Collection<? extends Alternative>) newValue);
			return;
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVETO:
			getAlternativeto().clear();
			getAlternativeto().addAll((Collection<? extends Alternative>) newValue);
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
		case PfcsmPackage.DESIGN_ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PfcsmPackage.DESIGN_ENTITY__ELEMENT:
			getElement().clear();
			return;
		case PfcsmPackage.DESIGN_ENTITY__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case PfcsmPackage.DESIGN_ENTITY__USEDBY:
			getUsedby().clear();
			return;
		case PfcsmPackage.DESIGN_ENTITY__USES:
			getUses().clear();
			return;
		case PfcsmPackage.DESIGN_ENTITY__OWNEROF:
			getOwnerof().clear();
			return;
		case PfcsmPackage.DESIGN_ENTITY__OWNEDBY:
			setOwnedby((Composition) null);
			return;
		case PfcsmPackage.DESIGN_ENTITY__PARENT:
			setParent((DesignEntity) null);
			return;
		case PfcsmPackage.DESIGN_ENTITY__CHILDREN:
			getChildren().clear();
			return;
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVE:
			getAlternative().clear();
			return;
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVETO:
			getAlternativeto().clear();
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
		case PfcsmPackage.DESIGN_ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PfcsmPackage.DESIGN_ENTITY__ELEMENT:
			return element != null && !element.isEmpty();
		case PfcsmPackage.DESIGN_ENTITY__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case PfcsmPackage.DESIGN_ENTITY__USEDBY:
			return usedby != null && !usedby.isEmpty();
		case PfcsmPackage.DESIGN_ENTITY__USES:
			return uses != null && !uses.isEmpty();
		case PfcsmPackage.DESIGN_ENTITY__OWNEROF:
			return ownerof != null && !ownerof.isEmpty();
		case PfcsmPackage.DESIGN_ENTITY__OWNEDBY:
			return ownedby != null;
		case PfcsmPackage.DESIGN_ENTITY__PARENT:
			return parent != null;
		case PfcsmPackage.DESIGN_ENTITY__CHILDREN:
			return children != null && !children.isEmpty();
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVE:
			return alternative != null && !alternative.isEmpty();
		case PfcsmPackage.DESIGN_ENTITY__ALTERNATIVETO:
			return alternativeto != null && !alternativeto.isEmpty();
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
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //DesignEntityImpl
