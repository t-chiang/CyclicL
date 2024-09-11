/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.Review;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl#isIsApproved <em>Is Approved</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl#getReviewer <em>Reviewer</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl#getRequirement_root <em>Requirement root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.ReviewImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewImpl extends MinimalEObjectImpl.Container implements Review {
	/**
	 * The default value of the '{@link #isIsApproved() <em>Is Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsApproved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_APPROVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsApproved() <em>Is Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsApproved()
	 * @generated
	 * @ordered
	 */
	protected boolean isApproved = IS_APPROVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewer() <em>Reviewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewer()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReviewer() <em>Reviewer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewer()
	 * @generated
	 * @ordered
	 */
	protected String reviewer = REVIEWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirements> requirements;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsApproved() {
		return isApproved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsApproved(boolean newIsApproved) {
		boolean oldIsApproved = isApproved;
		isApproved = newIsApproved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REVIEW__IS_APPROVED, oldIsApproved,
					isApproved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReviewer() {
		return reviewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewer(String newReviewer) {
		String oldReviewer = reviewer;
		reviewer = newReviewer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REVIEW__REVIEWER, oldReviewer, reviewer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Diagram getRequirement_root() {
		if (eContainerFeatureID() != RmdlPackage.REVIEW__REQUIREMENT_ROOT)
			return null;
		return (Requirement_Diagram) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement_root(Requirement_Diagram newRequirement_root, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirement_root, RmdlPackage.REVIEW__REQUIREMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_root(Requirement_Diagram newRequirement_root) {
		if (newRequirement_root != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.REVIEW__REQUIREMENT_ROOT && newRequirement_root != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_root))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_root != null)
				msgs = ((InternalEObject) newRequirement_root).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW, Requirement_Diagram.class, msgs);
			msgs = basicSetRequirement_root(newRequirement_root, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REVIEW__REQUIREMENT_ROOT,
					newRequirement_root, newRequirement_root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirements> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectWithInverseResolvingEList.ManyInverse<Requirements>(Requirements.class, this,
					RmdlPackage.REVIEW__REQUIREMENTS, RmdlPackage.REQUIREMENTS__REVIEW);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REVIEW__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.REVIEW__REQUIREMENT_ROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_root((Requirement_Diagram) otherEnd, msgs);
		case RmdlPackage.REVIEW__REQUIREMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.REVIEW__REQUIREMENT_ROOT:
			return basicSetRequirement_root(null, msgs);
		case RmdlPackage.REVIEW__REQUIREMENTS:
			return ((InternalEList<?>) getRequirements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RmdlPackage.REVIEW__REQUIREMENT_ROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_DIAGRAM__REVIEW,
					Requirement_Diagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RmdlPackage.REVIEW__IS_APPROVED:
			return isIsApproved();
		case RmdlPackage.REVIEW__REVIEWER:
			return getReviewer();
		case RmdlPackage.REVIEW__REQUIREMENT_ROOT:
			return getRequirement_root();
		case RmdlPackage.REVIEW__REQUIREMENTS:
			return getRequirements();
		case RmdlPackage.REVIEW__COMMENTS:
			return getComments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RmdlPackage.REVIEW__IS_APPROVED:
			setIsApproved((Boolean) newValue);
			return;
		case RmdlPackage.REVIEW__REVIEWER:
			setReviewer((String) newValue);
			return;
		case RmdlPackage.REVIEW__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Diagram) newValue);
			return;
		case RmdlPackage.REVIEW__REQUIREMENTS:
			getRequirements().clear();
			getRequirements().addAll((Collection<? extends Requirements>) newValue);
			return;
		case RmdlPackage.REVIEW__COMMENTS:
			setComments((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RmdlPackage.REVIEW__IS_APPROVED:
			setIsApproved(IS_APPROVED_EDEFAULT);
			return;
		case RmdlPackage.REVIEW__REVIEWER:
			setReviewer(REVIEWER_EDEFAULT);
			return;
		case RmdlPackage.REVIEW__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Diagram) null);
			return;
		case RmdlPackage.REVIEW__REQUIREMENTS:
			getRequirements().clear();
			return;
		case RmdlPackage.REVIEW__COMMENTS:
			setComments(COMMENTS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RmdlPackage.REVIEW__IS_APPROVED:
			return isApproved != IS_APPROVED_EDEFAULT;
		case RmdlPackage.REVIEW__REVIEWER:
			return REVIEWER_EDEFAULT == null ? reviewer != null : !REVIEWER_EDEFAULT.equals(reviewer);
		case RmdlPackage.REVIEW__REQUIREMENT_ROOT:
			return getRequirement_root() != null;
		case RmdlPackage.REVIEW__REQUIREMENTS:
			return requirements != null && !requirements.isEmpty();
		case RmdlPackage.REVIEW__COMMENTS:
			return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isApproved: ");
		result.append(isApproved);
		result.append(", reviewer: ");
		result.append(reviewer);
		result.append(", comments: ");
		result.append(comments);
		result.append(')');
		return result.toString();
	}

} //ReviewImpl
