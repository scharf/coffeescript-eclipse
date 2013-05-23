/**
 */
package csep.coffeeScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.Case#getWhens <em>Whens</em>}</li>
 *   <li>{@link csep.coffeeScript.Case#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject
{
  /**
   * Returns the value of the '<em><b>Whens</b></em>' containment reference list.
   * The list contents are of type {@link csep.coffeeScript.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whens</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whens</em>' containment reference list.
   * @see csep.coffeeScript.CoffeeScriptPackage#getCase_Whens()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getWhens();

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Block)
   * @see csep.coffeeScript.CoffeeScriptPackage#getCase_Then()
   * @model containment="true"
   * @generated
   */
  Block getThen();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Case#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Block value);

} // Case
