/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.Assignable;
import csep.coffeeScript.AssignableArg;
import csep.coffeeScript.CoffeeScriptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignable Arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.AssignableArgImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.AssignableArgImpl#isSplat <em>Splat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignableArgImpl extends MinimalEObjectImpl.Container implements AssignableArg
{
  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected Assignable arg;

  /**
   * The default value of the '{@link #isSplat() <em>Splat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSplat()
   * @generated
   * @ordered
   */
  protected static final boolean SPLAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSplat() <em>Splat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSplat()
   * @generated
   * @ordered
   */
  protected boolean splat = SPLAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignableArgImpl()
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
    return CoffeeScriptPackage.Literals.ASSIGNABLE_ARG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignable getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(Assignable newArg, NotificationChain msgs)
  {
    Assignable oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ASSIGNABLE_ARG__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(Assignable newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ASSIGNABLE_ARG__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ASSIGNABLE_ARG__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ASSIGNABLE_ARG__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSplat()
  {
    return splat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSplat(boolean newSplat)
  {
    boolean oldSplat = splat;
    splat = newSplat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ASSIGNABLE_ARG__SPLAT, oldSplat, splat));
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
      case CoffeeScriptPackage.ASSIGNABLE_ARG__ARG:
        return basicSetArg(null, msgs);
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
      case CoffeeScriptPackage.ASSIGNABLE_ARG__ARG:
        return getArg();
      case CoffeeScriptPackage.ASSIGNABLE_ARG__SPLAT:
        return isSplat();
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
      case CoffeeScriptPackage.ASSIGNABLE_ARG__ARG:
        setArg((Assignable)newValue);
        return;
      case CoffeeScriptPackage.ASSIGNABLE_ARG__SPLAT:
        setSplat((Boolean)newValue);
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
      case CoffeeScriptPackage.ASSIGNABLE_ARG__ARG:
        setArg((Assignable)null);
        return;
      case CoffeeScriptPackage.ASSIGNABLE_ARG__SPLAT:
        setSplat(SPLAT_EDEFAULT);
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
      case CoffeeScriptPackage.ASSIGNABLE_ARG__ARG:
        return arg != null;
      case CoffeeScriptPackage.ASSIGNABLE_ARG__SPLAT:
        return splat != SPLAT_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (splat: ");
    result.append(splat);
    result.append(')');
    return result.toString();
  }

} //AssignableArgImpl
