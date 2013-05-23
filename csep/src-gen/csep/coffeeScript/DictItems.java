/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dict Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.DictItems#getDummy <em>Dummy</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getDictItems()
 * @model
 * @generated
 */
public interface DictItems extends Dictionary
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
   * @see #setDummy(ExplicitDictItems)
   * @see csep.coffeeScript.CoffeeScriptPackage#getDictItems_Dummy()
   * @model containment="true"
   * @generated
   */
  ExplicitDictItems getDummy();

  /**
   * Sets the value of the '{@link csep.coffeeScript.DictItems#getDummy <em>Dummy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dummy</em>' containment reference.
   * @see #getDummy()
   * @generated
   */
  void setDummy(ExplicitDictItems value);

} // DictItems
