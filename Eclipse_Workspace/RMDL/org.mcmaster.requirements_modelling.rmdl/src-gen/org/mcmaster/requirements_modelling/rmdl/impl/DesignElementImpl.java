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
import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#isIsHardware <em>Is Hardware</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#isIsSoftware <em>Is Software</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#getTracefrom <em>Tracefrom</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl#getRequirement_canvas <em>Requirement canvas</em>}</li>
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
	 * The default value of the '{@link #isIsHardware() <em>Is Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHardware()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HARDWARE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHardware() <em>Is Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHardware()
	 * @generated
	 * @ordered
	 */
	protected boolean isHardware = IS_HARDWARE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSoftware() <em>Is Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSoftware()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SOFTWARE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSoftware() <em>Is Software</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSoftware()
	 * @generated
	 * @ordered
	 */
	protected boolean isSoftware = IS_SOFTWARE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTracefrom() <em>Tracefrom</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracefrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirements> tracefrom;

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
	public boolean isIsHardware() {
		return isHardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHardware(boolean newIsHardware) {
		boolean oldIsHardware = isHardware;
		isHardware = newIsHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.DESIGN_ELEMENT__IS_HARDWARE,
					oldIsHardware, isHardware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSoftware() {
		return isSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSoftware(boolean newIsSoftware) {
		boolean oldIsSoftware = isSoftware;
		isSoftware = newIsSoftware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.DESIGN_ELEMENT__IS_SOFTWARE,
					oldIsSoftware, isSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirements> getTracefrom() {
		if (tracefrom == null) {
			tracefrom = new EObjectWithInverseResolvingEList.ManyInverse<Requirements>(Requirements.class, this,
					RmdlPackage.DESIGN_ELEMENT__TRACEFROM, RmdlPackage.REQUIREMENTS__TRACETO);
		}
		return tracefrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Canvas getRequirement_canvas() {
		if (eContainerFeatureID() != RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS)
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
		msgs = eBasicSetContainer((InternalEObject) newRequirement_canvas,
				RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_canvas(Requirement_Canvas newRequirement_canvas) {
		if (newRequirement_canvas != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS
						&& newRequirement_canvas != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_canvas))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_canvas != null)
				msgs = ((InternalEObject) newRequirement_canvas).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_CANVAS__DESIGNELEMENT, Requirement_Canvas.class, msgs);
			msgs = basicSetRequirement_canvas(newRequirement_canvas, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS,
					newRequirement_canvas, newRequirement_canvas));
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
		case RmdlPackage.DESIGN_ELEMENT__TRACEFROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTracefrom()).basicAdd(otherEnd, msgs);
		case RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_canvas((Requirement_Canvas) otherEnd, msgs);
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
		case RmdlPackage.DESIGN_ELEMENT__TRACEFROM:
			return ((InternalEList<?>) getTracefrom()).basicRemove(otherEnd, msgs);
		case RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS:
			return basicSetRequirement_canvas(null, msgs);
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
		case RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_CANVAS__DESIGNELEMENT,
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
		case RmdlPackage.DESIGN_ELEMENT__NAME:
			return getName();
		case RmdlPackage.DESIGN_ELEMENT__IS_HARDWARE:
			return isIsHardware();
		case RmdlPackage.DESIGN_ELEMENT__IS_SOFTWARE:
			return isIsSoftware();
		case RmdlPackage.DESIGN_ELEMENT__TRACEFROM:
			return getTracefrom();
		case RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS:
			return getRequirement_canvas();
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
		case RmdlPackage.DESIGN_ELEMENT__IS_HARDWARE:
			setIsHardware((Boolean) newValue);
			return;
		case RmdlPackage.DESIGN_ELEMENT__IS_SOFTWARE:
			setIsSoftware((Boolean) newValue);
			return;
		case RmdlPackage.DESIGN_ELEMENT__TRACEFROM:
			getTracefrom().clear();
			getTracefrom().addAll((Collection<? extends Requirements>) newValue);
			return;
		case RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) newValue);
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
		case RmdlPackage.DESIGN_ELEMENT__IS_HARDWARE:
			setIsHardware(IS_HARDWARE_EDEFAULT);
			return;
		case RmdlPackage.DESIGN_ELEMENT__IS_SOFTWARE:
			setIsSoftware(IS_SOFTWARE_EDEFAULT);
			return;
		case RmdlPackage.DESIGN_ELEMENT__TRACEFROM:
			getTracefrom().clear();
			return;
		case RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS:
			setRequirement_canvas((Requirement_Canvas) null);
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
		case RmdlPackage.DESIGN_ELEMENT__IS_HARDWARE:
			return isHardware != IS_HARDWARE_EDEFAULT;
		case RmdlPackage.DESIGN_ELEMENT__IS_SOFTWARE:
			return isSoftware != IS_SOFTWARE_EDEFAULT;
		case RmdlPackage.DESIGN_ELEMENT__TRACEFROM:
			return tracefrom != null && !tracefrom.isEmpty();
		case RmdlPackage.DESIGN_ELEMENT__REQUIREMENT_CANVAS:
			return getRequirement_canvas() != null;
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
		result.append(", isHardware: ");
		result.append(isHardware);
		result.append(", isSoftware: ");
		result.append(isSoftware);
		result.append(')');
		return result.toString();
	}

} //DesignElementImpl
