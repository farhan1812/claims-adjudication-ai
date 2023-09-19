/**
 * generated by Xtext 2.32.0
 */
package mbt.cucumber;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mbt.cucumber.Text#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see mbt.cucumber.CucumberPackage#getText()
 * @model
 * @generated
 */
public interface Text extends EObject
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link mbt.cucumber.TextLine}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see mbt.cucumber.CucumberPackage#getText_Lines()
   * @model containment="true"
   * @generated
   */
  EList<TextLine> getLines();

} // Text
