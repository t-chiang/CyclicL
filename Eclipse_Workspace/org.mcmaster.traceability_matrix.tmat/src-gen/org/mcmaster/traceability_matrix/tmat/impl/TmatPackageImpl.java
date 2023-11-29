/**
 */
package org.mcmaster.traceability_matrix.tmat.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mcmaster.traceability_matrix.tmat.Approval;
import org.mcmaster.traceability_matrix.tmat.Comments;
import org.mcmaster.traceability_matrix.tmat.Component;
import org.mcmaster.traceability_matrix.tmat.Design;
import org.mcmaster.traceability_matrix.tmat.Implementation;
import org.mcmaster.traceability_matrix.tmat.PerformanceTest;
import org.mcmaster.traceability_matrix.tmat.ProjectRequirements;
import org.mcmaster.traceability_matrix.tmat.Requirement;
import org.mcmaster.traceability_matrix.tmat.Review;
import org.mcmaster.traceability_matrix.tmat.SatisfiabilityCheck;
import org.mcmaster.traceability_matrix.tmat.Scope;
import org.mcmaster.traceability_matrix.tmat.Source;
import org.mcmaster.traceability_matrix.tmat.Status;
import org.mcmaster.traceability_matrix.tmat.SystemTest;
import org.mcmaster.traceability_matrix.tmat.Testing;
import org.mcmaster.traceability_matrix.tmat.TmatFactory;
import org.mcmaster.traceability_matrix.tmat.TmatPackage;
import org.mcmaster.traceability_matrix.tmat.Traceability_Matrix;
import org.mcmaster.traceability_matrix.tmat.UnitTest;
import org.mcmaster.traceability_matrix.tmat.UserAcceptanceTest;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TmatPackageImpl extends EPackageImpl implements TmatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceability_MatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfiabilityCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAcceptanceTestEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mcmaster.traceability_matrix.tmat.TmatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TmatPackageImpl() {
		super(eNS_URI, TmatFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TmatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TmatPackage init() {
		if (isInited)
			return (TmatPackage) EPackage.Registry.INSTANCE.getEPackage(TmatPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTmatPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TmatPackageImpl theTmatPackage = registeredTmatPackage instanceof TmatPackageImpl
				? (TmatPackageImpl) registeredTmatPackage
				: new TmatPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTmatPackage.createPackageContents();

		// Initialize created meta-data
		theTmatPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTmatPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TmatPackage.eNS_URI, theTmatPackage);
		return theTmatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceability_Matrix() {
		return traceability_MatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceability_Matrix_Projectrequirements() {
		return (EReference) traceability_MatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceability_Matrix_Design() {
		return (EReference) traceability_MatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceability_Matrix_Implementation() {
		return (EReference) traceability_MatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceability_Matrix_Testing() {
		return (EReference) traceability_MatrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceability_Matrix_Review() {
		return (EReference) traceability_MatrixEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesign() {
		return designEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementation() {
		return implementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTesting() {
		return testingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReview() {
		return reviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getID() {
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getID_Id() {
		return (EAttribute) idEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectRequirements() {
		return projectRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Name() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApproval() {
		return approvalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComments() {
		return commentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatisfiabilityCheck() {
		return satisfiabilityCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTest() {
		return unitTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTest() {
		return systemTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceTest() {
		return performanceTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserAcceptanceTest() {
		return userAcceptanceTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmatFactory getTmatFactory() {
		return (TmatFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		traceability_MatrixEClass = createEClass(TRACEABILITY_MATRIX);
		createEReference(traceability_MatrixEClass, TRACEABILITY_MATRIX__PROJECTREQUIREMENTS);
		createEReference(traceability_MatrixEClass, TRACEABILITY_MATRIX__DESIGN);
		createEReference(traceability_MatrixEClass, TRACEABILITY_MATRIX__IMPLEMENTATION);
		createEReference(traceability_MatrixEClass, TRACEABILITY_MATRIX__TESTING);
		createEReference(traceability_MatrixEClass, TRACEABILITY_MATRIX__REVIEW);

		designEClass = createEClass(DESIGN);

		implementationEClass = createEClass(IMPLEMENTATION);

		testingEClass = createEClass(TESTING);

		reviewEClass = createEClass(REVIEW);

		idEClass = createEClass(ID);
		createEAttribute(idEClass, ID__ID);

		projectRequirementsEClass = createEClass(PROJECT_REQUIREMENTS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);

		approvalEClass = createEClass(APPROVAL);

		commentsEClass = createEClass(COMMENTS);

		scopeEClass = createEClass(SCOPE);

		componentEClass = createEClass(COMPONENT);

		satisfiabilityCheckEClass = createEClass(SATISFIABILITY_CHECK);

		sourceEClass = createEClass(SOURCE);

		statusEClass = createEClass(STATUS);

		unitTestEClass = createEClass(UNIT_TEST);

		systemTestEClass = createEClass(SYSTEM_TEST);

		performanceTestEClass = createEClass(PERFORMANCE_TEST);

		userAcceptanceTestEClass = createEClass(USER_ACCEPTANCE_TEST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		idEClass.getESuperTypes().add(this.getProjectRequirements());
		requirementEClass.getESuperTypes().add(this.getProjectRequirements());
		approvalEClass.getESuperTypes().add(this.getReview());
		commentsEClass.getESuperTypes().add(this.getReview());
		scopeEClass.getESuperTypes().add(this.getProjectRequirements());
		componentEClass.getESuperTypes().add(this.getDesign());
		satisfiabilityCheckEClass.getESuperTypes().add(this.getDesign());
		sourceEClass.getESuperTypes().add(this.getReview());
		statusEClass.getESuperTypes().add(this.getImplementation());
		unitTestEClass.getESuperTypes().add(this.getTesting());
		systemTestEClass.getESuperTypes().add(this.getTesting());
		performanceTestEClass.getESuperTypes().add(this.getTesting());
		userAcceptanceTestEClass.getESuperTypes().add(this.getTesting());

		// Initialize classes, features, and operations; add parameters
		initEClass(traceability_MatrixEClass, Traceability_Matrix.class, "Traceability_Matrix", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceability_Matrix_Projectrequirements(), this.getProjectRequirements(), null,
				"projectrequirements", null, 0, -1, Traceability_Matrix.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceability_Matrix_Design(), this.getDesign(), null, "design", null, 0, -1,
				Traceability_Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceability_Matrix_Implementation(), this.getImplementation(), null, "implementation", null,
				0, -1, Traceability_Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceability_Matrix_Testing(), this.getTesting(), null, "testing", null, 0, -1,
				Traceability_Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceability_Matrix_Review(), this.getReview(), null, "review", null, 0, -1,
				Traceability_Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designEClass, Design.class, "Design", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationEClass, Implementation.class, "Implementation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(testingEClass, Testing.class, "Testing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reviewEClass, Review.class, "Review", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idEClass, org.mcmaster.traceability_matrix.tmat.ID.class, "ID", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getID_Id(), ecorePackage.getEInt(), "id", null, 1, 1,
				org.mcmaster.traceability_matrix.tmat.ID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectRequirementsEClass, ProjectRequirements.class, "ProjectRequirements", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Requirement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(approvalEClass, Approval.class, "Approval", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentsEClass, Comments.class, "Comments", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(satisfiabilityCheckEClass, SatisfiabilityCheck.class, "SatisfiabilityCheck", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitTestEClass, UnitTest.class, "UnitTest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemTestEClass, SystemTest.class, "SystemTest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(performanceTestEClass, PerformanceTest.class, "PerformanceTest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(userAcceptanceTestEClass, UserAcceptanceTest.class, "UserAcceptanceTest", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TmatPackageImpl
