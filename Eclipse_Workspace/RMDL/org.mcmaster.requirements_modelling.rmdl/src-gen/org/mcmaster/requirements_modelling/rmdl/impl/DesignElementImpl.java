/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Root;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.Trace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#getSatisfies <em>Satisfies</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#getModelroot <em>Modelroot</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignElementImpl extends MinimalEObjectImpl.Container implements DesignElement {
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
	 * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfies()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> satisfies;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Class> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.DESIGN_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.DESIGN_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getSatisfies() {
		if (satisfies == null) {
			satisfies = new EObjectWithInverseResolvingEList<Trace>(Trace.class, this,
					RmdlPackage.DESIGN_ELEMENT__SATISFIES, RmdlPackage.TRACE__DESIGNELEMENT);
		}
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Root getModelroot() {
		if (eContainerFeatureID() != RmdlPackage.DESIGN_ELEMENT__MODELROOT)
			return null;
		return (Requirement_Root) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelroot(Requirement_Root newModelroot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModelroot, RmdlPackage.DESIGN_ELEMENT__MODELROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelroot(Requirement_Root newModelroot) {
		if (newModelroot != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.DESIGN_ELEMENT__MODELROOT && newModelroot != null)) {
			if (EcoreUtil.isAncestor(this, newModelroot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelroot != null)
				msgs = ((InternalEObject) newModelroot).eInverseAdd(this, RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT,
						Requirement_Root.class, msgs);
			msgs = basicSetModelroot(newModelroot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.DESIGN_ELEMENT__MODELROOT, newModelroot,
					newModelroot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Class> getChildren() {
		if (children == null) {
			children = new EDataTypeUniqueEList<Class>(Class.class, this, RmdlPackage.DESIGN_ELEMENT__CHILDREN);
		}
		return children;
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
		case RmdlPackage.DESIGN_ELEMENT__SATISFIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSatisfies()).basicAdd(otherEnd, msgs);
		case RmdlPackage.DESIGN_ELEMENT__MODELROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModelroot((Requirement_Root) otherEnd, msgs);
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
		case RmdlPackage.DESIGN_ELEMENT__SATISFIES:
			return ((InternalEList<?>) getSatisfies()).basicRemove(otherEnd, msgs);
		case RmdlPackage.DESIGN_ELEMENT__MODELROOT:
			return basicSetModelroot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RmdlPackage.DESIGN_ELEMENT__MODELROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT,
					Requirement_Root.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RmdlPackage.DESIGN_ELEMENT__NAME:
			return getName();
		case RmdlPackage.DESIGN_ELEMENT__SATISFIES:
			return getSatisfies();
		case RmdlPackage.DESIGN_ELEMENT__MODELROOT:
			return getModelroot();
		case RmdlPackage.DESIGN_ELEMENT__CHILDREN:
			return getChildren();
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
		case RmdlPackage.DESIGN_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case RmdlPackage.DESIGN_ELEMENT__SATISFIES:
			getSatisfies().clear();
			getSatisfies().addAll((Collection<? extends Trace>) newValue);
			return;
		case RmdlPackage.DESIGN_ELEMENT__MODELROOT:
			setModelroot((Requirement_Root) newValue);
			return;
		case RmdlPackage.DESIGN_ELEMENT__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends Class>) newValue);
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
		case RmdlPackage.DESIGN_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RmdlPackage.DESIGN_ELEMENT__SATISFIES:
			getSatisfies().clear();
			return;
		case RmdlPackage.DESIGN_ELEMENT__MODELROOT:
			setModelroot((Requirement_Root) null);
			return;
		case RmdlPackage.DESIGN_ELEMENT__CHILDREN:
			getChildren().clear();
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
		case RmdlPackage.DESIGN_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RmdlPackage.DESIGN_ELEMENT__SATISFIES:
			return satisfies != null && !satisfies.isEmpty();
		case RmdlPackage.DESIGN_ELEMENT__MODELROOT:
			return getModelroot() != null;
		case RmdlPackage.DESIGN_ELEMENT__CHILDREN:
			return children != null && !children.isEmpty();
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
		result.append(", children: ");
		result.append(children);
		result.append(')');
		return result.toString();
	}

} //DesignElementImpl
