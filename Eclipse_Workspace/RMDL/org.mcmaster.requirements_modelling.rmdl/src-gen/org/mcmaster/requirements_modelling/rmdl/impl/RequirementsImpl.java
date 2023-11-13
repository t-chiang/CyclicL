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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.Decomposition;
import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Root;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.Verification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getVerifyMethod <em>Verify Method</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getVerificationTgt <em>Verification Tgt</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getRequirement_root <em>Requirement root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getSatisfiedby <em>Satisfiedby</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementsImpl extends MinimalEObjectImpl.Container implements Requirements {
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
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The cached value of the '{@link #getVerificationTgt() <em>Verification Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationTgt()
	 * @generated
	 * @ordered
	 */
	protected Verification verificationTgt;

	/**
	 * The cached value of the '{@link #getSatisfiedby() <em>Satisfiedby</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedby()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignElement> satisfiedby;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REQUIREMENTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__DESCRIPTION, oldDescription,
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__VERIFY_METHOD,
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
					RmdlPackage.REQUIREMENTS__CHILD, RmdlPackage.DECOMPOSITION__SOURCE);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.REQUIREMENTS__PARENT,
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
					RmdlPackage.REQUIREMENTS__PARENT, oldParent, newParent);
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__PARENT, newParent,
					newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verification getVerificationTgt() {
		if (verificationTgt != null && verificationTgt.eIsProxy()) {
			InternalEObject oldVerificationTgt = (InternalEObject) verificationTgt;
			verificationTgt = (Verification) eResolveProxy(oldVerificationTgt);
			if (verificationTgt != oldVerificationTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RmdlPackage.REQUIREMENTS__VERIFICATION_TGT, oldVerificationTgt, verificationTgt));
			}
		}
		return verificationTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verification basicGetVerificationTgt() {
		return verificationTgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerificationTgt(Verification newVerificationTgt, NotificationChain msgs) {
		Verification oldVerificationTgt = verificationTgt;
		verificationTgt = newVerificationTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.REQUIREMENTS__VERIFICATION_TGT, oldVerificationTgt, newVerificationTgt);
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
	public void setVerificationTgt(Verification newVerificationTgt) {
		if (newVerificationTgt != verificationTgt) {
			NotificationChain msgs = null;
			if (verificationTgt != null)
				msgs = ((InternalEObject) verificationTgt).eInverseRemove(this, RmdlPackage.VERIFICATION__REQUIREMENT,
						Verification.class, msgs);
			if (newVerificationTgt != null)
				msgs = ((InternalEObject) newVerificationTgt).eInverseAdd(this, RmdlPackage.VERIFICATION__REQUIREMENT,
						Verification.class, msgs);
			msgs = basicSetVerificationTgt(newVerificationTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__VERIFICATION_TGT,
					newVerificationTgt, newVerificationTgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Root getRequirement_root() {
		if (eContainerFeatureID() != RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT)
			return null;
		return (Requirement_Root) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement_root(Requirement_Root newRequirement_root, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirement_root, RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_root(Requirement_Root newRequirement_root) {
		if (newRequirement_root != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT
						&& newRequirement_root != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_root))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_root != null)
				msgs = ((InternalEObject) newRequirement_root).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS, Requirement_Root.class, msgs);
			msgs = basicSetRequirement_root(newRequirement_root, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT,
					newRequirement_root, newRequirement_root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignElement> getSatisfiedby() {
		if (satisfiedby == null) {
			satisfiedby = new EObjectWithInverseResolvingEList.ManyInverse<DesignElement>(DesignElement.class, this,
					RmdlPackage.REQUIREMENTS__SATISFIEDBY, RmdlPackage.DESIGN_ELEMENT__SATISFIES);
		}
		return satisfiedby;
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
		case RmdlPackage.REQUIREMENTS__CHILD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChild()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__PARENT:
			if (parent != null)
				msgs = ((InternalEObject) parent).eInverseRemove(this, RmdlPackage.DECOMPOSITION__TARGET,
						Decomposition.class, msgs);
			return basicSetParent((Decomposition) otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__VERIFICATION_TGT:
			if (verificationTgt != null)
				msgs = ((InternalEObject) verificationTgt).eInverseRemove(this, RmdlPackage.VERIFICATION__REQUIREMENT,
						Verification.class, msgs);
			return basicSetVerificationTgt((Verification) otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_root((Requirement_Root) otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__SATISFIEDBY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSatisfiedby()).basicAdd(otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENTS__CHILD:
			return ((InternalEList<?>) getChild()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__PARENT:
			return basicSetParent(null, msgs);
		case RmdlPackage.REQUIREMENTS__VERIFICATION_TGT:
			return basicSetVerificationTgt(null, msgs);
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			return basicSetRequirement_root(null, msgs);
		case RmdlPackage.REQUIREMENTS__SATISFIEDBY:
			return ((InternalEList<?>) getSatisfiedby()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS,
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
		case RmdlPackage.REQUIREMENTS__NAME:
			return getName();
		case RmdlPackage.REQUIREMENTS__ID:
			return getID();
		case RmdlPackage.REQUIREMENTS__DESCRIPTION:
			return getDescription();
		case RmdlPackage.REQUIREMENTS__VERIFY_METHOD:
			return getVerifyMethod();
		case RmdlPackage.REQUIREMENTS__CHILD:
			return getChild();
		case RmdlPackage.REQUIREMENTS__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
		case RmdlPackage.REQUIREMENTS__VERIFICATION_TGT:
			if (resolve)
				return getVerificationTgt();
			return basicGetVerificationTgt();
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			return getRequirement_root();
		case RmdlPackage.REQUIREMENTS__SATISFIEDBY:
			return getSatisfiedby();
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
		case RmdlPackage.REQUIREMENTS__NAME:
			setName((String) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__ID:
			setID((Integer) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__VERIFY_METHOD:
			setVerifyMethod((String) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__CHILD:
			getChild().clear();
			getChild().addAll((Collection<? extends Decomposition>) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__PARENT:
			setParent((Decomposition) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__VERIFICATION_TGT:
			setVerificationTgt((Verification) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Root) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__SATISFIEDBY:
			getSatisfiedby().clear();
			getSatisfiedby().addAll((Collection<? extends DesignElement>) newValue);
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
		case RmdlPackage.REQUIREMENTS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENTS__ID:
			setID(ID_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENTS__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENTS__VERIFY_METHOD:
			setVerifyMethod(VERIFY_METHOD_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENTS__CHILD:
			getChild().clear();
			return;
		case RmdlPackage.REQUIREMENTS__PARENT:
			setParent((Decomposition) null);
			return;
		case RmdlPackage.REQUIREMENTS__VERIFICATION_TGT:
			setVerificationTgt((Verification) null);
			return;
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Root) null);
			return;
		case RmdlPackage.REQUIREMENTS__SATISFIEDBY:
			getSatisfiedby().clear();
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
		case RmdlPackage.REQUIREMENTS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RmdlPackage.REQUIREMENTS__ID:
			return id != ID_EDEFAULT;
		case RmdlPackage.REQUIREMENTS__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case RmdlPackage.REQUIREMENTS__VERIFY_METHOD:
			return VERIFY_METHOD_EDEFAULT == null ? verifyMethod != null : !VERIFY_METHOD_EDEFAULT.equals(verifyMethod);
		case RmdlPackage.REQUIREMENTS__CHILD:
			return child != null && !child.isEmpty();
		case RmdlPackage.REQUIREMENTS__PARENT:
			return parent != null;
		case RmdlPackage.REQUIREMENTS__VERIFICATION_TGT:
			return verificationTgt != null;
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			return getRequirement_root() != null;
		case RmdlPackage.REQUIREMENTS__SATISFIEDBY:
			return satisfiedby != null && !satisfiedby.isEmpty();
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

} //RequirementsImpl
