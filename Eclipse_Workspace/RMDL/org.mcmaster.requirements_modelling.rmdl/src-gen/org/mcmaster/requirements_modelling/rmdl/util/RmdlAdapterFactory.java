/**
 */
package org.mcmaster.requirements_modelling.rmdl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.mcmaster.requirements_modelling.rmdl.Constraint;
import org.mcmaster.requirements_modelling.rmdl.Decomposition;
import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Functional;
import org.mcmaster.requirements_modelling.rmdl.Qualitative;
import org.mcmaster.requirements_modelling.rmdl.Reference;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Root;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.Safety;
import org.mcmaster.requirements_modelling.rmdl.TestCase;
import org.mcmaster.requirements_modelling.rmdl.Verification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage
 * @generated
 */
public class RmdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RmdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RmdlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RmdlSwitch<Adapter> modelSwitch = new RmdlSwitch<Adapter>() {
		@Override
		public Adapter caseRequirements(Requirements object) {
			return createRequirementsAdapter();
		}

		@Override
		public Adapter caseFunctional(Functional object) {
			return createFunctionalAdapter();
		}

		@Override
		public Adapter caseQualitative(Qualitative object) {
			return createQualitativeAdapter();
		}

		@Override
		public Adapter caseConstraint(Constraint object) {
			return createConstraintAdapter();
		}

		@Override
		public Adapter casePackage(org.mcmaster.requirements_modelling.rmdl.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseRequirement_Root(Requirement_Root object) {
			return createRequirement_RootAdapter();
		}

		@Override
		public Adapter caseSafety(Safety object) {
			return createSafetyAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseDesignElement(DesignElement object) {
			return createDesignElementAdapter();
		}

		@Override
		public Adapter caseTestCase(TestCase object) {
			return createTestCaseAdapter();
		}

		@Override
		public Adapter caseVerification(Verification object) {
			return createVerificationAdapter();
		}

		@Override
		public Adapter caseDecomposition(Decomposition object) {
			return createDecompositionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements
	 * @generated
	 */
	public Adapter createRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Functional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Functional
	 * @generated
	 */
	public Adapter createFunctionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Qualitative <em>Qualitative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Qualitative
	 * @generated
	 */
	public Adapter createQualitativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root <em>Requirement Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root
	 * @generated
	 */
	public Adapter createRequirement_RootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Safety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Safety
	 * @generated
	 */
	public Adapter createSafetyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement <em>Design Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement
	 * @generated
	 */
	public Adapter createDesignElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Verification <em>Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Verification
	 * @generated
	 */
	public Adapter createVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.requirements_modelling.rmdl.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.requirements_modelling.rmdl.Decomposition
	 * @generated
	 */
	public Adapter createDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RmdlAdapterFactory
