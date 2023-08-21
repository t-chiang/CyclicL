/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mcmaster.pfcsm.AbstractClass;
import org.mcmaster.pfcsm.Action;
import org.mcmaster.pfcsm.Association;
import org.mcmaster.pfcsm.ClassVariable;
import org.mcmaster.pfcsm.Composition;
import org.mcmaster.pfcsm.ConcreteClass;
import org.mcmaster.pfcsm.DataStructure;
import org.mcmaster.pfcsm.Element;
import org.mcmaster.pfcsm.Inheritance;
import org.mcmaster.pfcsm.ModelRoot;
import org.mcmaster.pfcsm.Operation;
import org.mcmaster.pfcsm.OperationVariable;
import org.mcmaster.pfcsm.PfcsmFactory;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.PrimitiveType;
import org.mcmaster.pfcsm.Produces;
import org.mcmaster.pfcsm.Reference;
import org.mcmaster.pfcsm.State;
import org.mcmaster.pfcsm.Transition;
import org.mcmaster.pfcsm.Uses;
import org.mcmaster.pfcsm.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PfcsmPackageImpl extends EPackageImpl implements PfcsmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass producesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataStructureEEnum = null;

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
	 * @see org.mcmaster.pfcsm.PfcsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PfcsmPackageImpl() {
		super(eNS_URI, PfcsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PfcsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PfcsmPackage init() {
		if (isInited)
			return (PfcsmPackage) EPackage.Registry.INSTANCE.getEPackage(PfcsmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPfcsmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PfcsmPackageImpl thePfcsmPackage = registeredPfcsmPackage instanceof PfcsmPackageImpl
				? (PfcsmPackageImpl) registeredPfcsmPackage
				: new PfcsmPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePfcsmPackage.createPackageContents();

		// Initialize created meta-data
		thePfcsmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePfcsmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PfcsmPackage.eNS_URI, thePfcsmPackage);
		return thePfcsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsOptional() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_ReferenceTo() {
		return (EReference) classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_ReferenceFrom() {
		return (EReference) classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Element() {
		return (EReference) classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRoot() {
		return modelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_Class() {
		return (EReference) modelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_Reference() {
		return (EReference) modelRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractClass() {
		return abstractClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Source() {
		return (EReference) referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Target() {
		return (EReference) referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_SrcMult() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_TgtMult() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_AscSrc() {
		return (EReference) associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_AscTgt() {
		return (EReference) associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposition_TgtMult() {
		return (EAttribute) compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritance() {
		return inheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXOR() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassVariable() {
		return classVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassVariable_Public() {
		return (EAttribute) classVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassVariable_Input() {
		return (EReference) classVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassVariable_Output() {
		return (EReference) classVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_State() {
		return (EReference) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Transition() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_ReturnType() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Public() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Operationvariable() {
		return (EReference) operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Uses() {
		return (EReference) operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Produces() {
		return (EReference) operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Outgoing() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Incoming() {
		return (EReference) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Action() {
		return (EReference) stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsInitial() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsFinal() {
		return (EAttribute) stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Order() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Condition() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcreteClass() {
		return concreteClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Structure() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationVariable() {
		return operationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationVariable_Local() {
		return (EAttribute) operationVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationVariable_AssignedValue() {
		return (EAttribute) operationVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Body() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_AssociationTo() {
		return (EReference) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_AssociationFrom() {
		return (EReference) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUses() {
		return usesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduces() {
		return producesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataStructure() {
		return dataStructureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PfcsmFactory getPfcsmFactory() {
		return (PfcsmFactory) getEFactoryInstance();
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
		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__NAME);
		createEAttribute(classEClass, CLASS__IS_OPTIONAL);
		createEReference(classEClass, CLASS__REFERENCE_TO);
		createEReference(classEClass, CLASS__REFERENCE_FROM);
		createEReference(classEClass, CLASS__ELEMENT);

		modelRootEClass = createEClass(MODEL_ROOT);
		createEReference(modelRootEClass, MODEL_ROOT__CLASS);
		createEReference(modelRootEClass, MODEL_ROOT__REFERENCE);

		abstractClassEClass = createEClass(ABSTRACT_CLASS);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__SOURCE);
		createEReference(referenceEClass, REFERENCE__TARGET);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__SRC_MULT);
		createEAttribute(associationEClass, ASSOCIATION__TGT_MULT);
		createEReference(associationEClass, ASSOCIATION__ASC_SRC);
		createEReference(associationEClass, ASSOCIATION__ASC_TGT);

		compositionEClass = createEClass(COMPOSITION);
		createEAttribute(compositionEClass, COMPOSITION__TGT_MULT);

		inheritanceEClass = createEClass(INHERITANCE);

		xorEClass = createEClass(XOR);

		classVariableEClass = createEClass(CLASS_VARIABLE);
		createEAttribute(classVariableEClass, CLASS_VARIABLE__PUBLIC);
		createEReference(classVariableEClass, CLASS_VARIABLE__INPUT);
		createEReference(classVariableEClass, CLASS_VARIABLE__OUTPUT);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__STATE);
		createEReference(operationEClass, OPERATION__TRANSITION);
		createEAttribute(operationEClass, OPERATION__RETURN_TYPE);
		createEAttribute(operationEClass, OPERATION__PUBLIC);
		createEReference(operationEClass, OPERATION__OPERATIONVARIABLE);
		createEReference(operationEClass, OPERATION__USES);
		createEReference(operationEClass, OPERATION__PRODUCES);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__OUTGOING);
		createEReference(stateEClass, STATE__INCOMING);
		createEAttribute(stateEClass, STATE__NAME);
		createEAttribute(stateEClass, STATE__IS_INITIAL);
		createEAttribute(stateEClass, STATE__IS_FINAL);
		createEReference(stateEClass, STATE__ACTION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);
		createEAttribute(transitionEClass, TRANSITION__ORDER);

		concreteClassEClass = createEClass(CONCRETE_CLASS);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__STRUCTURE);

		operationVariableEClass = createEClass(OPERATION_VARIABLE);
		createEAttribute(operationVariableEClass, OPERATION_VARIABLE__LOCAL);
		createEAttribute(operationVariableEClass, OPERATION_VARIABLE__ASSIGNED_VALUE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__BODY);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEReference(elementEClass, ELEMENT__ASSOCIATION_TO);
		createEReference(elementEClass, ELEMENT__ASSOCIATION_FROM);

		usesEClass = createEClass(USES);

		producesEClass = createEClass(PRODUCES);

		// Create enums
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		dataStructureEEnum = createEEnum(DATA_STRUCTURE);
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
		abstractClassEClass.getESuperTypes().add(this.getClass_());
		associationEClass.getESuperTypes().add(this.getReference());
		compositionEClass.getESuperTypes().add(this.getReference());
		inheritanceEClass.getESuperTypes().add(this.getReference());
		xorEClass.getESuperTypes().add(this.getReference());
		classVariableEClass.getESuperTypes().add(this.getVariable());
		operationEClass.getESuperTypes().add(this.getElement());
		concreteClassEClass.getESuperTypes().add(this.getClass_());
		variableEClass.getESuperTypes().add(this.getElement());
		operationVariableEClass.getESuperTypes().add(this.getVariable());
		usesEClass.getESuperTypes().add(this.getAssociation());
		producesEClass.getESuperTypes().add(this.getAssociation());

		// Initialize classes, features, and operations; add parameters
		initEClass(classEClass, org.mcmaster.pfcsm.Class.class, "Class", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, org.mcmaster.pfcsm.Class.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_IsOptional(), ecorePackage.getEBoolean(), "isOptional", null, 1, 1,
				org.mcmaster.pfcsm.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_ReferenceTo(), this.getReference(), this.getReference_Source(), "referenceTo", null, 0,
				-1, org.mcmaster.pfcsm.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_ReferenceFrom(), this.getReference(), this.getReference_Target(), "referenceFrom", null,
				0, -1, org.mcmaster.pfcsm.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Element(), this.getElement(), null, "element", null, 0, -1,
				org.mcmaster.pfcsm.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelRootEClass, ModelRoot.class, "ModelRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelRoot_Class(), this.getClass_(), null, "class", null, 0, -1, ModelRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRoot_Reference(), this.getReference(), null, "reference", null, 0, -1, ModelRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractClassEClass, AbstractClass.class, "AbstractClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Source(), this.getClass_(), this.getClass_ReferenceTo(), "source", null, 1, 1,
				Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Target(), this.getClass_(), this.getClass_ReferenceFrom(), "target", null, 1, 1,
				Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_SrcMult(), ecorePackage.getEString(), "srcMult", "1..1", 0, 1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TgtMult(), ecorePackage.getEString(), "tgtMult", "1..1", 0, 1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_AscSrc(), this.getElement(), this.getElement_AssociationTo(), "ascSrc", null, 1,
				1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_AscTgt(), this.getElement(), this.getElement_AssociationFrom(), "ascTgt", null, 1,
				1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposition_TgtMult(), ecorePackage.getEString(), "tgtMult", "1..1", 0, 1, Composition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritanceEClass, Inheritance.class, "Inheritance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, org.mcmaster.pfcsm.XOR.class, "XOR", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(classVariableEClass, ClassVariable.class, "ClassVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassVariable_Public(), ecorePackage.getEBoolean(), "public", null, 1, 1, ClassVariable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassVariable_Input(), this.getOperation(), this.getOperation_Uses(), "input", null, 0, -1,
				ClassVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassVariable_Output(), this.getOperation(), this.getOperation_Produces(), "output", null, 0,
				-1, ClassVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_State(), this.getState(), null, "state", null, 0, -1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Transition(), this.getTransition(), null, "transition", null, 0, -1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_ReturnType(), this.getPrimitiveType(), "returnType", null, 1, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Public(), ecorePackage.getEBoolean(), "public", null, 1, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Operationvariable(), this.getOperationVariable(), null, "operationvariable", null,
				0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Uses(), this.getClassVariable(), this.getClassVariable_Input(), "uses", null, 0, -1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Produces(), this.getClassVariable(), this.getClassVariable_Output(), "produces",
				null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Outgoing(), this.getTransition(), this.getTransition_Source(), "outgoing", null, 0, -1,
				State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Incoming(), this.getTransition(), this.getTransition_Target(), "incoming", null, 0, -1,
				State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 1, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 1, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 1, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Action(), this.getAction(), null, "action", null, 1, 1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getState(), this.getState_Outgoing(), "source", null, 1, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), this.getState_Incoming(), "target", null, 1, 1,
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Order(), ecorePackage.getEString(), "order", null, 0, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteClassEClass, ConcreteClass.class, "ConcreteClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Type(), this.getPrimitiveType(), "type", null, 1, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Structure(), this.getDataStructure(), "structure", null, 1, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationVariableEClass, OperationVariable.class, "OperationVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationVariable_Local(), ecorePackage.getEBoolean(), "local", "true", 1, 1,
				OperationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationVariable_AssignedValue(), ecorePackage.getEString(), "assignedValue", null, 0, 1,
				OperationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Body(), ecorePackage.getEString(), "body", null, 1, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_AssociationTo(), this.getAssociation(), this.getAssociation_AscSrc(), "associationTo",
				null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_AssociationFrom(), this.getAssociation(), this.getAssociation_AscTgt(),
				"associationFrom", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usesEClass, Uses.class, "Uses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(producesEClass, Produces.class, "Produces", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.STRING);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.INT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.DOUBLE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.BOOLEAN);

		initEEnum(dataStructureEEnum, DataStructure.class, "DataStructure");
		addEEnumLiteral(dataStructureEEnum, DataStructure.VALUE);
		addEEnumLiteral(dataStructureEEnum, DataStructure.ARRAY);

		// Create resource
		createResource(eNS_URI);
	}

} //PfcsmPackageImpl
