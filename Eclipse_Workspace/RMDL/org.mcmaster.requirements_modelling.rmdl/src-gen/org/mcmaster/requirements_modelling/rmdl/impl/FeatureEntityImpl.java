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

import org.mcmaster.requirements_modelling.rmdl.FeatureEntity;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getOptionOf <em>Option Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getAlternativeOf <em>Alternative Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getProductOf <em>Product Of</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureEntityImpl extends Requirement_CanvasImpl implements FeatureEntity {
	/**
	 * The cached value of the '{@link #getComposes() <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposes()
	 * @generated
	 * @ordered
	 */
	protected FeatureEntity composes;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEntity> mandatory;

	/**
	 * The cached value of the '{@link #getOptionOf() <em>Option Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionOf()
	 * @generated
	 * @ordered
	 */
	protected FeatureEntity optionOf;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEntity> optional;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEntity> alternative;

	/**
	 * The cached value of the '{@link #getAlternativeOf() <em>Alternative Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeOf()
	 * @generated
	 * @ordered
	 */
	protected FeatureEntity alternativeOf;

	/**
	 * The cached value of the '{@link #getProductOf() <em>Product Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductOf()
	 * @generated
	 * @ordered
	 */
	protected FeatureEntity productOf;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEntity> variants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureEntityImpl() {
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
	public FeatureEntity getComposes() {
		if (composes != null && composes.eIsProxy()) {
			InternalEObject oldComposes = (InternalEObject) composes;
			composes = (FeatureEntity) eResolveProxy(oldComposes);
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
	public FeatureEntity basicGetComposes() {
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposes(FeatureEntity newComposes, NotificationChain msgs) {
		FeatureEntity oldComposes = composes;
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
	public void setComposes(FeatureEntity newComposes) {
		if (newComposes != composes) {
			NotificationChain msgs = null;
			if (composes != null)
				msgs = ((InternalEObject) composes).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__MANDATORY,
						FeatureEntity.class, msgs);
			if (newComposes != null)
				msgs = ((InternalEObject) newComposes).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__MANDATORY,
						FeatureEntity.class, msgs);
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
	public EList<FeatureEntity> getMandatory() {
		if (mandatory == null) {
			mandatory = new EObjectWithInverseResolvingEList<FeatureEntity>(FeatureEntity.class, this,
					RmdlPackage.FEATURE_ENTITY__MANDATORY, RmdlPackage.FEATURE_ENTITY__COMPOSES);
		}
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureEntity getOptionOf() {
		if (optionOf != null && optionOf.eIsProxy()) {
			InternalEObject oldOptionOf = (InternalEObject) optionOf;
			optionOf = (FeatureEntity) eResolveProxy(oldOptionOf);
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
	public FeatureEntity basicGetOptionOf() {
		return optionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionOf(FeatureEntity newOptionOf, NotificationChain msgs) {
		FeatureEntity oldOptionOf = optionOf;
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
	public void setOptionOf(FeatureEntity newOptionOf) {
		if (newOptionOf != optionOf) {
			NotificationChain msgs = null;
			if (optionOf != null)
				msgs = ((InternalEObject) optionOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						FeatureEntity.class, msgs);
			if (newOptionOf != null)
				msgs = ((InternalEObject) newOptionOf).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						FeatureEntity.class, msgs);
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
	public EList<FeatureEntity> getOptional() {
		if (optional == null) {
			optional = new EObjectWithInverseResolvingEList<FeatureEntity>(FeatureEntity.class, this,
					RmdlPackage.FEATURE_ENTITY__OPTIONAL, RmdlPackage.FEATURE_ENTITY__OPTION_OF);
		}
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureEntity> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectWithInverseResolvingEList<FeatureEntity>(FeatureEntity.class, this,
					RmdlPackage.FEATURE_ENTITY__ALTERNATIVE, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureEntity getAlternativeOf() {
		if (alternativeOf != null && alternativeOf.eIsProxy()) {
			InternalEObject oldAlternativeOf = (InternalEObject) alternativeOf;
			alternativeOf = (FeatureEntity) eResolveProxy(oldAlternativeOf);
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
	public FeatureEntity basicGetAlternativeOf() {
		return alternativeOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeOf(FeatureEntity newAlternativeOf, NotificationChain msgs) {
		FeatureEntity oldAlternativeOf = alternativeOf;
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
	public void setAlternativeOf(FeatureEntity newAlternativeOf) {
		if (newAlternativeOf != alternativeOf) {
			NotificationChain msgs = null;
			if (alternativeOf != null)
				msgs = ((InternalEObject) alternativeOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						FeatureEntity.class, msgs);
			if (newAlternativeOf != null)
				msgs = ((InternalEObject) newAlternativeOf).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						FeatureEntity.class, msgs);
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
	public FeatureEntity getProductOf() {
		if (productOf != null && productOf.eIsProxy()) {
			InternalEObject oldProductOf = (InternalEObject) productOf;
			productOf = (FeatureEntity) eResolveProxy(oldProductOf);
			if (productOf != oldProductOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.FEATURE_ENTITY__PRODUCT_OF,
							oldProductOf, productOf));
			}
		}
		return productOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureEntity basicGetProductOf() {
		return productOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductOf(FeatureEntity newProductOf, NotificationChain msgs) {
		FeatureEntity oldProductOf = productOf;
		productOf = newProductOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ENTITY__PRODUCT_OF, oldProductOf, newProductOf);
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
	public void setProductOf(FeatureEntity newProductOf) {
		if (newProductOf != productOf) {
			NotificationChain msgs = null;
			if (productOf != null)
				msgs = ((InternalEObject) productOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__VARIANTS,
						FeatureEntity.class, msgs);
			if (newProductOf != null)
				msgs = ((InternalEObject) newProductOf).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__VARIANTS,
						FeatureEntity.class, msgs);
			msgs = basicSetProductOf(newProductOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ENTITY__PRODUCT_OF, newProductOf,
					newProductOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureEntity> getVariants() {
		if (variants == null) {
			variants = new EObjectWithInverseResolvingEList<FeatureEntity>(FeatureEntity.class, this,
					RmdlPackage.FEATURE_ENTITY__VARIANTS, RmdlPackage.FEATURE_ENTITY__PRODUCT_OF);
		}
		return variants;
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
						FeatureEntity.class, msgs);
			return basicSetComposes((FeatureEntity) otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMandatory()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			if (optionOf != null)
				msgs = ((InternalEObject) optionOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						FeatureEntity.class, msgs);
			return basicSetOptionOf((FeatureEntity) otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptional()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAlternative()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			if (alternativeOf != null)
				msgs = ((InternalEObject) alternativeOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						FeatureEntity.class, msgs);
			return basicSetAlternativeOf((FeatureEntity) otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__PRODUCT_OF:
			if (productOf != null)
				msgs = ((InternalEObject) productOf).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__VARIANTS,
						FeatureEntity.class, msgs);
			return basicSetProductOf((FeatureEntity) otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__VARIANTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariants()).basicAdd(otherEnd, msgs);
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
		case RmdlPackage.FEATURE_ENTITY__PRODUCT_OF:
			return basicSetProductOf(null, msgs);
		case RmdlPackage.FEATURE_ENTITY__VARIANTS:
			return ((InternalEList<?>) getVariants()).basicRemove(otherEnd, msgs);
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
		case RmdlPackage.FEATURE_ENTITY__PRODUCT_OF:
			if (resolve)
				return getProductOf();
			return basicGetProductOf();
		case RmdlPackage.FEATURE_ENTITY__VARIANTS:
			return getVariants();
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
			setComposes((FeatureEntity) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			getMandatory().clear();
			getMandatory().addAll((Collection<? extends FeatureEntity>) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			setOptionOf((FeatureEntity) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			getOptional().clear();
			getOptional().addAll((Collection<? extends FeatureEntity>) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			getAlternative().clear();
			getAlternative().addAll((Collection<? extends FeatureEntity>) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			setAlternativeOf((FeatureEntity) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__PRODUCT_OF:
			setProductOf((FeatureEntity) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__VARIANTS:
			getVariants().clear();
			getVariants().addAll((Collection<? extends FeatureEntity>) newValue);
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
			setComposes((FeatureEntity) null);
			return;
		case RmdlPackage.FEATURE_ENTITY__MANDATORY:
			getMandatory().clear();
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTION_OF:
			setOptionOf((FeatureEntity) null);
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			getOptional().clear();
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			getAlternative().clear();
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE_OF:
			setAlternativeOf((FeatureEntity) null);
			return;
		case RmdlPackage.FEATURE_ENTITY__PRODUCT_OF:
			setProductOf((FeatureEntity) null);
			return;
		case RmdlPackage.FEATURE_ENTITY__VARIANTS:
			getVariants().clear();
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
		case RmdlPackage.FEATURE_ENTITY__PRODUCT_OF:
			return productOf != null;
		case RmdlPackage.FEATURE_ENTITY__VARIANTS:
			return variants != null && !variants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureEntityImpl
