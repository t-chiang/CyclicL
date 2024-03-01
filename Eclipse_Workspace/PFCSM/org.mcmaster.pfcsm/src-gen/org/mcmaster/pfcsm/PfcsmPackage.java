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
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.DesignEntityImpl <em>Design Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.DesignEntityImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getDesignEntity()
	 * @generated
	 */
	int DESIGN_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__IS_ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Usedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__USEDBY = 3;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__USES = 4;

	/**
	 * The feature id for the '<em><b>Ownerof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__OWNEROF = 5;

	/**
	 * The feature id for the '<em><b>Ownedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__OWNEDBY = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__PARENT = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__CHILDREN = 8;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__ALTERNATIVE = 9;

	/**
	 * The feature id for the '<em><b>Alternativeto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY__ALTERNATIVETO = 10;

	/**
	 * The number of structural features of the '<em>Design Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Design Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl <em>Class Diagram Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getClass_Diagram_Root()
	 * @generated
	 */
	int CLASS_DIAGRAM_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Designentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT__DESIGNENTITY = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT__HARDWARE = 2;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT__SOFTWARE = 3;

	/**
	 * The number of structural features of the '<em>Class Diagram Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Class Diagram Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ReferenceImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CLASS_DIAGRAM_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.CompositionImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 4;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ElementImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.OperationImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.UsesImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getUses()
	 * @generated
	 */
	int USES = 3;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__CLASS_DIAGRAM_ROOT = REFERENCE__CLASS_DIAGRAM_ROOT;

	/**
	 * The feature id for the '<em><b>Src Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__SRC_MULT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__TGT_MULT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__ATTRIBUTE = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__OPERATION = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__TGT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__SRC = REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__CLASS_DIAGRAM_ROOT = REFERENCE__CLASS_DIAGRAM_ROOT;

	/**
	 * The feature id for the '<em><b>Tgt Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TGT_MULT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SRC = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TGT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_PUBLIC = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.ProducesImpl <em>Produces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.ProducesImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getProduces()
	 * @generated
	 */
	int PRODUCES = 6;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__CLASS_DIAGRAM_ROOT = REFERENCE__CLASS_DIAGRAM_ROOT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__OPERATION = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__ATTRIBUTE = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__SRC_MULT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tgt Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__TGT_MULT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Produces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Produces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.AttributeImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_PUBLIC = ELEMENT__IS_PUBLIC;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__USES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRODUCES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_PUBLIC = ELEMENT__IS_PUBLIC;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__USES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRODUCES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.HardwareImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__NAME = DESIGN_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__ELEMENT = DESIGN_ENTITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__IS_ABSTRACT = DESIGN_ENTITY__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Usedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__USEDBY = DESIGN_ENTITY__USEDBY;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__USES = DESIGN_ENTITY__USES;

	/**
	 * The feature id for the '<em><b>Ownerof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__OWNEROF = DESIGN_ENTITY__OWNEROF;

	/**
	 * The feature id for the '<em><b>Ownedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__OWNEDBY = DESIGN_ENTITY__OWNEDBY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__PARENT = DESIGN_ENTITY__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__CHILDREN = DESIGN_ENTITY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__ALTERNATIVE = DESIGN_ENTITY__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Alternativeto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__ALTERNATIVETO = DESIGN_ENTITY__ALTERNATIVETO;

	/**
	 * The feature id for the '<em><b>Runs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__RUNS = DESIGN_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = DESIGN_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = DESIGN_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.SoftwareImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NAME = DESIGN_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__ELEMENT = DESIGN_ENTITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__IS_ABSTRACT = DESIGN_ENTITY__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Usedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__USEDBY = DESIGN_ENTITY__USEDBY;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__USES = DESIGN_ENTITY__USES;

	/**
	 * The feature id for the '<em><b>Ownerof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__OWNEROF = DESIGN_ENTITY__OWNEROF;

	/**
	 * The feature id for the '<em><b>Ownedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__OWNEDBY = DESIGN_ENTITY__OWNEDBY;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__PARENT = DESIGN_ENTITY__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__CHILDREN = DESIGN_ENTITY__CHILDREN;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__ALTERNATIVE = DESIGN_ENTITY__ALTERNATIVE;

	/**
	 * The feature id for the '<em><b>Alternativeto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__ALTERNATIVETO = DESIGN_ENTITY__ALTERNATIVETO;

	/**
	 * The feature id for the '<em><b>Runson</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__RUNSON = DESIGN_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = DESIGN_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = DESIGN_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.AggregationImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 11;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__CLASS_DIAGRAM_ROOT = REFERENCE__CLASS_DIAGRAM_ROOT;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TGT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SRC = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SRC_MULT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.AlternativeImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 12;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CLASS_DIAGRAM_ROOT = REFERENCE__CLASS_DIAGRAM_ROOT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__CARDINALITY = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__SRC = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__TGT = REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.PrimitiveType
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.DataStructure <em>Data Structure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.DataStructure
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 14;

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.DesignEntity <em>Design Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Entity</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity
	 * @generated
	 */
	EClass getDesignEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.DesignEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getName()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EAttribute getDesignEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.DesignEntity#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getElement()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.DesignEntity#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#isIsAbstract()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EAttribute getDesignEntity_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesignEntity#getUsedby <em>Usedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usedby</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getUsedby()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Usedby();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesignEntity#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getUses()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Uses();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesignEntity#getOwnerof <em>Ownerof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ownerof</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getOwnerof()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Ownerof();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.DesignEntity#getOwnedby <em>Ownedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ownedby</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getOwnedby()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Ownedby();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.DesignEntity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getParent()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesignEntity#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getChildren()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesignEntity#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getAlternative()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Alternative();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesignEntity#getAlternativeto <em>Alternativeto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternativeto</em>'.
	 * @see org.mcmaster.pfcsm.DesignEntity#getAlternativeto()
	 * @see #getDesignEntity()
	 * @generated
	 */
	EReference getDesignEntity_Alternativeto();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Class_Diagram_Root <em>Class Diagram Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Diagram Root</em>'.
	 * @see org.mcmaster.pfcsm.Class_Diagram_Root
	 * @generated
	 */
	EClass getClass_Diagram_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Class_Diagram_Root#getDesignentity <em>Designentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Designentity</em>'.
	 * @see org.mcmaster.pfcsm.Class_Diagram_Root#getDesignentity()
	 * @see #getClass_Diagram_Root()
	 * @generated
	 */
	EReference getClass_Diagram_Root_Designentity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Class_Diagram_Root#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.mcmaster.pfcsm.Class_Diagram_Root#getReference()
	 * @see #getClass_Diagram_Root()
	 * @generated
	 */
	EReference getClass_Diagram_Root_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Class_Diagram_Root#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hardware</em>'.
	 * @see org.mcmaster.pfcsm.Class_Diagram_Root#getHardware()
	 * @see #getClass_Diagram_Root()
	 * @generated
	 */
	EReference getClass_Diagram_Root_Hardware();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Class_Diagram_Root#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software</em>'.
	 * @see org.mcmaster.pfcsm.Class_Diagram_Root#getSoftware()
	 * @see #getClass_Diagram_Root()
	 * @generated
	 */
	EReference getClass_Diagram_Root_Software();

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
	 * Returns the meta object for the container reference '{@link org.mcmaster.pfcsm.Reference#getClass_diagram_root <em>Class diagram root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class diagram root</em>'.
	 * @see org.mcmaster.pfcsm.Reference#getClass_diagram_root()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Class_diagram_root();

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
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Composition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.pfcsm.Composition#getSrc()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Src();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Composition#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.pfcsm.Composition#getTgt()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Tgt();

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
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see org.mcmaster.pfcsm.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Hardware#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runs</em>'.
	 * @see org.mcmaster.pfcsm.Hardware#getRuns()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_Runs();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see org.mcmaster.pfcsm.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Software#getRunson <em>Runson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Runson</em>'.
	 * @see org.mcmaster.pfcsm.Software#getRunson()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Runson();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see org.mcmaster.pfcsm.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Aggregation#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.pfcsm.Aggregation#getTgt()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Tgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Aggregation#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.pfcsm.Aggregation#getSrc()
	 * @see #getAggregation()
	 * @generated
	 */
	EReference getAggregation_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Aggregation#getSrcMult <em>Src Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Mult</em>'.
	 * @see org.mcmaster.pfcsm.Aggregation#getSrcMult()
	 * @see #getAggregation()
	 * @generated
	 */
	EAttribute getAggregation_SrcMult();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see org.mcmaster.pfcsm.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Alternative#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see org.mcmaster.pfcsm.Alternative#getCardinality()
	 * @see #getAlternative()
	 * @generated
	 */
	EAttribute getAlternative_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Alternative#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.pfcsm.Alternative#getSrc()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Src();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Alternative#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.pfcsm.Alternative#getTgt()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Tgt();

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
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Element#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see org.mcmaster.pfcsm.Element#isIsPublic()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_IsPublic();

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
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Uses#getSrcMult <em>Src Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Mult</em>'.
	 * @see org.mcmaster.pfcsm.Uses#getSrcMult()
	 * @see #getUses()
	 * @generated
	 */
	EAttribute getUses_SrcMult();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Uses#getTgtMult <em>Tgt Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Mult</em>'.
	 * @see org.mcmaster.pfcsm.Uses#getTgtMult()
	 * @see #getUses()
	 * @generated
	 */
	EAttribute getUses_TgtMult();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Uses#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.mcmaster.pfcsm.Uses#getAttribute()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Attribute();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Uses#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.mcmaster.pfcsm.Uses#getOperation()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Uses#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.pfcsm.Uses#getTgt()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Tgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Uses#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.pfcsm.Uses#getSrc()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Src();

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
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Produces#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.mcmaster.pfcsm.Produces#getOperation()
	 * @see #getProduces()
	 * @generated
	 */
	EReference getProduces_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Produces#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.mcmaster.pfcsm.Produces#getAttribute()
	 * @see #getProduces()
	 * @generated
	 */
	EReference getProduces_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Produces#getSrcMult <em>Src Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Mult</em>'.
	 * @see org.mcmaster.pfcsm.Produces#getSrcMult()
	 * @see #getProduces()
	 * @generated
	 */
	EAttribute getProduces_SrcMult();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.Produces#getTgtMult <em>Tgt Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tgt Mult</em>'.
	 * @see org.mcmaster.pfcsm.Produces#getTgtMult()
	 * @see #getProduces()
	 * @generated
	 */
	EAttribute getProduces_TgtMult();

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.mcmaster.pfcsm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Attribute#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see org.mcmaster.pfcsm.Attribute#getUses()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Uses();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Attribute#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produces</em>'.
	 * @see org.mcmaster.pfcsm.Attribute#getProduces()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Produces();

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
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.DesignEntityImpl <em>Design Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.DesignEntityImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getDesignEntity()
		 * @generated
		 */
		EClass DESIGN_ENTITY = eINSTANCE.getDesignEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_ENTITY__NAME = eINSTANCE.getDesignEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__ELEMENT = eINSTANCE.getDesignEntity_Element();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_ENTITY__IS_ABSTRACT = eINSTANCE.getDesignEntity_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Usedby</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__USEDBY = eINSTANCE.getDesignEntity_Usedby();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__USES = eINSTANCE.getDesignEntity_Uses();

		/**
		 * The meta object literal for the '<em><b>Ownerof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__OWNEROF = eINSTANCE.getDesignEntity_Ownerof();

		/**
		 * The meta object literal for the '<em><b>Ownedby</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__OWNEDBY = eINSTANCE.getDesignEntity_Ownedby();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__PARENT = eINSTANCE.getDesignEntity_Parent();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__CHILDREN = eINSTANCE.getDesignEntity_Children();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__ALTERNATIVE = eINSTANCE.getDesignEntity_Alternative();

		/**
		 * The meta object literal for the '<em><b>Alternativeto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ENTITY__ALTERNATIVETO = eINSTANCE.getDesignEntity_Alternativeto();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl <em>Class Diagram Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.Class_Diagram_RootImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getClass_Diagram_Root()
		 * @generated
		 */
		EClass CLASS_DIAGRAM_ROOT = eINSTANCE.getClass_Diagram_Root();

		/**
		 * The meta object literal for the '<em><b>Designentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ROOT__DESIGNENTITY = eINSTANCE.getClass_Diagram_Root_Designentity();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ROOT__REFERENCE = eINSTANCE.getClass_Diagram_Root_Reference();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ROOT__HARDWARE = eINSTANCE.getClass_Diagram_Root_Hardware();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ROOT__SOFTWARE = eINSTANCE.getClass_Diagram_Root_Software();

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
		 * The meta object literal for the '<em><b>Class diagram root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__CLASS_DIAGRAM_ROOT = eINSTANCE.getReference_Class_diagram_root();

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
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__SRC = eINSTANCE.getComposition_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__TGT = eINSTANCE.getComposition_Tgt();

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
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.HardwareImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Runs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__RUNS = eINSTANCE.getHardware_Runs();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.SoftwareImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Runson</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__RUNSON = eINSTANCE.getSoftware_Runson();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.AggregationImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__TGT = eINSTANCE.getAggregation_Tgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION__SRC = eINSTANCE.getAggregation_Src();

		/**
		 * The meta object literal for the '<em><b>Src Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION__SRC_MULT = eINSTANCE.getAggregation_SrcMult();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.AlternativeImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERNATIVE__CARDINALITY = eINSTANCE.getAlternative_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__SRC = eINSTANCE.getAlternative_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__TGT = eINSTANCE.getAlternative_Tgt();

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
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__IS_PUBLIC = eINSTANCE.getElement_IsPublic();

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
		 * The meta object literal for the '<em><b>Src Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES__SRC_MULT = eINSTANCE.getUses_SrcMult();

		/**
		 * The meta object literal for the '<em><b>Tgt Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES__TGT_MULT = eINSTANCE.getUses_TgtMult();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__ATTRIBUTE = eINSTANCE.getUses_Attribute();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__OPERATION = eINSTANCE.getUses_Operation();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__TGT = eINSTANCE.getUses_Tgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__SRC = eINSTANCE.getUses_Src();

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
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCES__OPERATION = eINSTANCE.getProduces_Operation();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCES__ATTRIBUTE = eINSTANCE.getProduces_Attribute();

		/**
		 * The meta object literal for the '<em><b>Src Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCES__SRC_MULT = eINSTANCE.getProduces_SrcMult();

		/**
		 * The meta object literal for the '<em><b>Tgt Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCES__TGT_MULT = eINSTANCE.getProduces_TgtMult();

		/**
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.AttributeImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__USES = eINSTANCE.getAttribute_Uses();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__PRODUCES = eINSTANCE.getAttribute_Produces();

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
