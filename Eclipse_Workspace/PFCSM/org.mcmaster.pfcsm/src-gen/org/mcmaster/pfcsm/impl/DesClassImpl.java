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

import org.mcmaster.pfcsm.DesClass;
import org.mcmaster.pfcsm.Element;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Reference;

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
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getReferenceTo <em>Reference To</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getReferenceFrom <em>Reference From</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.DesClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
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
	 * The cached value of the '{@link #getReferenceTo() <em>Reference To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> referenceTo;

	/**
	 * The cached value of the '{@link #getReferenceFrom() <em>Reference From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> referenceFrom;

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
	public EList<Reference> getReferenceTo() {
		if (referenceTo == null) {
			referenceTo = new EObjectWithInverseResolvingEList<Reference>(Reference.class, this,
					PfcsmPackage.DES_CLASS__REFERENCE_TO, PfcsmPackage.REFERENCE__SOURCE);
		}
		return referenceTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferenceFrom() {
		if (referenceFrom == null) {
			referenceFrom = new EObjectWithInverseResolvingEList<Reference>(Reference.class, this,
					PfcsmPackage.DES_CLASS__REFERENCE_FROM, PfcsmPackage.REFERENCE__TARGET);
		}
		return referenceFrom;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.DES_CLASS__REFERENCE_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferenceTo()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__REFERENCE_FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferenceFrom()).basicAdd(otherEnd, msgs);
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
		case PfcsmPackage.DES_CLASS__REFERENCE_TO:
			return ((InternalEList<?>) getReferenceTo()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__REFERENCE_FROM:
			return ((InternalEList<?>) getReferenceFrom()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.DES_CLASS__ELEMENT:
			return ((InternalEList<?>) getElement()).basicRemove(otherEnd, msgs);
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
		case PfcsmPackage.DES_CLASS__REFERENCE_TO:
			return getReferenceTo();
		case PfcsmPackage.DES_CLASS__REFERENCE_FROM:
			return getReferenceFrom();
		case PfcsmPackage.DES_CLASS__ELEMENT:
			return getElement();
		case PfcsmPackage.DES_CLASS__IS_ABSTRACT:
			return isIsAbstract();
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
		case PfcsmPackage.DES_CLASS__REFERENCE_TO:
			getReferenceTo().clear();
			getReferenceTo().addAll((Collection<? extends Reference>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__REFERENCE_FROM:
			getReferenceFrom().clear();
			getReferenceFrom().addAll((Collection<? extends Reference>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends Element>) newValue);
			return;
		case PfcsmPackage.DES_CLASS__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
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
		case PfcsmPackage.DES_CLASS__REFERENCE_TO:
			getReferenceTo().clear();
			return;
		case PfcsmPackage.DES_CLASS__REFERENCE_FROM:
			getReferenceFrom().clear();
			return;
		case PfcsmPackage.DES_CLASS__ELEMENT:
			getElement().clear();
			return;
		case PfcsmPackage.DES_CLASS__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
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
		case PfcsmPackage.DES_CLASS__REFERENCE_TO:
			return referenceTo != null && !referenceTo.isEmpty();
		case PfcsmPackage.DES_CLASS__REFERENCE_FROM:
			return referenceFrom != null && !referenceFrom.isEmpty();
		case PfcsmPackage.DES_CLASS__ELEMENT:
			return element != null && !element.isEmpty();
		case PfcsmPackage.DES_CLASS__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
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
