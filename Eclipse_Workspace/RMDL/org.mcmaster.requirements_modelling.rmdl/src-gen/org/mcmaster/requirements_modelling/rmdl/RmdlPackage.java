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
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__REVIEW = 3;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__TESTCASE = 4;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__TRACETO = 5;

	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl <em>Requirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirementType()
	 * @generated
	 */
	int REQUIREMENT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__NAME = REQUIREMENTS__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__ID = REQUIREMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__DESCRIPTION = REQUIREMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REVIEW = REQUIREMENTS__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__TESTCASE = REQUIREMENTS__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__TRACETO = REQUIREMENTS__TRACETO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__SPECIFICATION = REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REQUIREMENTCONTAINER = REQUIREMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Replacedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REPLACEDBY = REQUIREMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Starting Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__STARTING_REQ = REQUIREMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__REQUIREMENT_CANVAS = REQUIREMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependson</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__DEPENDSON = REQUIREMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_FEATURE_COUNT = REQUIREMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_OPERATION_COUNT = REQUIREMENTS_OPERATION_COUNT + 0;

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
	int FUNCTIONAL__NAME = REQUIREMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__ID = REQUIREMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__DESCRIPTION = REQUIREMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__REVIEW = REQUIREMENT_TYPE__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__TESTCASE = REQUIREMENT_TYPE__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__TRACETO = REQUIREMENT_TYPE__TRACETO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__SPECIFICATION = REQUIREMENT_TYPE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__REQUIREMENTCONTAINER = REQUIREMENT_TYPE__REQUIREMENTCONTAINER;

	/**
	 * The feature id for the '<em><b>Replacedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__REPLACEDBY = REQUIREMENT_TYPE__REPLACEDBY;

	/**
	 * The feature id for the '<em><b>Starting Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__STARTING_REQ = REQUIREMENT_TYPE__STARTING_REQ;

	/**
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__REQUIREMENT_CANVAS = REQUIREMENT_TYPE__REQUIREMENT_CANVAS;

	/**
	 * The feature id for the '<em><b>Dependson</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__DEPENDSON = REQUIREMENT_TYPE__DEPENDSON;

	/**
	 * The number of structural features of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FEATURE_COUNT = REQUIREMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATION_COUNT = REQUIREMENT_TYPE_OPERATION_COUNT + 0;

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
	int QUALITATIVE__NAME = REQUIREMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__ID = REQUIREMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__DESCRIPTION = REQUIREMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__REVIEW = REQUIREMENT_TYPE__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__TESTCASE = REQUIREMENT_TYPE__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__TRACETO = REQUIREMENT_TYPE__TRACETO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__SPECIFICATION = REQUIREMENT_TYPE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__REQUIREMENTCONTAINER = REQUIREMENT_TYPE__REQUIREMENTCONTAINER;

	/**
	 * The feature id for the '<em><b>Replacedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__REPLACEDBY = REQUIREMENT_TYPE__REPLACEDBY;

	/**
	 * The feature id for the '<em><b>Starting Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__STARTING_REQ = REQUIREMENT_TYPE__STARTING_REQ;

	/**
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__REQUIREMENT_CANVAS = REQUIREMENT_TYPE__REQUIREMENT_CANVAS;

	/**
	 * The feature id for the '<em><b>Dependson</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__DEPENDSON = REQUIREMENT_TYPE__DEPENDSON;

	/**
	 * The number of structural features of the '<em>Qualitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FEATURE_COUNT = REQUIREMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qualitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_OPERATION_COUNT = REQUIREMENT_TYPE_OPERATION_COUNT + 0;

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
	int CONSTRAINT__NAME = REQUIREMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = REQUIREMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = REQUIREMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REVIEW = REQUIREMENT_TYPE__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TESTCASE = REQUIREMENT_TYPE__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TRACETO = REQUIREMENT_TYPE__TRACETO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SPECIFICATION = REQUIREMENT_TYPE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REQUIREMENTCONTAINER = REQUIREMENT_TYPE__REQUIREMENTCONTAINER;

	/**
	 * The feature id for the '<em><b>Replacedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REPLACEDBY = REQUIREMENT_TYPE__REPLACEDBY;

	/**
	 * The feature id for the '<em><b>Starting Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__STARTING_REQ = REQUIREMENT_TYPE__STARTING_REQ;

	/**
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REQUIREMENT_CANVAS = REQUIREMENT_TYPE__REQUIREMENT_CANVAS;

	/**
	 * The feature id for the '<em><b>Dependson</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DEPENDSON = REQUIREMENT_TYPE__DEPENDSON;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = REQUIREMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = REQUIREMENT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl <em>Requirement Canvas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirement_Canvas()
	 * @generated
	 */
	int REQUIREMENT_CANVAS = 4;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CANVAS__TESTCASE = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CANVAS__REQUIREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CANVAS__REVIEW = 2;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CANVAS__DESIGNELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CANVAS__NAME = 4;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CANVAS__REQUIREMENTCONTAINER = 5;

	/**
	 * The number of structural features of the '<em>Requirement Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CANVAS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Requirement Canvas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CANVAS_OPERATION_COUNT = 0;

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
	int SAFETY__NAME = REQUIREMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__ID = REQUIREMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DESCRIPTION = REQUIREMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__REVIEW = REQUIREMENT_TYPE__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__TESTCASE = REQUIREMENT_TYPE__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__TRACETO = REQUIREMENT_TYPE__TRACETO;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__SPECIFICATION = REQUIREMENT_TYPE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__REQUIREMENTCONTAINER = REQUIREMENT_TYPE__REQUIREMENTCONTAINER;

	/**
	 * The feature id for the '<em><b>Replacedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__REPLACEDBY = REQUIREMENT_TYPE__REPLACEDBY;

	/**
	 * The feature id for the '<em><b>Starting Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__STARTING_REQ = REQUIREMENT_TYPE__STARTING_REQ;

	/**
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__REQUIREMENT_CANVAS = REQUIREMENT_TYPE__REQUIREMENT_CANVAS;

	/**
	 * The feature id for the '<em><b>Dependson</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DEPENDSON = REQUIREMENT_TYPE__DEPENDSON;

	/**
	 * The number of structural features of the '<em>Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FEATURE_COUNT = REQUIREMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_OPERATION_COUNT = REQUIREMENT_TYPE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__REQUIREMENT_CANVAS = 4;

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
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__REQUIREMENT_CANVAS = 3;

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
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REQUIREMENT_CANVAS = 2;

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
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl <em>Feature Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getFeatureEntity()
	 * @generated
	 */
	int FEATURE_ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__TESTCASE = REQUIREMENT_CANVAS__TESTCASE;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__REQUIREMENTS = REQUIREMENT_CANVAS__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__REVIEW = REQUIREMENT_CANVAS__REVIEW;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__DESIGNELEMENT = REQUIREMENT_CANVAS__DESIGNELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__NAME = REQUIREMENT_CANVAS__NAME;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__REQUIREMENTCONTAINER = REQUIREMENT_CANVAS__REQUIREMENTCONTAINER;

	/**
	 * The feature id for the '<em><b>Composes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__COMPOSES = REQUIREMENT_CANVAS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__MANDATORY = REQUIREMENT_CANVAS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optionof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__OPTIONOF = REQUIREMENT_CANVAS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__OPTIONAL = REQUIREMENT_CANVAS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__ALTERNATIVE = REQUIREMENT_CANVAS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alternativeof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY__ALTERNATIVEOF = REQUIREMENT_CANVAS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Feature Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY_FEATURE_COUNT = REQUIREMENT_CANVAS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Feature Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ENTITY_OPERATION_COUNT = REQUIREMENT_CANVAS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.ElementImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TESTCASE = FEATURE_ENTITY__TESTCASE;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REQUIREMENTS = FEATURE_ENTITY__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REVIEW = FEATURE_ENTITY__REVIEW;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESIGNELEMENT = FEATURE_ENTITY__DESIGNELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = FEATURE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REQUIREMENTCONTAINER = FEATURE_ENTITY__REQUIREMENTCONTAINER;

	/**
	 * The feature id for the '<em><b>Composes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMPOSES = FEATURE_ENTITY__COMPOSES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MANDATORY = FEATURE_ENTITY__MANDATORY;

	/**
	 * The feature id for the '<em><b>Optionof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OPTIONOF = FEATURE_ENTITY__OPTIONOF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OPTIONAL = FEATURE_ENTITY__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ALTERNATIVE = FEATURE_ENTITY__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Alternativeof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ALTERNATIVEOF = FEATURE_ENTITY__ALTERNATIVEOF;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = FEATURE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = FEATURE_ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Featureentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__FEATUREENTITY = 1;

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
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RMDL_ProjectImpl <em>RMDL Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RMDL_ProjectImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRMDL_Project()
	 * @generated
	 */
	int RMDL_PROJECT = 11;

	/**
	 * The feature id for the '<em><b>Feature model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMDL_PROJECT__FEATURE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>RMDL Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMDL_PROJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RMDL Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMDL_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RootImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 13;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TESTCASE = FEATURE_ENTITY__TESTCASE;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__REQUIREMENTS = FEATURE_ENTITY__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Review</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__REVIEW = FEATURE_ENTITY__REVIEW;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DESIGNELEMENT = FEATURE_ENTITY__DESIGNELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAME = FEATURE_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Requirementcontainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__REQUIREMENTCONTAINER = FEATURE_ENTITY__REQUIREMENTCONTAINER;

	/**
	 * The feature id for the '<em><b>Composes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__COMPOSES = FEATURE_ENTITY__COMPOSES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MANDATORY = FEATURE_ENTITY__MANDATORY;

	/**
	 * The feature id for the '<em><b>Optionof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__OPTIONOF = FEATURE_ENTITY__OPTIONOF;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__OPTIONAL = FEATURE_ENTITY__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ALTERNATIVE = FEATURE_ENTITY__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Alternativeof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ALTERNATIVEOF = FEATURE_ENTITY__ALTERNATIVEOF;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = FEATURE_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = FEATURE_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementContainerImpl <em>Requirement Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RequirementContainerImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirementContainer()
	 * @generated
	 */
	int REQUIREMENT_CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER__NAME = REQUIREMENTS__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER__ID = REQUIREMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER__DESCRIPTION = REQUIREMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER__REVIEW = REQUIREMENTS__REVIEW;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER__TESTCASE = REQUIREMENTS__TESTCASE;

	/**
	 * The feature id for the '<em><b>Traceto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER__TRACETO = REQUIREMENTS__TRACETO;

	/**
	 * The feature id for the '<em><b>Ownedrequirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS = REQUIREMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement canvas</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS = REQUIREMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER_FEATURE_COUNT = REQUIREMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirement Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_CONTAINER_OPERATION_COUNT = REQUIREMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.TestType <em>Test Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.TestType
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTestType()
	 * @generated
	 */
	int TEST_TYPE = 16;

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
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas <em>Requirement Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Canvas</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas
	 * @generated
	 */
	EClass getRequirement_Canvas();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testcase</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getTestcase()
	 * @see #getRequirement_Canvas()
	 * @generated
	 */
	EReference getRequirement_Canvas_Testcase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirements()
	 * @see #getRequirement_Canvas()
	 * @generated
	 */
	EReference getRequirement_Canvas_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Review</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getReview()
	 * @see #getRequirement_Canvas()
	 * @generated
	 */
	EReference getRequirement_Canvas_Review();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getDesignelement <em>Designelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Designelement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getDesignelement()
	 * @see #getRequirement_Canvas()
	 * @generated
	 */
	EReference getRequirement_Canvas_Designelement();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getName()
	 * @see #getRequirement_Canvas()
	 * @generated
	 */
	EAttribute getRequirement_Canvas_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirementcontainer <em>Requirementcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirementcontainer</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Canvas#getRequirementcontainer()
	 * @see #getRequirement_Canvas()
	 * @generated
	 */
	EReference getRequirement_Canvas_Requirementcontainer();

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
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement canvas</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getRequirement_canvas()
	 * @see #getDesignElement()
	 * @generated
	 */
	EReference getDesignElement_Requirement_canvas();

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
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement canvas</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getRequirement_canvas()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Requirement_canvas();

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
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement canvas</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_canvas()
	 * @see #getReview()
	 * @generated
	 */
	EReference getReview_Requirement_canvas();

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
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Element
	 * @generated
	 */
	EClass getElement();

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
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureentity <em>Featureentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Featureentity</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Feature_Model#getFeatureentity()
	 * @see #getFeature_Model()
	 * @generated
	 */
	EReference getFeature_Model_Featureentity();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Project <em>RMDL Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RMDL Project</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RMDL_Project
	 * @generated
	 */
	EClass getRMDL_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.RMDL_Project#getFeature_model <em>Feature model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature model</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RMDL_Project#getFeature_model()
	 * @see #getRMDL_Project()
	 * @generated
	 */
	EReference getRMDL_Project_Feature_model();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity <em>Feature Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Entity</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity
	 * @generated
	 */
	EClass getFeatureEntity();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getComposes <em>Composes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composes</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getComposes()
	 * @see #getFeatureEntity()
	 * @generated
	 */
	EReference getFeatureEntity_Composes();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getMandatory()
	 * @see #getFeatureEntity()
	 * @generated
	 */
	EReference getFeatureEntity_Mandatory();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionof <em>Optionof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Optionof</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptionof()
	 * @see #getFeatureEntity()
	 * @generated
	 */
	EReference getFeatureEntity_Optionof();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getOptional()
	 * @see #getFeatureEntity()
	 * @generated
	 */
	EReference getFeatureEntity_Optional();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternative()
	 * @see #getFeatureEntity()
	 * @generated
	 */
	EReference getFeatureEntity_Alternative();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeof <em>Alternativeof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alternativeof</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.FeatureEntity#getAlternativeof()
	 * @see #getFeatureEntity()
	 * @generated
	 */
	EReference getFeatureEntity_Alternativeof();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer <em>Requirement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Container</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementContainer
	 * @generated
	 */
	EClass getRequirementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getOwnedrequirements <em>Ownedrequirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ownedrequirements</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getOwnedrequirements()
	 * @see #getRequirementContainer()
	 * @generated
	 */
	EReference getRequirementContainer_Ownedrequirements();

	/**
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement canvas</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementContainer#getRequirement_canvas()
	 * @see #getRequirementContainer()
	 * @generated
	 */
	EReference getRequirementContainer_Requirement_canvas();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Type</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType
	 * @generated
	 */
	EClass getRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getSpecification()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Specification();

	/**
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementcontainer <em>Requirementcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirementcontainer</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirementcontainer()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Requirementcontainer();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getReplacedby <em>Replacedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replacedby</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getReplacedby()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Replacedby();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#isStartingReq <em>Starting Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Req</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#isStartingReq()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_StartingReq();

	/**
	 * Returns the meta object for the container reference '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirement_canvas <em>Requirement canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirement canvas</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getRequirement_canvas()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Requirement_canvas();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.RequirementType#getDependson <em>Dependson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependson</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.RequirementType#getDependson()
	 * @see #getRequirementType()
	 * @generated
	 */
	EReference getRequirementType_Dependson();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl <em>Requirement Canvas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.Requirement_CanvasImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirement_Canvas()
		 * @generated
		 */
		EClass REQUIREMENT_CANVAS = eINSTANCE.getRequirement_Canvas();

		/**
		 * The meta object literal for the '<em><b>Testcase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CANVAS__TESTCASE = eINSTANCE.getRequirement_Canvas_Testcase();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CANVAS__REQUIREMENTS = eINSTANCE.getRequirement_Canvas_Requirements();

		/**
		 * The meta object literal for the '<em><b>Review</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CANVAS__REVIEW = eINSTANCE.getRequirement_Canvas_Review();

		/**
		 * The meta object literal for the '<em><b>Designelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CANVAS__DESIGNELEMENT = eINSTANCE.getRequirement_Canvas_Designelement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_CANVAS__NAME = eINSTANCE.getRequirement_Canvas_Name();

		/**
		 * The meta object literal for the '<em><b>Requirementcontainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CANVAS__REQUIREMENTCONTAINER = eINSTANCE.getRequirement_Canvas_Requirementcontainer();

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
		 * The meta object literal for the '<em><b>Requirement canvas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT__REQUIREMENT_CANVAS = eINSTANCE.getDesignElement_Requirement_canvas();

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
		 * The meta object literal for the '<em><b>Requirement canvas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__REQUIREMENT_CANVAS = eINSTANCE.getTestCase_Requirement_canvas();

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
		 * The meta object literal for the '<em><b>Requirement canvas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW__REQUIREMENT_CANVAS = eINSTANCE.getReview_Requirement_canvas();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.ElementImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MODEL__NAME = eINSTANCE.getFeature_Model_Name();

		/**
		 * The meta object literal for the '<em><b>Featureentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__FEATUREENTITY = eINSTANCE.getFeature_Model_Featureentity();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RMDL_ProjectImpl <em>RMDL Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RMDL_ProjectImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRMDL_Project()
		 * @generated
		 */
		EClass RMDL_PROJECT = eINSTANCE.getRMDL_Project();

		/**
		 * The meta object literal for the '<em><b>Feature model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RMDL_PROJECT__FEATURE_MODEL = eINSTANCE.getRMDL_Project_Feature_model();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl <em>Feature Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.FeatureEntityImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getFeatureEntity()
		 * @generated
		 */
		EClass FEATURE_ENTITY = eINSTANCE.getFeatureEntity();

		/**
		 * The meta object literal for the '<em><b>Composes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ENTITY__COMPOSES = eINSTANCE.getFeatureEntity_Composes();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ENTITY__MANDATORY = eINSTANCE.getFeatureEntity_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Optionof</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ENTITY__OPTIONOF = eINSTANCE.getFeatureEntity_Optionof();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ENTITY__OPTIONAL = eINSTANCE.getFeatureEntity_Optional();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ENTITY__ALTERNATIVE = eINSTANCE.getFeatureEntity_Alternative();

		/**
		 * The meta object literal for the '<em><b>Alternativeof</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_ENTITY__ALTERNATIVEOF = eINSTANCE.getFeatureEntity_Alternativeof();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RootImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementContainerImpl <em>Requirement Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RequirementContainerImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirementContainer()
		 * @generated
		 */
		EClass REQUIREMENT_CONTAINER = eINSTANCE.getRequirementContainer();

		/**
		 * The meta object literal for the '<em><b>Ownedrequirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CONTAINER__OWNEDREQUIREMENTS = eINSTANCE.getRequirementContainer_Ownedrequirements();

		/**
		 * The meta object literal for the '<em><b>Requirement canvas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_CONTAINER__REQUIREMENT_CANVAS = eINSTANCE.getRequirementContainer_Requirement_canvas();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl <em>Requirement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RequirementTypeImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirementType()
		 * @generated
		 */
		EClass REQUIREMENT_TYPE = eINSTANCE.getRequirementType();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__SPECIFICATION = eINSTANCE.getRequirementType_Specification();

		/**
		 * The meta object literal for the '<em><b>Requirementcontainer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__REQUIREMENTCONTAINER = eINSTANCE.getRequirementType_Requirementcontainer();

		/**
		 * The meta object literal for the '<em><b>Replacedby</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__REPLACEDBY = eINSTANCE.getRequirementType_Replacedby();

		/**
		 * The meta object literal for the '<em><b>Starting Req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_TYPE__STARTING_REQ = eINSTANCE.getRequirementType_StartingReq();

		/**
		 * The meta object literal for the '<em><b>Requirement canvas</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__REQUIREMENT_CANVAS = eINSTANCE.getRequirementType_Requirement_canvas();

		/**
		 * The meta object literal for the '<em><b>Dependson</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_TYPE__DEPENDSON = eINSTANCE.getRequirementType_Dependson();

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
