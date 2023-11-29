/**
 */
package org.mcmaster.traceability_matrix.tmat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mcmaster.traceability_matrix.tmat.TmatFactory
 * @model kind="package"
 * @generated
 */
public interface TmatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tmat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tmat";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tmat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TmatPackage eINSTANCE = org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl <em>Traceability Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getTraceability_Matrix()
	 * @generated
	 */
	int TRACEABILITY_MATRIX = 0;

	/**
	 * The feature id for the '<em><b>Projectrequirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MATRIX__PROJECTREQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Design</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MATRIX__DESIGN = 1;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MATRIX__IMPLEMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Testing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MATRIX__TESTING = 3;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MATRIX__REVIEW = 4;

	/**
	 * The number of structural features of the '<em>Traceability Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MATRIX_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Traceability Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABILITY_MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.DesignImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getDesign()
	 * @generated
	 */
	int DESIGN = 1;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.ImplementationImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 2;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.TestingImpl <em>Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TestingImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getTesting()
	 * @generated
	 */
	int TESTING = 3;

	/**
	 * The number of structural features of the '<em>Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.ReviewImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 4;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ProjectRequirementsImpl <em>Project Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.ProjectRequirementsImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getProjectRequirements()
	 * @generated
	 */
	int PROJECT_REQUIREMENTS = 6;

	/**
	 * The number of structural features of the '<em>Project Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Project Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.IDImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getID()
	 * @generated
	 */
	int ID = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__ID = PROJECT_REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = PROJECT_REQUIREMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = PROJECT_REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.RequirementImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = PROJECT_REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = PROJECT_REQUIREMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = PROJECT_REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ApprovalImpl <em>Approval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.ApprovalImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getApproval()
	 * @generated
	 */
	int APPROVAL = 8;

	/**
	 * The number of structural features of the '<em>Approval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_FEATURE_COUNT = REVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Approval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_OPERATION_COUNT = REVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.CommentsImpl <em>Comments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.CommentsImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getComments()
	 * @generated
	 */
	int COMMENTS = 9;

	/**
	 * The number of structural features of the '<em>Comments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_FEATURE_COUNT = REVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_OPERATION_COUNT = REVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.ScopeImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 10;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = PROJECT_REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = PROJECT_REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.ComponentImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 11;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = DESIGN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.SatisfiabilityCheckImpl <em>Satisfiability Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.SatisfiabilityCheckImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getSatisfiabilityCheck()
	 * @generated
	 */
	int SATISFIABILITY_CHECK = 12;

	/**
	 * The number of structural features of the '<em>Satisfiability Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABILITY_CHECK_FEATURE_COUNT = DESIGN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Satisfiability Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABILITY_CHECK_OPERATION_COUNT = DESIGN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.SourceImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 13;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = REVIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = REVIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.StatusImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 14;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.UnitTestImpl <em>Unit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.UnitTestImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getUnitTest()
	 * @generated
	 */
	int UNIT_TEST = 15;

	/**
	 * The number of structural features of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_FEATURE_COUNT = TESTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_OPERATION_COUNT = TESTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.SystemTestImpl <em>System Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.SystemTestImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getSystemTest()
	 * @generated
	 */
	int SYSTEM_TEST = 16;

	/**
	 * The number of structural features of the '<em>System Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST_FEATURE_COUNT = TESTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TEST_OPERATION_COUNT = TESTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.PerformanceTestImpl <em>Performance Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.PerformanceTestImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getPerformanceTest()
	 * @generated
	 */
	int PERFORMANCE_TEST = 17;

	/**
	 * The number of structural features of the '<em>Performance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_TEST_FEATURE_COUNT = TESTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Performance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_TEST_OPERATION_COUNT = TESTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.traceability_matrix.tmat.impl.UserAcceptanceTestImpl <em>User Acceptance Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.traceability_matrix.tmat.impl.UserAcceptanceTestImpl
	 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getUserAcceptanceTest()
	 * @generated
	 */
	int USER_ACCEPTANCE_TEST = 18;

	/**
	 * The number of structural features of the '<em>User Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCEPTANCE_TEST_FEATURE_COUNT = TESTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCEPTANCE_TEST_OPERATION_COUNT = TESTING_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix <em>Traceability Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceability Matrix</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Traceability_Matrix
	 * @generated
	 */
	EClass getTraceability_Matrix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getProjectrequirements <em>Projectrequirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projectrequirements</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getProjectrequirements()
	 * @see #getTraceability_Matrix()
	 * @generated
	 */
	EReference getTraceability_Matrix_Projectrequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getDesign <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Design</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getDesign()
	 * @see #getTraceability_Matrix()
	 * @generated
	 */
	EReference getTraceability_Matrix_Design();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getImplementation()
	 * @see #getTraceability_Matrix()
	 * @generated
	 */
	EReference getTraceability_Matrix_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getTesting <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testing</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getTesting()
	 * @see #getTraceability_Matrix()
	 * @generated
	 */
	EReference getTraceability_Matrix_Testing();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Review</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Traceability_Matrix#getReview()
	 * @see #getTraceability_Matrix()
	 * @generated
	 */
	EReference getTraceability_Matrix_Review();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Testing <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Testing
	 * @generated
	 */
	EClass getTesting();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.traceability_matrix.tmat.ID#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.ID#getId()
	 * @see #getID()
	 * @generated
	 */
	EAttribute getID_Id();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.ProjectRequirements <em>Project Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Requirements</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.ProjectRequirements
	 * @generated
	 */
	EClass getProjectRequirements();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.traceability_matrix.tmat.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Approval <em>Approval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approval</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Approval
	 * @generated
	 */
	EClass getApproval();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Comments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comments</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Comments
	 * @generated
	 */
	EClass getComments();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.SatisfiabilityCheck <em>Satisfiability Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfiability Check</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.SatisfiabilityCheck
	 * @generated
	 */
	EClass getSatisfiabilityCheck();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.UnitTest <em>Unit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.UnitTest
	 * @generated
	 */
	EClass getUnitTest();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.SystemTest <em>System Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Test</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.SystemTest
	 * @generated
	 */
	EClass getSystemTest();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.PerformanceTest <em>Performance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Test</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.PerformanceTest
	 * @generated
	 */
	EClass getPerformanceTest();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.traceability_matrix.tmat.UserAcceptanceTest <em>User Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Acceptance Test</em>'.
	 * @see org.mcmaster.traceability_matrix.tmat.UserAcceptanceTest
	 * @generated
	 */
	EClass getUserAcceptanceTest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TmatFactory getTmatFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl <em>Traceability Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.Traceability_MatrixImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getTraceability_Matrix()
		 * @generated
		 */
		EClass TRACEABILITY_MATRIX = eINSTANCE.getTraceability_Matrix();

		/**
		 * The meta object literal for the '<em><b>Projectrequirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MATRIX__PROJECTREQUIREMENTS = eINSTANCE.getTraceability_Matrix_Projectrequirements();

		/**
		 * The meta object literal for the '<em><b>Design</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MATRIX__DESIGN = eINSTANCE.getTraceability_Matrix_Design();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MATRIX__IMPLEMENTATION = eINSTANCE.getTraceability_Matrix_Implementation();

		/**
		 * The meta object literal for the '<em><b>Testing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MATRIX__TESTING = eINSTANCE.getTraceability_Matrix_Testing();

		/**
		 * The meta object literal for the '<em><b>Review</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABILITY_MATRIX__REVIEW = eINSTANCE.getTraceability_Matrix_Review();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.DesignImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getDesign()
		 * @generated
		 */
		EClass DESIGN = eINSTANCE.getDesign();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.ImplementationImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.TestingImpl <em>Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TestingImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getTesting()
		 * @generated
		 */
		EClass TESTING = eINSTANCE.getTesting();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.ReviewImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.IDImpl <em>ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.IDImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID__ID = eINSTANCE.getID_Id();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ProjectRequirementsImpl <em>Project Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.ProjectRequirementsImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getProjectRequirements()
		 * @generated
		 */
		EClass PROJECT_REQUIREMENTS = eINSTANCE.getProjectRequirements();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.RequirementImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ApprovalImpl <em>Approval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.ApprovalImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getApproval()
		 * @generated
		 */
		EClass APPROVAL = eINSTANCE.getApproval();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.CommentsImpl <em>Comments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.CommentsImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getComments()
		 * @generated
		 */
		EClass COMMENTS = eINSTANCE.getComments();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.ScopeImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.ComponentImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.SatisfiabilityCheckImpl <em>Satisfiability Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.SatisfiabilityCheckImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getSatisfiabilityCheck()
		 * @generated
		 */
		EClass SATISFIABILITY_CHECK = eINSTANCE.getSatisfiabilityCheck();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.SourceImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.StatusImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.UnitTestImpl <em>Unit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.UnitTestImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getUnitTest()
		 * @generated
		 */
		EClass UNIT_TEST = eINSTANCE.getUnitTest();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.SystemTestImpl <em>System Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.SystemTestImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getSystemTest()
		 * @generated
		 */
		EClass SYSTEM_TEST = eINSTANCE.getSystemTest();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.PerformanceTestImpl <em>Performance Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.PerformanceTestImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getPerformanceTest()
		 * @generated
		 */
		EClass PERFORMANCE_TEST = eINSTANCE.getPerformanceTest();

		/**
		 * The meta object literal for the '{@link org.mcmaster.traceability_matrix.tmat.impl.UserAcceptanceTestImpl <em>User Acceptance Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.traceability_matrix.tmat.impl.UserAcceptanceTestImpl
		 * @see org.mcmaster.traceability_matrix.tmat.impl.TmatPackageImpl#getUserAcceptanceTest()
		 * @generated
		 */
		EClass USER_ACCEPTANCE_TEST = eINSTANCE.getUserAcceptanceTest();

	}

} //TmatPackage
