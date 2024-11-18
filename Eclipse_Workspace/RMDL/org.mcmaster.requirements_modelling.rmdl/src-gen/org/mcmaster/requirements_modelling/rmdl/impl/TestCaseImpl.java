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
import org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.TestCase;
import org.mcmaster.requirements_modelling.rmdl.TestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getRequirement_canvas <em>Requirement canvas</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#isHasPassed <em>Has Passed</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestCaseImpl extends MinimalEObjectImpl.Container implements TestCase {
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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirements> requirements;

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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TEST_CASE__ID, oldID, id));
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
	public Requirement_Canvas getRequirement_canvas() {
		if (eContainerFeatureID() != RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS)
			return null;
		return (Requirement_Canvas) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement_canvas(Requirement_Canvas newRequirement_canvas,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirement_canvas, RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_canvas(Requirement_Canvas newRequirement_canvas) {
		if (newRequirement_canvas != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS
						&& newRequirement_canvas != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_canvas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_canvas != null)
				msgs = ((InternalEObject) newRequirement_canvas).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_CANVAS__TESTCASE, Requirement_Canvas.class, msgs);
			msgs = basicSetRequirement_canvas(newRequirement_canvas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS,
					newRequirement_canvas, newRequirement_canvas));
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
	public EList<Requirements> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectWithInverseResolvingEList.ManyInverse<Requirements>(Requirements.class, this,
					RmdlPackage.TEST_CASE__REQUIREMENTS, RmdlPackage.REQUIREMENTS__TESTCASE);
		}
		return requirements;
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
		case RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_canvas((Requirement_Canvas) otherEnd, msgs);
		case RmdlPackage.TEST_CASE__REQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirements()).basicAdd(otherEnd, msgs);
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
		case RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS:
			return basicSetRequirement_canvas(null, msgs);
		case RmdlPackage.TEST_CASE__REQUIREMENTS:
			return ((InternalEList<?>) getRequirements()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_CANVAS__TESTCASE,
					Requirement_Canvas.class, msgs);
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
		case RmdlPackage.TEST_CASE__ID:
			return getID();
		case RmdlPackage.TEST_CASE__TYPE:
			return getType();
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			return getDescription();
		case RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS:
			return getRequirement_canvas();
		case RmdlPackage.TEST_CASE__HAS_PASSED:
			return isHasPassed();
		case RmdlPackage.TEST_CASE__REQUIREMENTS:
			return getRequirements();
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
		case RmdlPackage.TEST_CASE__ID:
			setID((Integer) newValue);
			return;
		case RmdlPackage.TEST_CASE__TYPE:
			setType((TestType) newValue);
			return;
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) newValue);
			return;
		case RmdlPackage.TEST_CASE__HAS_PASSED:
			setHasPassed((Boolean) newValue);
			return;
		case RmdlPackage.TEST_CASE__REQUIREMENTS:
			getRequirements().clear();
			getRequirements().addAll((Collection<? extends Requirements>) newValue);
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
		case RmdlPackage.TEST_CASE__ID:
			setID(ID_EDEFAULT);
			return;
		case RmdlPackage.TEST_CASE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) null);
			return;
		case RmdlPackage.TEST_CASE__HAS_PASSED:
			setHasPassed(HAS_PASSED_EDEFAULT);
			return;
		case RmdlPackage.TEST_CASE__REQUIREMENTS:
			getRequirements().clear();
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
		case RmdlPackage.TEST_CASE__ID:
			return id != ID_EDEFAULT;
		case RmdlPackage.TEST_CASE__TYPE:
			return type != TYPE_EDEFAULT;
		case RmdlPackage.TEST_CASE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case RmdlPackage.TEST_CASE__REQUIREMENT_CANVAS:
			return getRequirement_canvas() != null;
		case RmdlPackage.TEST_CASE__HAS_PASSED:
			return hasPassed != HAS_PASSED_EDEFAULT;
		case RmdlPackage.TEST_CASE__REQUIREMENTS:
			return requirements != null && !requirements.isEmpty();
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
		result.append(" (ID: ");
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
