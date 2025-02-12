/**
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.sheepDog.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.farhan.mbt.sheepDog.SheepDogPackage;
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.StepParameters;
import org.farhan.mbt.sheepDog.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.farhan.mbt.sheepDog.impl.StepParametersImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.farhan.mbt.sheepDog.impl.StepParametersImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.farhan.mbt.sheepDog.impl.StepParametersImpl#getParametersTable <em>Parameters Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepParametersImpl extends MinimalEObjectImpl.Container implements StepParameters
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getParametersTable() <em>Parameters Table</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametersTable()
   * @generated
   * @ordered
   */
  protected Table parametersTable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StepParametersImpl()
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
    return SheepDogPackage.Literals.STEP_PARAMETERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SheepDogPackage.STEP_PARAMETERS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, SheepDogPackage.STEP_PARAMETERS__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Table getParametersTable()
  {
    return parametersTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParametersTable(Table newParametersTable, NotificationChain msgs)
  {
    Table oldParametersTable = parametersTable;
    parametersTable = newParametersTable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE, oldParametersTable, newParametersTable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParametersTable(Table newParametersTable)
  {
    if (newParametersTable != parametersTable)
    {
      NotificationChain msgs = null;
      if (parametersTable != null)
        msgs = ((InternalEObject)parametersTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE, null, msgs);
      if (newParametersTable != null)
        msgs = ((InternalEObject)newParametersTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE, null, msgs);
      msgs = basicSetParametersTable(newParametersTable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE, newParametersTable, newParametersTable));
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
      case SheepDogPackage.STEP_PARAMETERS__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE:
        return basicSetParametersTable(null, msgs);
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
      case SheepDogPackage.STEP_PARAMETERS__NAME:
        return getName();
      case SheepDogPackage.STEP_PARAMETERS__STATEMENTS:
        return getStatements();
      case SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE:
        return getParametersTable();
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
      case SheepDogPackage.STEP_PARAMETERS__NAME:
        setName((String)newValue);
        return;
      case SheepDogPackage.STEP_PARAMETERS__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE:
        setParametersTable((Table)newValue);
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
      case SheepDogPackage.STEP_PARAMETERS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SheepDogPackage.STEP_PARAMETERS__STATEMENTS:
        getStatements().clear();
        return;
      case SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE:
        setParametersTable((Table)null);
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
      case SheepDogPackage.STEP_PARAMETERS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SheepDogPackage.STEP_PARAMETERS__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case SheepDogPackage.STEP_PARAMETERS__PARAMETERS_TABLE:
        return parametersTable != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StepParametersImpl
