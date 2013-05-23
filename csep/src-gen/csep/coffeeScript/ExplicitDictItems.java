/**
 */
package csep.coffeeScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Dict Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.ExplicitDictItems#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getExplicitDictItems()
 * @model
 * @generated
 */
public interface ExplicitDictItems extends EObject
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link csep.coffeeScript.DictLine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see csep.coffeeScript.CoffeeScriptPackage#getExplicitDictItems_Lines()
   * @model containment="true"
   * @generated
   */
  EList<DictLine> getLines();

} // ExplicitDictItems
