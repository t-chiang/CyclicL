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
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__VERIFY_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__CHILD = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__PARENT = 5;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__VERIFICATION_TGT = 6;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__REQUIREMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Satisfiedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__SATISFIEDBY = 8;

	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__VERIFY_METHOD = REQUIREMENTS__VERIFY_METHOD;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__CHILD = REQUIREMENTS__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__PARENT = REQUIREMENTS__PARENT;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__VERIFICATION_TGT = REQUIREMENTS__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__REQUIREMENT_ROOT = REQUIREMENTS__REQUIREMENT_ROOT;

	/**
	 * The feature id for the '<em><b>Satisfiedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__SATISFIEDBY = REQUIREMENTS__SATISFIEDBY;

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
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__VERIFY_METHOD = REQUIREMENTS__VERIFY_METHOD;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__CHILD = REQUIREMENTS__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__PARENT = REQUIREMENTS__PARENT;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__VERIFICATION_TGT = REQUIREMENTS__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__REQUIREMENT_ROOT = REQUIREMENTS__REQUIREMENT_ROOT;

	/**
	 * The feature id for the '<em><b>Satisfiedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__SATISFIEDBY = REQUIREMENTS__SATISFIEDBY;

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
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VERIFY_METHOD = REQUIREMENTS__VERIFY_METHOD;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CHILD = REQUIREMENTS__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PARENT = REQUIREMENTS__PARENT;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VERIFICATION_TGT = REQUIREMENTS__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REQUIREMENT_ROOT = REQUIREMENTS__REQUIREMENT_ROOT;

	/**
	 * The feature id for the '<em><b>Satisfiedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SATISFIEDBY = REQUIREMENTS__SATISFIEDBY;

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
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__TESTCASE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__DESIGNELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ROOT__REQUIREMENTS = 4;

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
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REFERENCE = REQUIREMENT_ROOT__REFERENCE;

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
	 * The feature id for the '<em><b>Designelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESIGNELEMENT = REQUIREMENT_ROOT__DESIGNELEMENT;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REQUIREMENTS = REQUIREMENT_ROOT__REQUIREMENTS;

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
	 * The feature id for the '<em><b>Verify Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__VERIFY_METHOD = REQUIREMENTS__VERIFY_METHOD;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__CHILD = REQUIREMENTS__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__PARENT = REQUIREMENTS__PARENT;

	/**
	 * The feature id for the '<em><b>Verification Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__VERIFICATION_TGT = REQUIREMENTS__VERIFICATION_TGT;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__REQUIREMENT_ROOT = REQUIREMENTS__REQUIREMENT_ROOT;

	/**
	 * The feature id for the '<em><b>Satisfiedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY__SATISFIEDBY = REQUIREMENTS__SATISFIEDBY;

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
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.ReferenceImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 7;

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
	 * The meta object id for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl <em>Design Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.DesignElementImpl
	 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getDesignElement()
	 * @generated
	 */
	int DESIGN_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__REQUIREMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT__SATISFIES = 3;

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
	int TEST_CASE = 9;

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
	 * The feature id for the '<em><b>Requirement root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__REQUIREMENT_ROOT = 4;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 5;

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
	int VERIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Testcase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__TESTCASE = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION__REQUIREMENT = REFERENCE_FEATURE_COUNT + 1;

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
	int DECOMPOSITION = 11;

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
	 * Returns the meta object for the attribute '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getVerifyMethod <em>Verify Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Method</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getVerifyMethod()
	 * @see #getRequirements()
	 * @generated
	 */
	EAttribute getRequirements_VerifyMethod();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getChild()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Child();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getParent()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Parent();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getVerificationTgt <em>Verification Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Verification Tgt</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getVerificationTgt()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_VerificationTgt();

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
	 * Returns the meta object for the reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getSatisfiedby <em>Satisfiedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfiedby</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getSatisfiedby()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Satisfiedby();

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
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getReference()
	 * @see #getRequirement_Root()
	 * @generated
	 */
	EReference getRequirement_Root_Reference();

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
	 * Returns the meta object for class '{@link org.mcmaster.requirements_modelling.rmdl.Safety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Safety
	 * @generated
	 */
	EClass getSafety();

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
	 * Returns the meta object for the attribute list '{@link org.mcmaster.requirements_modelling.rmdl.DesignElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Children</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.DesignElement#getChildren()
	 * @see #getDesignElement()
	 * @generated
	 */
	EAttribute getDesignElement_Children();

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
	 * Returns the meta object for the reference '{@link org.mcmaster.requirements_modelling.rmdl.Verification#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see org.mcmaster.requirements_modelling.rmdl.Verification#getRequirement()
	 * @see #getVerification()
	 * @generated
	 */
	EReference getVerification_Requirement();

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
		 * The meta object literal for the '<em><b>Verify Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS__VERIFY_METHOD = eINSTANCE.getRequirements_VerifyMethod();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__CHILD = eINSTANCE.getRequirements_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__PARENT = eINSTANCE.getRequirements_Parent();

		/**
		 * The meta object literal for the '<em><b>Verification Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__VERIFICATION_TGT = eINSTANCE.getRequirements_VerificationTgt();

		/**
		 * The meta object literal for the '<em><b>Requirement root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__REQUIREMENT_ROOT = eINSTANCE.getRequirements_Requirement_root();

		/**
		 * The meta object literal for the '<em><b>Satisfiedby</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__SATISFIEDBY = eINSTANCE.getRequirements_Satisfiedby();

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
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROOT__REFERENCE = eINSTANCE.getRequirement_Root_Reference();

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
		 * The meta object literal for the '<em><b>Designelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROOT__DESIGNELEMENT = eINSTANCE.getRequirement_Root_Designelement();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ROOT__REQUIREMENTS = eINSTANCE.getRequirement_Root_Requirements();

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
		 * The meta object literal for the '{@link org.mcmaster.requirements_modelling.rmdl.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.ReferenceImpl
		 * @see org.mcmaster.requirements_modelling.rmdl.impl.RmdlPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

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
		 * The meta object literal for the '<em><b>Requirement root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT__REQUIREMENT_ROOT = eINSTANCE.getDesignElement_Requirement_root();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_ELEMENT__CHILDREN = eINSTANCE.getDesignElement_Children();

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
		 * The meta object literal for the '<em><b>Requirement root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__REQUIREMENT_ROOT = eINSTANCE.getTestCase_Requirement_root();

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
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION__REQUIREMENT = eINSTANCE.getVerification_Requirement();

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
