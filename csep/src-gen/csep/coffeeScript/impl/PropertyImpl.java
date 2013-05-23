/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.Assignable;
import csep.coffeeScript.CoffeeScriptPackage;
import csep.coffeeScript.Expression;
import csep.coffeeScript.ForSource;
import csep.coffeeScript.ForValue;
import csep.coffeeScript.Line;
import csep.coffeeScript.Property;
import csep.coffeeScript.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.PropertyImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.PropertyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.PropertyImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.PropertyImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.PropertyImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends SuperClassImpl implements Property
{
  /**
   * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexes()
   * @generated
   * @ordered
   */
  protected EList<ForValue> indexes;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected ForSource source;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected EObject left;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Expression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return CoffeeScriptPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ForValue> getIndexes()
  {
    if (indexes == null)
    {
      indexes = new EObjectContainmentEList<ForValue>(ForValue.class, this, CoffeeScriptPackage.PROPERTY__INDEXES);
    }
    return indexes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForSource getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(ForSource newSource, NotificationChain msgs)
  {
    ForSource oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.PROPERTY__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(ForSource newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.PROPERTY__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.PROPERTY__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.PROPERTY__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(EObject newLeft, NotificationChain msgs)
  {
    EObject oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.PROPERTY__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(EObject newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.PROPERTY__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.PROPERTY__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.PROPERTY__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.PROPERTY__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs)
  {
    Expression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.PROPERTY__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Expression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.PROPERTY__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.PROPERTY__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.PROPERTY__RIGHT, newRight, newRight));
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
      case CoffeeScriptPackage.PROPERTY__INDEXES:
        return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
      case CoffeeScriptPackage.PROPERTY__SOURCE:
        return basicSetSource(null, msgs);
      case CoffeeScriptPackage.PROPERTY__LEFT:
        return basicSetLeft(null, msgs);
      case CoffeeScriptPackage.PROPERTY__RIGHT:
        return basicSetRight(null, msgs);
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
      case CoffeeScriptPackage.PROPERTY__INDEXES:
        return getIndexes();
      case CoffeeScriptPackage.PROPERTY__SOURCE:
        return getSource();
      case CoffeeScriptPackage.PROPERTY__LEFT:
        return getLeft();
      case CoffeeScriptPackage.PROPERTY__OPERATOR:
        return getOperator();
      case CoffeeScriptPackage.PROPERTY__RIGHT:
        return getRight();
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
      case CoffeeScriptPackage.PROPERTY__INDEXES:
        getIndexes().clear();
        getIndexes().addAll((Collection<? extends ForValue>)newValue);
        return;
      case CoffeeScriptPackage.PROPERTY__SOURCE:
        setSource((ForSource)newValue);
        return;
      case CoffeeScriptPackage.PROPERTY__LEFT:
        setLeft((EObject)newValue);
        return;
      case CoffeeScriptPackage.PROPERTY__OPERATOR:
        setOperator((String)newValue);
        return;
      case CoffeeScriptPackage.PROPERTY__RIGHT:
        setRight((Expression)newValue);
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
      case CoffeeScriptPackage.PROPERTY__INDEXES:
        getIndexes().clear();
        return;
      case CoffeeScriptPackage.PROPERTY__SOURCE:
        setSource((ForSource)null);
        return;
      case CoffeeScriptPackage.PROPERTY__LEFT:
        setLeft((EObject)null);
        return;
      case CoffeeScriptPackage.PROPERTY__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case CoffeeScriptPackage.PROPERTY__RIGHT:
        setRight((Expression)null);
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
      case CoffeeScriptPackage.PROPERTY__INDEXES:
        return indexes != null && !indexes.isEmpty();
      case CoffeeScriptPackage.PROPERTY__SOURCE:
        return source != null;
      case CoffeeScriptPackage.PROPERTY__LEFT:
        return left != null;
      case CoffeeScriptPackage.PROPERTY__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case CoffeeScriptPackage.PROPERTY__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Line.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case CoffeeScriptPackage.PROPERTY__INDEXES: return CoffeeScriptPackage.EXPRESSION__INDEXES;
        case CoffeeScriptPackage.PROPERTY__SOURCE: return CoffeeScriptPackage.EXPRESSION__SOURCE;
        case CoffeeScriptPackage.PROPERTY__LEFT: return CoffeeScriptPackage.EXPRESSION__LEFT;
        case CoffeeScriptPackage.PROPERTY__OPERATOR: return CoffeeScriptPackage.EXPRESSION__OPERATOR;
        case CoffeeScriptPackage.PROPERTY__RIGHT: return CoffeeScriptPackage.EXPRESSION__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == Assignable.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Variable.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Line.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case CoffeeScriptPackage.EXPRESSION__INDEXES: return CoffeeScriptPackage.PROPERTY__INDEXES;
        case CoffeeScriptPackage.EXPRESSION__SOURCE: return CoffeeScriptPackage.PROPERTY__SOURCE;
        case CoffeeScriptPackage.EXPRESSION__LEFT: return CoffeeScriptPackage.PROPERTY__LEFT;
        case CoffeeScriptPackage.EXPRESSION__OPERATOR: return CoffeeScriptPackage.PROPERTY__OPERATOR;
        case CoffeeScriptPackage.EXPRESSION__RIGHT: return CoffeeScriptPackage.PROPERTY__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == Assignable.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Variable.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
