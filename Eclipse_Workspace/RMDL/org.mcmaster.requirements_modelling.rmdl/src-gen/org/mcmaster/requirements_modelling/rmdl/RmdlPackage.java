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
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.EntityImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SATISFIED_BY = 0;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VERIFICATION_TGT = 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = ENTITY__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFICATION_TGT = ENTITY__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFY_METHOD = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHILD = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARENT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__SATISFIED_BY = REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__VERIFICATION_TGT = REQUIREMENT__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__VERIFY_METHOD = REQUIREMENT__VERIFY_METHOD;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__CHILD = REQUIREMENT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__PARENT = REQUIREMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__SATISFIED_BY = REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__VERIFICATION_TGT = REQUIREMENT__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__VERIFY_METHOD = REQUIREMENT__VERIFY_METHOD;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__CHILD = REQUIREMENT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__PARENT = REQUIREMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Qualitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qualitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SATISFIED_BY = REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VERIFICATION_TGT = REQUIREMENT__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VERIFY_METHOD = REQUIREMENT__VERIFY_METHOD;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CHILD = REQUIREMENT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PARENT = REQUIREMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SATISFIED_BY = ENTITY__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERIFICATION_TGT = ENTITY__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REQUIREMENT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ENTITY = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_ID = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.ModelRootImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 5;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__TESTCASE = 2;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__SATISFIED_BY = REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__VERIFICATION_TGT = REQUIREMENT__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__VERIFY_METHOD = REQUIREMENT__VERIFY_METHOD;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__CHILD = REQUIREMENT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__PARENT = REQUIREMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Safety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.ReferenceImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 8;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.TraceImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 9;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__DESIGNELEMENT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__REQUIREMENT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl <em>Design Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getDesignElement()
	 * @generated
	 */
	int DESIGN_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__SATISFIED_BY = ENTITY__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__VERIFICATION_TGT = ENTITY__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__SATISFIES = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Design Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Design Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.TestCaseImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 11;

	/**
	 * The feature id for the '<em><b>Verification Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__VERIFICATION_SRC = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.VerificationImpl <em>Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.VerificationImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getVerification()
	 * @generated
	 */
	int VERIFICATION = 12;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__TESTCASE = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__ENTITY = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.DecompositionImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__SOURCE = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__TARGET = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.TestType <em>Test Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.TestType
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTestType()
	 * @generated
	 */
	int TEST_TYPE = 14;

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement#getID()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getVerifyMethod <em>Verify Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Method</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement#getVerifyMethod()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_VerifyMethod();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement#getChild()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Child();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Requirement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement#getParent()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Parent();

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
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Package#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Package#getRequirement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Requirement();

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
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Package#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Package#getEntity()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Entity();

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
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.ModelRoot#getEntity()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.ModelRoot#getReference()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.ModelRoot#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testcase</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.ModelRoot#getTestcase()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Testcase();

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
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Entity#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Satisfied By</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Entity#getSatisfiedBy()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SatisfiedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Entity#getVerificationTgt <em>Verification Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verification Tgt</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Entity#getVerificationTgt()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_VerificationTgt();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Trace#getDesignelement <em>Designelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Designelement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Trace#getDesignelement()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Designelement();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Trace#getRequirement()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Requirement();

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
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfies</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getSatisfies()
	 * @see #getDesignElement()
	 * @generated
	 */
	EReference getDesignElement_Satisfies();

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
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getVerificationSrc <em>Verification Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verification Src</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getVerificationSrc()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_VerificationSrc();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.TestCase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.TestCase#getId()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Id();

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
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Verification <em>Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Verification
	 * @generated
	 */
	EClass getVerification();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Verification#getTestcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testcase</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Verification#getTestcase()
	 * @see #getVerification()
	 * @generated
	 */
	EReference getVerification_Testcase();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Verification#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Verification#getEntity()
	 * @see #getVerification()
	 * @generated
	 */
	EReference getVerification_Entity();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Decomposition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Decomposition#getSource()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Decomposition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Decomposition#getTarget()
	 * @see #getDecomposition()
	 * @generated
	 */
	EReference getDecomposition_Target();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RequirementImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getRequirement()
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
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Verify Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VERIFY_METHOD = eINSTANCE.getRequirement_VerifyMethod();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CHILD = eINSTANCE.getRequirement_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PARENT = eINSTANCE.getRequirement_Parent();

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
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__REQUIREMENT = eINSTANCE.getPackage_Requirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ENTITY = eINSTANCE.getPackage_Entity();

		/**
		 * The meta object literal for the '<em><b>Package ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PACKAGE_ID = eINSTANCE.getPackage_PackageID();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ModelRootImpl <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.ModelRootImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getModelRoot()
		 * @generated
		 */
		EClass MODEL_ROOT = eINSTANCE.getModelRoot();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__ENTITY = eINSTANCE.getModelRoot_Entity();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__REFERENCE = eINSTANCE.getModelRoot_Reference();

		/**
		 * The meta object literal for the '<em><b>Testcase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__TESTCASE = eINSTANCE.getModelRoot_Testcase();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.EntityImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SATISFIED_BY = eINSTANCE.getEntity_SatisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Verification Tgt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__VERIFICATION_TGT = eINSTANCE.getEntity_VerificationTgt();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.ReferenceImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.TraceImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Designelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__DESIGNELEMENT = eINSTANCE.getTrace_Designelement();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__REQUIREMENT = eINSTANCE.getTrace_Requirement();

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
		 * The meta object literal for the '<em><b>Satisfies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT__SATISFIES = eINSTANCE.getDesignElement_Satisfies();

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
		 * The meta object literal for the '<em><b>Verification Src</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__VERIFICATION_SRC = eINSTANCE.getTestCase_VerificationSrc();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__ID = eINSTANCE.getTestCase_Id();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.VerificationImpl <em>Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.VerificationImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getVerification()
		 * @generated
		 */
		EClass VERIFICATION = eINSTANCE.getVerification();

		/**
		 * The meta object literal for the '<em><b>Testcase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION__TESTCASE = eINSTANCE.getVerification_Testcase();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION__ENTITY = eINSTANCE.getVerification_Entity();

		/**
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.DecompositionImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION__SOURCE = eINSTANCE.getDecomposition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSITION__TARGET = eINSTANCE.getDecomposition_Target();

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
