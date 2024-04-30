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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mcmaster.requirements_modelling.rmdl.FeatureElement;
import org.mcmaster.requirements_modelling.rmdl.Feature_Model;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl#getAlternativeof <em>Alternativeof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl#getOptionof <em>Optionof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureElementImpl extends Requirement_DiagramImpl implements FeatureElement {
	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureElement> mandatory;

	/**
	 * The cached value of the '{@link #getComposes() <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposes()
	 * @generated
	 * @ordered
	 */
	protected FeatureElement composes;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureElement> alternative;

	/**
	 * The cached value of the '{@link #getAlternativeof() <em>Alternativeof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeof()
	 * @generated
	 * @ordered
	 */
	protected FeatureElement alternativeof;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureElement> optional;

	/**
	 * The cached value of the '{@link #getOptionof() <em>Optionof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionof()
	 * @generated
	 * @ordered
	 */
	protected FeatureElement optionof;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.FEATURE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ELEMENT__IS_OPTIONAL,
					oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureElement> getMandatory() {
		if (mandatory == null) {
			mandatory = new EObjectWithInverseResolvingEList<FeatureElement>(FeatureElement.class, this,
					RmdlPackage.FEATURE_ELEMENT__MANDATORY, RmdlPackage.FEATURE_ELEMENT__COMPOSES);
		}
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureElement getComposes() {
		if (composes != null && composes.eIsProxy()) {
			InternalEObject oldComposes = (InternalEObject) composes;
			composes = (FeatureElement) eResolveProxy(oldComposes);
			if (composes != oldComposes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.FEATURE_ELEMENT__COMPOSES,
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
	public FeatureElement basicGetComposes() {
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposes(FeatureElement newComposes, NotificationChain msgs) {
		FeatureElement oldComposes = composes;
		composes = newComposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ELEMENT__COMPOSES, oldComposes, newComposes);
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
	public void setComposes(FeatureElement newComposes) {
		if (newComposes != composes) {
			NotificationChain msgs = null;
			if (composes != null)
				msgs = ((InternalEObject) composes).eInverseRemove(this, RmdlPackage.FEATURE_ELEMENT__MANDATORY,
						FeatureElement.class, msgs);
			if (newComposes != null)
				msgs = ((InternalEObject) newComposes).eInverseAdd(this, RmdlPackage.FEATURE_ELEMENT__MANDATORY,
						FeatureElement.class, msgs);
			msgs = basicSetComposes(newComposes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ELEMENT__COMPOSES, newComposes,
					newComposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureElement> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectWithInverseResolvingEList<FeatureElement>(FeatureElement.class, this,
					RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE, RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureElement getAlternativeof() {
		if (alternativeof != null && alternativeof.eIsProxy()) {
			InternalEObject oldAlternativeof = (InternalEObject) alternativeof;
			alternativeof = (FeatureElement) eResolveProxy(oldAlternativeof);
			if (alternativeof != oldAlternativeof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF, oldAlternativeof, alternativeof));
			}
		}
		return alternativeof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureElement basicGetAlternativeof() {
		return alternativeof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeof(FeatureElement newAlternativeof, NotificationChain msgs) {
		FeatureElement oldAlternativeof = alternativeof;
		alternativeof = newAlternativeof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF, oldAlternativeof, newAlternativeof);
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
	public void setAlternativeof(FeatureElement newAlternativeof) {
		if (newAlternativeof != alternativeof) {
			NotificationChain msgs = null;
			if (alternativeof != null)
				msgs = ((InternalEObject) alternativeof).eInverseRemove(this, RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE,
						FeatureElement.class, msgs);
			if (newAlternativeof != null)
				msgs = ((InternalEObject) newAlternativeof).eInverseAdd(this, RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE,
						FeatureElement.class, msgs);
			msgs = basicSetAlternativeof(newAlternativeof, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF,
					newAlternativeof, newAlternativeof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureElement> getOptional() {
		if (optional == null) {
			optional = new EObjectWithInverseResolvingEList<FeatureElement>(FeatureElement.class, this,
					RmdlPackage.FEATURE_ELEMENT__OPTIONAL, RmdlPackage.FEATURE_ELEMENT__OPTIONOF);
		}
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureElement getOptionof() {
		if (optionof != null && optionof.eIsProxy()) {
			InternalEObject oldOptionof = (InternalEObject) optionof;
			optionof = (FeatureElement) eResolveProxy(oldOptionof);
			if (optionof != oldOptionof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.FEATURE_ELEMENT__OPTIONOF,
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
	public FeatureElement basicGetOptionof() {
		return optionof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionof(FeatureElement newOptionof, NotificationChain msgs) {
		FeatureElement oldOptionof = optionof;
		optionof = newOptionof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.FEATURE_ELEMENT__OPTIONOF, oldOptionof, newOptionof);
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
	public void setOptionof(FeatureElement newOptionof) {
		if (newOptionof != optionof) {
			NotificationChain msgs = null;
			if (optionof != null)
				msgs = ((InternalEObject) optionof).eInverseRemove(this, RmdlPackage.FEATURE_ELEMENT__OPTIONAL,
						FeatureElement.class, msgs);
			if (newOptionof != null)
				msgs = ((InternalEObject) newOptionof).eInverseAdd(this, RmdlPackage.FEATURE_ELEMENT__OPTIONAL,
						FeatureElement.class, msgs);
			msgs = basicSetOptionof(newOptionof, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ELEMENT__OPTIONOF, newOptionof,
					newOptionof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Model getProduct() {
		if (eContainerFeatureID() != RmdlPackage.FEATURE_ELEMENT__PRODUCT)
			return null;
		return (Feature_Model) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Feature_Model newProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProduct, RmdlPackage.FEATURE_ELEMENT__PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Feature_Model newProduct) {
		if (newProduct != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.FEATURE_ELEMENT__PRODUCT && newProduct != null)) {
			if (EcoreUtil.isAncestor(this, newProduct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProduct != null)
				msgs = ((InternalEObject) newProduct).eInverseAdd(this, RmdlPackage.FEATURE_MODEL__FEATUREELEMENT,
						Feature_Model.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.FEATURE_ELEMENT__PRODUCT, newProduct,
					newProduct));
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
		case RmdlPackage.FEATURE_ELEMENT__MANDATORY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMandatory()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__COMPOSES:
			if (composes != null)
				msgs = ((InternalEObject) composes).eInverseRemove(this, RmdlPackage.FEATURE_ELEMENT__MANDATORY,
						FeatureElement.class, msgs);
			return basicSetComposes((FeatureElement) otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAlternative()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF:
			if (alternativeof != null)
				msgs = ((InternalEObject) alternativeof).eInverseRemove(this, RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE,
						FeatureElement.class, msgs);
			return basicSetAlternativeof((FeatureElement) otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__OPTIONAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptional()).basicAdd(otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__OPTIONOF:
			if (optionof != null)
				msgs = ((InternalEObject) optionof).eInverseRemove(this, RmdlPackage.FEATURE_ELEMENT__OPTIONAL,
						FeatureElement.class, msgs);
			return basicSetOptionof((FeatureElement) otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__PRODUCT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProduct((Feature_Model) otherEnd, msgs);
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
		case RmdlPackage.FEATURE_ELEMENT__MANDATORY:
			return ((InternalEList<?>) getMandatory()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__COMPOSES:
			return basicSetComposes(null, msgs);
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE:
			return ((InternalEList<?>) getAlternative()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF:
			return basicSetAlternativeof(null, msgs);
		case RmdlPackage.FEATURE_ELEMENT__OPTIONAL:
			return ((InternalEList<?>) getOptional()).basicRemove(otherEnd, msgs);
		case RmdlPackage.FEATURE_ELEMENT__OPTIONOF:
			return basicSetOptionof(null, msgs);
		case RmdlPackage.FEATURE_ELEMENT__PRODUCT:
			return basicSetProduct(null, msgs);
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
		case RmdlPackage.FEATURE_ELEMENT__PRODUCT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.FEATURE_MODEL__FEATUREELEMENT,
					Feature_Model.class, msgs);
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
		case RmdlPackage.FEATURE_ELEMENT__IS_OPTIONAL:
			return isIsOptional();
		case RmdlPackage.FEATURE_ELEMENT__MANDATORY:
			return getMandatory();
		case RmdlPackage.FEATURE_ELEMENT__COMPOSES:
			if (resolve)
				return getComposes();
			return basicGetComposes();
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE:
			return getAlternative();
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF:
			if (resolve)
				return getAlternativeof();
			return basicGetAlternativeof();
		case RmdlPackage.FEATURE_ELEMENT__OPTIONAL:
			return getOptional();
		case RmdlPackage.FEATURE_ELEMENT__OPTIONOF:
			if (resolve)
				return getOptionof();
			return basicGetOptionof();
		case RmdlPackage.FEATURE_ELEMENT__PRODUCT:
			return getProduct();
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
		case RmdlPackage.FEATURE_ELEMENT__IS_OPTIONAL:
			setIsOptional((Boolean) newValue);
			return;
		case RmdlPackage.FEATURE_ELEMENT__MANDATORY:
			getMandatory().clear();
			getMandatory().addAll((Collection<? extends FeatureElement>) newValue);
			return;
		case RmdlPackage.FEATURE_ELEMENT__COMPOSES:
			setComposes((FeatureElement) newValue);
			return;
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE:
			getAlternative().clear();
			getAlternative().addAll((Collection<? extends FeatureElement>) newValue);
			return;
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF:
			setAlternativeof((FeatureElement) newValue);
			return;
		case RmdlPackage.FEATURE_ELEMENT__OPTIONAL:
			getOptional().clear();
			getOptional().addAll((Collection<? extends FeatureElement>) newValue);
			return;
		case RmdlPackage.FEATURE_ELEMENT__OPTIONOF:
			setOptionof((FeatureElement) newValue);
			return;
		case RmdlPackage.FEATURE_ELEMENT__PRODUCT:
			setProduct((Feature_Model) newValue);
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
		case RmdlPackage.FEATURE_ELEMENT__IS_OPTIONAL:
			setIsOptional(IS_OPTIONAL_EDEFAULT);
			return;
		case RmdlPackage.FEATURE_ELEMENT__MANDATORY:
			getMandatory().clear();
			return;
		case RmdlPackage.FEATURE_ELEMENT__COMPOSES:
			setComposes((FeatureElement) null);
			return;
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE:
			getAlternative().clear();
			return;
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF:
			setAlternativeof((FeatureElement) null);
			return;
		case RmdlPackage.FEATURE_ELEMENT__OPTIONAL:
			getOptional().clear();
			return;
		case RmdlPackage.FEATURE_ELEMENT__OPTIONOF:
			setOptionof((FeatureElement) null);
			return;
		case RmdlPackage.FEATURE_ELEMENT__PRODUCT:
			setProduct((Feature_Model) null);
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
		case RmdlPackage.FEATURE_ELEMENT__IS_OPTIONAL:
			return isOptional != IS_OPTIONAL_EDEFAULT;
		case RmdlPackage.FEATURE_ELEMENT__MANDATORY:
			return mandatory != null && !mandatory.isEmpty();
		case RmdlPackage.FEATURE_ELEMENT__COMPOSES:
			return composes != null;
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVE:
			return alternative != null && !alternative.isEmpty();
		case RmdlPackage.FEATURE_ELEMENT__ALTERNATIVEOF:
			return alternativeof != null;
		case RmdlPackage.FEATURE_ELEMENT__OPTIONAL:
			return optional != null && !optional.isEmpty();
		case RmdlPackage.FEATURE_ELEMENT__OPTIONOF:
			return optionof != null;
		case RmdlPackage.FEATURE_ELEMENT__PRODUCT:
			return getProduct() != null;
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
		result.append(" (isOptional: ");
		result.append(isOptional);
		result.append(')');
		return result.toString();
	}

} //FeatureElementImpl
