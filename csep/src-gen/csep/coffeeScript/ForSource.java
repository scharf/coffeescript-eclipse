/**
 */
package csep.coffeeScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.ForSource#getSource <em>Source</em>}</li>
 *   <li>{@link csep.coffeeScript.ForSource#getWhen <em>When</em>}</li>
 *   <li>{@link csep.coffeeScript.ForSource#getBy <em>By</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getForSource()
 * @model
 * @generated
 */
public interface ForSource extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getForSource_Source()
   * @model containment="true"
   * @generated
   */
  Expression getSource();

  /**
   * Sets the value of the '{@link csep.coffeeScript.ForSource#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Expression value);

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference.
   * @see #setWhen(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getForSource_When()
   * @model containment="true"
   * @generated
   */
  Expression getWhen();

  /**
   * Sets the value of the '{@link csep.coffeeScript.ForSource#getWhen <em>When</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' containment reference.
   * @see #getWhen()
   * @generated
   */
  void setWhen(Expression value);

  /**
   * Returns the value of the '<em><b>By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By</em>' containment reference.
   * @see #setBy(Expression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getForSource_By()
   * @model containment="true"
   * @generated
   */
  Expression getBy();

  /**
   * Sets the value of the '{@link csep.coffeeScript.ForSource#getBy <em>By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By</em>' containment reference.
   * @see #getBy()
   * @generated
   */
  void setBy(Expression value);

} // ForSource
