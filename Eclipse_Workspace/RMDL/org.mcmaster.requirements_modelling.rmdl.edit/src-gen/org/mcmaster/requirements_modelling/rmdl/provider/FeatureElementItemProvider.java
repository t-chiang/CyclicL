/**
 */
package org.mcmaster.requirements_modelling.rmdl.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mcmaster.requirements_modelling.rmdl.FeatureElement;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * This is the item provider adapter for a {@link org.mcmaster.requirements_modelling.rmdl.FeatureElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureElementItemProvider extends Requirement_DiagramItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIsOptionalPropertyDescriptor(object);
			addMandatoryPropertyDescriptor(object);
			addComposesPropertyDescriptor(object);
			addAlternativePropertyDescriptor(object);
			addAlternativeofPropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
			addOptionofPropertyDescriptor(object);
			addProductPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureElement_isOptional_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureElement_isOptional_feature",
								"_UI_FeatureElement_type"),
						RmdlPackage.Literals.FEATURE_ELEMENT__IS_OPTIONAL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Mandatory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMandatoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureElement_mandatory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureElement_mandatory_feature",
								"_UI_FeatureElement_type"),
						RmdlPackage.Literals.FEATURE_ELEMENT__MANDATORY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Composes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComposesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureElement_composes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureElement_composes_feature",
								"_UI_FeatureElement_type"),
						RmdlPackage.Literals.FEATURE_ELEMENT__COMPOSES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Alternative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureElement_alternative_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureElement_alternative_feature",
								"_UI_FeatureElement_type"),
						RmdlPackage.Literals.FEATURE_ELEMENT__ALTERNATIVE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Alternativeof feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlternativeofPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureElement_alternativeof_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureElement_alternativeof_feature",
								"_UI_FeatureElement_type"),
						RmdlPackage.Literals.FEATURE_ELEMENT__ALTERNATIVEOF, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureElement_optional_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureElement_optional_feature",
								"_UI_FeatureElement_type"),
						RmdlPackage.Literals.FEATURE_ELEMENT__OPTIONAL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Optionof feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionofPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureElement_optionof_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureElement_optionof_feature",
								"_UI_FeatureElement_type"),
						RmdlPackage.Literals.FEATURE_ELEMENT__OPTIONOF, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureElement_product_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureElement_product_feature",
								"_UI_FeatureElement_type"),
						RmdlPackage.Literals.FEATURE_ELEMENT__PRODUCT, true, false, true, null, null, null));
	}

	/**
	 * This returns FeatureElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureElement"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureElement) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FeatureElement_type")
				: getString("_UI_FeatureElement_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FeatureElement.class)) {
		case RmdlPackage.FEATURE_ELEMENT__IS_OPTIONAL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
