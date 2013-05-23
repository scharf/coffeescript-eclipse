/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arg List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.ArgList#getDummy <em>Dummy</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getArgList()
 * @model
 * @generated
 */
public interface ArgList extends Array
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
   * @see #setDummy(ExplicitArgList)
   * @see csep.coffeeScript.CoffeeScriptPackage#getArgList_Dummy()
   * @model containment="true"
   * @generated
   */
  ExplicitArgList getDummy();

  /**
   * Sets the value of the '{@link csep.coffeeScript.ArgList#getDummy <em>Dummy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dummy</em>' containment reference.
   * @see #getDummy()
   * @generated
   */
  void setDummy(ExplicitArgList value);

} // ArgList
