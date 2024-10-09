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

import org.mcmaster.requirements_modelling.rmdl.RequirementType;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * This is the item provider adapter for a {@link org.mcmaster.requirements_modelling.rmdl.RequirementType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementTypeItemProvider extends RequirementsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementTypeItemProvider(AdapterFactory adapterFactory) {
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

			addSpecificationPropertyDescriptor(object);
			addReplacedbyPropertyDescriptor(object);
			addStartingReqPropertyDescriptor(object);
			addDependsonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RequirementType_specification_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RequirementType_specification_feature",
								"_UI_RequirementType_type"),
						RmdlPackage.Literals.REQUIREMENT_TYPE__SPECIFICATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Replacedby feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplacedbyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RequirementType_replacedby_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RequirementType_replacedby_feature",
								"_UI_RequirementType_type"),
						RmdlPackage.Literals.REQUIREMENT_TYPE__REPLACEDBY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Starting Req feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartingReqPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RequirementType_startingReq_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RequirementType_startingReq_feature",
								"_UI_RequirementType_type"),
						RmdlPackage.Literals.REQUIREMENT_TYPE__STARTING_REQ, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dependson feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependsonPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RequirementType_dependson_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RequirementType_dependson_feature",
								"_UI_RequirementType_type"),
						RmdlPackage.Literals.REQUIREMENT_TYPE__DEPENDSON, true, false, true, null, null, null));
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
		String label = ((RequirementType) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RequirementType_type")
				: getString("_UI_RequirementType_type") + " " + label;
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

		switch (notification.getFeatureID(RequirementType.class)) {
		case RmdlPackage.REQUIREMENT_TYPE__SPECIFICATION:
		case RmdlPackage.REQUIREMENT_TYPE__STARTING_REQ:
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
