/**
 */
package org.mcmaster.pfcsm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mcmaster.pfcsm.Class_Diagram_Root;
import org.mcmaster.pfcsm.DesClass;
import org.mcmaster.pfcsm.PfcsmPackage;
import org.mcmaster.pfcsm.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.pfcsm.impl.ReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.mcmaster.pfcsm.impl.ReferenceImpl#getClass_diagram_root <em>Class diagram root</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DesClass source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DesClass target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PfcsmPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesClass getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (DesClass) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.REFERENCE__SOURCE, oldSource,
							source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesClass basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(DesClass newSource, NotificationChain msgs) {
		DesClass oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.REFERENCE__SOURCE, oldSource, newSource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(DesClass newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, PfcsmPackage.DES_CLASS__REFERENCE_TO,
						DesClass.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, PfcsmPackage.DES_CLASS__REFERENCE_TO,
						DesClass.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.REFERENCE__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (DesClass) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PfcsmPackage.REFERENCE__TARGET, oldTarget,
							target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(DesClass newTarget, NotificationChain msgs) {
		DesClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PfcsmPackage.REFERENCE__TARGET, oldTarget, newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(DesClass newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, PfcsmPackage.DES_CLASS__REFERENCE_FROM,
						DesClass.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, PfcsmPackage.DES_CLASS__REFERENCE_FROM,
						DesClass.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.REFERENCE__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class_Diagram_Root getClass_diagram_root() {
		if (eContainerFeatureID() != PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT)
			return null;
		return (Class_Diagram_Root) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass_diagram_root(Class_Diagram_Root newClass_diagram_root,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newClass_diagram_root, PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_diagram_root(Class_Diagram_Root newClass_diagram_root) {
		if (newClass_diagram_root != eInternalContainer()
				|| (eContainerFeatureID() != PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT
						&& newClass_diagram_root != null)) {
			if (EcoreUtil.isAncestor(this, newClass_diagram_root))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass_diagram_root != null)
				msgs = ((InternalEObject) newClass_diagram_root).eInverseAdd(this,
						PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE, Class_Diagram_Root.class, msgs);
			msgs = basicSetClass_diagram_root(newClass_diagram_root, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT,
					newClass_diagram_root, newClass_diagram_root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PfcsmPackage.REFERENCE__SOURCE:
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, PfcsmPackage.DES_CLASS__REFERENCE_TO,
						DesClass.class, msgs);
			return basicSetSource((DesClass) otherEnd, msgs);
		case PfcsmPackage.REFERENCE__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, PfcsmPackage.DES_CLASS__REFERENCE_FROM,
						DesClass.class, msgs);
			return basicSetTarget((DesClass) otherEnd, msgs);
		case PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetClass_diagram_root((Class_Diagram_Root) otherEnd, msgs);
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
		case PfcsmPackage.REFERENCE__SOURCE:
			return basicSetSource(null, msgs);
		case PfcsmPackage.REFERENCE__TARGET:
			return basicSetTarget(null, msgs);
		case PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT:
			return basicSetClass_diagram_root(null, msgs);
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
		case PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT:
			return eInternalContainer().eInverseRemove(this, PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE,
					Class_Diagram_Root.class, msgs);
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
		case PfcsmPackage.REFERENCE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case PfcsmPackage.REFERENCE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT:
			return getClass_diagram_root();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PfcsmPackage.REFERENCE__SOURCE:
			setSource((DesClass) newValue);
			return;
		case PfcsmPackage.REFERENCE__TARGET:
			setTarget((DesClass) newValue);
			return;
		case PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT:
			setClass_diagram_root((Class_Diagram_Root) newValue);
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
		case PfcsmPackage.REFERENCE__SOURCE:
			setSource((DesClass) null);
			return;
		case PfcsmPackage.REFERENCE__TARGET:
			setTarget((DesClass) null);
			return;
		case PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT:
			setClass_diagram_root((Class_Diagram_Root) null);
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
		case PfcsmPackage.REFERENCE__SOURCE:
			return source != null;
		case PfcsmPackage.REFERENCE__TARGET:
			return target != null;
		case PfcsmPackage.REFERENCE__CLASS_DIAGRAM_ROOT:
			return getClass_diagram_root() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
