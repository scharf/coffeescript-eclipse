/**
 */
package csep.coffeeScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.Id#getName <em>Name</em>}</li>
 *   <li>{@link csep.coffeeScript.Id#getProps <em>Props</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getId()
 * @model
 * @generated
 */
public interface Id extends ForValue, ThisProperty, Variable, DictKey, Param
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see csep.coffeeScript.CoffeeScriptPackage#getId_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Id#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Props</b></em>' containment reference list.
   * The list contents are of type {@link csep.coffeeScript.Id}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Props</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Props</em>' containment reference list.
   * @see csep.coffeeScript.CoffeeScriptPackage#getId_Props()
   * @model containment="true"
   * @generated
   */
  EList<Id> getProps();

} // Id
