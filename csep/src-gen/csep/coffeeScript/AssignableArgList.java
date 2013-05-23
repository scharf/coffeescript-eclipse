/**
 */
package csep.coffeeScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignable Arg List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.AssignableArgList#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getAssignableArgList()
 * @model
 * @generated
 */
public interface AssignableArgList extends AssignableArray
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link csep.coffeeScript.AssignableArg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see csep.coffeeScript.CoffeeScriptPackage#getAssignableArgList_Args()
   * @model containment="true"
   * @generated
   */
  EList<AssignableArg> getArgs();

} // AssignableArgList
