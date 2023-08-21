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
import org.mcmaster.pfcsm.Element;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ClassImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ClassImpl#getReferenceTo <em>Reference To</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ClassImpl#getReferenceFrom <em>Reference From</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ClassImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassImpl extends MinimalEObjectImpl.Container implements org.mcmaster.pfcsm.Class {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.CLASS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.CLASS__IS_OPTIONAL, oldIsOptional,
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
					PfcsmPackage.CLASS__REFERENCE_TO, PfcsmPackage.REFERENCE__SOURCE);
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
					PfcsmPackage.CLASS__REFERENCE_FROM, PfcsmPackage.REFERENCE__TARGET);
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
			element = new EObjectContainmentEList<Element>(Element.class, this, PfcsmPackage.CLASS__ELEMENT);
		}
		return element;
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
		case PfcsmPackage.CLASS__REFERENCE_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferenceTo()).basicAdd(otherEnd, msgs);
		case PfcsmPackage.CLASS__REFERENCE_FROM:
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
		case PfcsmPackage.CLASS__REFERENCE_TO:
			return ((InternalEList<?>) getReferenceTo()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.CLASS__REFERENCE_FROM:
			return ((InternalEList<?>) getReferenceFrom()).basicRemove(otherEnd, msgs);
		case PfcsmPackage.CLASS__ELEMENT:
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
		case PfcsmPackage.CLASS__NAME:
			return getName();
		case PfcsmPackage.CLASS__IS_OPTIONAL:
			return isIsOptional();
		case PfcsmPackage.CLASS__REFERENCE_TO:
			return getReferenceTo();
		case PfcsmPackage.CLASS__REFERENCE_FROM:
			return getReferenceFrom();
		case PfcsmPackage.CLASS__ELEMENT:
			return getElement();
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
		case PfcsmPackage.CLASS__NAME:
			setName((String) newValue);
			return;
		case PfcsmPackage.CLASS__IS_OPTIONAL:
			setIsOptional((Boolean) newValue);
			return;
		case PfcsmPackage.CLASS__REFERENCE_TO:
			getReferenceTo().clear();
			getReferenceTo().addAll((Collection<? extends Reference>) newValue);
			return;
		case PfcsmPackage.CLASS__REFERENCE_FROM:
			getReferenceFrom().clear();
			getReferenceFrom().addAll((Collection<? extends Reference>) newValue);
			return;
		case PfcsmPackage.CLASS__ELEMENT:
			getElement().clear();
			getElement().addAll((Collection<? extends Element>) newValue);
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
		case PfcsmPackage.CLASS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PfcsmPackage.CLASS__IS_OPTIONAL:
			setIsOptional(IS_OPTIONAL_EDEFAULT);
			return;
		case PfcsmPackage.CLASS__REFERENCE_TO:
			getReferenceTo().clear();
			return;
		case PfcsmPackage.CLASS__REFERENCE_FROM:
			getReferenceFrom().clear();
			return;
		case PfcsmPackage.CLASS__ELEMENT:
			getElement().clear();
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
		case PfcsmPackage.CLASS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PfcsmPackage.CLASS__IS_OPTIONAL:
			return isOptional != IS_OPTIONAL_EDEFAULT;
		case PfcsmPackage.CLASS__REFERENCE_TO:
			return referenceTo != null && !referenceTo.isEmpty();
		case PfcsmPackage.CLASS__REFERENCE_FROM:
			return referenceFrom != null && !referenceFrom.isEmpty();
		case PfcsmPackage.CLASS__ELEMENT:
			return element != null && !element.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ClassImpl
