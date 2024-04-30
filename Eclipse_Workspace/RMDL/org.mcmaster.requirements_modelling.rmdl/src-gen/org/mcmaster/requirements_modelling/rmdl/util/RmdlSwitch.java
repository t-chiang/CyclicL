/**
 */
package org.mcmaster.requirements_modelling.rmdl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.mcmaster.requirements_modelling.rmdl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage
 * @generated
 */
public class RmdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RmdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmdlSwitch() {
		if (modelPackage == null) {
			modelPackage = RmdlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RmdlPackage.REQUIREMENTS: {
			Requirements requirements = (Requirements) theEObject;
			T result = caseRequirements(requirements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.FUNCTIONAL: {
			Functional functional = (Functional) theEObject;
			T result = caseFunctional(functional);
			if (result == null)
				result = caseRequirements(functional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.QUALITATIVE: {
			Qualitative qualitative = (Qualitative) theEObject;
			T result = caseQualitative(qualitative);
			if (result == null)
				result = caseRequirements(qualitative);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = caseRequirements(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.REQUIREMENT_DIAGRAM: {
			Requirement_Diagram requirement_Diagram = (Requirement_Diagram) theEObject;
			T result = caseRequirement_Diagram(requirement_Diagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.SAFETY: {
			Safety safety = (Safety) theEObject;
			T result = caseSafety(safety);
			if (result == null)
				result = caseRequirements(safety);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.DESIGN_ELEMENT: {
			DesignElement designElement = (DesignElement) theEObject;
			T result = caseDesignElement(designElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.TEST_CASE: {
			TestCase testCase = (TestCase) theEObject;
			T result = caseTestCase(testCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.REVIEW: {
			Review review = (Review) theEObject;
			T result = caseReview(review);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.FEATURE_ELEMENT: {
			FeatureElement featureElement = (FeatureElement) theEObject;
			T result = caseFeatureElement(featureElement);
			if (result == null)
				result = caseRequirement_Diagram(featureElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.FEATURE_MODEL: {
			Feature_Model feature_Model = (Feature_Model) theEObject;
			T result = caseFeature_Model(feature_Model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RmdlPackage.RMDL_ROOT: {
			RMDL_Root rmdL_Root = (RMDL_Root) theEObject;
			T result = caseRMDL_Root(rmdL_Root);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirements(Requirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctional(Functional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitative(Qualitative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement_Diagram(Requirement_Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafety(Safety object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignElement(DesignElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCase(TestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReview(Review object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureElement(FeatureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature_Model(Feature_Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RMDL Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RMDL Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMDL_Root(RMDL_Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RmdlSwitch
