/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.CoffeeScriptPackage;
import csep.coffeeScript.Expression;
import csep.coffeeScript.ForSource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.ForSourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ForSourceImpl#getWhen <em>When</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ForSourceImpl#getBy <em>By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForSourceImpl extends MinimalEObjectImpl.Container implements ForSource
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Expression source;

  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected Expression when;

  /**
   * The cached value of the '{@link #getBy() <em>By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBy()
   * @generated
   * @ordered
   */
  protected Expression by;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForSourceImpl()
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
    return CoffeeScriptPackage.Literals.FOR_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Expression newSource, NotificationChain msgs)
  {
    Expression oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.FOR_SOURCE__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Expression newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.FOR_SOURCE__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.FOR_SOURCE__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.FOR_SOURCE__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWhen()
  {
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhen(Expression newWhen, NotificationChain msgs)
  {
    Expression oldWhen = when;
    when = newWhen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.FOR_SOURCE__WHEN, oldWhen, newWhen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhen(Expression newWhen)
  {
    if (newWhen != when)
    {
      NotificationChain msgs = null;
      if (when != null)
        msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.FOR_SOURCE__WHEN, null, msgs);
      if (newWhen != null)
        msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.FOR_SOURCE__WHEN, null, msgs);
      msgs = basicSetWhen(newWhen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.FOR_SOURCE__WHEN, newWhen, newWhen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getBy()
  {
    return by;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBy(Expression newBy, NotificationChain msgs)
  {
    Expression oldBy = by;
    by = newBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.FOR_SOURCE__BY, oldBy, newBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBy(Expression newBy)
  {
    if (newBy != by)
    {
      NotificationChain msgs = null;
      if (by != null)
        msgs = ((InternalEObject)by).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.FOR_SOURCE__BY, null, msgs);
      if (newBy != null)
        msgs = ((InternalEObject)newBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.FOR_SOURCE__BY, null, msgs);
      msgs = basicSetBy(newBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.FOR_SOURCE__BY, newBy, newBy));
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
      case CoffeeScriptPackage.FOR_SOURCE__SOURCE:
        return basicSetSource(null, msgs);
      case CoffeeScriptPackage.FOR_SOURCE__WHEN:
        return basicSetWhen(null, msgs);
      case CoffeeScriptPackage.FOR_SOURCE__BY:
        return basicSetBy(null, msgs);
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
      case CoffeeScriptPackage.FOR_SOURCE__SOURCE:
        return getSource();
      case CoffeeScriptPackage.FOR_SOURCE__WHEN:
        return getWhen();
      case CoffeeScriptPackage.FOR_SOURCE__BY:
        return getBy();
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
      case CoffeeScriptPackage.FOR_SOURCE__SOURCE:
        setSource((Expression)newValue);
        return;
      case CoffeeScriptPackage.FOR_SOURCE__WHEN:
        setWhen((Expression)newValue);
        return;
      case CoffeeScriptPackage.FOR_SOURCE__BY:
        setBy((Expression)newValue);
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
      case CoffeeScriptPackage.FOR_SOURCE__SOURCE:
        setSource((Expression)null);
        return;
      case CoffeeScriptPackage.FOR_SOURCE__WHEN:
        setWhen((Expression)null);
        return;
      case CoffeeScriptPackage.FOR_SOURCE__BY:
        setBy((Expression)null);
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
      case CoffeeScriptPackage.FOR_SOURCE__SOURCE:
        return source != null;
      case CoffeeScriptPackage.FOR_SOURCE__WHEN:
        return when != null;
      case CoffeeScriptPackage.FOR_SOURCE__BY:
        return by != null;
    }
    return super.eIsSet(featureID);
  }

} //ForSourceImpl
