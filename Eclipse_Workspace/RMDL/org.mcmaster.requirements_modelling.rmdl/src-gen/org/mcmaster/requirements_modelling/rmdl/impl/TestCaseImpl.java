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
import org.mcmaster.requirements_modelling.rmdl.Requirement_Root;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.TestCase;
import org.mcmaster.requirements_modelling.rmdl.TestType;
import org.mcmaster.requirements_modelling.rmdl.Verification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getVerificationSrc <em>Verification Src</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getRequirement_root <em>Requirement root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#isHasPassed <em>Has Passed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestCaseImpl extends MinimalEObjectImpl.Container implements TestCase {
	/**
	 * The cached value of the '{@link #getVerificationSrc() <em>Verification Src</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationSrc()
	 * @generated
	 * @ordered
	 */
	protected EList<Verification> verificationSrc;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TestType TYPE_EDEFAULT = TestType.UNIT_TEST;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TestType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isHasPassed() <em>Has Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPassed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PASSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasPassed() <em>Has Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPassed()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPassed = HAS_PASSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Verification> getVerificationSrc() {
		if (verificationSrc == null) {
			verificationSrc = new EObjectWithInverseResolvingEList<Verification>(Verification.class, this,
					RmdlPackage.TEST_CASE__VERIFICATION_SRC, RmdlPackage.VERIFICATION__TESTCASE);
		}
		return verificationSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TEST_CASE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TestType newType) {
		TestType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TEST_CASE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TEST_CASE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Root getRequirement_root() {
		if (eContainerFeatureID() != RmdlPackage.TEST_CASE__REQUIREMENT_ROOT)
			return null;
		return (Requirement_Root) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement_root(Requirement_Root newRequirement_root, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirement_root, RmdlPackage.TEST_CASE__REQUIREMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_root(Requirement_Root newRequirement_root) {
		if (newRequirement_root != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.TEST_CASE__REQUIREMENT_ROOT && newRequirement_root != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_root))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_root != null)
				msgs = ((InternalEObject) newRequirement_root).eInverseAdd(this, RmdlPackage.REQUIREMENT_ROOT__TESTCASE,
						Requirement_Root.class, msgs);
			msgs = basicSetRequirement_root(newRequirement_root, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TEST_CASE__REQUIREMENT_ROOT,
					newRequirement_root, newRequirement_root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasPassed() {
		return hasPassed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPassed(boolean newHasPassed) {
		boolean oldHasPassed = hasPassed;
		hasPassed = newHasPassed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TEST_CASE__HAS_PASSED, oldHasPassed,
					hasPassed));
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
		case RmdlPackage.TEST_CASE__VERIFICATION_SRC:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVerificationSrc()).basicAdd(otherEnd, msgs);
		case RmdlPackage.TEST_CASE__REQUIREMENT_ROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_root((Requirement_Root) otherEnd, msgs);
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
		case RmdlPackage.TEST_CASE__VERIFICATION_SRC:
			return ((InternalEList<?>) getVerificationSrc()).basicRemove(otherEnd, msgs);
		case RmdlPackage.TEST_CASE__REQUIREMENT_ROOT:
			return basicSetRequirement_root(null, msgs);
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
		case RmdlPackage.TEST_CASE__REQUIREMENT_ROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_ROOT__TESTCASE,
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
		case RmdlPackage.TEST_CASE__VERIFICATION_SRC:
			return getVerificationSrc();
		case RmdlPackage.TEST_CASE__ID:
			return getId();
		case RmdlPackage.TEST_CASE__TYPE:
			return getType();
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			return getDescription();
		case RmdlPackage.TEST_CASE__REQUIREMENT_ROOT:
			return getRequirement_root();
		case RmdlPackage.TEST_CASE__HAS_PASSED:
			return isHasPassed();
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
		case RmdlPackage.TEST_CASE__VERIFICATION_SRC:
			getVerificationSrc().clear();
			getVerificationSrc().addAll((Collection<? extends Verification>) newValue);
			return;
		case RmdlPackage.TEST_CASE__ID:
			setId((Integer) newValue);
			return;
		case RmdlPackage.TEST_CASE__TYPE:
			setType((TestType) newValue);
			return;
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case RmdlPackage.TEST_CASE__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Root) newValue);
			return;
		case RmdlPackage.TEST_CASE__HAS_PASSED:
			setHasPassed((Boolean) newValue);
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
		case RmdlPackage.TEST_CASE__VERIFICATION_SRC:
			getVerificationSrc().clear();
			return;
		case RmdlPackage.TEST_CASE__ID:
			setId(ID_EDEFAULT);
			return;
		case RmdlPackage.TEST_CASE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case RmdlPackage.TEST_CASE__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Root) null);
			return;
		case RmdlPackage.TEST_CASE__HAS_PASSED:
			setHasPassed(HAS_PASSED_EDEFAULT);
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
		case RmdlPackage.TEST_CASE__VERIFICATION_SRC:
			return verificationSrc != null && !verificationSrc.isEmpty();
		case RmdlPackage.TEST_CASE__ID:
			return id != ID_EDEFAULT;
		case RmdlPackage.TEST_CASE__TYPE:
			return type != TYPE_EDEFAULT;
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case RmdlPackage.TEST_CASE__REQUIREMENT_ROOT:
			return getRequirement_root() != null;
		case RmdlPackage.TEST_CASE__HAS_PASSED:
			return hasPassed != HAS_PASSED_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", hasPassed: ");
		result.append(hasPassed);
		result.append(')');
		return result.toString();
	}

} //TestCaseImpl
