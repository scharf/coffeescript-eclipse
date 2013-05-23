/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.If#getDummy <em>Dummy</em>}</li>
 *   <li>{@link csep.coffeeScript.If#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Expression
{
  /**
   * Returns the value of the '<em><b>Dummy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dummy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dummy</em>' containment reference.
   * @see #setDummy(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIf_Dummy()
   * @model containment="true"
   * @generated
   */
  Expression getDummy();

  /**
   * Sets the value of the '{@link csep.coffeeScript.If#getDummy <em>Dummy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dummy</em>' containment reference.
   * @see #getDummy()
   * @generated
   */
  void setDummy(Expression value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIf_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link csep.coffeeScript.If#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

} // If
