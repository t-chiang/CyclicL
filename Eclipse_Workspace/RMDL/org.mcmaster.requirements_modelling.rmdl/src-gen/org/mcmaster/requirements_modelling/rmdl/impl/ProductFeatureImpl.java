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

import org.mcmaster.requirements_modelling.rmdl.Feature_Model;
import org.mcmaster.requirements_modelling.rmdl.ProductFeature;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ProductFeatureImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ProductFeatureImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ProductFeatureImpl#getComposes <em>Composes</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ProductFeatureImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ProductFeatureImpl#getAlternativeof <em>Alternativeof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ProductFeatureImpl#getOptional <em>Optional</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ProductFeatureImpl#getOptionof <em>Optionof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ProductFeatureImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureImpl extends Requirement_DiagramImpl implements ProductFeature {
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
	protected EList<ProductFeature> mandatory;

	/**
	 * The cached value of the '{@link #getComposes() <em>Composes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposes()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature composes;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductFeature> alternative;

	/**
	 * The cached value of the '{@link #getAlternativeof() <em>Alternativeof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeof()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature alternativeof;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductFeature> optional;

	/**
	 * The cached value of the '{@link #getOptionof() <em>Optionof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionof()
	 * @generated
	 * @ordered
	 */
	protected ProductFeature optionof;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.PRODUCT_FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PRODUCT_FEATURE__IS_OPTIONAL,
					oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductFeature> getMandatory() {
		if (mandatory == null) {
			mandatory = new EObjectWithInverseResolvingEList<ProductFeature>(ProductFeature.class, this,
					RmdlPackage.PRODUCT_FEATURE__MANDATORY, RmdlPackage.PRODUCT_FEATURE__COMPOSES);
		}
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature getComposes() {
		if (composes != null && composes.eIsProxy()) {
			InternalEObject oldComposes = (InternalEObject) composes;
			composes = (ProductFeature) eResolveProxy(oldComposes);
			if (composes != oldComposes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.PRODUCT_FEATURE__COMPOSES,
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
	public ProductFeature basicGetComposes() {
		return composes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposes(ProductFeature newComposes, NotificationChain msgs) {
		ProductFeature oldComposes = composes;
		composes = newComposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.PRODUCT_FEATURE__COMPOSES, oldComposes, newComposes);
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
	public void setComposes(ProductFeature newComposes) {
		if (newComposes != composes) {
			NotificationChain msgs = null;
			if (composes != null)
				msgs = ((InternalEObject) composes).eInverseRemove(this, RmdlPackage.PRODUCT_FEATURE__MANDATORY,
						ProductFeature.class, msgs);
			if (newComposes != null)
				msgs = ((InternalEObject) newComposes).eInverseAdd(this, RmdlPackage.PRODUCT_FEATURE__MANDATORY,
						ProductFeature.class, msgs);
			msgs = basicSetComposes(newComposes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PRODUCT_FEATURE__COMPOSES, newComposes,
					newComposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductFeature> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectWithInverseResolvingEList<ProductFeature>(ProductFeature.class, this,
					RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE, RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature getAlternativeof() {
		if (alternativeof != null && alternativeof.eIsProxy()) {
			InternalEObject oldAlternativeof = (InternalEObject) alternativeof;
			alternativeof = (ProductFeature) eResolveProxy(oldAlternativeof);
			if (alternativeof != oldAlternativeof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF, oldAlternativeof, alternativeof));
			}
		}
		return alternativeof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature basicGetAlternativeof() {
		return alternativeof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeof(ProductFeature newAlternativeof, NotificationChain msgs) {
		ProductFeature oldAlternativeof = alternativeof;
		alternativeof = newAlternativeof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF, oldAlternativeof, newAlternativeof);
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
	public void setAlternativeof(ProductFeature newAlternativeof) {
		if (newAlternativeof != alternativeof) {
			NotificationChain msgs = null;
			if (alternativeof != null)
				msgs = ((InternalEObject) alternativeof).eInverseRemove(this, RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE,
						ProductFeature.class, msgs);
			if (newAlternativeof != null)
				msgs = ((InternalEObject) newAlternativeof).eInverseAdd(this, RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE,
						ProductFeature.class, msgs);
			msgs = basicSetAlternativeof(newAlternativeof, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF,
					newAlternativeof, newAlternativeof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductFeature> getOptional() {
		if (optional == null) {
			optional = new EObjectWithInverseResolvingEList<ProductFeature>(ProductFeature.class, this,
					RmdlPackage.PRODUCT_FEATURE__OPTIONAL, RmdlPackage.PRODUCT_FEATURE__OPTIONOF);
		}
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeature getOptionof() {
		if (optionof != null && optionof.eIsProxy()) {
			InternalEObject oldOptionof = (InternalEObject) optionof;
			optionof = (ProductFeature) eResolveProxy(oldOptionof);
			if (optionof != oldOptionof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmdlPackage.PRODUCT_FEATURE__OPTIONOF,
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
	public ProductFeature basicGetOptionof() {
		return optionof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionof(ProductFeature newOptionof, NotificationChain msgs) {
		ProductFeature oldOptionof = optionof;
		optionof = newOptionof;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RmdlPackage.PRODUCT_FEATURE__OPTIONOF, oldOptionof, newOptionof);
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
	public void setOptionof(ProductFeature newOptionof) {
		if (newOptionof != optionof) {
			NotificationChain msgs = null;
			if (optionof != null)
				msgs = ((InternalEObject) optionof).eInverseRemove(this, RmdlPackage.PRODUCT_FEATURE__OPTIONAL,
						ProductFeature.class, msgs);
			if (newOptionof != null)
				msgs = ((InternalEObject) newOptionof).eInverseAdd(this, RmdlPackage.PRODUCT_FEATURE__OPTIONAL,
						ProductFeature.class, msgs);
			msgs = basicSetOptionof(newOptionof, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PRODUCT_FEATURE__OPTIONOF, newOptionof,
					newOptionof));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Model getProduct() {
		if (eContainerFeatureID() != RmdlPackage.PRODUCT_FEATURE__PRODUCT)
			return null;
		return (Feature_Model) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProduct(Feature_Model newProduct, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProduct, RmdlPackage.PRODUCT_FEATURE__PRODUCT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Feature_Model newProduct) {
		if (newProduct != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.PRODUCT_FEATURE__PRODUCT && newProduct != null)) {
			if (EcoreUtil.isAncestor(this, newProduct))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProduct != null)
				msgs = ((InternalEObject) newProduct).eInverseAdd(this, RmdlPackage.FEATURE_MODEL__PRODUCTFEATURE,
						Feature_Model.class, msgs);
			msgs = basicSetProduct(newProduct, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.PRODUCT_FEATURE__PRODUCT, newProduct,
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
		case RmdlPackage.PRODUCT_FEATURE__MANDATORY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMandatory()).basicAdd(otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__COMPOSES:
			if (composes != null)
				msgs = ((InternalEObject) composes).eInverseRemove(this, RmdlPackage.PRODUCT_FEATURE__MANDATORY,
						ProductFeature.class, msgs);
			return basicSetComposes((ProductFeature) otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAlternative()).basicAdd(otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF:
			if (alternativeof != null)
				msgs = ((InternalEObject) alternativeof).eInverseRemove(this, RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE,
						ProductFeature.class, msgs);
			return basicSetAlternativeof((ProductFeature) otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__OPTIONAL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptional()).basicAdd(otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__OPTIONOF:
			if (optionof != null)
				msgs = ((InternalEObject) optionof).eInverseRemove(this, RmdlPackage.PRODUCT_FEATURE__OPTIONAL,
						ProductFeature.class, msgs);
			return basicSetOptionof((ProductFeature) otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__PRODUCT:
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
		case RmdlPackage.PRODUCT_FEATURE__MANDATORY:
			return ((InternalEList<?>) getMandatory()).basicRemove(otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__COMPOSES:
			return basicSetComposes(null, msgs);
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE:
			return ((InternalEList<?>) getAlternative()).basicRemove(otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF:
			return basicSetAlternativeof(null, msgs);
		case RmdlPackage.PRODUCT_FEATURE__OPTIONAL:
			return ((InternalEList<?>) getOptional()).basicRemove(otherEnd, msgs);
		case RmdlPackage.PRODUCT_FEATURE__OPTIONOF:
			return basicSetOptionof(null, msgs);
		case RmdlPackage.PRODUCT_FEATURE__PRODUCT:
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
		case RmdlPackage.PRODUCT_FEATURE__PRODUCT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.FEATURE_MODEL__PRODUCTFEATURE,
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
		case RmdlPackage.PRODUCT_FEATURE__IS_OPTIONAL:
			return isIsOptional();
		case RmdlPackage.PRODUCT_FEATURE__MANDATORY:
			return getMandatory();
		case RmdlPackage.PRODUCT_FEATURE__COMPOSES:
			if (resolve)
				return getComposes();
			return basicGetComposes();
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE:
			return getAlternative();
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF:
			if (resolve)
				return getAlternativeof();
			return basicGetAlternativeof();
		case RmdlPackage.PRODUCT_FEATURE__OPTIONAL:
			return getOptional();
		case RmdlPackage.PRODUCT_FEATURE__OPTIONOF:
			if (resolve)
				return getOptionof();
			return basicGetOptionof();
		case RmdlPackage.PRODUCT_FEATURE__PRODUCT:
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
		case RmdlPackage.PRODUCT_FEATURE__IS_OPTIONAL:
			setIsOptional((Boolean) newValue);
			return;
		case RmdlPackage.PRODUCT_FEATURE__MANDATORY:
			getMandatory().clear();
			getMandatory().addAll((Collection<? extends ProductFeature>) newValue);
			return;
		case RmdlPackage.PRODUCT_FEATURE__COMPOSES:
			setComposes((ProductFeature) newValue);
			return;
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE:
			getAlternative().clear();
			getAlternative().addAll((Collection<? extends ProductFeature>) newValue);
			return;
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF:
			setAlternativeof((ProductFeature) newValue);
			return;
		case RmdlPackage.PRODUCT_FEATURE__OPTIONAL:
			getOptional().clear();
			getOptional().addAll((Collection<? extends ProductFeature>) newValue);
			return;
		case RmdlPackage.PRODUCT_FEATURE__OPTIONOF:
			setOptionof((ProductFeature) newValue);
			return;
		case RmdlPackage.PRODUCT_FEATURE__PRODUCT:
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
		case RmdlPackage.PRODUCT_FEATURE__IS_OPTIONAL:
			setIsOptional(IS_OPTIONAL_EDEFAULT);
			return;
		case RmdlPackage.PRODUCT_FEATURE__MANDATORY:
			getMandatory().clear();
			return;
		case RmdlPackage.PRODUCT_FEATURE__COMPOSES:
			setComposes((ProductFeature) null);
			return;
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE:
			getAlternative().clear();
			return;
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF:
			setAlternativeof((ProductFeature) null);
			return;
		case RmdlPackage.PRODUCT_FEATURE__OPTIONAL:
			getOptional().clear();
			return;
		case RmdlPackage.PRODUCT_FEATURE__OPTIONOF:
			setOptionof((ProductFeature) null);
			return;
		case RmdlPackage.PRODUCT_FEATURE__PRODUCT:
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
		case RmdlPackage.PRODUCT_FEATURE__IS_OPTIONAL:
			return isOptional != IS_OPTIONAL_EDEFAULT;
		case RmdlPackage.PRODUCT_FEATURE__MANDATORY:
			return mandatory != null && !mandatory.isEmpty();
		case RmdlPackage.PRODUCT_FEATURE__COMPOSES:
			return composes != null;
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVE:
			return alternative != null && !alternative.isEmpty();
		case RmdlPackage.PRODUCT_FEATURE__ALTERNATIVEOF:
			return alternativeof != null;
		case RmdlPackage.PRODUCT_FEATURE__OPTIONAL:
			return optional != null && !optional.isEmpty();
		case RmdlPackage.PRODUCT_FEATURE__OPTIONOF:
			return optionof != null;
		case RmdlPackage.PRODUCT_FEATURE__PRODUCT:
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

} //ProductFeatureImpl
