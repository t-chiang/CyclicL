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
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.DesClassImpl <em>Des Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.DesClassImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getDesClass()
	 * @generated
	 */
	int DES_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__IS_OPTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__IS_ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__PARENT = 5;

	/**
	 * The feature id for the '<em><b>Ownerof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__OWNEROF = 6;

	/**
	 * The feature id for the '<em><b>Ownedby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__OWNEDBY = 7;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__USES = 8;

	/**
	 * The feature id for the '<em><b>Usedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__USEDBY = 9;

	/**
	 * The feature id for the '<em><b>Xorfrom</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__XORFROM = 10;

	/**
	 * The feature id for the '<em><b>Xorto</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS__XORTO = 11;

	/**
	 * The number of structural features of the '<em>Des Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Des Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DES_CLASS_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Desclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT__DESCLASS = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT__REFERENCE = 1;

	/**
	 * The number of structural features of the '<em>Class Diagram Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DIAGRAM_ROOT_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.AssociationImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CLASS_DIAGRAM_ROOT = REFERENCE__CLASS_DIAGRAM_ROOT;

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
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TGT = REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SRC = REFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 6;

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
	int COMPOSITION = 4;

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
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.InheritanceImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 5;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__CLASS_DIAGRAM_ROOT = REFERENCE__CLASS_DIAGRAM_ROOT;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__TGT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__SRC = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

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
	int XOR = 6;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__CLASS_DIAGRAM_ROOT = REFERENCE__CLASS_DIAGRAM_ROOT;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__TGT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__SRC = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 2;

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
	int ELEMENT = 7;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.OperationImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Usedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__USEDBY = 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__USES = 2;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IS_PUBLIC = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.UsesImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getUses()
	 * @generated
	 */
	int USES = 8;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__CLASS_DIAGRAM_ROOT = ASSOCIATION__CLASS_DIAGRAM_ROOT;

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
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__TGT = ASSOCIATION__TGT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__SRC = ASSOCIATION__SRC;

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
	int PRODUCES = 9;

	/**
	 * The feature id for the '<em><b>Class diagram root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__CLASS_DIAGRAM_ROOT = ASSOCIATION__CLASS_DIAGRAM_ROOT;

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
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__TGT = ASSOCIATION__TGT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCES__SRC = ASSOCIATION__SRC;

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
	 * The meta object id for the '{@link org.mcmaster.pfcsm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.impl.AttributeImpl
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Usedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__USEDBY = ELEMENT__USEDBY;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__USES = ELEMENT__USES;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_PUBLIC = ELEMENT__IS_PUBLIC;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Usedby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__USEDBY = ELEMENT__USEDBY;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__USES = ELEMENT__USES;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_PUBLIC = ELEMENT__IS_PUBLIC;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.PrimitiveType
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.mcmaster.pfcsm.DataStructure <em>Data Structure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mcmaster.pfcsm.DataStructure
	 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getDataStructure()
	 * @generated
	 */
	int DATA_STRUCTURE = 13;

	/**
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.DesClass <em>Des Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Des Class</em>'.
	 * @see org.mcmaster.pfcsm.DesClass
	 * @generated
	 */
	EClass getDesClass();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.DesClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getName()
	 * @see #getDesClass()
	 * @generated
	 */
	EAttribute getDesClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.DesClass#isIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#isIsOptional()
	 * @see #getDesClass()
	 * @generated
	 */
	EAttribute getDesClass_IsOptional();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.DesClass#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getElement()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Element();

	/**
	 * Returns the meta object for the attribute '{@link org.mcmaster.pfcsm.DesClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#isIsAbstract()
	 * @see #getDesClass()
	 * @generated
	 */
	EAttribute getDesClass_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesClass#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getChildren()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Children();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.DesClass#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getParent()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Parent();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesClass#getOwnerof <em>Ownerof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ownerof</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getOwnerof()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Ownerof();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.DesClass#getOwnedby <em>Ownedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ownedby</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getOwnedby()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Ownedby();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesClass#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getUses()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Uses();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesClass#getUsedby <em>Usedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usedby</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getUsedby()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Usedby();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesClass#getXorfrom <em>Xorfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Xorfrom</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getXorfrom()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Xorfrom();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.DesClass#getXorto <em>Xorto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Xorto</em>'.
	 * @see org.mcmaster.pfcsm.DesClass#getXorto()
	 * @see #getDesClass()
	 * @generated
	 */
	EReference getDesClass_Xorto();

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
	 * Returns the meta object for the containment reference list '{@link org.mcmaster.pfcsm.Class_Diagram_Root#getDesclass <em>Desclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Desclass</em>'.
	 * @see org.mcmaster.pfcsm.Class_Diagram_Root#getDesclass()
	 * @see #getClass_Diagram_Root()
	 * @generated
	 */
	EReference getClass_Diagram_Root_Desclass();

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
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Association#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.pfcsm.Association#getTgt()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Tgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Association#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.pfcsm.Association#getSrc()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Src();

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
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see org.mcmaster.pfcsm.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Inheritance#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.pfcsm.Inheritance#getTgt()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Tgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.Inheritance#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.pfcsm.Inheritance#getSrc()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_Src();

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
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.XOR#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see org.mcmaster.pfcsm.XOR#getTgt()
	 * @see #getXOR()
	 * @generated
	 */
	EReference getXOR_Tgt();

	/**
	 * Returns the meta object for the reference '{@link org.mcmaster.pfcsm.XOR#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see org.mcmaster.pfcsm.XOR#getSrc()
	 * @see #getXOR()
	 * @generated
	 */
	EReference getXOR_Src();

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
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Element#getUsedby <em>Usedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usedby</em>'.
	 * @see org.mcmaster.pfcsm.Element#getUsedby()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Usedby();

	/**
	 * Returns the meta object for the reference list '{@link org.mcmaster.pfcsm.Element#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see org.mcmaster.pfcsm.Element#getUses()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Uses();

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
	 * Returns the meta object for class '{@link org.mcmaster.pfcsm.Produces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Produces</em>'.
	 * @see org.mcmaster.pfcsm.Produces
	 * @generated
	 */
	EClass getProduces();

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
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.DesClassImpl <em>Des Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.DesClassImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getDesClass()
		 * @generated
		 */
		EClass DES_CLASS = eINSTANCE.getDesClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DES_CLASS__NAME = eINSTANCE.getDesClass_Name();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DES_CLASS__IS_OPTIONAL = eINSTANCE.getDesClass_IsOptional();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__ELEMENT = eINSTANCE.getDesClass_Element();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DES_CLASS__IS_ABSTRACT = eINSTANCE.getDesClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__CHILDREN = eINSTANCE.getDesClass_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__PARENT = eINSTANCE.getDesClass_Parent();

		/**
		 * The meta object literal for the '<em><b>Ownerof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__OWNEROF = eINSTANCE.getDesClass_Ownerof();

		/**
		 * The meta object literal for the '<em><b>Ownedby</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__OWNEDBY = eINSTANCE.getDesClass_Ownedby();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__USES = eINSTANCE.getDesClass_Uses();

		/**
		 * The meta object literal for the '<em><b>Usedby</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__USEDBY = eINSTANCE.getDesClass_Usedby();

		/**
		 * The meta object literal for the '<em><b>Xorfrom</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__XORFROM = eINSTANCE.getDesClass_Xorfrom();

		/**
		 * The meta object literal for the '<em><b>Xorto</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DES_CLASS__XORTO = eINSTANCE.getDesClass_Xorto();

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
		 * The meta object literal for the '<em><b>Desclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ROOT__DESCLASS = eINSTANCE.getClass_Diagram_Root_Desclass();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DIAGRAM_ROOT__REFERENCE = eINSTANCE.getClass_Diagram_Root_Reference();

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
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TGT = eINSTANCE.getAssociation_Tgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SRC = eINSTANCE.getAssociation_Src();

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
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.InheritanceImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__TGT = eINSTANCE.getInheritance_Tgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__SRC = eINSTANCE.getInheritance_Src();

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
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XOR__TGT = eINSTANCE.getXOR_Tgt();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XOR__SRC = eINSTANCE.getXOR_Src();

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
		 * The meta object literal for the '<em><b>Usedby</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__USEDBY = eINSTANCE.getElement_Usedby();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__USES = eINSTANCE.getElement_Uses();

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
		 * The meta object literal for the '{@link org.mcmaster.pfcsm.impl.ProducesImpl <em>Produces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mcmaster.pfcsm.impl.ProducesImpl
		 * @see org.mcmaster.pfcsm.impl.PfcsmPackageImpl#getProduces()
		 * @generated
		 */
		EClass PRODUCES = eINSTANCE.getProduces();

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
