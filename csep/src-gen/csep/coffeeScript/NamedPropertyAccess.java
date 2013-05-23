/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Property Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.NamedPropertyAccess#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link csep.coffeeScript.NamedPropertyAccess#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getNamedPropertyAccess()
 * @model
 * @generated
 */
public interface NamedPropertyAccess extends PropertyAccess
{
  /**
   * Returns the value of the '<em><b>Accessor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accessor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accessor</em>' attribute.
   * @see #setAccessor(String)
   * @see csep.coffeeScript.CoffeeScriptPackage#getNamedPropertyAccess_Accessor()
   * @model
   * @generated
   */
  String getAccessor();

  /**
   * Sets the value of the '{@link csep.coffeeScript.NamedPropertyAccess#getAccessor <em>Accessor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accessor</em>' attribute.
   * @see #getAccessor()
   * @generated
   */
  void setAccessor(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Id)
   * @see csep.coffeeScript.CoffeeScriptPackage#getNamedPropertyAccess_Name()
   * @model containment="true"
   * @generated
   */
  Id getName();

  /**
   * Sets the value of the '{@link csep.coffeeScript.NamedPropertyAccess#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Id value);

} // NamedPropertyAccess
