/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.Assignable;
import csep.coffeeScript.CoffeeScriptPackage;
import csep.coffeeScript.Expression;
import csep.coffeeScript.ForSource;
import csep.coffeeScript.ForValue;
import csep.coffeeScript.Id;
import csep.coffeeScript.IdRef;
import csep.coffeeScript.Index;
import csep.coffeeScript.Line;
import csep.coffeeScript.PrimaryExpression;
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
 * An implementation of the model object '<em><b>Id Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getSource <em>Source</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getRight <em>Right</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getVal <em>Val</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdRefImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdRefImpl extends SuperClassImpl implements IdRef
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
   * The cached value of the '{@link #getVal() <em>Val</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Id val;

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
   * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProp()
   * @generated
   * @ordered
   */
  protected Id prop;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected Index index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdRefImpl()
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
    return CoffeeScriptPackage.Literals.ID_REF;
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
      indexes = new EObjectContainmentEList<ForValue>(ForValue.class, this, CoffeeScriptPackage.ID_REF__INDEXES);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__SOURCE, oldSource, newSource);
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
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__SOURCE, newSource, newSource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__OPERATOR, oldOperator, operator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id getVal()
  {
    if (val != null && val.eIsProxy())
    {
      InternalEObject oldVal = (InternalEObject)val;
      val = (Id)eResolveProxy(oldVal);
      if (val != oldVal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoffeeScriptPackage.ID_REF__VAL, oldVal, val));
      }
    }
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id basicGetVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(Id newVal)
  {
    Id oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__VAL, oldVal, val));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__ACCESSOR, oldAccessor, accessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id getProp()
  {
    return prop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProp(Id newProp, NotificationChain msgs)
  {
    Id oldProp = prop;
    prop = newProp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__PROP, oldProp, newProp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProp(Id newProp)
  {
    if (newProp != prop)
    {
      NotificationChain msgs = null;
      if (prop != null)
        msgs = ((InternalEObject)prop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__PROP, null, msgs);
      if (newProp != null)
        msgs = ((InternalEObject)newProp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__PROP, null, msgs);
      msgs = basicSetProp(newProp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__PROP, newProp, newProp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Index getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Index newIndex, NotificationChain msgs)
  {
    Index oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(Index newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID_REF__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID_REF__INDEX, newIndex, newIndex));
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
      case CoffeeScriptPackage.ID_REF__INDEXES:
        return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
      case CoffeeScriptPackage.ID_REF__SOURCE:
        return basicSetSource(null, msgs);
      case CoffeeScriptPackage.ID_REF__LEFT:
        return basicSetLeft(null, msgs);
      case CoffeeScriptPackage.ID_REF__RIGHT:
        return basicSetRight(null, msgs);
      case CoffeeScriptPackage.ID_REF__PROP:
        return basicSetProp(null, msgs);
      case CoffeeScriptPackage.ID_REF__INDEX:
        return basicSetIndex(null, msgs);
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
      case CoffeeScriptPackage.ID_REF__INDEXES:
        return getIndexes();
      case CoffeeScriptPackage.ID_REF__SOURCE:
        return getSource();
      case CoffeeScriptPackage.ID_REF__LEFT:
        return getLeft();
      case CoffeeScriptPackage.ID_REF__OPERATOR:
        return getOperator();
      case CoffeeScriptPackage.ID_REF__RIGHT:
        return getRight();
      case CoffeeScriptPackage.ID_REF__VAL:
        if (resolve) return getVal();
        return basicGetVal();
      case CoffeeScriptPackage.ID_REF__ACCESSOR:
        return getAccessor();
      case CoffeeScriptPackage.ID_REF__PROP:
        return getProp();
      case CoffeeScriptPackage.ID_REF__INDEX:
        return getIndex();
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
      case CoffeeScriptPackage.ID_REF__INDEXES:
        getIndexes().clear();
        getIndexes().addAll((Collection<? extends ForValue>)newValue);
        return;
      case CoffeeScriptPackage.ID_REF__SOURCE:
        setSource((ForSource)newValue);
        return;
      case CoffeeScriptPackage.ID_REF__LEFT:
        setLeft((EObject)newValue);
        return;
      case CoffeeScriptPackage.ID_REF__OPERATOR:
        setOperator((String)newValue);
        return;
      case CoffeeScriptPackage.ID_REF__RIGHT:
        setRight((Expression)newValue);
        return;
      case CoffeeScriptPackage.ID_REF__VAL:
        setVal((Id)newValue);
        return;
      case CoffeeScriptPackage.ID_REF__ACCESSOR:
        setAccessor((String)newValue);
        return;
      case CoffeeScriptPackage.ID_REF__PROP:
        setProp((Id)newValue);
        return;
      case CoffeeScriptPackage.ID_REF__INDEX:
        setIndex((Index)newValue);
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
      case CoffeeScriptPackage.ID_REF__INDEXES:
        getIndexes().clear();
        return;
      case CoffeeScriptPackage.ID_REF__SOURCE:
        setSource((ForSource)null);
        return;
      case CoffeeScriptPackage.ID_REF__LEFT:
        setLeft((EObject)null);
        return;
      case CoffeeScriptPackage.ID_REF__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case CoffeeScriptPackage.ID_REF__RIGHT:
        setRight((Expression)null);
        return;
      case CoffeeScriptPackage.ID_REF__VAL:
        setVal((Id)null);
        return;
      case CoffeeScriptPackage.ID_REF__ACCESSOR:
        setAccessor(ACCESSOR_EDEFAULT);
        return;
      case CoffeeScriptPackage.ID_REF__PROP:
        setProp((Id)null);
        return;
      case CoffeeScriptPackage.ID_REF__INDEX:
        setIndex((Index)null);
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
      case CoffeeScriptPackage.ID_REF__INDEXES:
        return indexes != null && !indexes.isEmpty();
      case CoffeeScriptPackage.ID_REF__SOURCE:
        return source != null;
      case CoffeeScriptPackage.ID_REF__LEFT:
        return left != null;
      case CoffeeScriptPackage.ID_REF__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case CoffeeScriptPackage.ID_REF__RIGHT:
        return right != null;
      case CoffeeScriptPackage.ID_REF__VAL:
        return val != null;
      case CoffeeScriptPackage.ID_REF__ACCESSOR:
        return ACCESSOR_EDEFAULT == null ? accessor != null : !ACCESSOR_EDEFAULT.equals(accessor);
      case CoffeeScriptPackage.ID_REF__PROP:
        return prop != null;
      case CoffeeScriptPackage.ID_REF__INDEX:
        return index != null;
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
    if (baseClass == PrimaryExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
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
        case CoffeeScriptPackage.ID_REF__INDEXES: return CoffeeScriptPackage.EXPRESSION__INDEXES;
        case CoffeeScriptPackage.ID_REF__SOURCE: return CoffeeScriptPackage.EXPRESSION__SOURCE;
        case CoffeeScriptPackage.ID_REF__LEFT: return CoffeeScriptPackage.EXPRESSION__LEFT;
        case CoffeeScriptPackage.ID_REF__OPERATOR: return CoffeeScriptPackage.EXPRESSION__OPERATOR;
        case CoffeeScriptPackage.ID_REF__RIGHT: return CoffeeScriptPackage.EXPRESSION__RIGHT;
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
    if (baseClass == Property.class)
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
    if (baseClass == PrimaryExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
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
        case CoffeeScriptPackage.EXPRESSION__INDEXES: return CoffeeScriptPackage.ID_REF__INDEXES;
        case CoffeeScriptPackage.EXPRESSION__SOURCE: return CoffeeScriptPackage.ID_REF__SOURCE;
        case CoffeeScriptPackage.EXPRESSION__LEFT: return CoffeeScriptPackage.ID_REF__LEFT;
        case CoffeeScriptPackage.EXPRESSION__OPERATOR: return CoffeeScriptPackage.ID_REF__OPERATOR;
        case CoffeeScriptPackage.EXPRESSION__RIGHT: return CoffeeScriptPackage.ID_REF__RIGHT;
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
    if (baseClass == Property.class)
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
    result.append(", accessor: ");
    result.append(accessor);
    result.append(')');
    return result.toString();
  }

} //IdRefImpl
