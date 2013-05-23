/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.ClassDeclaration#getBody <em>Body</em>}</li>
 *   <li>{@link csep.coffeeScript.ClassDeclaration#getExtend <em>Extend</em>}</li>
 *   <li>{@link csep.coffeeScript.ClassDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getClassDeclaration()
 * @model
 * @generated
 */
public interface ClassDeclaration extends Stmt, AssignedClassDeclaration
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Block)
   * @see csep.coffeeScript.CoffeeScriptPackage#getClassDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  Block getBody();

  /**
   * Sets the value of the '{@link csep.coffeeScript.ClassDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Block value);

  /**
   * Returns the value of the '<em><b>Extend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extend</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extend</em>' containment reference.
   * @see #setExtend(SuperClass)
   * @see csep.coffeeScript.CoffeeScriptPackage#getClassDeclaration_Extend()
   * @model containment="true"
   * @generated
   */
  SuperClass getExtend();

  /**
   * Sets the value of the '{@link csep.coffeeScript.ClassDeclaration#getExtend <em>Extend</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extend</em>' containment reference.
   * @see #getExtend()
   * @generated
   */
  void setExtend(SuperClass value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Variable)
   * @see csep.coffeeScript.CoffeeScriptPackage#getClassDeclaration_Name()
   * @model containment="true"
   * @generated
   */
  Variable getName();

  /**
   * Sets the value of the '{@link csep.coffeeScript.ClassDeclaration#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Variable value);

} // ClassDeclaration
