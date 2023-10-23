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

import org.mcmaster.requirements_modelling.rmdl.ModelRoot;
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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getModelroot <em>Modelroot</em>}</li>
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
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
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
	public ModelRoot getModelroot() {
		if (eContainerFeatureID() != RmdlPackage.TEST_CASE__MODELROOT)
			return null;
		return (ModelRoot) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelroot(ModelRoot newModelroot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModelroot, RmdlPackage.TEST_CASE__MODELROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelroot(ModelRoot newModelroot) {
		if (newModelroot != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.TEST_CASE__MODELROOT && newModelroot != null)) {
			if (EcoreUtil.isAncestor(this, newModelroot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelroot != null)
				msgs = ((InternalEObject) newModelroot).eInverseAdd(this, RmdlPackage.MODEL_ROOT__TESTCASE,
						ModelRoot.class, msgs);
			msgs = basicSetModelroot(newModelroot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TEST_CASE__MODELROOT, newModelroot,
					newModelroot));
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
		case RmdlPackage.TEST_CASE__MODELROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModelroot((ModelRoot) otherEnd, msgs);
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
		case RmdlPackage.TEST_CASE__MODELROOT:
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
		case RmdlPackage.TEST_CASE__MODELROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.MODEL_ROOT__TESTCASE, ModelRoot.class, msgs);
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
		case RmdlPackage.TEST_CASE__MODELROOT:
			return getModelroot();
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
			setId((String) newValue);
			return;
		case RmdlPackage.TEST_CASE__TYPE:
			setType((TestType) newValue);
			return;
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case RmdlPackage.TEST_CASE__MODELROOT:
			setModelroot((ModelRoot) newValue);
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
		case RmdlPackage.TEST_CASE__MODELROOT:
			setModelroot((ModelRoot) null);
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
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case RmdlPackage.TEST_CASE__TYPE:
			return type != TYPE_EDEFAULT;
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case RmdlPackage.TEST_CASE__MODELROOT:
			return getModelroot() != null;
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
		result.append(')');
		return result.toString();
	}

} //TestCaseImpl
