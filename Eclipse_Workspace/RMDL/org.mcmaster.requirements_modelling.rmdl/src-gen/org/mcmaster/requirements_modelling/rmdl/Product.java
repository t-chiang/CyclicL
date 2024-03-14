/**
 */
package org.mcmaster.requirements_modelling.rmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Product#getProductfeature <em>Productfeature</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.Product#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Productfeature</b></em>' containment reference list.
	 * The list contents are of type {@link org.mcmaster.requirements_modelling.rmdl.ProductFeature}.
	 * It is bidirectional and its opposite is '{@link org.mcmaster.requirements_modelling.rmdl.ProductFeature#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productfeature</em>' containment reference list.
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProduct_Productfeature()
	 * @see org.mcmaster.requirements_modelling.rmdl.ProductFeature#getProduct
	 * @model opposite="product" containment="true"
	 * @generated
	 */
	EList<ProductFeature> getProductfeature();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mcmaster.requirements_modelling.rmdl.RmdlPackage#getProduct_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mcmaster.requirements_modelling.rmdl.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Product
