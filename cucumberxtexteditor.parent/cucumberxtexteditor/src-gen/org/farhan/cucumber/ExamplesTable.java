/**
 * generated by Xtext 2.35.0
 */
package org.farhan.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examples Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.cucumber.ExamplesTable#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see org.farhan.cucumber.CucumberPackage#getExamplesTable()
 * @model
 * @generated
 */
public interface ExamplesTable extends EObject
{
  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link org.farhan.cucumber.Row}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see org.farhan.cucumber.CucumberPackage#getExamplesTable_Rows()
   * @model containment="true"
   * @generated
   */
  EList<Row> getRows();

} // ExamplesTable
