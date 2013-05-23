/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Catch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.TryCatch#getBody <em>Body</em>}</li>
 *   <li>{@link csep.coffeeScript.TryCatch#getException <em>Exception</em>}</li>
 *   <li>{@link csep.coffeeScript.TryCatch#getCatchBlock <em>Catch Block</em>}</li>
 *   <li>{@link csep.coffeeScript.TryCatch#getFinallyBlock <em>Finally Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getTryCatch()
 * @model
 * @generated
 */
public interface TryCatch extends PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Block)
   * @see csep.coffeeScript.CoffeeScriptPackage#getTryCatch_Body()
   * @model containment="true"
   * @generated
   */
  Block getBody();

  /**
   * Sets the value of the '{@link csep.coffeeScript.TryCatch#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Block value);

  /**
   * Returns the value of the '<em><b>Exception</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exception</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exception</em>' containment reference.
   * @see #setException(Id)
   * @see csep.coffeeScript.CoffeeScriptPackage#getTryCatch_Exception()
   * @model containment="true"
   * @generated
   */
  Id getException();

  /**
   * Sets the value of the '{@link csep.coffeeScript.TryCatch#getException <em>Exception</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exception</em>' containment reference.
   * @see #getException()
   * @generated
   */
  void setException(Id value);

  /**
   * Returns the value of the '<em><b>Catch Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Catch Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catch Block</em>' containment reference.
   * @see #setCatchBlock(Block)
   * @see csep.coffeeScript.CoffeeScriptPackage#getTryCatch_CatchBlock()
   * @model containment="true"
   * @generated
   */
  Block getCatchBlock();

  /**
   * Sets the value of the '{@link csep.coffeeScript.TryCatch#getCatchBlock <em>Catch Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Catch Block</em>' containment reference.
   * @see #getCatchBlock()
   * @generated
   */
  void setCatchBlock(Block value);

  /**
   * Returns the value of the '<em><b>Finally Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Finally Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Finally Block</em>' containment reference.
   * @see #setFinallyBlock(Block)
   * @see csep.coffeeScript.CoffeeScriptPackage#getTryCatch_FinallyBlock()
   * @model containment="true"
   * @generated
   */
  Block getFinallyBlock();

  /**
   * Sets the value of the '{@link csep.coffeeScript.TryCatch#getFinallyBlock <em>Finally Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Finally Block</em>' containment reference.
   * @see #getFinallyBlock()
   * @generated
   */
  void setFinallyBlock(Block value);

} // TryCatch
