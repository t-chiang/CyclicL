/**
 */
package org.mcmaster.requirements_modelling.rmdl.provider;

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

import org.mcmaster.requirements_modelling.rmdl.util.RmdlAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RmdlItemProviderAdapterFactory extends RmdlAdapterFactory
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
	public RmdlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.Functional} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalItemProvider functionalItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Functional}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionalAdapter() {
		if (functionalItemProvider == null) {
			functionalItemProvider = new FunctionalItemProvider(this);
		}

		return functionalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.Qualitative} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitativeItemProvider qualitativeItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Qualitative}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualitativeAdapter() {
		if (qualitativeItemProvider == null) {
			qualitativeItemProvider = new QualitativeItemProvider(this);
		}

		return qualitativeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.Package} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageItemProvider packageItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Package}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageAdapter() {
		if (packageItemProvider == null) {
			packageItemProvider = new PackageItemProvider(this);
		}

		return packageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirement_RootItemProvider requirement_RootItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirement_RootAdapter() {
		if (requirement_RootItemProvider == null) {
			requirement_RootItemProvider = new Requirement_RootItemProvider(this);
		}

		return requirement_RootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.Safety} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyItemProvider safetyItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Safety}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSafetyAdapter() {
		if (safetyItemProvider == null) {
			safetyItemProvider = new SafetyItemProvider(this);
		}

		return safetyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.DesignElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignElementItemProvider designElementItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.DesignElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDesignElementAdapter() {
		if (designElementItemProvider == null) {
			designElementItemProvider = new DesignElementItemProvider(this);
		}

		return designElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.TestCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseItemProvider testCaseItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.TestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestCaseAdapter() {
		if (testCaseItemProvider == null) {
			testCaseItemProvider = new TestCaseItemProvider(this);
		}

		return testCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.Verification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationItemProvider verificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Verification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerificationAdapter() {
		if (verificationItemProvider == null) {
			verificationItemProvider = new VerificationItemProvider(this);
		}

		return verificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.mcmaster.requirements_modelling.rmdl.Decomposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecompositionItemProvider decompositionItemProvider;

	/**
	 * This creates an adapter for a {@link org.mcmaster.requirements_modelling.rmdl.Decomposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecompositionAdapter() {
		if (decompositionItemProvider == null) {
			decompositionItemProvider = new DecompositionItemProvider(this);
		}

		return decompositionItemProvider;
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
		if (functionalItemProvider != null)
			functionalItemProvider.dispose();
		if (qualitativeItemProvider != null)
			qualitativeItemProvider.dispose();
		if (constraintItemProvider != null)
			constraintItemProvider.dispose();
		if (packageItemProvider != null)
			packageItemProvider.dispose();
		if (requirement_RootItemProvider != null)
			requirement_RootItemProvider.dispose();
		if (safetyItemProvider != null)
			safetyItemProvider.dispose();
		if (designElementItemProvider != null)
			designElementItemProvider.dispose();
		if (testCaseItemProvider != null)
			testCaseItemProvider.dispose();
		if (verificationItemProvider != null)
			verificationItemProvider.dispose();
		if (decompositionItemProvider != null)
			decompositionItemProvider.dispose();
	}

}
