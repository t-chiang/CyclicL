/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.mcmaster.requirements_modelling.rmdl.Constraint;
import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.FeatureElement;
import org.mcmaster.requirements_modelling.rmdl.Feature_Model;
import org.mcmaster.requirements_modelling.rmdl.Functional;
import org.mcmaster.requirements_modelling.rmdl.Qualitative;
import org.mcmaster.requirements_modelling.rmdl.RMDL_Root;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.Review;
import org.mcmaster.requirements_modelling.rmdl.RmdlFactory;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.Safety;
import org.mcmaster.requirements_modelling.rmdl.TestCase;
import org.mcmaster.requirements_modelling.rmdl.TestType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RmdlPackageImpl extends EPackageImpl implements RmdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualitativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirement_DiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feature_ModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmdL_RootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testTypeEEnum = null;

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
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RmdlPackageImpl() {
		super(eNS_URI, RmdlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RmdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RmdlPackage init() {
		if (isInited)
			return (RmdlPackage) EPackage.Registry.INSTANCE.getEPackage(RmdlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRmdlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RmdlPackageImpl theRmdlPackage = registeredRmdlPackage instanceof RmdlPackageImpl
				? (RmdlPackageImpl) registeredRmdlPackage
				: new RmdlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRmdlPackage.createPackageContents();

		// Initialize created meta-data
		theRmdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRmdlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RmdlPackage.eNS_URI, theRmdlPackage);
		return theRmdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirements() {
		return requirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirements_Name() {
		return (EAttribute) requirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirements_ID() {
		return (EAttribute) requirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirements_Description() {
		return (EAttribute) requirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirements_Requirement_root() {
		return (EReference) requirementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirements_Review() {
		return (EReference) requirementsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirements_Testcase() {
		return (EReference) requirementsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirements_Traceto() {
		return (EReference) requirementsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirements_Partof() {
		return (EReference) requirementsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirements_Decomposesto() {
		return (EReference) requirementsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirements_Specification() {
		return (EAttribute) requirementsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctional() {
		return functionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualitative() {
		return qualitativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement_Diagram() {
		return requirement_DiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Diagram_Testcase() {
		return (EReference) requirement_DiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Diagram_Requirements() {
		return (EReference) requirement_DiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Diagram_Review() {
		return (EReference) requirement_DiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Diagram_Designelement() {
		return (EReference) requirement_DiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Diagram_Name() {
		return (EAttribute) requirement_DiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafety() {
		return safetyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignElement() {
		return designElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignElement_Name() {
		return (EAttribute) designElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignElement_IsHardware() {
		return (EAttribute) designElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignElement_IsSoftware() {
		return (EAttribute) designElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignElement_Tracefrom() {
		return (EReference) designElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignElement_Requirement_root() {
		return (EReference) designElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_ID() {
		return (EAttribute) testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_Type() {
		return (EAttribute) testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_Description() {
		return (EAttribute) testCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Requirement_root() {
		return (EReference) testCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_HasPassed() {
		return (EAttribute) testCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Requirements() {
		return (EReference) testCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReview() {
		return reviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReview_IsApproved() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReview_Reviewer() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReview_Requirement_root() {
		return (EReference) reviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReview_Requirements() {
		return (EReference) reviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReview_Comments() {
		return (EAttribute) reviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureElement() {
		return featureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureElement_IsOptional() {
		return (EAttribute) featureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureElement_Mandatory() {
		return (EReference) featureElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureElement_Composes() {
		return (EReference) featureElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureElement_Alternative() {
		return (EReference) featureElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureElement_Alternativeof() {
		return (EReference) featureElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureElement_Optional() {
		return (EReference) featureElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureElement_Optionof() {
		return (EReference) featureElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureElement_Product() {
		return (EReference) featureElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature_Model() {
		return feature_ModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Model_Featureelement() {
		return (EReference) feature_ModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Model_Name() {
		return (EAttribute) feature_ModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMDL_Root() {
		return rmdL_RootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRMDL_Root_Feature_model() {
		return (EReference) rmdL_RootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRMDL_Root_Requirement_diagram() {
		return (EReference) rmdL_RootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestType() {
		return testTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmdlFactory getRmdlFactory() {
		return (RmdlFactory) getEFactoryInstance();
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
		requirementsEClass = createEClass(REQUIREMENTS);
		createEAttribute(requirementsEClass, REQUIREMENTS__NAME);
		createEAttribute(requirementsEClass, REQUIREMENTS__ID);
		createEAttribute(requirementsEClass, REQUIREMENTS__DESCRIPTION);
		createEReference(requirementsEClass, REQUIREMENTS__REQUIREMENT_ROOT);
		createEReference(requirementsEClass, REQUIREMENTS__REVIEW);
		createEReference(requirementsEClass, REQUIREMENTS__TESTCASE);
		createEReference(requirementsEClass, REQUIREMENTS__TRACETO);
		createEReference(requirementsEClass, REQUIREMENTS__PARTOF);
		createEReference(requirementsEClass, REQUIREMENTS__DECOMPOSESTO);
		createEAttribute(requirementsEClass, REQUIREMENTS__SPECIFICATION);

		functionalEClass = createEClass(FUNCTIONAL);

		qualitativeEClass = createEClass(QUALITATIVE);

		constraintEClass = createEClass(CONSTRAINT);

		requirement_DiagramEClass = createEClass(REQUIREMENT_DIAGRAM);
		createEReference(requirement_DiagramEClass, REQUIREMENT_DIAGRAM__TESTCASE);
		createEReference(requirement_DiagramEClass, REQUIREMENT_DIAGRAM__REQUIREMENTS);
		createEReference(requirement_DiagramEClass, REQUIREMENT_DIAGRAM__REVIEW);
		createEReference(requirement_DiagramEClass, REQUIREMENT_DIAGRAM__DESIGNELEMENT);
		createEAttribute(requirement_DiagramEClass, REQUIREMENT_DIAGRAM__NAME);

		safetyEClass = createEClass(SAFETY);

		designElementEClass = createEClass(DESIGN_ELEMENT);
		createEAttribute(designElementEClass, DESIGN_ELEMENT__NAME);
		createEAttribute(designElementEClass, DESIGN_ELEMENT__IS_HARDWARE);
		createEAttribute(designElementEClass, DESIGN_ELEMENT__IS_SOFTWARE);
		createEReference(designElementEClass, DESIGN_ELEMENT__TRACEFROM);
		createEReference(designElementEClass, DESIGN_ELEMENT__REQUIREMENT_ROOT);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__ID);
		createEAttribute(testCaseEClass, TEST_CASE__TYPE);
		createEAttribute(testCaseEClass, TEST_CASE__DESCRIPTION);
		createEReference(testCaseEClass, TEST_CASE__REQUIREMENT_ROOT);
		createEAttribute(testCaseEClass, TEST_CASE__HAS_PASSED);
		createEReference(testCaseEClass, TEST_CASE__REQUIREMENTS);

		reviewEClass = createEClass(REVIEW);
		createEAttribute(reviewEClass, REVIEW__IS_APPROVED);
		createEAttribute(reviewEClass, REVIEW__REVIEWER);
		createEReference(reviewEClass, REVIEW__REQUIREMENT_ROOT);
		createEReference(reviewEClass, REVIEW__REQUIREMENTS);
		createEAttribute(reviewEClass, REVIEW__COMMENTS);

		featureElementEClass = createEClass(FEATURE_ELEMENT);
		createEAttribute(featureElementEClass, FEATURE_ELEMENT__IS_OPTIONAL);
		createEReference(featureElementEClass, FEATURE_ELEMENT__MANDATORY);
		createEReference(featureElementEClass, FEATURE_ELEMENT__COMPOSES);
		createEReference(featureElementEClass, FEATURE_ELEMENT__ALTERNATIVE);
		createEReference(featureElementEClass, FEATURE_ELEMENT__ALTERNATIVEOF);
		createEReference(featureElementEClass, FEATURE_ELEMENT__OPTIONAL);
		createEReference(featureElementEClass, FEATURE_ELEMENT__OPTIONOF);
		createEReference(featureElementEClass, FEATURE_ELEMENT__PRODUCT);

		feature_ModelEClass = createEClass(FEATURE_MODEL);
		createEReference(feature_ModelEClass, FEATURE_MODEL__FEATUREELEMENT);
		createEAttribute(feature_ModelEClass, FEATURE_MODEL__NAME);

		rmdL_RootEClass = createEClass(RMDL_ROOT);
		createEReference(rmdL_RootEClass, RMDL_ROOT__FEATURE_MODEL);
		createEReference(rmdL_RootEClass, RMDL_ROOT__REQUIREMENT_DIAGRAM);

		// Create enums
		testTypeEEnum = createEEnum(TEST_TYPE);
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
		functionalEClass.getESuperTypes().add(this.getRequirements());
		qualitativeEClass.getESuperTypes().add(this.getRequirements());
		constraintEClass.getESuperTypes().add(this.getRequirements());
		safetyEClass.getESuperTypes().add(this.getRequirements());
		featureElementEClass.getESuperTypes().add(this.getRequirement_Diagram());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementsEClass, Requirements.class, "Requirements", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirements_Name(), ecorePackage.getEString(), "name", null, 1, 1, Requirements.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirements_ID(), ecorePackage.getEInt(), "ID", null, 1, 1, Requirements.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirements_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRequirements_Requirement_root(), this.getRequirement_Diagram(),
				this.getRequirement_Diagram_Requirements(), "requirement_root", null, 1, 1, Requirements.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirements_Review(), this.getReview(), this.getReview_Requirements(), "review", null, 1, -1,
				Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirements_Testcase(), this.getTestCase(), this.getTestCase_Requirements(), "testcase",
				null, 1, -1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirements_Traceto(), this.getDesignElement(), this.getDesignElement_Tracefrom(), "traceto",
				null, 1, -1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirements_Partof(), this.getRequirements(), this.getRequirements_Decomposesto(), "partof",
				null, 0, -1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirements_Decomposesto(), this.getRequirements(), this.getRequirements_Partof(),
				"decomposesto", null, 0, -1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirements_Specification(), ecorePackage.getEString(), "specification", null, 0, 1,
				Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(functionalEClass, Functional.class, "Functional", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualitativeEClass, Qualitative.class, "Qualitative", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirement_DiagramEClass, Requirement_Diagram.class, "Requirement_Diagram", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_Diagram_Testcase(), this.getTestCase(), this.getTestCase_Requirement_root(),
				"testcase", null, 0, -1, Requirement_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Diagram_Requirements(), this.getRequirements(),
				this.getRequirements_Requirement_root(), "requirements", null, 0, -1, Requirement_Diagram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Diagram_Review(), this.getReview(), this.getReview_Requirement_root(), "review",
				null, 0, -1, Requirement_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Diagram_Designelement(), this.getDesignElement(),
				this.getDesignElement_Requirement_root(), "designelement", null, 0, -1, Requirement_Diagram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Diagram_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				Requirement_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyEClass, Safety.class, "Safety", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(designElementEClass, DesignElement.class, "DesignElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDesignElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, DesignElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignElement_IsHardware(), ecorePackage.getEBoolean(), "isHardware", "false", 1, 1,
				DesignElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignElement_IsSoftware(), ecorePackage.getEBoolean(), "isSoftware", "false", 1, 1,
				DesignElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDesignElement_Tracefrom(), this.getRequirements(), this.getRequirements_Traceto(),
				"tracefrom", null, 1, -1, DesignElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignElement_Requirement_root(), this.getRequirement_Diagram(),
				this.getRequirement_Diagram_Designelement(), "requirement_root", null, 0, 1, DesignElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase_ID(), ecorePackage.getEInt(), "ID", null, 1, 1, TestCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestCase_Type(), this.getTestType(), "type", null, 1, 1, TestCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestCase_Description(), ecorePackage.getEString(), "description", null, 1, 1, TestCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Requirement_root(), this.getRequirement_Diagram(),
				this.getRequirement_Diagram_Testcase(), "requirement_root", null, 1, 1, TestCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTestCase_HasPassed(), ecorePackage.getEBoolean(), "hasPassed", "false", 1, 1, TestCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Requirements(), this.getRequirements(), this.getRequirements_Testcase(),
				"requirements", null, 1, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reviewEClass, Review.class, "Review", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReview_IsApproved(), ecorePackage.getEBoolean(), "isApproved", "false", 1, 1, Review.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_Reviewer(), ecorePackage.getEString(), "reviewer", null, 0, 1, Review.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReview_Requirement_root(), this.getRequirement_Diagram(),
				this.getRequirement_Diagram_Review(), "requirement_root", null, 1, 1, Review.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getReview_Requirements(), this.getRequirements(), this.getRequirements_Review(), "requirements",
				null, 1, -1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, Review.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureElementEClass, FeatureElement.class, "FeatureElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureElement_IsOptional(), ecorePackage.getEBoolean(), "isOptional", "false", 1, 1,
				FeatureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureElement_Mandatory(), this.getFeatureElement(), this.getFeatureElement_Composes(),
				"mandatory", null, 0, -1, FeatureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureElement_Composes(), this.getFeatureElement(), this.getFeatureElement_Mandatory(),
				"composes", null, 0, 1, FeatureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureElement_Alternative(), this.getFeatureElement(),
				this.getFeatureElement_Alternativeof(), "alternative", null, 0, -1, FeatureElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFeatureElement_Alternativeof(), this.getFeatureElement(),
				this.getFeatureElement_Alternative(), "alternativeof", null, 0, 1, FeatureElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFeatureElement_Optional(), this.getFeatureElement(), this.getFeatureElement_Optionof(),
				"optional", null, 0, -1, FeatureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureElement_Optionof(), this.getFeatureElement(), this.getFeatureElement_Optional(),
				"optionof", null, 0, 1, FeatureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureElement_Product(), this.getFeature_Model(), this.getFeature_Model_Featureelement(),
				"product", null, 0, 1, FeatureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feature_ModelEClass, Feature_Model.class, "Feature_Model", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Model_Featureelement(), this.getFeatureElement(), this.getFeatureElement_Product(),
				"featureelement", null, 0, -1, Feature_Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Model_Name(), ecorePackage.getEString(), "name", null, 1, 1, Feature_Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rmdL_RootEClass, RMDL_Root.class, "RMDL_Root", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRMDL_Root_Feature_model(), this.getFeature_Model(), null, "feature_model", null, 0, -1,
				RMDL_Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRMDL_Root_Requirement_diagram(), this.getRequirement_Diagram(), null, "requirement_diagram",
				null, 0, 1, RMDL_Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(testTypeEEnum, TestType.class, "TestType");
		addEEnumLiteral(testTypeEEnum, TestType.UNIT_TEST);

		// Create resource
		createResource(eNS_URI);
	}

} //RmdlPackageImpl
