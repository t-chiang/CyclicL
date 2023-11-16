/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Comment#getReview <em>Review</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Review</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.Review#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review</em>' container reference.
	 * @see #setReview(Review)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getComment_Review()
	 * @see org.mcmaster.requirements_modelling.rmdl.Review#getComment
	 * @model opposite="comment" required="true" transient="false"
	 * @generated
	 */
	Review getReview();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Comment#getReview <em>Review</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review</em>' container reference.
	 * @see #getReview()
	 * @generated
	 */
	void setReview(Review value);

} // Comment
