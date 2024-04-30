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
	 * The feature id for the '<em><b>Partof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__PARTOF = 7;

	/**
	 * The feature id for the '<em><b>Decomposesto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__DECOMPOSESTO = 8;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__SPECIFICATION = 9;

	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 10;

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
	 * The feature id for the '<em><b>Partof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__PARTOF = REQUIREMENTS__PARTOF;

	/**
	 * The feature id for the '<em><b>Decomposesto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__DECOMPOSESTO = REQUIREMENTS__DECOMPOSESTO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__SPECIFICATION = REQUIREMENTS__SPECIFICATION;

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
	 * The feature id for the '<em><b>Partof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__PARTOF = REQUIREMENTS__PARTOF;

	/**
	 * The feature id for the '<em><b>Decomposesto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__DECOMPOSESTO = REQUIREMENTS__DECOMPOSESTO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__SPECIFICATION = REQUIREMENTS__SPECIFICATION;

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
	 * The feature id for the '<em><b>Partof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PARTOF = REQUIREMENTS__PARTOF;

	/**
	 * The feature id for the '<em><b>Decomposesto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DECOMPOSESTO = REQUIREMENTS__DECOMPOSESTO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SPECIFICATION = REQUIREMENTS__SPECIFICATION;

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
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl <em>Requirement Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirement_Diagram()
	 * @generated
	 */
	int REQUIREMENT_DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DIAGRAM__TESTCASE = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DIAGRAM__REQUIREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DIAGRAM__REVIEW = 2;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DIAGRAM__DESIGNELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DIAGRAM__NAME = 4;

	/**
	 * The number of structural features of the '<em>Requirement Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DIAGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Requirement Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.SafetyImpl <em>Safety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.SafetyImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getSafety()
	 * @generated
	 */
	int SAFETY = 5;

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
	 * The feature id for the '<em><b>Partof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__PARTOF = REQUIREMENTS__PARTOF;

	/**
	 * The feature id for the '<em><b>Decomposesto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DECOMPOSESTO = REQUIREMENTS__DECOMPOSESTO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__SPECIFICATION = REQUIREMENTS__SPECIFICATION;

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
	int DESIGN_ELEMENT = 6;

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
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__REQUIREMENT_ROOT = 4;

	/**
	 * The number of structural features of the '<em>Design Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_FEATURE_COUNT = 5;

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
	int TEST_CASE = 7;

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
	int REVIEW = 8;

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
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl <em>Feature Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getFeatureElement()
	 * @generated
	 */
	int FEATURE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__TESTCASE = REQUIREMENT_DIAGRAM__TESTCASE;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__REQUIREMENTS = REQUIREMENT_DIAGRAM__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__REVIEW = REQUIREMENT_DIAGRAM__REVIEW;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__DESIGNELEMENT = REQUIREMENT_DIAGRAM__DESIGNELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__NAME = REQUIREMENT_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__IS_OPTIONAL = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__MANDATORY = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__COMPOSES = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__ALTERNATIVE = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alternativeof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__ALTERNATIVEOF = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__OPTIONAL = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Optionof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__OPTIONOF = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT__PRODUCT = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Feature Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT_FEATURE_COUNT = REQUIREMENT_DIAGRAM_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Feature Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ELEMENT_OPERATION_COUNT = REQUIREMENT_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getFeature_Model()
	 * @generated
	 */
	int FEATURE_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Featureelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATUREELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RMDL_RootImpl <em>RMDL Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RMDL_RootImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRMDL_Root()
	 * @generated
	 */
	int RMDL_ROOT = 11;

	/**
	 * The feature id for the '<em><b>Feature model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMDL_ROOT__FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Requirement diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMDL_ROOT__REQUIREMENT_DIAGRAM = 1;

	/**
	 * The number of structural features of the '<em>RMDL Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMDL_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RMDL Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMDL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.TestType <em>Test Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.TestType
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTestType()
	 * @generated
	 */
	int TEST_TYPE = 12;

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
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getPartof <em>Partof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partof</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getPartof()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Partof();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getDecomposesto <em>Decomposesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Decomposesto</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getDecomposesto()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Decomposesto();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getSpecification()
	 * @see #getRequirements()
	 * @generated
	 */
	EAttribute getRequirements_Specification();

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
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram <em>Requirement Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Diagram</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram
	 * @generated
	 */
	EClass getRequirement_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testcase</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getTestcase()
	 * @see #getRequirement_Diagram()
	 * @generated
	 */
	EReference getRequirement_Diagram_Testcase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getRequirements()
	 * @see #getRequirement_Diagram()
	 * @generated
	 */
	EReference getRequirement_Diagram_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Review</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getReview()
	 * @see #getRequirement_Diagram()
	 * @generated
	 */
	EReference getRequirement_Diagram_Review();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getDesignelement <em>Designelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Designelement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getDesignelement()
	 * @see #getRequirement_Diagram()
	 * @generated
	 */
	EReference getRequirement_Diagram_Designelement();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram#getName()
	 * @see #getRequirement_Diagram()
	 * @generated
	 */
	EAttribute getRequirement_Diagram_Name();

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
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_root <em>Requirement root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_root()
	 * @see #getDesignElement()
	 * @generated
	 */
	EReference getDesignElement_Requirement_root();

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
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement <em>Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Element</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement
	 * @generated
	 */
	EClass getFeatureElement();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#isIsOptional()
	 * @see #getFeatureElement()
	 * @generated
	 */
	EAttribute getFeatureElement_IsOptional();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getMandatory()
	 * @see #getFeatureElement()
	 * @generated
	 */
	EReference getFeatureElement_Mandatory();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composes</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getComposes()
	 * @see #getFeatureElement()
	 * @generated
	 */
	EReference getFeatureElement_Composes();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternative()
	 * @see #getFeatureElement()
	 * @generated
	 */
	EReference getFeatureElement_Alternative();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternativeof <em>Alternativeof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alternativeof</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getAlternativeof()
	 * @see #getFeatureElement()
	 * @generated
	 */
	EReference getFeatureElement_Alternativeof();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptional()
	 * @see #getFeatureElement()
	 * @generated
	 */
	EReference getFeatureElement_Optional();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptionof <em>Optionof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Optionof</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getOptionof()
	 * @see #getFeatureElement()
	 * @generated
	 */
	EReference getFeatureElement_Optionof();

	/**
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.FeatureElement#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Product</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureElement#getProduct()
	 * @see #getFeatureElement()
	 * @generated
	 */
	EReference getFeatureElement_Product();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model
	 * @generated
	 */
	EClass getFeature_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureelement <em>Featureelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Featureelement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureelement()
	 * @see #getFeature_Model()
	 * @generated
	 */
	EReference getFeature_Model_Featureelement();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model#getName()
	 * @see #getFeature_Model()
	 * @generated
	 */
	EAttribute getFeature_Model_Name();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Root <em>RMDL Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RMDL Root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RMDL_Root
	 * @generated
	 */
	EClass getRMDL_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Root#getFeature_model <em>Feature model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature model</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RMDL_Root#getFeature_model()
	 * @see #getRMDL_Root()
	 * @generated
	 */
	EReference getRMDL_Root_Feature_model();

	/**
	 * Returns the meta object for the containment reference '{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Root#getRequirement_diagram <em>Requirement diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirement diagram</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RMDL_Root#getRequirement_diagram()
	 * @see #getRMDL_Root()
	 * @generated
	 */
	EReference getRMDL_Root_Requirement_diagram();

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
		 * The meta object literal for the '<em><b>Partof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__PARTOF = eINSTANCE.getRequirements_Partof();

		/**
		 * The meta object literal for the '<em><b>Decomposesto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__DECOMPOSESTO = eINSTANCE.getRequirements_Decomposesto();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS__SPECIFICATION = eINSTANCE.getRequirements_Specification();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl <em>Requirement Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.Requirement_DiagramImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirement_Diagram()
		 * @generated
		 */
		EClass REQUIREMENT_DIAGRAM = eINSTANCE.getRequirement_Diagram();

		/**
		 * The meta object literal for the '<em><b>Testcase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DIAGRAM__TESTCASE = eINSTANCE.getRequirement_Diagram_Testcase();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DIAGRAM__REQUIREMENTS = eINSTANCE.getRequirement_Diagram_Requirements();

		/**
		 * The meta object literal for the '<em><b>Review</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DIAGRAM__REVIEW = eINSTANCE.getRequirement_Diagram_Review();

		/**
		 * The meta object literal for the '<em><b>Designelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DIAGRAM__DESIGNELEMENT = eINSTANCE.getRequirement_Diagram_Designelement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DIAGRAM__NAME = eINSTANCE.getRequirement_Diagram_Name();

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
		 * The meta object literal for the '<em><b>Requirement root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT__REQUIREMENT_ROOT = eINSTANCE.getDesignElement_Requirement_root();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl <em>Feature Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.FeatureElementImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getFeatureElement()
		 * @generated
		 */
		EClass FEATURE_ELEMENT = eINSTANCE.getFeatureElement();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_ELEMENT__IS_OPTIONAL = eINSTANCE.getFeatureElement_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ELEMENT__MANDATORY = eINSTANCE.getFeatureElement_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Composes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ELEMENT__COMPOSES = eINSTANCE.getFeatureElement_Composes();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ELEMENT__ALTERNATIVE = eINSTANCE.getFeatureElement_Alternative();

		/**
		 * The meta object literal for the '<em><b>Alternativeof</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ELEMENT__ALTERNATIVEOF = eINSTANCE.getFeatureElement_Alternativeof();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ELEMENT__OPTIONAL = eINSTANCE.getFeatureElement_Optional();

		/**
		 * The meta object literal for the '<em><b>Optionof</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ELEMENT__OPTIONOF = eINSTANCE.getFeatureElement_Optionof();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ELEMENT__PRODUCT = eINSTANCE.getFeatureElement_Product();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.Feature_ModelImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getFeature_Model()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeature_Model();

		/**
		 * The meta object literal for the '<em><b>Featureelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATUREELEMENT = eINSTANCE.getFeature_Model_Featureelement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MODEL__NAME = eINSTANCE.getFeature_Model_Name();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RMDL_RootImpl <em>RMDL Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RMDL_RootImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRMDL_Root()
		 * @generated
		 */
		EClass RMDL_ROOT = eINSTANCE.getRMDL_Root();

		/**
		 * The meta object literal for the '<em><b>Feature model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RMDL_ROOT__FEATURE_MODEL = eINSTANCE.getRMDL_Root_Feature_model();

		/**
		 * The meta object literal for the '<em><b>Requirement diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RMDL_ROOT__REQUIREMENT_DIAGRAM = eINSTANCE.getRMDL_Root_Requirement_diagram();

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
