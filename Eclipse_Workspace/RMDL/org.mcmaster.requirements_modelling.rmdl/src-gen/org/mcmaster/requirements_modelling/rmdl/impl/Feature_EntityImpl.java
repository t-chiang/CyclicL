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

import org.mcmaster.requirements_modelling.rmdl.Feature_Entity;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_EntityImpl#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_EntityImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_EntityImpl#getOptionOf <em>Option Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_EntityImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_EntityImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_EntityImpl#getAlternativeOf <em>Alternative Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Feature_EntityImpl extends Requirement_CanvasImpl implements Feature_Entity {
	/**
	 * The cached value of the '{@link #getComposes() <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposes()
	 * @generated
	 * @ordered
	 */
	protected Feature_Entity composes;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature_Entity> mandatory;

	/**
	 * The cached value of the '{@link #getOptionOf() <em>Option Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionOf()
	 * @generated
	 * @ordered
	 */
	protected Feature_Entity optionOf;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature_Entity> optional;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature_Entity> alternative;

	/**
	 * The cached value of the '{@link #getAlternativeOf() <em>Alternative Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeOf()
	 * @generated
	 * @ordered
	 */
	protected Feature_Entity alternativeOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Feature_EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.FEATURE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Entity getComposes() {
		if (composes != null && composes.eIsProxy()) {
			InternalEObject oldComposes = (InternalEObject) composes;
			composes = (Feature_Entity) eResolveProxy(oldComposes);
			if (composes != oldComposes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.FEATURE_ENTITY__COMPOSES,
							oldComposes, composes));
			}
		}
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Entity basicGetComposes() {
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposes(Feature_Entity newComposes, NotificationChain msgs) {
		Feature_Entity oldComposes = composes;
		composes = newComposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ENTITY__COMPOSES, oldComposes, newComposes);
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
	public void setComposes(Feature_Entity newComposes) {
		if (newComposes != composes) {
			NotificationChain msgs = null;
			if (composes != null)
				msgs = ((InternalEObject) composes).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__MANDATORY,
						Feature_Entity.class, msgs);
			if (newComposes != null)
				msgs = ((InternalEObject) newComposes).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__MANDATORY,
						Feature_Entity.class, msgs);
			msgs = basicSetComposes(newComposes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ENTITY__COMPOSES, newComposes,
					newComposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature_Entity> getMandatory() {
		if (mandatory == null) {
			mandatory = new EObjectWithInverseResolvingEList<Feature_Entity>(Feature_Entity.class, this,
					RmdlPackage.FEATURE_ENTITY__MANDATORY, RmdlPackage.FEATURE_ENTITY__COMPOSES);
		}
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Entity getOptionOf() {
		if (optionOf != null && optionOf.eIsProxy()) {
			InternalEObject oldOptionOf = (InternalEObject) optionOf;
			optionOf = (Feature_Entity) eResolveProxy(oldOptionOf);
			if (optionOf != oldOptionOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.FEATURE_ENTITY__OPTION_OF,
							oldOptionOf, optionOf));
			}
		}
		return optionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Entity basicGetOptionOf() {
		return optionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionOf(Feature_Entity newOptionOf, NotificationChain msgs) {
		Feature_Entity oldOptionOf = optionOf;
		optionOf = newOptionOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ENTITY__OPTION_OF, oldOptionOf, newOptionOf);
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
	public void setOptionOf(Feature_Entity newOptionOf) {
		if (newOptionOf != optionOf) {
			NotificationChain msgs = null;
			if (optionOf != null)
				msgs = ((InternalEObject) optionOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						Feature_Entity.class, msgs);
			if (newOptionOf != null)
				msgs = ((InternalEObject) newOptionOf).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						Feature_Entity.class, msgs);
			msgs = basicSetOptionOf(newOptionOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ENTITY__OPTION_OF, newOptionOf,
					newOptionOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature_Entity> getOptional() {
		if (optional == null) {
			optional = new EObjectWithInverseResolvingEList<Feature_Entity>(Feature_Entity.class, this,
					RmdlPackage.FEATURE_ENTITY__OPTIONAL, RmdlPackage.FEATURE_ENTITY__OPTION_OF);
		}
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature_Entity> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectWithInverseResolvingEList<Feature_Entity>(Feature_Entity.class, this,
					RmdlPackage.FEATURE_ENTITY__ALTERNATIVE, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Entity getAlternativeOf() {
		if (alternativeOf != null && alternativeOf.eIsProxy()) {
			InternalEObject oldAlternativeOf = (InternalEObject) alternativeOf;
			alternativeOf = (Feature_Entity) eResolveProxy(oldAlternativeOf);
			if (alternativeOf != oldAlternativeOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF, oldAlternativeOf, alternativeOf));
			}
		}
		return alternativeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Entity basicGetAlternativeOf() {
		return alternativeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeOf(Feature_Entity newAlternativeOf, NotificationChain msgs) {
		Feature_Entity oldAlternativeOf = alternativeOf;
		alternativeOf = newAlternativeOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF, oldAlternativeOf, newAlternativeOf);
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
	public void setAlternativeOf(Feature_Entity newAlternativeOf) {
		if (newAlternativeOf != alternativeOf) {
			NotificationChain msgs = null;
			if (alternativeOf != null)
				msgs = ((InternalEObject) alternativeOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						Feature_Entity.class, msgs);
			if (newAlternativeOf != null)
				msgs = ((InternalEObject) newAlternativeOf).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						Feature_Entity.class, msgs);
			msgs = basicSetAlternativeOf(newAlternativeOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF,
					newAlternativeOf, newAlternativeOf));
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
		case RmdlPackage.FEATURE_ENTITY__COMPOSES:
			if (composes != null)
				msgs = ((InternalEObject) composes).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__MANDATORY,
						Feature_Entity.class, msgs);
			return basicSetComposes((Feature_Entity) otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMandatory()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			if (optionOf != null)
				msgs = ((InternalEObject) optionOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						Feature_Entity.class, msgs);
			return basicSetOptionOf((Feature_Entity) otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptional()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAlternative()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			if (alternativeOf != null)
				msgs = ((InternalEObject) alternativeOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						Feature_Entity.class, msgs);
			return basicSetAlternativeOf((Feature_Entity) otherEnd, msgs);
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
		case RmdlPackage.FEATURE_ENTITY__COMPOSES:
			return basicSetComposes(null, msgs);
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			return ((InternalEList<?>) getMandatory()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			return basicSetOptionOf(null, msgs);
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return ((InternalEList<?>) getOptional()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return ((InternalEList<?>) getAlternative()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			return basicSetAlternativeOf(null, msgs);
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
		case RmdlPackage.FEATURE_ENTITY__COMPOSES:
			if (resolve)
				return getComposes();
			return basicGetComposes();
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			return getMandatory();
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			if (resolve)
				return getOptionOf();
			return basicGetOptionOf();
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return getOptional();
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return getAlternative();
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			if (resolve)
				return getAlternativeOf();
			return basicGetAlternativeOf();
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
		case RmdlPackage.FEATURE_ENTITY__COMPOSES:
			setComposes((Feature_Entity) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			getMandatory().clear();
			getMandatory().addAll((Collection<? extends Feature_Entity>) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			setOptionOf((Feature_Entity) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			getOptional().clear();
			getOptional().addAll((Collection<? extends Feature_Entity>) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			getAlternative().clear();
			getAlternative().addAll((Collection<? extends Feature_Entity>) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			setAlternativeOf((Feature_Entity) newValue);
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
		case RmdlPackage.FEATURE_ENTITY__COMPOSES:
			setComposes((Feature_Entity) null);
			return;
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			getMandatory().clear();
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			setOptionOf((Feature_Entity) null);
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			getOptional().clear();
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			getAlternative().clear();
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			setAlternativeOf((Feature_Entity) null);
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
		case RmdlPackage.FEATURE_ENTITY__COMPOSES:
			return composes != null;
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			return mandatory != null && !mandatory.isEmpty();
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			return optionOf != null;
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return optional != null && !optional.isEmpty();
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return alternative != null && !alternative.isEmpty();
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			return alternativeOf != null;
		}
		return super.eIsSet(featureID);
	}

} //Feature_EntityImpl
