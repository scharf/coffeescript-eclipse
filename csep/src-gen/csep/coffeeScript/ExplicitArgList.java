/**
 */
package csep.coffeeScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Arg List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.ExplicitArgList#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getExplicitArgList()
 * @model
 * @generated
 */
public interface ExplicitArgList extends EObject
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link csep.coffeeScript.ArgLine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see csep.coffeeScript.CoffeeScriptPackage#getExplicitArgList_Lines()
   * @model containment="true"
   * @generated
   */
  EList<ArgLine> getLines();

} // ExplicitArgList
