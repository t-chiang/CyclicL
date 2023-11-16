/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Review#isIsApproved <em>Is Approved</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Review#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_root <em>Requirement root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Review#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getReview()
 * @model
 * @generated
 */
public interface Review extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Approved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Approved</em>' attribute.
	 * @see #setIsApproved(boolean)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getReview_IsApproved()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsApproved();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Review#isIsApproved <em>Is Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Approved</em>' attribute.
	 * @see #isIsApproved()
	 * @generated
	 */
	void setIsApproved(boolean value);

	/**
	 * Returns the value of the '<em><b>Reviewer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewer</em>' attribute.
	 * @see #setReviewer(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getReview_Reviewer()
	 * @model
	 * @generated
	 */
	String getReviewer();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Review#getReviewer <em>Reviewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewer</em>' attribute.
	 * @see #getReviewer()
	 * @generated
	 */
	void setReviewer(String value);

	/**
	 * Returns the value of the '<em><b>Requirement root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement root</em>' container reference.
	 * @see #setRequirement_root(Requirement_Root)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getReview_Requirement_root()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirement_Root#getReview
	 * @model opposite="review" required="true" transient="false"
	 * @generated
	 */
	Requirement_Root getRequirement_root();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Review#getRequirement_root <em>Requirement root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement root</em>' container reference.
	 * @see #getRequirement_root()
	 * @generated
	 */
	void setRequirement_root(Requirement_Root value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.Requirements}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Requirements#getReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getReview_Requirements()
	 * @see org.mcmaster.requirements_modelling.rmdl.Requirements#getReview
	 * @model opposite="review" required="true"
	 * @generated
	 */
	EList<Requirements> getRequirements();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getReview_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Review#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

} // Review
