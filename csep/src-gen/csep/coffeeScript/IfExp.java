/**
 */
package csep.coffeeScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.IfExp#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link csep.coffeeScript.IfExp#getDefaultBlock <em>Default Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getIfExp()
 * @model
 * @generated
 */
public interface IfExp extends PrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link csep.coffeeScript.CondBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see csep.coffeeScript.CoffeeScriptPackage#getIfExp_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<CondBlock> getBlocks();

  /**
   * Returns the value of the '<em><b>Default Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Block</em>' containment reference.
   * @see #setDefaultBlock(Block)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIfExp_DefaultBlock()
   * @model containment="true"
   * @generated
   */
  Block getDefaultBlock();

  /**
   * Sets the value of the '{@link csep.coffeeScript.IfExp#getDefaultBlock <em>Default Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Block</em>' containment reference.
   * @see #getDefaultBlock()
   * @generated
   */
  void setDefaultBlock(Block value);

} // IfExp
