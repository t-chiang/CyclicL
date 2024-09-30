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
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getOptionof <em>Optionof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl#getAlternativeof <em>Alternativeof</em>}</li>
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
	 * The cached value of the '{@link #getOptionof() <em>Optionof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionof()
	 * @generated
	 * @ordered
	 */
	protected FeatureEntity optionof;

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
	 * The cached value of the '{@link #getAlternativeof() <em>Alternativeof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeof()
	 * @generated
	 * @ordered
	 */
	protected FeatureEntity alternativeof;

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
	public FeatureEntity getOptionof() {
		if (optionof != null && optionof.eIsProxy()) {
			InternalEObject oldOptionof = (InternalEObject) optionof;
			optionof = (FeatureEntity) eResolveProxy(oldOptionof);
			if (optionof != oldOptionof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.FEATURE_ENTITY__OPTIONOF,
							oldOptionof, optionof));
			}
		}
		return optionof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureEntity basicGetOptionof() {
		return optionof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionof(FeatureEntity newOptionof, NotificationChain msgs) {
		FeatureEntity oldOptionof = optionof;
		optionof = newOptionof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ENTITY__OPTIONOF, oldOptionof, newOptionof);
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
	public void setOptionof(FeatureEntity newOptionof) {
		if (newOptionof != optionof) {
			NotificationChain msgs = null;
			if (optionof != null)
				msgs = ((InternalEObject) optionof).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						FeatureEntity.class, msgs);
			if (newOptionof != null)
				msgs = ((InternalEObject) newOptionof).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						FeatureEntity.class, msgs);
			msgs = basicSetOptionof(newOptionof, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ENTITY__OPTIONOF, newOptionof,
					newOptionof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureEntity> getOptional() {
		if (optional == null) {
			optional = new EObjectWithInverseResolvingEList<FeatureEntity>(FeatureEntity.class, this,
					RmdlPackage.FEATURE_ENTITY__OPTIONAL, RmdlPackage.FEATURE_ENTITY__OPTIONOF);
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
					RmdlPackage.FEATURE_ENTITY__ALTERNATIVE, RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureEntity getAlternativeof() {
		if (alternativeof != null && alternativeof.eIsProxy()) {
			InternalEObject oldAlternativeof = (InternalEObject) alternativeof;
			alternativeof = (FeatureEntity) eResolveProxy(oldAlternativeof);
			if (alternativeof != oldAlternativeof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF,
							oldAlternativeof, alternativeof));
			}
		}
		return alternativeof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureEntity basicGetAlternativeof() {
		return alternativeof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeof(FeatureEntity newAlternativeof, NotificationChain msgs) {
		FeatureEntity oldAlternativeof = alternativeof;
		alternativeof = newAlternativeof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF, oldAlternativeof, newAlternativeof);
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
	public void setAlternativeof(FeatureEntity newAlternativeof) {
		if (newAlternativeof != alternativeof) {
			NotificationChain msgs = null;
			if (alternativeof != null)
				msgs = ((InternalEObject) alternativeof).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						FeatureEntity.class, msgs);
			if (newAlternativeof != null)
				msgs = ((InternalEObject) newAlternativeof).eInverseAdd(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						FeatureEntity.class, msgs);
			msgs = basicSetAlternativeof(newAlternativeof, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF,
					newAlternativeof, newAlternativeof));
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
		case RmdlPackage.FEATURE_ENTITY__OPTIONOF:
			if (optionof != null)
				msgs = ((InternalEObject) optionof).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__OPTIONAL,
						FeatureEntity.class, msgs);
			return basicSetOptionof((FeatureEntity) otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptional()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAlternative()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF:
			if (alternativeof != null)
				msgs = ((InternalEObject) alternativeof).eInverseRemove(this, RmdlPackage.FEATURE_ENTITY__ALTERNATIVE,
						FeatureEntity.class, msgs);
			return basicSetAlternativeof((FeatureEntity) otherEnd, msgs);
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
		case RmdlPackage.FEATURE_ENTITY__OPTIONOF:
			return basicSetOptionof(null, msgs);
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return ((InternalEList<?>) getOptional()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return ((InternalEList<?>) getAlternative()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF:
			return basicSetAlternativeof(null, msgs);
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
		case RmdlPackage.FEATURE_ENTITY__OPTIONOF:
			if (resolve)
				return getOptionof();
			return basicGetOptionof();
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return getOptional();
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return getAlternative();
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF:
			if (resolve)
				return getAlternativeof();
			return basicGetAlternativeof();
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
		case RmdlPackage.FEATURE_ENTITY__OPTIONOF:
			setOptionof((FeatureEntity) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			getOptional().clear();
			getOptional().addAll((Collection<? extends FeatureEntity>) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			getAlternative().clear();
			getAlternative().addAll((Collection<? extends FeatureEntity>) newValue);
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF:
			setAlternativeof((FeatureEntity) newValue);
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
		case RmdlPackage.FEATURE_ENTITY__OPTIONOF:
			setOptionof((FeatureEntity) null);
			return;
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			getOptional().clear();
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			getAlternative().clear();
			return;
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF:
			setAlternativeof((FeatureEntity) null);
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
		case RmdlPackage.FEATURE_ENTITY__OPTIONOF:
			return optionof != null;
		case RmdlPackage.FEATURE_ENTITY__OPTIONAL:
			return optional != null && !optional.isEmpty();
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVE:
			return alternative != null && !alternative.isEmpty();
		case RmdlPackage.FEATURE_ENTITY__ALTERNATIVEOF:
			return alternativeof != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureEntityImpl
