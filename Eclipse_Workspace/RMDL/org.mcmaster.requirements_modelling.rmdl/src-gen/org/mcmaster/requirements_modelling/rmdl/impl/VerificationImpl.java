/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.TestCase;
import org.mcmaster.requirements_modelling.rmdl.Verification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.VerificationImpl#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.VerificationImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationImpl extends ReferenceImpl implements Verification {
	/**
	 * The cached value of the '{@link #getTestcase() <em>Testcase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestcase()
	 * @generated
	 * @ordered
	 */
	protected TestCase testcase;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirements requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.VERIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase getTestcase() {
		if (testcase != null && testcase.eIsProxy()) {
			InternalEObject oldTestcase = (InternalEObject) testcase;
			testcase = (TestCase) eResolveProxy(oldTestcase);
			if (testcase != oldTestcase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.VERIFICATION__TESTCASE,
							oldTestcase, testcase));
			}
		}
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase basicGetTestcase() {
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestcase(TestCase newTestcase, NotificationChain msgs) {
		TestCase oldTestcase = testcase;
		testcase = newTestcase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.VERIFICATION__TESTCASE, oldTestcase, newTestcase);
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
	public void setTestcase(TestCase newTestcase) {
		if (newTestcase != testcase) {
			NotificationChain msgs = null;
			if (testcase != null)
				msgs = ((InternalEObject) testcase).eInverseRemove(this, RmdlPackage.TEST_CASE__VERIFICATION_SRC,
						TestCase.class, msgs);
			if (newTestcase != null)
				msgs = ((InternalEObject) newTestcase).eInverseAdd(this, RmdlPackage.TEST_CASE__VERIFICATION_SRC,
						TestCase.class, msgs);
			msgs = basicSetTestcase(newTestcase, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.VERIFICATION__TESTCASE, newTestcase,
					newTestcase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject) requirement;
			requirement = (Requirements) eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.VERIFICATION__REQUIREMENT,
							oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(Requirements newRequirement, NotificationChain msgs) {
		Requirements oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.VERIFICATION__REQUIREMENT, oldRequirement, newRequirement);
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
	public void setRequirement(Requirements newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject) requirement).eInverseRemove(this, RmdlPackage.REQUIREMENTS__VERIFICATION_TGT,
						Requirements.class, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject) newRequirement).eInverseAdd(this, RmdlPackage.REQUIREMENTS__VERIFICATION_TGT,
						Requirements.class, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.VERIFICATION__REQUIREMENT, newRequirement,
					newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.VERIFICATION__TESTCASE:
			if (testcase != null)
				msgs = ((InternalEObject) testcase).eInverseRemove(this, RmdlPackage.TEST_CASE__VERIFICATION_SRC,
						TestCase.class, msgs);
			return basicSetTestcase((TestCase) otherEnd, msgs);
		case RmdlPackage.VERIFICATION__REQUIREMENT:
			if (requirement != null)
				msgs = ((InternalEObject) requirement).eInverseRemove(this, RmdlPackage.REQUIREMENTS__VERIFICATION_TGT,
						Requirements.class, msgs);
			return basicSetRequirement((Requirements) otherEnd, msgs);
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
		case RmdlPackage.VERIFICATION__TESTCASE:
			return basicSetTestcase(null, msgs);
		case RmdlPackage.VERIFICATION__REQUIREMENT:
			return basicSetRequirement(null, msgs);
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
		case RmdlPackage.VERIFICATION__TESTCASE:
			if (resolve)
				return getTestcase();
			return basicGetTestcase();
		case RmdlPackage.VERIFICATION__REQUIREMENT:
			if (resolve)
				return getRequirement();
			return basicGetRequirement();
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
		case RmdlPackage.VERIFICATION__TESTCASE:
			setTestcase((TestCase) newValue);
			return;
		case RmdlPackage.VERIFICATION__REQUIREMENT:
			setRequirement((Requirements) newValue);
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
		case RmdlPackage.VERIFICATION__TESTCASE:
			setTestcase((TestCase) null);
			return;
		case RmdlPackage.VERIFICATION__REQUIREMENT:
			setRequirement((Requirements) null);
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
		case RmdlPackage.VERIFICATION__TESTCASE:
			return testcase != null;
		case RmdlPackage.VERIFICATION__REQUIREMENT:
			return requirement != null;
		}
		return super.eIsSet(featureID);
	}

} //VerificationImpl
