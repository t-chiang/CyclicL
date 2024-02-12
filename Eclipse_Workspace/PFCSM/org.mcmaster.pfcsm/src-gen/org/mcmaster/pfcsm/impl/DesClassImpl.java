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

import org.mcmaster.pfcsm.Association;
import org.mcmaster.pfcsm.Composition;
import org.mcmaster.pfcsm.DesClass;
import org.mcmaster.pfcsm.Element;
import org.mcmaster.pfcsm.Inheritance;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.XOR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Des Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getOwnerof <em>Ownerof</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getOwnedby <em>Ownedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getUsedby <em>Usedby</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getXorfrom <em>Xorfrom</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getXorto <em>Xorto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesClassImpl extends MinimalEObjectImpl.Container implements DesClass {
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
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Inheritance> children;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Inheritance parent;

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
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> uses;

	/**
	 * The cached value of the '{@link #getUsedby() <em>Usedby</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedby()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> usedby;

	/**
	 * The cached value of the '{@link #getXorfrom() <em>Xorfrom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXorfrom()
	 * @generated
	 * @ordered
	 */
	protected EList<XOR> xorfrom;

	/**
	 * The cached value of the '{@link #getXorto() <em>Xorto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXorto()
	 * @generated
	 * @ordered
	 */
	protected EList<XOR> xorto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.DES_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DES_CLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DES_CLASS__IS_OPTIONAL, oldIsOptional,
					isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<Element>(Element.class, this, PfcsmPackage.DES_CLASS__ELEMENT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DES_CLASS__IS_ABSTRACT, oldIsAbstract,
					isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inheritance> getChildren() {
		if (children == null) {
			children = new EObjectWithInverseResolvingEList<Inheritance>(Inheritance.class, this,
					PfcsmPackage.DES_CLASS__CHILDREN, PfcsmPackage.INHERITANCE__TGT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (Inheritance) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.DES_CLASS__PARENT, oldParent,
							parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Inheritance newParent, NotificationChain msgs) {
		Inheritance oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.DES_CLASS__PARENT, oldParent, newParent);
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
	public void setParent(Inheritance newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, PfcsmPackage.INHERITANCE__SRC, Inheritance.class,
						msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, PfcsmPackage.INHERITANCE__SRC, Inheritance.class,
						msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DES_CLASS__PARENT, newParent,
					newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getOwnerof() {
		if (ownerof == null) {
			ownerof = new EObjectWithInverseResolvingEList<Composition>(Composition.class, this,
					PfcsmPackage.DES_CLASS__OWNEROF, PfcsmPackage.COMPOSITION__SRC);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.DES_CLASS__OWNEDBY,
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
					PfcsmPackage.DES_CLASS__OWNEDBY, oldOwnedby, newOwnedby);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.DES_CLASS__OWNEDBY, newOwnedby,
					newOwnedby));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getUses() {
		if (uses == null) {
			uses = new EObjectWithInverseResolvingEList<Association>(Association.class, this,
					PfcsmPackage.DES_CLASS__USES, PfcsmPackage.ASSOCIATION__TGT);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getUsedby() {
		if (usedby == null) {
			usedby = new EObjectWithInverseResolvingEList<Association>(Association.class, this,
					PfcsmPackage.DES_CLASS__USEDBY, PfcsmPackage.ASSOCIATION__SRC);
		}
		return usedby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XOR> getXorfrom() {
		if (xorfrom == null) {
			xorfrom = new EObjectWithInverseResolvingEList<XOR>(XOR.class, this, PfcsmPackage.DES_CLASS__XORFROM,
					PfcsmPackage.XOR__TGT);
		}
		return xorfrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XOR> getXorto() {
		if (xorto == null) {
			xorto = new EObjectWithInverseResolvingEList<XOR>(XOR.class, this, PfcsmPackage.DES_CLASS__XORTO,
					PfcsmPackage.XOR__SRC);
		}
		return xorto;
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
		case PfcsmPackage.DES_CLASS__CHILDREN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildren()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__PARENT:
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, PfcsmPackage.INHERITANCE__SRC, Inheritance.class,
						msgs);
			return basicSetParent((Inheritance) otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__OWNEROF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnerof()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__OWNEDBY:
			if (ownedby != null)
				msgs = ((InternalEObject) ownedby).eInverseRemove(this, PfcsmPackage.COMPOSITION__TGT,
						Composition.class, msgs);
			return basicSetOwnedby((Composition) otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__USES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUses()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__USEDBY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsedby()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__XORFROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getXorfrom()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__XORTO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getXorto()).basicAdd(otherEnd, msgs);
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
		case PfcsmPackage.DES_CLASS__ELEMENT:
			return ((InternalEList<?>) getElement()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__PARENT:
			return basicSetParent(null, msgs);
		case PfcsmPackage.DES_CLASS__OWNEROF:
			return ((InternalEList<?>) getOwnerof()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__OWNEDBY:
			return basicSetOwnedby(null, msgs);
		case PfcsmPackage.DES_CLASS__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__USEDBY:
			return ((InternalEList<?>) getUsedby()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__XORFROM:
			return ((InternalEList<?>) getXorfrom()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__XORTO:
			return ((InternalEList<?>) getXorto()).basicRemove(otherEnd, msgs);
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
		case PfcsmPackage.DES_CLASS__NAME:
			return getName();
		case PfcsmPackage.DES_CLASS__IS_OPTIONAL:
			return isIsOptional();
		case PfcsmPackage.DES_CLASS__ELEMENT:
			return getElement();
		case PfcsmPackage.DES_CLASS__IS_ABSTRACT:
			return isIsAbstract();
		case PfcsmPackage.DES_CLASS__CHILDREN:
			return getChildren();
		case PfcsmPackage.DES_CLASS__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case PfcsmPackage.DES_CLASS__OWNEROF:
			return getOwnerof();
		case PfcsmPackage.DES_CLASS__OWNEDBY:
			if (resolve)
				return getOwnedby();
			return basicGetOwnedby();
		case PfcsmPackage.DES_CLASS__USES:
			return getUses();
		case PfcsmPackage.DES_CLASS__USEDBY:
			return getUsedby();
		case PfcsmPackage.DES_CLASS__XORFROM:
			return getXorfrom();
		case PfcsmPackage.DES_CLASS__XORTO:
			return getXorto();
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
		case PfcsmPackage.DES_CLASS__NAME:
			setName((String) newValue);
			return;
		case PfcsmPackage.DES_CLASS__IS_OPTIONAL:
			setIsOptional((Boolean) newValue);
			return;
		case PfcsmPackage.DES_CLASS__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends Element>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case PfcsmPackage.DES_CLASS__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends Inheritance>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__PARENT:
			setParent((Inheritance) newValue);
			return;
		case PfcsmPackage.DES_CLASS__OWNEROF:
			getOwnerof().clear();
			getOwnerof().addAll((Collection<? extends Composition>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__OWNEDBY:
			setOwnedby((Composition) newValue);
			return;
		case PfcsmPackage.DES_CLASS__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends Association>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__USEDBY:
			getUsedby().clear();
			getUsedby().addAll((Collection<? extends Association>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__XORFROM:
			getXorfrom().clear();
			getXorfrom().addAll((Collection<? extends XOR>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__XORTO:
			getXorto().clear();
			getXorto().addAll((Collection<? extends XOR>) newValue);
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
		case PfcsmPackage.DES_CLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PfcsmPackage.DES_CLASS__IS_OPTIONAL:
			setIsOptional(IS_OPTIONAL_EDEFAULT);
			return;
		case PfcsmPackage.DES_CLASS__ELEMENT:
			getElement().clear();
			return;
		case PfcsmPackage.DES_CLASS__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case PfcsmPackage.DES_CLASS__CHILDREN:
			getChildren().clear();
			return;
		case PfcsmPackage.DES_CLASS__PARENT:
			setParent((Inheritance) null);
			return;
		case PfcsmPackage.DES_CLASS__OWNEROF:
			getOwnerof().clear();
			return;
		case PfcsmPackage.DES_CLASS__OWNEDBY:
			setOwnedby((Composition) null);
			return;
		case PfcsmPackage.DES_CLASS__USES:
			getUses().clear();
			return;
		case PfcsmPackage.DES_CLASS__USEDBY:
			getUsedby().clear();
			return;
		case PfcsmPackage.DES_CLASS__XORFROM:
			getXorfrom().clear();
			return;
		case PfcsmPackage.DES_CLASS__XORTO:
			getXorto().clear();
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
		case PfcsmPackage.DES_CLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PfcsmPackage.DES_CLASS__IS_OPTIONAL:
			return isOptional != IS_OPTIONAL_EDEFAULT;
		case PfcsmPackage.DES_CLASS__ELEMENT:
			return element != null && !element.isEmpty();
		case PfcsmPackage.DES_CLASS__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case PfcsmPackage.DES_CLASS__CHILDREN:
			return children != null && !children.isEmpty();
		case PfcsmPackage.DES_CLASS__PARENT:
			return parent != null;
		case PfcsmPackage.DES_CLASS__OWNEROF:
			return ownerof != null && !ownerof.isEmpty();
		case PfcsmPackage.DES_CLASS__OWNEDBY:
			return ownedby != null;
		case PfcsmPackage.DES_CLASS__USES:
			return uses != null && !uses.isEmpty();
		case PfcsmPackage.DES_CLASS__USEDBY:
			return usedby != null && !usedby.isEmpty();
		case PfcsmPackage.DES_CLASS__XORFROM:
			return xorfrom != null && !xorfrom.isEmpty();
		case PfcsmPackage.DES_CLASS__XORTO:
			return xorto != null && !xorto.isEmpty();
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
		result.append(", isOptional: ");
		result.append(isOptional);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //DesClassImpl
