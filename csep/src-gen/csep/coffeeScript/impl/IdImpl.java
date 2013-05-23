/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.Assignable;
import csep.coffeeScript.CoffeeScriptPackage;
import csep.coffeeScript.DictKey;
import csep.coffeeScript.Expression;
import csep.coffeeScript.ForSource;
import csep.coffeeScript.ForValue;
import csep.coffeeScript.Id;
import csep.coffeeScript.Line;
import csep.coffeeScript.Param;
import csep.coffeeScript.PrimaryExpression;
import csep.coffeeScript.ThisProperty;
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
 * An implementation of the model object '<em><b>Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#isSplat <em>Splat</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#getSource <em>Source</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#getRight <em>Right</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#getName <em>Name</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.IdImpl#getProps <em>Props</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdImpl extends ForValueImpl implements Id
{
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
   * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValue()
   * @generated
   * @ordered
   */
  protected Expression defaultValue;

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
   * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProps()
   * @generated
   * @ordered
   */
  protected EList<Id> props;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdImpl()
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
    return CoffeeScriptPackage.Literals.ID;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__SPLAT, oldSplat, splat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDefaultValue()
  {
    return defaultValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValue(Expression newDefaultValue, NotificationChain msgs)
  {
    Expression oldDefaultValue = defaultValue;
    defaultValue = newDefaultValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValue(Expression newDefaultValue)
  {
    if (newDefaultValue != defaultValue)
    {
      NotificationChain msgs = null;
      if (defaultValue != null)
        msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID__DEFAULT_VALUE, null, msgs);
      if (newDefaultValue != null)
        msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID__DEFAULT_VALUE, null, msgs);
      msgs = basicSetDefaultValue(newDefaultValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
      indexes = new EObjectContainmentEList<ForValue>(ForValue.class, this, CoffeeScriptPackage.ID__INDEXES);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__SOURCE, oldSource, newSource);
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
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__SOURCE, newSource, newSource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__OPERATOR, oldOperator, operator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.ID__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.ID__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Id> getProps()
  {
    if (props == null)
    {
      props = new EObjectContainmentEList<Id>(Id.class, this, CoffeeScriptPackage.ID__PROPS);
    }
    return props;
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
      case CoffeeScriptPackage.ID__DEFAULT_VALUE:
        return basicSetDefaultValue(null, msgs);
      case CoffeeScriptPackage.ID__INDEXES:
        return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
      case CoffeeScriptPackage.ID__SOURCE:
        return basicSetSource(null, msgs);
      case CoffeeScriptPackage.ID__LEFT:
        return basicSetLeft(null, msgs);
      case CoffeeScriptPackage.ID__RIGHT:
        return basicSetRight(null, msgs);
      case CoffeeScriptPackage.ID__PROPS:
        return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
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
      case CoffeeScriptPackage.ID__SPLAT:
        return isSplat();
      case CoffeeScriptPackage.ID__DEFAULT_VALUE:
        return getDefaultValue();
      case CoffeeScriptPackage.ID__INDEXES:
        return getIndexes();
      case CoffeeScriptPackage.ID__SOURCE:
        return getSource();
      case CoffeeScriptPackage.ID__LEFT:
        return getLeft();
      case CoffeeScriptPackage.ID__OPERATOR:
        return getOperator();
      case CoffeeScriptPackage.ID__RIGHT:
        return getRight();
      case CoffeeScriptPackage.ID__NAME:
        return getName();
      case CoffeeScriptPackage.ID__PROPS:
        return getProps();
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
      case CoffeeScriptPackage.ID__SPLAT:
        setSplat((Boolean)newValue);
        return;
      case CoffeeScriptPackage.ID__DEFAULT_VALUE:
        setDefaultValue((Expression)newValue);
        return;
      case CoffeeScriptPackage.ID__INDEXES:
        getIndexes().clear();
        getIndexes().addAll((Collection<? extends ForValue>)newValue);
        return;
      case CoffeeScriptPackage.ID__SOURCE:
        setSource((ForSource)newValue);
        return;
      case CoffeeScriptPackage.ID__LEFT:
        setLeft((EObject)newValue);
        return;
      case CoffeeScriptPackage.ID__OPERATOR:
        setOperator((String)newValue);
        return;
      case CoffeeScriptPackage.ID__RIGHT:
        setRight((Expression)newValue);
        return;
      case CoffeeScriptPackage.ID__NAME:
        setName((String)newValue);
        return;
      case CoffeeScriptPackage.ID__PROPS:
        getProps().clear();
        getProps().addAll((Collection<? extends Id>)newValue);
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
      case CoffeeScriptPackage.ID__SPLAT:
        setSplat(SPLAT_EDEFAULT);
        return;
      case CoffeeScriptPackage.ID__DEFAULT_VALUE:
        setDefaultValue((Expression)null);
        return;
      case CoffeeScriptPackage.ID__INDEXES:
        getIndexes().clear();
        return;
      case CoffeeScriptPackage.ID__SOURCE:
        setSource((ForSource)null);
        return;
      case CoffeeScriptPackage.ID__LEFT:
        setLeft((EObject)null);
        return;
      case CoffeeScriptPackage.ID__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case CoffeeScriptPackage.ID__RIGHT:
        setRight((Expression)null);
        return;
      case CoffeeScriptPackage.ID__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CoffeeScriptPackage.ID__PROPS:
        getProps().clear();
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
      case CoffeeScriptPackage.ID__SPLAT:
        return splat != SPLAT_EDEFAULT;
      case CoffeeScriptPackage.ID__DEFAULT_VALUE:
        return defaultValue != null;
      case CoffeeScriptPackage.ID__INDEXES:
        return indexes != null && !indexes.isEmpty();
      case CoffeeScriptPackage.ID__SOURCE:
        return source != null;
      case CoffeeScriptPackage.ID__LEFT:
        return left != null;
      case CoffeeScriptPackage.ID__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case CoffeeScriptPackage.ID__RIGHT:
        return right != null;
      case CoffeeScriptPackage.ID__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CoffeeScriptPackage.ID__PROPS:
        return props != null && !props.isEmpty();
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
    if (baseClass == Param.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ThisProperty.class)
    {
      switch (derivedFeatureID)
      {
        case CoffeeScriptPackage.ID__SPLAT: return CoffeeScriptPackage.THIS_PROPERTY__SPLAT;
        case CoffeeScriptPackage.ID__DEFAULT_VALUE: return CoffeeScriptPackage.THIS_PROPERTY__DEFAULT_VALUE;
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
        case CoffeeScriptPackage.ID__INDEXES: return CoffeeScriptPackage.EXPRESSION__INDEXES;
        case CoffeeScriptPackage.ID__SOURCE: return CoffeeScriptPackage.EXPRESSION__SOURCE;
        case CoffeeScriptPackage.ID__LEFT: return CoffeeScriptPackage.EXPRESSION__LEFT;
        case CoffeeScriptPackage.ID__OPERATOR: return CoffeeScriptPackage.EXPRESSION__OPERATOR;
        case CoffeeScriptPackage.ID__RIGHT: return CoffeeScriptPackage.EXPRESSION__RIGHT;
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
    if (baseClass == DictKey.class)
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
    if (baseClass == Param.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ThisProperty.class)
    {
      switch (baseFeatureID)
      {
        case CoffeeScriptPackage.THIS_PROPERTY__SPLAT: return CoffeeScriptPackage.ID__SPLAT;
        case CoffeeScriptPackage.THIS_PROPERTY__DEFAULT_VALUE: return CoffeeScriptPackage.ID__DEFAULT_VALUE;
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
        case CoffeeScriptPackage.EXPRESSION__INDEXES: return CoffeeScriptPackage.ID__INDEXES;
        case CoffeeScriptPackage.EXPRESSION__SOURCE: return CoffeeScriptPackage.ID__SOURCE;
        case CoffeeScriptPackage.EXPRESSION__LEFT: return CoffeeScriptPackage.ID__LEFT;
        case CoffeeScriptPackage.EXPRESSION__OPERATOR: return CoffeeScriptPackage.ID__OPERATOR;
        case CoffeeScriptPackage.EXPRESSION__RIGHT: return CoffeeScriptPackage.ID__RIGHT;
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
    if (baseClass == DictKey.class)
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
    result.append(" (splat: ");
    result.append(splat);
    result.append(", operator: ");
    result.append(operator);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //IdImpl
