/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.RequireStmt#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link csep.coffeeScript.RequireStmt#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getRequireStmt()
 * @model
 * @generated
 */
public interface RequireStmt extends Stmt
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' containment reference.
   * @see #setImportedNamespace(Id)
   * @see csep.coffeeScript.CoffeeScriptPackage#getRequireStmt_ImportedNamespace()
   * @model containment="true"
   * @generated
   */
  Id getImportedNamespace();

  /**
   * Sets the value of the '{@link csep.coffeeScript.RequireStmt#getImportedNamespace <em>Imported Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' containment reference.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(Id value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see csep.coffeeScript.CoffeeScriptPackage#getRequireStmt_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link csep.coffeeScript.RequireStmt#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

} // RequireStmt
