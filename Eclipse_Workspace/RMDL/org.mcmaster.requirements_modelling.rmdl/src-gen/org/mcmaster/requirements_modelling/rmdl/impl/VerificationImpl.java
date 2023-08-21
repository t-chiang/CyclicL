/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mcmaster.requirements_modelling.rmdl.Entity;
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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.VerificationImpl#getEntity <em>Entity</em>}</li>
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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

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
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject) entity;
			entity = (Entity) eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.VERIFICATION__ENTITY,
							oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.VERIFICATION__ENTITY, oldEntity, newEntity);
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
	public void setEntity(Entity newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this, RmdlPackage.ENTITY__VERIFICATION_TGT,
						Entity.class, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject) newEntity).eInverseAdd(this, RmdlPackage.ENTITY__VERIFICATION_TGT,
						Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.VERIFICATION__ENTITY, newEntity,
					newEntity));
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
		case RmdlPackage.VERIFICATION__ENTITY:
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this, RmdlPackage.ENTITY__VERIFICATION_TGT,
						Entity.class, msgs);
			return basicSetEntity((Entity) otherEnd, msgs);
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
		case RmdlPackage.VERIFICATION__ENTITY:
			return basicSetEntity(null, msgs);
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
		case RmdlPackage.VERIFICATION__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
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
		case RmdlPackage.VERIFICATION__ENTITY:
			setEntity((Entity) newValue);
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
		case RmdlPackage.VERIFICATION__ENTITY:
			setEntity((Entity) null);
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
		case RmdlPackage.VERIFICATION__ENTITY:
			return entity != null;
		}
		return super.eIsSet(featureID);
	}

} //VerificationImpl
