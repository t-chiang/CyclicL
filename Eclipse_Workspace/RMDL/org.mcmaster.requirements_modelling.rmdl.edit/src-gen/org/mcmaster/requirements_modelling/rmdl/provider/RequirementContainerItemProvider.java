/**
 */
package org.mcmaster.requirements_modelling.rmdl.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mcmaster.requirements_modelling.rmdl.RequirementContainer;
import org.mcmaster.requirements_modelling.rmdl.RmdlFactory;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * This is the item provider adapter for a {@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementContainerItemProvider extends RequirementsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementContainerItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedrequirementsPropertyDescriptor(object);
			addRequirement_canvasPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ownedrequirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedrequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequirementContainer_ownedrequirements_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RequirementContainer_ownedrequirements_feature",
						"_UI_RequirementContainer_type"),
				RmdlPackage.Literals.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Requirement canvas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirement_canvasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_RequirementContainer_requirement_canvas_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RequirementContainer_requirement_canvas_feature",
						"_UI_RequirementContainer_type"),
				RmdlPackage.Literals.REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RmdlPackage.Literals.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RequirementContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RequirementContainer"));
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
		String label = ((RequirementContainer) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_RequirementContainer_type")
				: getString("_UI_RequirementContainer_type") + " " + label;
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

		switch (notification.getFeatureID(RequirementContainer.class)) {
		case RmdlPackage.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS,
				RmdlFactory.eINSTANCE.createFunctional()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS,
				RmdlFactory.eINSTANCE.createQualitative()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS,
				RmdlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS,
				RmdlFactory.eINSTANCE.createSafety()));
	}

}
