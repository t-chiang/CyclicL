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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.Decomposition;
import org.mcmaster.requirements_modelling.rmdl.Requirement;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl#getVerifyMethod <em>Verify Method</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends EntityImpl implements Requirement {
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
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifyMethod() <em>Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFY_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifyMethod() <em>Verify Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyMethod()
	 * @generated
	 * @ordered
	 */
	protected String verifyMethod = VERIFY_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<Decomposition> child;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Decomposition parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerifyMethod() {
		return verifyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifyMethod(String newVerifyMethod) {
		String oldVerifyMethod = verifyMethod;
		verifyMethod = newVerifyMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT__VERIFY_METHOD,
					oldVerifyMethod, verifyMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decomposition> getChild() {
		if (child == null) {
			child = new EObjectWithInverseResolvingEList<Decomposition>(Decomposition.class, this,
					RmdlPackage.REQUIREMENT__CHILD, RmdlPackage.DECOMPOSITION__SOURCE);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (Decomposition) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.REQUIREMENT__PARENT,
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
	public Decomposition basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Decomposition newParent, NotificationChain msgs) {
		Decomposition oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.REQUIREMENT__PARENT, oldParent, newParent);
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
	public void setParent(Decomposition newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, RmdlPackage.DECOMPOSITION__TARGET,
						Decomposition.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject) newParent).eInverseAdd(this, RmdlPackage.DECOMPOSITION__TARGET,
						Decomposition.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENT__PARENT, newParent,
					newParent));
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
		case RmdlPackage.REQUIREMENT__CHILD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChild()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT__PARENT:
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, RmdlPackage.DECOMPOSITION__TARGET,
						Decomposition.class, msgs);
			return basicSetParent((Decomposition) otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENT__CHILD:
			return ((InternalEList<?>) getChild()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENT__PARENT:
			return basicSetParent(null, msgs);
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
		case RmdlPackage.REQUIREMENT__NAME:
			return getName();
		case RmdlPackage.REQUIREMENT__ID:
			return getID();
		case RmdlPackage.REQUIREMENT__DESCRIPTION:
			return getDescription();
		case RmdlPackage.REQUIREMENT__VERIFY_METHOD:
			return getVerifyMethod();
		case RmdlPackage.REQUIREMENT__CHILD:
			return getChild();
		case RmdlPackage.REQUIREMENT__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
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
		case RmdlPackage.REQUIREMENT__NAME:
			setName((String) newValue);
			return;
		case RmdlPackage.REQUIREMENT__ID:
			setID((String) newValue);
			return;
		case RmdlPackage.REQUIREMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case RmdlPackage.REQUIREMENT__VERIFY_METHOD:
			setVerifyMethod((String) newValue);
			return;
		case RmdlPackage.REQUIREMENT__CHILD:
			getChild().clear();
			getChild().addAll((Collection<? extends Decomposition>) newValue);
			return;
		case RmdlPackage.REQUIREMENT__PARENT:
			setParent((Decomposition) newValue);
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
		case RmdlPackage.REQUIREMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENT__ID:
			setID(ID_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENT__VERIFY_METHOD:
			setVerifyMethod(VERIFY_METHOD_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENT__CHILD:
			getChild().clear();
			return;
		case RmdlPackage.REQUIREMENT__PARENT:
			setParent((Decomposition) null);
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
		case RmdlPackage.REQUIREMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RmdlPackage.REQUIREMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case RmdlPackage.REQUIREMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case RmdlPackage.REQUIREMENT__VERIFY_METHOD:
			return VERIFY_METHOD_EDEFAULT == null ? verifyMethod != null : !VERIFY_METHOD_EDEFAULT.equals(verifyMethod);
		case RmdlPackage.REQUIREMENT__CHILD:
			return child != null && !child.isEmpty();
		case RmdlPackage.REQUIREMENT__PARENT:
			return parent != null;
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
		result.append(", ID: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", verifyMethod: ");
		result.append(verifyMethod);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
