/**
 */
package csep.coffeeScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arg Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.ArgLine#getHead <em>Head</em>}</li>
 *   <li>{@link csep.coffeeScript.ArgLine#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getArgLine()
 * @model
 * @generated
 */
public interface ArgLine extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(Arg)
   * @see csep.coffeeScript.CoffeeScriptPackage#getArgLine_Head()
   * @model containment="true"
   * @generated
   */
  Arg getHead();

  /**
   * Sets the value of the '{@link csep.coffeeScript.ArgLine#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Arg value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference list.
   * The list contents are of type {@link csep.coffeeScript.Arg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference list.
   * @see csep.coffeeScript.CoffeeScriptPackage#getArgLine_Tail()
   * @model containment="true"
   * @generated
   */
  EList<Arg> getTail();

} // ArgLine
