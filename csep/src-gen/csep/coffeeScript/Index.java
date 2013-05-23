/**
 */
package csep.coffeeScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.Index#getDots <em>Dots</em>}</li>
 *   <li>{@link csep.coffeeScript.Index#getEnd <em>End</em>}</li>
 *   <li>{@link csep.coffeeScript.Index#getStart <em>Start</em>}</li>
 *   <li>{@link csep.coffeeScript.Index#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends EObject
{
  /**
   * Returns the value of the '<em><b>Dots</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dots</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dots</em>' attribute.
   * @see #setDots(String)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIndex_Dots()
   * @model
   * @generated
   */
  String getDots();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Index#getDots <em>Dots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dots</em>' attribute.
   * @see #getDots()
   * @generated
   */
  void setDots(String value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIndex_End()
   * @model containment="true"
   * @generated
   */
  Expression getEnd();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Index#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(Expression value);

  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIndex_Start()
   * @model containment="true"
   * @generated
   */
  Expression getStart();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Index#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(Expression value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIndex_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Index#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // Index
