/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.Block;
import csep.coffeeScript.CoffeeScriptPackage;
import csep.coffeeScript.Id;
import csep.coffeeScript.TryCatch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Catch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csep.coffeeScript.impl.TryCatchImpl#getBody <em>Body</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.TryCatchImpl#getException <em>Exception</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.TryCatchImpl#getCatchBlock <em>Catch Block</em>}</li>
 *   <li>{@link csep.coffeeScript.impl.TryCatchImpl#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TryCatchImpl extends PrimaryExpressionImpl implements TryCatch
{
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
   * The cached value of the '{@link #getException() <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getException()
   * @generated
   * @ordered
   */
  protected Id exception;

  /**
   * The cached value of the '{@link #getCatchBlock() <em>Catch Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatchBlock()
   * @generated
   * @ordered
   */
  protected Block catchBlock;

  /**
   * The cached value of the '{@link #getFinallyBlock() <em>Finally Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinallyBlock()
   * @generated
   * @ordered
   */
  protected Block finallyBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TryCatchImpl()
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
    return CoffeeScriptPackage.Literals.TRY_CATCH;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.TRY_CATCH__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.TRY_CATCH__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.TRY_CATCH__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.TRY_CATCH__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id getException()
  {
    return exception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetException(Id newException, NotificationChain msgs)
  {
    Id oldException = exception;
    exception = newException;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.TRY_CATCH__EXCEPTION, oldException, newException);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setException(Id newException)
  {
    if (newException != exception)
    {
      NotificationChain msgs = null;
      if (exception != null)
        msgs = ((InternalEObject)exception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.TRY_CATCH__EXCEPTION, null, msgs);
      if (newException != null)
        msgs = ((InternalEObject)newException).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.TRY_CATCH__EXCEPTION, null, msgs);
      msgs = basicSetException(newException, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.TRY_CATCH__EXCEPTION, newException, newException));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getCatchBlock()
  {
    return catchBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCatchBlock(Block newCatchBlock, NotificationChain msgs)
  {
    Block oldCatchBlock = catchBlock;
    catchBlock = newCatchBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK, oldCatchBlock, newCatchBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCatchBlock(Block newCatchBlock)
  {
    if (newCatchBlock != catchBlock)
    {
      NotificationChain msgs = null;
      if (catchBlock != null)
        msgs = ((InternalEObject)catchBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK, null, msgs);
      if (newCatchBlock != null)
        msgs = ((InternalEObject)newCatchBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK, null, msgs);
      msgs = basicSetCatchBlock(newCatchBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK, newCatchBlock, newCatchBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getFinallyBlock()
  {
    return finallyBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinallyBlock(Block newFinallyBlock, NotificationChain msgs)
  {
    Block oldFinallyBlock = finallyBlock;
    finallyBlock = newFinallyBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK, oldFinallyBlock, newFinallyBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinallyBlock(Block newFinallyBlock)
  {
    if (newFinallyBlock != finallyBlock)
    {
      NotificationChain msgs = null;
      if (finallyBlock != null)
        msgs = ((InternalEObject)finallyBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK, null, msgs);
      if (newFinallyBlock != null)
        msgs = ((InternalEObject)newFinallyBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK, null, msgs);
      msgs = basicSetFinallyBlock(newFinallyBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK, newFinallyBlock, newFinallyBlock));
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
      case CoffeeScriptPackage.TRY_CATCH__BODY:
        return basicSetBody(null, msgs);
      case CoffeeScriptPackage.TRY_CATCH__EXCEPTION:
        return basicSetException(null, msgs);
      case CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK:
        return basicSetCatchBlock(null, msgs);
      case CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK:
        return basicSetFinallyBlock(null, msgs);
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
      case CoffeeScriptPackage.TRY_CATCH__BODY:
        return getBody();
      case CoffeeScriptPackage.TRY_CATCH__EXCEPTION:
        return getException();
      case CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK:
        return getCatchBlock();
      case CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK:
        return getFinallyBlock();
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
      case CoffeeScriptPackage.TRY_CATCH__BODY:
        setBody((Block)newValue);
        return;
      case CoffeeScriptPackage.TRY_CATCH__EXCEPTION:
        setException((Id)newValue);
        return;
      case CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK:
        setCatchBlock((Block)newValue);
        return;
      case CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK:
        setFinallyBlock((Block)newValue);
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
      case CoffeeScriptPackage.TRY_CATCH__BODY:
        setBody((Block)null);
        return;
      case CoffeeScriptPackage.TRY_CATCH__EXCEPTION:
        setException((Id)null);
        return;
      case CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK:
        setCatchBlock((Block)null);
        return;
      case CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK:
        setFinallyBlock((Block)null);
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
      case CoffeeScriptPackage.TRY_CATCH__BODY:
        return body != null;
      case CoffeeScriptPackage.TRY_CATCH__EXCEPTION:
        return exception != null;
      case CoffeeScriptPackage.TRY_CATCH__CATCH_BLOCK:
        return catchBlock != null;
      case CoffeeScriptPackage.TRY_CATCH__FINALLY_BLOCK:
        return finallyBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //TryCatchImpl
