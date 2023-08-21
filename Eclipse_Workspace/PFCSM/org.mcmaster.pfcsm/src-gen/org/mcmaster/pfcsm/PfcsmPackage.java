/**
 */
package org.mcmaster.pfcsm;

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
 * @see org.mcmaster.pfcsm.PfcsmFactory
 * @model kind="package"
 * @generated
 */
public interface PfcsmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pfcsm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/pfcsm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pfcsm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PfcsmPackage eINSTANCE = org.mcmaster.pfcsm.impl.PfcsmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ClassImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_OPTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Reference To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REFERENCE_TO = 2;

	/**
	 * The feature id for the '<em><b>Reference From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REFERENCE_FROM = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ModelRootImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.AbstractClassImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAbstractClass()
	 * @generated
	 */
	int ABSTRACT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__IS_OPTIONAL = CLASS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Reference To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__REFERENCE_TO = CLASS__REFERENCE_TO;

	/**
	 * The feature id for the '<em><b>Reference From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__REFERENCE_FROM = CLASS__REFERENCE_FROM;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__ELEMENT = CLASS__ELEMENT;

	/**
	 * The number of structural features of the '<em>Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ReferenceImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.AssociationImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Src Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SRC_MULT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TGT_MULT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Asc Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASC_SRC = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Asc Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASC_TGT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.CompositionImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Tgt Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TGT_MULT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.InheritanceImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TARGET = REFERENCE__TARGET;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.XORImpl <em>XOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.XORImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getXOR()
	 * @generated
	 */
	int XOR = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__SOURCE = REFERENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__TARGET = REFERENCE__TARGET;

	/**
	 * The number of structural features of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ElementImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Association To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ASSOCIATION_TO = 1;

	/**
	 * The feature id for the '<em><b>Association From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ASSOCIATION_FROM = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.VariableImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Association To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ASSOCIATION_TO = ELEMENT__ASSOCIATION_TO;

	/**
	 * The feature id for the '<em><b>Association From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ASSOCIATION_FROM = ELEMENT__ASSOCIATION_FROM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__STRUCTURE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ClassVariableImpl <em>Class Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ClassVariableImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getClassVariable()
	 * @generated
	 */
	int CLASS_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Association To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE__ASSOCIATION_TO = VARIABLE__ASSOCIATION_TO;

	/**
	 * The feature id for the '<em><b>Association From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE__ASSOCIATION_FROM = VARIABLE__ASSOCIATION_FROM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE__STRUCTURE = VARIABLE__STRUCTURE;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE__PUBLIC = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE__INPUT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE__OUTPUT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Class Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.OperationImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Association To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ASSOCIATION_TO = ELEMENT__ASSOCIATION_TO;

	/**
	 * The feature id for the '<em><b>Association From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ASSOCIATION_FROM = ELEMENT__ASSOCIATION_FROM;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STATE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TRANSITION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PUBLIC = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operationvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERATIONVARIABLE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__USES = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRODUCES = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.StateImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 10;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INITIAL = 3;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_FINAL = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTION = 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.TransitionImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ORDER = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ConcreteClassImpl <em>Concrete Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ConcreteClassImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getConcreteClass()
	 * @generated
	 */
	int CONCRETE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CLASS__NAME = CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CLASS__IS_OPTIONAL = CLASS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Reference To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CLASS__REFERENCE_TO = CLASS__REFERENCE_TO;

	/**
	 * The feature id for the '<em><b>Reference From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CLASS__REFERENCE_FROM = CLASS__REFERENCE_FROM;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CLASS__ELEMENT = CLASS__ELEMENT;

	/**
	 * The number of structural features of the '<em>Concrete Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concrete Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_CLASS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.OperationVariableImpl <em>Operation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.OperationVariableImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getOperationVariable()
	 * @generated
	 */
	int OPERATION_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Association To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__ASSOCIATION_TO = VARIABLE__ASSOCIATION_TO;

	/**
	 * The feature id for the '<em><b>Association From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__ASSOCIATION_FROM = VARIABLE__ASSOCIATION_FROM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__STRUCTURE = VARIABLE__STRUCTURE;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__LOCAL = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE__ASSIGNED_VALUE = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ActionImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 15;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BODY = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.UsesImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getUses()
	 * @generated
	 */
	int USES = 17;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__SOURCE = ASSOCIATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__TARGET = ASSOCIATION__TARGET;

	/**
	 * The feature id for the '<em><b>Src Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__SRC_MULT = ASSOCIATION__SRC_MULT;

	/**
	 * The feature id for the '<em><b>Tgt Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__TGT_MULT = ASSOCIATION__TGT_MULT;

	/**
	 * The feature id for the '<em><b>Asc Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__ASC_SRC = ASSOCIATION__ASC_SRC;

	/**
	 * The feature id for the '<em><b>Asc Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__ASC_TGT = ASSOCIATION__ASC_TGT;

	/**
	 * The number of structural features of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ProducesImpl <em>Produces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ProducesImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getProduces()
	 * @generated
	 */
	int PRODUCES = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__SOURCE = ASSOCIATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__TARGET = ASSOCIATION__TARGET;

	/**
	 * The feature id for the '<em><b>Src Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__SRC_MULT = ASSOCIATION__SRC_MULT;

	/**
	 * The feature id for the '<em><b>Tgt Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__TGT_MULT = ASSOCIATION__TGT_MULT;

	/**
	 * The feature id for the '<em><b>Asc Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__ASC_SRC = ASSOCIATION__ASC_SRC;

	/**
	 * The feature id for the '<em><b>Asc Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__ASC_TGT = ASSOCIATION__ASC_TGT;

	/**
	 * The number of structural features of the '<em>Produces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Produces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_OPERATION_COUNT = ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.PrimitiveType
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 19;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.DataStructure <em>Data Structure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.DataStructure
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 20;

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.mcmaster.pfcsm.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.pfcsm.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Class#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.mcmaster.pfcsm.Class#isIsOptional()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsOptional();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Class#getReferenceTo <em>Reference To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference To</em>'.
	 * @see org.mcmaster.pfcsm.Class#getReferenceTo()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ReferenceTo();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Class#getReferenceFrom <em>Reference From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reference From</em>'.
	 * @see org.mcmaster.pfcsm.Class#getReferenceFrom()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ReferenceFrom();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Class#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.mcmaster.pfcsm.Class#getElement()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Element();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see org.mcmaster.pfcsm.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.ModelRoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see org.mcmaster.pfcsm.ModelRoot#getClass_()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.ModelRoot#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.mcmaster.pfcsm.ModelRoot#getReference()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Reference();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.AbstractClass <em>Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Class</em>'.
	 * @see org.mcmaster.pfcsm.AbstractClass
	 * @generated
	 */
	EClass getAbstractClass();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.mcmaster.pfcsm.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Reference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.mcmaster.pfcsm.Reference#getSource()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Source();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.mcmaster.pfcsm.Reference#getTarget()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Target();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.mcmaster.pfcsm.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Association#getSrcMult <em>Src Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Mult</em>'.
	 * @see org.mcmaster.pfcsm.Association#getSrcMult()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SrcMult();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Association#getTgtMult <em>Tgt Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Mult</em>'.
	 * @see org.mcmaster.pfcsm.Association#getTgtMult()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TgtMult();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Association#getAscSrc <em>Asc Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asc Src</em>'.
	 * @see org.mcmaster.pfcsm.Association#getAscSrc()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AscSrc();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Association#getAscTgt <em>Asc Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asc Tgt</em>'.
	 * @see org.mcmaster.pfcsm.Association#getAscTgt()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_AscTgt();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see org.mcmaster.pfcsm.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Composition#getTgtMult <em>Tgt Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Mult</em>'.
	 * @see org.mcmaster.pfcsm.Composition#getTgtMult()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_TgtMult();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see org.mcmaster.pfcsm.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR</em>'.
	 * @see org.mcmaster.pfcsm.XOR
	 * @generated
	 */
	EClass getXOR();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.ClassVariable <em>Class Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Variable</em>'.
	 * @see org.mcmaster.pfcsm.ClassVariable
	 * @generated
	 */
	EClass getClassVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.ClassVariable#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see org.mcmaster.pfcsm.ClassVariable#isPublic()
	 * @see #getClassVariable()
	 * @generated
	 */
	EAttribute getClassVariable_Public();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.ClassVariable#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see org.mcmaster.pfcsm.ClassVariable#getInput()
	 * @see #getClassVariable()
	 * @generated
	 */
	EReference getClassVariable_Input();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.ClassVariable#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see org.mcmaster.pfcsm.ClassVariable#getOutput()
	 * @see #getClassVariable()
	 * @generated
	 */
	EReference getClassVariable_Output();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.mcmaster.pfcsm.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Operation#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see org.mcmaster.pfcsm.Operation#getState()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_State();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Operation#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see org.mcmaster.pfcsm.Operation#getTransition()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Transition();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see org.mcmaster.pfcsm.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Operation#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see org.mcmaster.pfcsm.Operation#isPublic()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Public();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Operation#getOperationvariable <em>Operationvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operationvariable</em>'.
	 * @see org.mcmaster.pfcsm.Operation#getOperationvariable()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operationvariable();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Operation#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see org.mcmaster.pfcsm.Operation#getUses()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Uses();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Operation#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces</em>'.
	 * @see org.mcmaster.pfcsm.Operation#getProduces()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Produces();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.mcmaster.pfcsm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.mcmaster.pfcsm.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.mcmaster.pfcsm.State#getIncoming()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incoming();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.pfcsm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.mcmaster.pfcsm.State#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.mcmaster.pfcsm.State#getAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.State#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see org.mcmaster.pfcsm.State#isIsInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.State#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see org.mcmaster.pfcsm.State#isIsFinal()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsFinal();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.mcmaster.pfcsm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.mcmaster.pfcsm.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.mcmaster.pfcsm.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Transition#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.mcmaster.pfcsm.Transition#getOrder()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.mcmaster.pfcsm.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.ConcreteClass <em>Concrete Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Class</em>'.
	 * @see org.mcmaster.pfcsm.ConcreteClass
	 * @generated
	 */
	EClass getConcreteClass();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.mcmaster.pfcsm.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mcmaster.pfcsm.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Variable#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure</em>'.
	 * @see org.mcmaster.pfcsm.Variable#getStructure()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Structure();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.OperationVariable <em>Operation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Variable</em>'.
	 * @see org.mcmaster.pfcsm.OperationVariable
	 * @generated
	 */
	EClass getOperationVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.OperationVariable#isLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see org.mcmaster.pfcsm.OperationVariable#isLocal()
	 * @see #getOperationVariable()
	 * @generated
	 */
	EAttribute getOperationVariable_Local();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.OperationVariable#getAssignedValue <em>Assigned Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned Value</em>'.
	 * @see org.mcmaster.pfcsm.OperationVariable#getAssignedValue()
	 * @see #getOperationVariable()
	 * @generated
	 */
	EAttribute getOperationVariable_AssignedValue();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.mcmaster.pfcsm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Action#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.mcmaster.pfcsm.Action#getBody()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Body();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.mcmaster.pfcsm.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.pfcsm.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Element#getAssociationTo <em>Association To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association To</em>'.
	 * @see org.mcmaster.pfcsm.Element#getAssociationTo()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_AssociationTo();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Element#getAssociationFrom <em>Association From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association From</em>'.
	 * @see org.mcmaster.pfcsm.Element#getAssociationFrom()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_AssociationFrom();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses</em>'.
	 * @see org.mcmaster.pfcsm.Uses
	 * @generated
	 */
	EClass getUses();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Produces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produces</em>'.
	 * @see org.mcmaster.pfcsm.Produces
	 * @generated
	 */
	EClass getProduces();

	/**
	 * Returns the meta object for enum '{@link org.mcmaster.pfcsm.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see org.mcmaster.pfcsm.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link org.mcmaster.pfcsm.DataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Structure</em>'.
	 * @see org.mcmaster.pfcsm.DataStructure
	 * @generated
	 */
	EEnum getDataStructure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PfcsmFactory getPfcsmFactory();

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
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ClassImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_OPTIONAL = eINSTANCE.getClass_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Reference To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__REFERENCE_TO = eINSTANCE.getClass_ReferenceTo();

		/**
		 * The meta object literal for the '<em><b>Reference From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__REFERENCE_FROM = eINSTANCE.getClass_ReferenceFrom();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ELEMENT = eINSTANCE.getClass_Element();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ModelRootImpl <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ModelRootImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getModelRoot()
		 * @generated
		 */
		EClass MODEL_ROOT = eINSTANCE.getModelRoot();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__CLASS = eINSTANCE.getModelRoot_Class();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__REFERENCE = eINSTANCE.getModelRoot_Reference();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.AbstractClassImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAbstractClass()
		 * @generated
		 */
		EClass ABSTRACT_CLASS = eINSTANCE.getAbstractClass();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ReferenceImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SOURCE = eINSTANCE.getReference_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TARGET = eINSTANCE.getReference_Target();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.AssociationImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Src Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SRC_MULT = eINSTANCE.getAssociation_SrcMult();

		/**
		 * The meta object literal for the '<em><b>Tgt Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TGT_MULT = eINSTANCE.getAssociation_TgtMult();

		/**
		 * The meta object literal for the '<em><b>Asc Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ASC_SRC = eINSTANCE.getAssociation_AscSrc();

		/**
		 * The meta object literal for the '<em><b>Asc Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__ASC_TGT = eINSTANCE.getAssociation_AscTgt();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.CompositionImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Tgt Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__TGT_MULT = eINSTANCE.getComposition_TgtMult();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.InheritanceImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.XORImpl <em>XOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.XORImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getXOR()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXOR();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ClassVariableImpl <em>Class Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ClassVariableImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getClassVariable()
		 * @generated
		 */
		EClass CLASS_VARIABLE = eINSTANCE.getClassVariable();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_VARIABLE__PUBLIC = eINSTANCE.getClassVariable_Public();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_VARIABLE__INPUT = eINSTANCE.getClassVariable_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_VARIABLE__OUTPUT = eINSTANCE.getClassVariable_Output();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.OperationImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__STATE = eINSTANCE.getOperation_State();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TRANSITION = eINSTANCE.getOperation_Transition();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PUBLIC = eINSTANCE.getOperation_Public();

		/**
		 * The meta object literal for the '<em><b>Operationvariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERATIONVARIABLE = eINSTANCE.getOperation_Operationvariable();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__USES = eINSTANCE.getOperation_Uses();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PRODUCES = eINSTANCE.getOperation_Produces();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.StateImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING = eINSTANCE.getState_Incoming();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTION = eINSTANCE.getState_Action();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_FINAL = eINSTANCE.getState_IsFinal();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.TransitionImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ORDER = eINSTANCE.getTransition_Order();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ConcreteClassImpl <em>Concrete Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ConcreteClassImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getConcreteClass()
		 * @generated
		 */
		EClass CONCRETE_CLASS = eINSTANCE.getConcreteClass();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.VariableImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__STRUCTURE = eINSTANCE.getVariable_Structure();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.OperationVariableImpl <em>Operation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.OperationVariableImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getOperationVariable()
		 * @generated
		 */
		EClass OPERATION_VARIABLE = eINSTANCE.getOperationVariable();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_VARIABLE__LOCAL = eINSTANCE.getOperationVariable_Local();

		/**
		 * The meta object literal for the '<em><b>Assigned Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_VARIABLE__ASSIGNED_VALUE = eINSTANCE.getOperationVariable_AssignedValue();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ActionImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__BODY = eINSTANCE.getAction_Body();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ElementImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Association To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ASSOCIATION_TO = eINSTANCE.getElement_AssociationTo();

		/**
		 * The meta object literal for the '<em><b>Association From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ASSOCIATION_FROM = eINSTANCE.getElement_AssociationFrom();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.UsesImpl <em>Uses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.UsesImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getUses()
		 * @generated
		 */
		EClass USES = eINSTANCE.getUses();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ProducesImpl <em>Produces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ProducesImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getProduces()
		 * @generated
		 */
		EClass PRODUCES = eINSTANCE.getProduces();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.PrimitiveType
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.DataStructure <em>Data Structure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.DataStructure
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getDataStructure()
		 * @generated
		 */
		EEnum DATA_STRUCTURE = eINSTANCE.getDataStructure();

	}

} //PfcsmPackage
