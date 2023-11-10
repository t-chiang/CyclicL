/**
 */
package org.mcmaster.requirements_modelling.rmdl.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mcmaster.requirements_modelling.rmdl.Requirement_Root;
import org.mcmaster.requirements_modelling.rmdl.RmdlFactory;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * This is the item provider adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Requirement_RootItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_RootItemProvider(AdapterFactory adapterFactory) {
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

			addPackagePropertyDescriptor(object);
			addDesignelementPropertyDescriptor(object);
			addRequirementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_Root_package_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_Root_package_feature",
								"_UI_Requirement_Root_type"),
						RmdlPackage.Literals.REQUIREMENT_ROOT__PACKAGE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Designelement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDesignelementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_Root_designelement_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_Root_designelement_feature",
								"_UI_Requirement_Root_type"),
						RmdlPackage.Literals.REQUIREMENT_ROOT__DESIGNELEMENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Requirement_Root_requirements_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Requirement_Root_requirements_feature",
								"_UI_Requirement_Root_type"),
						RmdlPackage.Literals.REQUIREMENT_ROOT__REQUIREMENTS, true, false, true, null, null, null));
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
			childrenFeatures.add(RmdlPackage.Literals.REQUIREMENT_ROOT__REFERENCE);
			childrenFeatures.add(RmdlPackage.Literals.REQUIREMENT_ROOT__TESTCASE);
			childrenFeatures.add(RmdlPackage.Literals.REQUIREMENT_ROOT__PACKAGE);
			childrenFeatures.add(RmdlPackage.Literals.REQUIREMENT_ROOT__DESIGNELEMENT);
			childrenFeatures.add(RmdlPackage.Literals.REQUIREMENT_ROOT__REQUIREMENTS);
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
	 * This returns Requirement_Root.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Requirement_Root"));
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
		return getString("_UI_Requirement_Root_type");
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

		switch (notification.getFeatureID(Requirement_Root.class)) {
		case RmdlPackage.REQUIREMENT_ROOT__REFERENCE:
		case RmdlPackage.REQUIREMENT_ROOT__TESTCASE:
		case RmdlPackage.REQUIREMENT_ROOT__PACKAGE:
		case RmdlPackage.REQUIREMENT_ROOT__DESIGNELEMENT:
		case RmdlPackage.REQUIREMENT_ROOT__REQUIREMENTS:
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

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__REFERENCE,
				RmdlFactory.eINSTANCE.createTrace()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__REFERENCE,
				RmdlFactory.eINSTANCE.createVerification()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__REFERENCE,
				RmdlFactory.eINSTANCE.createDecomposition()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__TESTCASE,
				RmdlFactory.eINSTANCE.createTestCase()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__PACKAGE,
				RmdlFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__DESIGNELEMENT,
				RmdlFactory.eINSTANCE.createDesignElement()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__REQUIREMENTS,
				RmdlFactory.eINSTANCE.createFunctional()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__REQUIREMENTS,
				RmdlFactory.eINSTANCE.createQualitative()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__REQUIREMENTS,
				RmdlFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(RmdlPackage.Literals.REQUIREMENT_ROOT__REQUIREMENTS,
				RmdlFactory.eINSTANCE.createSafety()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RmdlEditPlugin.INSTANCE;
	}

}
