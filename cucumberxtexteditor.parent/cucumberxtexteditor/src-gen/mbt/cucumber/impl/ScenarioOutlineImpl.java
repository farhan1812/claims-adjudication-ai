/**
 * generated by Xtext 2.32.0
 */
package mbt.cucumber.impl;

import java.util.Collection;

import mbt.cucumber.CucumberPackage;
import mbt.cucumber.Example;
import mbt.cucumber.ScenarioOutline;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Outline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mbt.cucumber.impl.ScenarioOutlineImpl#getExamples <em>Examples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioOutlineImpl extends AbstractScenarioImpl implements ScenarioOutline
{
  /**
   * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExamples()
   * @generated
   * @ordered
   */
  protected EList<Example> examples;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioOutlineImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CucumberPackage.Literals.SCENARIO_OUTLINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Example> getExamples()
  {
    if (examples == null)
    {
      examples = new EObjectContainmentEList<Example>(Example.class, this, CucumberPackage.SCENARIO_OUTLINE__EXAMPLES);
    }
    return examples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CucumberPackage.SCENARIO_OUTLINE__EXAMPLES:
        return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CucumberPackage.SCENARIO_OUTLINE__EXAMPLES:
        return getExamples();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CucumberPackage.SCENARIO_OUTLINE__EXAMPLES:
        getExamples().clear();
        getExamples().addAll((Collection<? extends Example>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CucumberPackage.SCENARIO_OUTLINE__EXAMPLES:
        getExamples().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CucumberPackage.SCENARIO_OUTLINE__EXAMPLES:
        return examples != null && !examples.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScenarioOutlineImpl
