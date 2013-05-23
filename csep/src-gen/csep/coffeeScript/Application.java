/**
 */
package csep.coffeeScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.Application#getValue <em>Value</em>}</li>
 *   <li>{@link csep.coffeeScript.Application#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(PrimaryExpression)
   * @see csep.coffeeScript.CoffeeScriptPackage#getApplication_Value()
   * @model containment="true"
   * @generated
   */
  PrimaryExpression getValue();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Application#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(PrimaryExpression value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link csep.coffeeScript.FeatureCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see csep.coffeeScript.CoffeeScriptPackage#getApplication_Features()
   * @model containment="true"
   * @generated
   */
  EList<FeatureCall> getFeatures();

} // Application
