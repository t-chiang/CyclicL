/**
 */
package org.mcmaster.traceability_matrix.tmat.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mcmaster.traceability_matrix.tmat.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TmatFactoryImpl extends EFactoryImpl implements TmatFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TmatFactory init() {
		try {
			TmatFactory theTmatFactory = (TmatFactory) EPackage.Registry.INSTANCE.getEFactory(TmatPackage.eNS_URI);
			if (theTmatFactory != null) {
				return theTmatFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TmatFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmatFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TmatPackage.TRACEABILITY_MATRIX:
			return createTraceability_Matrix();
		case TmatPackage.ID:
			return createID();
		case TmatPackage.REQUIREMENT:
			return createRequirement();
		case TmatPackage.APPROVAL:
			return createApproval();
		case TmatPackage.COMMENTS:
			return createComments();
		case TmatPackage.SCOPE:
			return createScope();
		case TmatPackage.COMPONENT:
			return createComponent();
		case TmatPackage.SATISFIABILITY_CHECK:
			return createSatisfiabilityCheck();
		case TmatPackage.SOURCE:
			return createSource();
		case TmatPackage.STATUS:
			return createStatus();
		case TmatPackage.UNIT_TEST:
			return createUnitTest();
		case TmatPackage.SYSTEM_TEST:
			return createSystemTest();
		case TmatPackage.PERFORMANCE_TEST:
			return createPerformanceTest();
		case TmatPackage.USER_ACCEPTANCE_TEST:
			return createUserAcceptanceTest();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Traceability_Matrix createTraceability_Matrix() {
		Traceability_MatrixImpl traceability_Matrix = new Traceability_MatrixImpl();
		return traceability_Matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ID createID() {
		IDImpl id = new IDImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Approval createApproval() {
		ApprovalImpl approval = new ApprovalImpl();
		return approval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comments createComments() {
		CommentsImpl comments = new CommentsImpl();
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisfiabilityCheck createSatisfiabilityCheck() {
		SatisfiabilityCheckImpl satisfiabilityCheck = new SatisfiabilityCheckImpl();
		return satisfiabilityCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTest createUnitTest() {
		UnitTestImpl unitTest = new UnitTestImpl();
		return unitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTest createSystemTest() {
		SystemTestImpl systemTest = new SystemTestImpl();
		return systemTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceTest createPerformanceTest() {
		PerformanceTestImpl performanceTest = new PerformanceTestImpl();
		return performanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAcceptanceTest createUserAcceptanceTest() {
		UserAcceptanceTestImpl userAcceptanceTest = new UserAcceptanceTestImpl();
		return userAcceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmatPackage getTmatPackage() {
		return (TmatPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TmatPackage getPackage() {
		return TmatPackage.eINSTANCE;
	}

} //TmatFactoryImpl
