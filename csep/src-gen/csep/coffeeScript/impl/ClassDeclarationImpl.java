/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.AssignedClassDeclaration;
import csep.coffeeScript.Block;
import csep.coffeeScript.ClassDeclaration;
import csep.coffeeScript.CoffeeScriptPackage;
import csep.coffeeScript.Expression;
import csep.coffeeScript.ForSource;
import csep.coffeeScript.ForValue;
import csep.coffeeScript.SuperClass;
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
 * An implementation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.ClassDeclarationImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ClassDeclarationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ClassDeclarationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ClassDeclarationImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ClassDeclarationImpl#getRight <em>Right</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ClassDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ClassDeclarationImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.ClassDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDeclarationImpl extends StmtImpl implements ClassDeclaration
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
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Block body;

  /**
   * The cached value of the '{@link #getExtend() <em>Extend</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtend()
   * @generated
   * @ordered
   */
  protected SuperClass extend;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Variable name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassDeclarationImpl()
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
    return CoffeeScriptPackage.Literals.CLASS_DECLARATION;
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
      indexes = new EObjectContainmentEList<ForValue>(ForValue.class, this, CoffeeScriptPackage.CLASS_DECLARATION__INDEXES);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__SOURCE, oldSource, newSource);
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
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__SOURCE, newSource, newSource));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__OPERATOR, oldOperator, operator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Block newBody, NotificationChain msgs)
  {
    Block oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Block newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperClass getExtend()
  {
    return extend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtend(SuperClass newExtend, NotificationChain msgs)
  {
    SuperClass oldExtend = extend;
    extend = newExtend;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__EXTEND, oldExtend, newExtend);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtend(SuperClass newExtend)
  {
    if (newExtend != extend)
    {
      NotificationChain msgs = null;
      if (extend != null)
        msgs = ((InternalEObject)extend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__EXTEND, null, msgs);
      if (newExtend != null)
        msgs = ((InternalEObject)newExtend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__EXTEND, null, msgs);
      msgs = basicSetExtend(newExtend, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__EXTEND, newExtend, newExtend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(Variable newName, NotificationChain msgs)
  {
    Variable oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Variable newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.CLASS_DECLARATION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.CLASS_DECLARATION__NAME, newName, newName));
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
      case CoffeeScriptPackage.CLASS_DECLARATION__INDEXES:
        return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
      case CoffeeScriptPackage.CLASS_DECLARATION__SOURCE:
        return basicSetSource(null, msgs);
      case CoffeeScriptPackage.CLASS_DECLARATION__LEFT:
        return basicSetLeft(null, msgs);
      case CoffeeScriptPackage.CLASS_DECLARATION__RIGHT:
        return basicSetRight(null, msgs);
      case CoffeeScriptPackage.CLASS_DECLARATION__BODY:
        return basicSetBody(null, msgs);
      case CoffeeScriptPackage.CLASS_DECLARATION__EXTEND:
        return basicSetExtend(null, msgs);
      case CoffeeScriptPackage.CLASS_DECLARATION__NAME:
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
      case CoffeeScriptPackage.CLASS_DECLARATION__INDEXES:
        return getIndexes();
      case CoffeeScriptPackage.CLASS_DECLARATION__SOURCE:
        return getSource();
      case CoffeeScriptPackage.CLASS_DECLARATION__LEFT:
        return getLeft();
      case CoffeeScriptPackage.CLASS_DECLARATION__OPERATOR:
        return getOperator();
      case CoffeeScriptPackage.CLASS_DECLARATION__RIGHT:
        return getRight();
      case CoffeeScriptPackage.CLASS_DECLARATION__BODY:
        return getBody();
      case CoffeeScriptPackage.CLASS_DECLARATION__EXTEND:
        return getExtend();
      case CoffeeScriptPackage.CLASS_DECLARATION__NAME:
        return getName();
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
      case CoffeeScriptPackage.CLASS_DECLARATION__INDEXES:
        getIndexes().clear();
        getIndexes().addAll((Collection<? extends ForValue>)newValue);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__SOURCE:
        setSource((ForSource)newValue);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__LEFT:
        setLeft((EObject)newValue);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__OPERATOR:
        setOperator((String)newValue);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__RIGHT:
        setRight((Expression)newValue);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__BODY:
        setBody((Block)newValue);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__EXTEND:
        setExtend((SuperClass)newValue);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__NAME:
        setName((Variable)newValue);
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
      case CoffeeScriptPackage.CLASS_DECLARATION__INDEXES:
        getIndexes().clear();
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__SOURCE:
        setSource((ForSource)null);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__LEFT:
        setLeft((EObject)null);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__RIGHT:
        setRight((Expression)null);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__BODY:
        setBody((Block)null);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__EXTEND:
        setExtend((SuperClass)null);
        return;
      case CoffeeScriptPackage.CLASS_DECLARATION__NAME:
        setName((Variable)null);
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
      case CoffeeScriptPackage.CLASS_DECLARATION__INDEXES:
        return indexes != null && !indexes.isEmpty();
      case CoffeeScriptPackage.CLASS_DECLARATION__SOURCE:
        return source != null;
      case CoffeeScriptPackage.CLASS_DECLARATION__LEFT:
        return left != null;
      case CoffeeScriptPackage.CLASS_DECLARATION__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case CoffeeScriptPackage.CLASS_DECLARATION__RIGHT:
        return right != null;
      case CoffeeScriptPackage.CLASS_DECLARATION__BODY:
        return body != null;
      case CoffeeScriptPackage.CLASS_DECLARATION__EXTEND:
        return extend != null;
      case CoffeeScriptPackage.CLASS_DECLARATION__NAME:
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
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case CoffeeScriptPackage.CLASS_DECLARATION__INDEXES: return CoffeeScriptPackage.EXPRESSION__INDEXES;
        case CoffeeScriptPackage.CLASS_DECLARATION__SOURCE: return CoffeeScriptPackage.EXPRESSION__SOURCE;
        case CoffeeScriptPackage.CLASS_DECLARATION__LEFT: return CoffeeScriptPackage.EXPRESSION__LEFT;
        case CoffeeScriptPackage.CLASS_DECLARATION__OPERATOR: return CoffeeScriptPackage.EXPRESSION__OPERATOR;
        case CoffeeScriptPackage.CLASS_DECLARATION__RIGHT: return CoffeeScriptPackage.EXPRESSION__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == AssignedClassDeclaration.class)
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
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case CoffeeScriptPackage.EXPRESSION__INDEXES: return CoffeeScriptPackage.CLASS_DECLARATION__INDEXES;
        case CoffeeScriptPackage.EXPRESSION__SOURCE: return CoffeeScriptPackage.CLASS_DECLARATION__SOURCE;
        case CoffeeScriptPackage.EXPRESSION__LEFT: return CoffeeScriptPackage.CLASS_DECLARATION__LEFT;
        case CoffeeScriptPackage.EXPRESSION__OPERATOR: return CoffeeScriptPackage.CLASS_DECLARATION__OPERATOR;
        case CoffeeScriptPackage.EXPRESSION__RIGHT: return CoffeeScriptPackage.CLASS_DECLARATION__RIGHT;
        default: return -1;
      }
    }
    if (baseClass == AssignedClassDeclaration.class)
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

} //ClassDeclarationImpl
