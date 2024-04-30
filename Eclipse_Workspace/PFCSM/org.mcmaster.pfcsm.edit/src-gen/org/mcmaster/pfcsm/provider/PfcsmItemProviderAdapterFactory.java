/**
 */
package org.mcmaster.pfcsm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.mcmaster.pfcsm.util.PfcsmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PfcsmItemProviderAdapterFactory extends PfcsmAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PfcsmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.DesignEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignEntityItemProvider designEntityItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.DesignEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDesignEntityAdapter() {
		if (designEntityItemProvider == null) {
			designEntityItemProvider = new DesignEntityItemProvider(this);
		}

		return designEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Class_Diagram_Root} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class_Diagram_RootItemProvider class_Diagram_RootItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Class_Diagram_Root}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClass_Diagram_RootAdapter() {
		if (class_Diagram_RootItemProvider == null) {
			class_Diagram_RootItemProvider = new Class_Diagram_RootItemProvider(this);
		}

		return class_Diagram_RootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Uses} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsesItemProvider usesItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Uses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsesAdapter() {
		if (usesItemProvider == null) {
			usesItemProvider = new UsesItemProvider(this);
		}

		return usesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Composition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionItemProvider compositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Composition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositionAdapter() {
		if (compositionItemProvider == null) {
			compositionItemProvider = new CompositionItemProvider(this);
		}

		return compositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Produces} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProducesItemProvider producesItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Produces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProducesAdapter() {
		if (producesItemProvider == null) {
			producesItemProvider = new ProducesItemProvider(this);
		}

		return producesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Hardware} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareItemProvider hardwareItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Hardware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHardwareAdapter() {
		if (hardwareItemProvider == null) {
			hardwareItemProvider = new HardwareItemProvider(this);
		}

		return hardwareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Software} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareItemProvider softwareItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Software}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSoftwareAdapter() {
		if (softwareItemProvider == null) {
			softwareItemProvider = new SoftwareItemProvider(this);
		}

		return softwareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Aggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationItemProvider aggregationItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregationAdapter() {
		if (aggregationItemProvider == null) {
			aggregationItemProvider = new AggregationItemProvider(this);
		}

		return aggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.pfcsm.Alternative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeItemProvider alternativeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.pfcsm.Alternative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAlternativeAdapter() {
		if (alternativeItemProvider == null) {
			alternativeItemProvider = new AlternativeItemProvider(this);
		}

		return alternativeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (designEntityItemProvider != null)
			designEntityItemProvider.dispose();
		if (class_Diagram_RootItemProvider != null)
			class_Diagram_RootItemProvider.dispose();
		if (usesItemProvider != null)
			usesItemProvider.dispose();
		if (compositionItemProvider != null)
			compositionItemProvider.dispose();
		if (producesItemProvider != null)
			producesItemProvider.dispose();
		if (attributeItemProvider != null)
			attributeItemProvider.dispose();
		if (operationItemProvider != null)
			operationItemProvider.dispose();
		if (hardwareItemProvider != null)
			hardwareItemProvider.dispose();
		if (softwareItemProvider != null)
			softwareItemProvider.dispose();
		if (aggregationItemProvider != null)
			aggregationItemProvider.dispose();
		if (alternativeItemProvider != null)
			alternativeItemProvider.dispose();
	}

}
