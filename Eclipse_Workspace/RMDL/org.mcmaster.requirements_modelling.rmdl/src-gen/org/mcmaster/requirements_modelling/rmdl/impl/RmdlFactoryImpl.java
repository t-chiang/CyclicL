/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.mcmaster.requirements_modelling.rmdl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RmdlFactoryImpl extends EFactoryImpl implements RmdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RmdlFactory init() {
		try {
			RmdlFactory theRmdlFactory = (RmdlFactory) EPackage.Registry.INSTANCE.getEFactory(RmdlPackage.eNS_URI);
			if (theRmdlFactory != null) {
				return theRmdlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RmdlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmdlFactoryImpl() {
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
		case RmdlPackage.FUNCTIONAL:
			return createFunctional();
		case RmdlPackage.QUALITATIVE:
			return createQualitative();
		case RmdlPackage.CONSTRAINT:
			return createConstraint();
		case RmdlPackage.REQUIREMENT_DIAGRAM:
			return createRequirement_Diagram();
		case RmdlPackage.SAFETY:
			return createSafety();
		case RmdlPackage.DESIGN_ELEMENT:
			return createDesignElement();
		case RmdlPackage.TEST_CASE:
			return createTestCase();
		case RmdlPackage.REVIEW:
			return createReview();
		case RmdlPackage.ELEMENT:
			return createElement();
		case RmdlPackage.FEATURE_MODEL:
			return createFeature_Model();
		case RmdlPackage.RMDL_PROJECT:
			return createRMDL_Project();
		case RmdlPackage.ROOT:
			return createRoot();
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
		case RmdlPackage.TEST_TYPE:
			return createTestTypeFromString(eDataType, initialValue);
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
		case RmdlPackage.TEST_TYPE:
			return convertTestTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional createFunctional() {
		FunctionalImpl functional = new FunctionalImpl();
		return functional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualitative createQualitative() {
		QualitativeImpl qualitative = new QualitativeImpl();
		return qualitative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Diagram createRequirement_Diagram() {
		Requirement_DiagramImpl requirement_Diagram = new Requirement_DiagramImpl();
		return requirement_Diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Safety createSafety() {
		SafetyImpl safety = new SafetyImpl();
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignElement createDesignElement() {
		DesignElementImpl designElement = new DesignElementImpl();
		return designElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Review createReview() {
		ReviewImpl review = new ReviewImpl();
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature_Model createFeature_Model() {
		Feature_ModelImpl feature_Model = new Feature_ModelImpl();
		return feature_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMDL_Project createRMDL_Project() {
		RMDL_ProjectImpl rmdL_Project = new RMDL_ProjectImpl();
		return rmdL_Project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestType createTestTypeFromString(EDataType eDataType, String initialValue) {
		TestType result = TestType.get(initialValue);
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
	public String convertTestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmdlPackage getRmdlPackage() {
		return (RmdlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RmdlPackage getPackage() {
		return RmdlPackage.eINSTANCE;
	}

} //RmdlFactoryImpl
