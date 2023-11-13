/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mcmaster.requirements_modelling.rmdl.Constraint;
import org.mcmaster.requirements_modelling.rmdl.Decomposition;
import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Functional;
import org.mcmaster.requirements_modelling.rmdl.Qualitative;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Root;
import org.mcmaster.requirements_modelling.rmdl.RmdlFactory;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.Safety;
import org.mcmaster.requirements_modelling.rmdl.TestCase;
import org.mcmaster.requirements_modelling.rmdl.TestType;
import org.mcmaster.requirements_modelling.rmdl.Verification;

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
		case RmdlPackage.PACKAGE:
			return createPackage();
		case RmdlPackage.REQUIREMENT_ROOT:
			return createRequirement_Root();
		case RmdlPackage.SAFETY:
			return createSafety();
		case RmdlPackage.DESIGN_ELEMENT:
			return createDesignElement();
		case RmdlPackage.TEST_CASE:
			return createTestCase();
		case RmdlPackage.VERIFICATION:
			return createVerification();
		case RmdlPackage.DECOMPOSITION:
			return createDecomposition();
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
	public org.mcmaster.requirements_modelling.rmdl.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Root createRequirement_Root() {
		Requirement_RootImpl requirement_Root = new Requirement_RootImpl();
		return requirement_Root;
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
	public Verification createVerification() {
		VerificationImpl verification = new VerificationImpl();
		return verification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decomposition createDecomposition() {
		DecompositionImpl decomposition = new DecompositionImpl();
		return decomposition;
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
