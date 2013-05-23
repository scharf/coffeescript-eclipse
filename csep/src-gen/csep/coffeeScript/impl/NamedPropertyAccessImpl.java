/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.CoffeeScriptPackage;
import csep.coffeeScript.Id;
import csep.coffeeScript.NamedPropertyAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Property Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.NamedPropertyAccessImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.NamedPropertyAccessImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedPropertyAccessImpl extends PropertyAccessImpl implements NamedPropertyAccess
{
  /**
   * The default value of the '{@link #getAccessor() <em>Accessor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessor()
   * @generated
   * @ordered
   */
  protected static final String ACCESSOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessor()
   * @generated
   * @ordered
   */
  protected String accessor = ACCESSOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Id name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedPropertyAccessImpl()
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
    return CoffeeScriptPackage.Literals.NAMED_PROPERTY_ACCESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccessor()
  {
    return accessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessor(String newAccessor)
  {
    String oldAccessor = accessor;
    accessor = newAccessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__ACCESSOR, oldAccessor, accessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Id newName, NotificationChain msgs)
  {
    Id oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Id newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME, newName, newName));
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
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME:
        return basicSetName(null, msgs);
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
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__ACCESSOR:
        return getAccessor();
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME:
        return getName();
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
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__ACCESSOR:
        setAccessor((String)newValue);
        return;
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME:
        setName((Id)newValue);
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
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__ACCESSOR:
        setAccessor(ACCESSOR_EDEFAULT);
        return;
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME:
        setName((Id)null);
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
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__ACCESSOR:
        return ACCESSOR_EDEFAULT == null ? accessor != null : !ACCESSOR_EDEFAULT.equals(accessor);
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS__NAME:
        return name != null;
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
    result.append(" (accessor: ");
    result.append(accessor);
    result.append(')');
    return result.toString();
  }

} //NamedPropertyAccessImpl
