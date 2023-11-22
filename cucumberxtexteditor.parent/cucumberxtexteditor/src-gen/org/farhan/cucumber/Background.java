/**
 * generated by Xtext 2.32.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.Background#getTitle <em>Title</em>}</li>
 *   <li>{@link org.farhan.cucumber.Background#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.farhan.cucumber.Background#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getBackground()
 * @model
 * @generated
 */
public interface Background extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.farhan.cucumber.CucumberPackage#getBackground_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.farhan.cucumber.Background#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Description}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descriptions</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getBackground_Descriptions()
   * @model containment="true"
   * @generated
   */
  EList<Description> getDescriptions();

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Step}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getBackground_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

} // Background
