/**
 */
package org.mcmaster.traceability_matrix.tmat.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mcmaster.traceability_matrix.tmat.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage
 * @generated
 */
public class TmatAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TmatPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmatAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TmatPackage.eINSTANCE;
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
	protected TmatSwitch<Adapter> modelSwitch = new TmatSwitch<Adapter>() {
		@Override
		public Adapter caseTraceability_Matrix(Traceability_Matrix object) {
			return createTraceability_MatrixAdapter();
		}

		@Override
		public Adapter caseDesign(Design object) {
			return createDesignAdapter();
		}

		@Override
		public Adapter caseImplementation(Implementation object) {
			return createImplementationAdapter();
		}

		@Override
		public Adapter caseTesting(Testing object) {
			return createTestingAdapter();
		}

		@Override
		public Adapter caseReview(Review object) {
			return createReviewAdapter();
		}

		@Override
		public Adapter caseID(ID object) {
			return createIDAdapter();
		}

		@Override
		public Adapter caseProjectRequirements(ProjectRequirements object) {
			return createProjectRequirementsAdapter();
		}

		@Override
		public Adapter caseRequirement(Requirement object) {
			return createRequirementAdapter();
		}

		@Override
		public Adapter caseApproval(Approval object) {
			return createApprovalAdapter();
		}

		@Override
		public Adapter caseComments(Comments object) {
			return createCommentsAdapter();
		}

		@Override
		public Adapter caseScope(Scope object) {
			return createScopeAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseSatisfiabilityCheck(SatisfiabilityCheck object) {
			return createSatisfiabilityCheckAdapter();
		}

		@Override
		public Adapter caseSource(Source object) {
			return createSourceAdapter();
		}

		@Override
		public Adapter caseStatus(Status object) {
			return createStatusAdapter();
		}

		@Override
		public Adapter caseUnitTest(UnitTest object) {
			return createUnitTestAdapter();
		}

		@Override
		public Adapter caseSystemTest(SystemTest object) {
			return createSystemTestAdapter();
		}

		@Override
		public Adapter casePerformanceTest(PerformanceTest object) {
			return createPerformanceTestAdapter();
		}

		@Override
		public Adapter caseUserAcceptanceTest(UserAcceptanceTest object) {
			return createUserAcceptanceTestAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix <em>Traceability Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Traceability_Matrix
	 * @generated
	 */
	public Adapter createTraceability_MatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Design
	 * @generated
	 */
	public Adapter createDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Testing <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Testing
	 * @generated
	 */
	public Adapter createTestingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Review
	 * @generated
	 */
	public Adapter createReviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.ID
	 * @generated
	 */
	public Adapter createIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.ProjectRequirements <em>Project Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.ProjectRequirements
	 * @generated
	 */
	public Adapter createProjectRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Approval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Approval
	 * @generated
	 */
	public Adapter createApprovalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Comments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Comments
	 * @generated
	 */
	public Adapter createCommentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.SatisfiabilityCheck <em>Satisfiability Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.SatisfiabilityCheck
	 * @generated
	 */
	public Adapter createSatisfiabilityCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.UnitTest <em>Unit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.UnitTest
	 * @generated
	 */
	public Adapter createUnitTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.SystemTest <em>System Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.SystemTest
	 * @generated
	 */
	public Adapter createSystemTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.PerformanceTest <em>Performance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.PerformanceTest
	 * @generated
	 */
	public Adapter createPerformanceTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mcmaster.traceability_matrix.tmat.UserAcceptanceTest <em>User Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mcmaster.traceability_matrix.tmat.UserAcceptanceTest
	 * @generated
	 */
	public Adapter createUserAcceptanceTestAdapter() {
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

} //TmatAdapterFactory
