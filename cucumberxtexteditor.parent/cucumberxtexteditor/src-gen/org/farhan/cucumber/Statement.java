/**
 * generated by Xtext 2.35.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.Statement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.farhan.cucumber.CucumberPackage#getStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.Statement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Statement
