/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.ArgList;
import csep.coffeeScript.CoffeeScriptPackage;
import csep.coffeeScript.ExplicitArgList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arg List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.ArgListImpl#getDummy <em>Dummy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgListImpl extends ArrayImpl implements ArgList
{
  /**
   * The cached value of the '{@link #getDummy() <em>Dummy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDummy()
   * @generated
   * @ordered
   */
  protected ExplicitArgList dummy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgListImpl()
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
    return CoffeeScriptPackage.Literals.ARG_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitArgList getDummy()
  {
    return dummy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDummy(ExplicitArgList newDummy, NotificationChain msgs)
  {
    ExplicitArgList oldDummy = dummy;
    dummy = newDummy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ARG_LIST__DUMMY, oldDummy, newDummy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDummy(ExplicitArgList newDummy)
  {
    if (newDummy != dummy)
    {
      NotificationChain msgs = null;
      if (dummy != null)
        msgs = ((InternalEObject)dummy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ARG_LIST__DUMMY, null, msgs);
      if (newDummy != null)
        msgs = ((InternalEObject)newDummy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ARG_LIST__DUMMY, null, msgs);
      msgs = basicSetDummy(newDummy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ARG_LIST__DUMMY, newDummy, newDummy));
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
      case CoffeeScriptPackage.ARG_LIST__DUMMY:
        return basicSetDummy(null, msgs);
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
      case CoffeeScriptPackage.ARG_LIST__DUMMY:
        return getDummy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CoffeeScriptPackage.ARG_LIST__DUMMY:
        setDummy((ExplicitArgList)newValue);
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
      case CoffeeScriptPackage.ARG_LIST__DUMMY:
        setDummy((ExplicitArgList)null);
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
      case CoffeeScriptPackage.ARG_LIST__DUMMY:
        return dummy != null;
    }
    return super.eIsSet(featureID);
  }

} //ArgListImpl
