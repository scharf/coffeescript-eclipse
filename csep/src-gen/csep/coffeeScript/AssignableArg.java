/**
 */
package csep.coffeeScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignable Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.AssignableArg#getArg <em>Arg</em>}</li>
 *   <li>{@link csep.coffeeScript.AssignableArg#isSplat <em>Splat</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getAssignableArg()
 * @model
 * @generated
 */
public interface AssignableArg extends EObject
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(Assignable)
   * @see csep.coffeeScript.CoffeeScriptPackage#getAssignableArg_Arg()
   * @model containment="true"
   * @generated
   */
  Assignable getArg();

  /**
   * Sets the value of the '{@link csep.coffeeScript.AssignableArg#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(Assignable value);

  /**
   * Returns the value of the '<em><b>Splat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Splat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Splat</em>' attribute.
   * @see #setSplat(boolean)
   * @see csep.coffeeScript.CoffeeScriptPackage#getAssignableArg_Splat()
   * @model
   * @generated
   */
  boolean isSplat();

  /**
   * Sets the value of the '{@link csep.coffeeScript.AssignableArg#isSplat <em>Splat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Splat</em>' attribute.
   * @see #isSplat()
   * @generated
   */
  void setSplat(boolean value);

} // AssignableArg
