/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mcmaster.pfcsm.AbstractClass;
import org.mcmaster.pfcsm.Action;
import org.mcmaster.pfcsm.Association;
import org.mcmaster.pfcsm.ClassVariable;
import org.mcmaster.pfcsm.Composition;
import org.mcmaster.pfcsm.ConcreteClass;
import org.mcmaster.pfcsm.DataStructure;
import org.mcmaster.pfcsm.Inheritance;
import org.mcmaster.pfcsm.ModelRoot;
import org.mcmaster.pfcsm.Operation;
import org.mcmaster.pfcsm.OperationVariable;
import org.mcmaster.pfcsm.PfcsmFactory;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.PrimitiveType;
import org.mcmaster.pfcsm.Produces;
import org.mcmaster.pfcsm.State;
import org.mcmaster.pfcsm.Transition;
import org.mcmaster.pfcsm.Uses;
import org.mcmaster.pfcsm.XOR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PfcsmFactoryImpl extends EFactoryImpl implements PfcsmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PfcsmFactory init() {
		try {
			PfcsmFactory thePfcsmFactory = (PfcsmFactory) EPackage.Registry.INSTANCE.getEFactory(PfcsmPackage.eNS_URI);
			if (thePfcsmFactory != null) {
				return thePfcsmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PfcsmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PfcsmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PfcsmPackage.MODEL_ROOT:
			return createModelRoot();
		case PfcsmPackage.ABSTRACT_CLASS:
			return createAbstractClass();
		case PfcsmPackage.ASSOCIATION:
			return createAssociation();
		case PfcsmPackage.COMPOSITION:
			return createComposition();
		case PfcsmPackage.INHERITANCE:
			return createInheritance();
		case PfcsmPackage.XOR:
			return createXOR();
		case PfcsmPackage.CLASS_VARIABLE:
			return createClassVariable();
		case PfcsmPackage.OPERATION:
			return createOperation();
		case PfcsmPackage.STATE:
			return createState();
		case PfcsmPackage.TRANSITION:
			return createTransition();
		case PfcsmPackage.CONCRETE_CLASS:
			return createConcreteClass();
		case PfcsmPackage.OPERATION_VARIABLE:
			return createOperationVariable();
		case PfcsmPackage.ACTION:
			return createAction();
		case PfcsmPackage.USES:
			return createUses();
		case PfcsmPackage.PRODUCES:
			return createProduces();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PfcsmPackage.PRIMITIVE_TYPE:
			return createPrimitiveTypeFromString(eDataType, initialValue);
		case PfcsmPackage.DATA_STRUCTURE:
			return createDataStructureFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PfcsmPackage.PRIMITIVE_TYPE:
			return convertPrimitiveTypeToString(eDataType, instanceValue);
		case PfcsmPackage.DATA_STRUCTURE:
			return convertDataStructureToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot createModelRoot() {
		ModelRootImpl modelRoot = new ModelRootImpl();
		return modelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractClass createAbstractClass() {
		AbstractClassImpl abstractClass = new AbstractClassImpl();
		return abstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inheritance createInheritance() {
		InheritanceImpl inheritance = new InheritanceImpl();
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOR createXOR() {
		XORImpl xor = new XORImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassVariable createClassVariable() {
		ClassVariableImpl classVariable = new ClassVariableImpl();
		return classVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteClass createConcreteClass() {
		ConcreteClassImpl concreteClass = new ConcreteClassImpl();
		return concreteClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationVariable createOperationVariable() {
		OperationVariableImpl operationVariable = new OperationVariableImpl();
		return operationVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uses createUses() {
		UsesImpl uses = new UsesImpl();
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Produces createProduces() {
		ProducesImpl produces = new ProducesImpl();
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStructure createDataStructureFromString(EDataType eDataType, String initialValue) {
		DataStructure result = DataStructure.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataStructureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PfcsmPackage getPfcsmPackage() {
		return (PfcsmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PfcsmPackage getPackage() {
		return PfcsmPackage.eINSTANCE;
	}

} //PfcsmFactoryImpl
