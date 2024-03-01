/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlFactory
 * @model kind="package"
 * @generated
 */
public interface RmdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rmdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rmdl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rmdl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RmdlPackage eINSTANCE = org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl <em>Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirements()
	 * @generated
	 */
	int REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__NAME = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__REQUIREMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__REVIEW = 4;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__TESTCASE = 5;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__TRACETO = 6;

	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.FunctionalImpl <em>Functional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.FunctionalImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getFunctional()
	 * @generated
	 */
	int FUNCTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__NAME = REQUIREMENTS__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__ID = REQUIREMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__DESCRIPTION = REQUIREMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__REQUIREMENT_ROOT = REQUIREMENTS__REQUIREMENT_ROOT;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__REVIEW = REQUIREMENTS__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__TESTCASE = REQUIREMENTS__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__TRACETO = REQUIREMENTS__TRACETO;

	/**
	 * The number of structural features of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FEATURE_COUNT = REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATION_COUNT = REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.QualitativeImpl <em>Qualitative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.QualitativeImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getQualitative()
	 * @generated
	 */
	int QUALITATIVE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__NAME = REQUIREMENTS__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__ID = REQUIREMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__DESCRIPTION = REQUIREMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__REQUIREMENT_ROOT = REQUIREMENTS__REQUIREMENT_ROOT;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__REVIEW = REQUIREMENTS__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__TESTCASE = REQUIREMENTS__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__TRACETO = REQUIREMENTS__TRACETO;

	/**
	 * The number of structural features of the '<em>Qualitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FEATURE_COUNT = REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qualitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_OPERATION_COUNT = REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.ConstraintImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = REQUIREMENTS__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = REQUIREMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = REQUIREMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REQUIREMENT_ROOT = REQUIREMENTS__REQUIREMENT_ROOT;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REVIEW = REQUIREMENTS__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TESTCASE = REQUIREMENTS__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TRACETO = REQUIREMENTS__TRACETO;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl <em>Requirement Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirement_Root()
	 * @generated
	 */
	int REQUIREMENT_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__TESTCASE = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__REQUIREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__REVIEW = 3;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__DESIGNELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Requirement Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Requirement Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TESTCASE = REQUIREMENT_ROOT__TESTCASE;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE = REQUIREMENT_ROOT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REQUIREMENTS = REQUIREMENT_ROOT__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REVIEW = REQUIREMENT_ROOT__REVIEW;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESIGNELEMENT = REQUIREMENT_ROOT__DESIGNELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = REQUIREMENT_ROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_ID = REQUIREMENT_ROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REQUIREMENT_ROOT = REQUIREMENT_ROOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = REQUIREMENT_ROOT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = REQUIREMENT_ROOT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.SafetyImpl <em>Safety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.SafetyImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getSafety()
	 * @generated
	 */
	int SAFETY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__NAME = REQUIREMENTS__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__ID = REQUIREMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DESCRIPTION = REQUIREMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__REQUIREMENT_ROOT = REQUIREMENTS__REQUIREMENT_ROOT;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__REVIEW = REQUIREMENTS__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__TESTCASE = REQUIREMENTS__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__TRACETO = REQUIREMENTS__TRACETO;

	/**
	 * The number of structural features of the '<em>Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FEATURE_COUNT = REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_OPERATION_COUNT = REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl <em>Design Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getDesignElement()
	 * @generated
	 */
	int DESIGN_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__IS_HARDWARE = 1;

	/**
	 * The feature id for the '<em><b>Is Software</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__IS_SOFTWARE = 2;

	/**
	 * The feature id for the '<em><b>Tracefrom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__TRACEFROM = 3;

	/**
	 * The number of structural features of the '<em>Design Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Design Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__REQUIREMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Has Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__HAS_PASSED = 4;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__REQUIREMENTS = 5;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 9;

	/**
	 * The feature id for the '<em><b>Is Approved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__IS_APPROVED = 0;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REVIEWER = 1;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REQUIREMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REQUIREMENTS = 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__COMMENTS = 4;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.TestType <em>Test Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.TestType
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTestType()
	 * @generated
	 */
	int TEST_TYPE = 10;

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements
	 * @generated
	 */
	EClass getRequirements();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getName()
	 * @see #getRequirements()
	 * @generated
	 */
	EAttribute getRequirements_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getID()
	 * @see #getRequirements()
	 * @generated
	 */
	EAttribute getRequirements_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getDescription()
	 * @see #getRequirements()
	 * @generated
	 */
	EAttribute getRequirements_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getRequirement_root()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Requirement_root();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Review</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getReview()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Review();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Testcase</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getTestcase()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Testcase();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getTraceto <em>Traceto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traceto</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getTraceto()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Traceto();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Functional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Functional
	 * @generated
	 */
	EClass getFunctional();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Qualitative <em>Qualitative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Qualitative
	 * @generated
	 */
	EClass getQualitative();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Package#getPackageID <em>Package ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package ID</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Package#getPackageID()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_PackageID();

	/**
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.Package#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Package#getRequirement_root()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Requirement_root();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root <em>Requirement Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root
	 * @generated
	 */
	EClass getRequirement_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testcase</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getTestcase()
	 * @see #getRequirement_Root()
	 * @generated
	 */
	EReference getRequirement_Root_Testcase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getPackage()
	 * @see #getRequirement_Root()
	 * @generated
	 */
	EReference getRequirement_Root_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getRequirements()
	 * @see #getRequirement_Root()
	 * @generated
	 */
	EReference getRequirement_Root_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Review</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getReview()
	 * @see #getRequirement_Root()
	 * @generated
	 */
	EReference getRequirement_Root_Review();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getDesignelement <em>Designelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Designelement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getDesignelement()
	 * @see #getRequirement_Root()
	 * @generated
	 */
	EReference getRequirement_Root_Designelement();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Safety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Safety
	 * @generated
	 */
	EClass getSafety();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement <em>Design Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Element</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement
	 * @generated
	 */
	EClass getDesignElement();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getName()
	 * @see #getDesignElement()
	 * @generated
	 */
	EAttribute getDesignElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#isIsHardware <em>Is Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Hardware</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#isIsHardware()
	 * @see #getDesignElement()
	 * @generated
	 */
	EAttribute getDesignElement_IsHardware();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#isIsSoftware <em>Is Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Software</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#isIsSoftware()
	 * @see #getDesignElement()
	 * @generated
	 */
	EAttribute getDesignElement_IsSoftware();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getTracefrom <em>Tracefrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracefrom</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getTracefrom()
	 * @see #getDesignElement()
	 * @generated
	 */
	EReference getDesignElement_Tracefrom();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getID()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getType()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getDescription()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Description();

	/**
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_root()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Requirement_root();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#isHasPassed <em>Has Passed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Passed</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#isHasPassed()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_HasPassed();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirements()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Requirements();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Review#isIsApproved <em>Is Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Approved</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#isIsApproved()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_IsApproved();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Review#getReviewer <em>Reviewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reviewer</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getReviewer()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Reviewer();

	/**
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_root()
	 * @see #getReview()
	 * @generated
	 */
	EReference getReview_Requirement_root();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getRequirements()
	 * @see #getReview()
	 * @generated
	 */
	EReference getReview_Requirements();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Review#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getComments()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Comments();

	/**
	 * Returns the meta object for enum '{@link org.mcmaster.requirements_modelling.rmdl.TestType <em>Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Type</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestType
	 * @generated
	 */
	EEnum getTestType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RmdlFactory getRmdlFactory();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl <em>Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirements()
		 * @generated
		 */
		EClass REQUIREMENTS = eINSTANCE.getRequirements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS__NAME = eINSTANCE.getRequirements_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS__ID = eINSTANCE.getRequirements_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS__DESCRIPTION = eINSTANCE.getRequirements_Description();

		/**
		 * The meta object literal for the '<em><b>Requirement root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__REQUIREMENT_ROOT = eINSTANCE.getRequirements_Requirement_root();

		/**
		 * The meta object literal for the '<em><b>Review</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__REVIEW = eINSTANCE.getRequirements_Review();

		/**
		 * The meta object literal for the '<em><b>Testcase</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__TESTCASE = eINSTANCE.getRequirements_Testcase();

		/**
		 * The meta object literal for the '<em><b>Traceto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__TRACETO = eINSTANCE.getRequirements_Traceto();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.FunctionalImpl <em>Functional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.FunctionalImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getFunctional()
		 * @generated
		 */
		EClass FUNCTIONAL = eINSTANCE.getFunctional();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.QualitativeImpl <em>Qualitative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.QualitativeImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getQualitative()
		 * @generated
		 */
		EClass QUALITATIVE = eINSTANCE.getQualitative();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.ConstraintImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.PackageImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Package ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PACKAGE_ID = eINSTANCE.getPackage_PackageID();

		/**
		 * The meta object literal for the '<em><b>Requirement root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__REQUIREMENT_ROOT = eINSTANCE.getPackage_Requirement_root();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl <em>Requirement Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.Requirement_RootImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirement_Root()
		 * @generated
		 */
		EClass REQUIREMENT_ROOT = eINSTANCE.getRequirement_Root();

		/**
		 * The meta object literal for the '<em><b>Testcase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROOT__TESTCASE = eINSTANCE.getRequirement_Root_Testcase();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROOT__PACKAGE = eINSTANCE.getRequirement_Root_Package();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROOT__REQUIREMENTS = eINSTANCE.getRequirement_Root_Requirements();

		/**
		 * The meta object literal for the '<em><b>Review</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROOT__REVIEW = eINSTANCE.getRequirement_Root_Review();

		/**
		 * The meta object literal for the '<em><b>Designelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROOT__DESIGNELEMENT = eINSTANCE.getRequirement_Root_Designelement();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.SafetyImpl <em>Safety</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.SafetyImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getSafety()
		 * @generated
		 */
		EClass SAFETY = eINSTANCE.getSafety();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl <em>Design Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getDesignElement()
		 * @generated
		 */
		EClass DESIGN_ELEMENT = eINSTANCE.getDesignElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_ELEMENT__NAME = eINSTANCE.getDesignElement_Name();

		/**
		 * The meta object literal for the '<em><b>Is Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_ELEMENT__IS_HARDWARE = eINSTANCE.getDesignElement_IsHardware();

		/**
		 * The meta object literal for the '<em><b>Is Software</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_ELEMENT__IS_SOFTWARE = eINSTANCE.getDesignElement_IsSoftware();

		/**
		 * The meta object literal for the '<em><b>Tracefrom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT__TRACEFROM = eINSTANCE.getDesignElement_Tracefrom();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__ID = eINSTANCE.getTestCase_ID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__TYPE = eINSTANCE.getTestCase_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__DESCRIPTION = eINSTANCE.getTestCase_Description();

		/**
		 * The meta object literal for the '<em><b>Requirement root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__REQUIREMENT_ROOT = eINSTANCE.getTestCase_Requirement_root();

		/**
		 * The meta object literal for the '<em><b>Has Passed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__HAS_PASSED = eINSTANCE.getTestCase_HasPassed();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__REQUIREMENTS = eINSTANCE.getTestCase_Requirements();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '<em><b>Is Approved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__IS_APPROVED = eINSTANCE.getReview_IsApproved();

		/**
		 * The meta object literal for the '<em><b>Reviewer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__REVIEWER = eINSTANCE.getReview_Reviewer();

		/**
		 * The meta object literal for the '<em><b>Requirement root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW__REQUIREMENT_ROOT = eINSTANCE.getReview_Requirement_root();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW__REQUIREMENTS = eINSTANCE.getReview_Requirements();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__COMMENTS = eINSTANCE.getReview_Comments();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.TestType <em>Test Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.TestType
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTestType()
		 * @generated
		 */
		EEnum TEST_TYPE = eINSTANCE.getTestType();

	}

} //RmdlPackage
