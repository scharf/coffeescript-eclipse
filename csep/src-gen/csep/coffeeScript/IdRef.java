/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.IdRef#getVal <em>Val</em>}</li>
 *   <li>{@link csep.coffeeScript.IdRef#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link csep.coffeeScript.IdRef#getProp <em>Prop</em>}</li>
 *   <li>{@link csep.coffeeScript.IdRef#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getIdRef()
 * @model
 * @generated
 */
public interface IdRef extends SuperClass, PrimaryExpression, Property
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' reference.
   * @see #setVal(Id)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIdRef_Val()
   * @model
   * @generated
   */
  Id getVal();

  /**
   * Sets the value of the '{@link csep.coffeeScript.IdRef#getVal <em>Val</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' reference.
   * @see #getVal()
   * @generated
   */
  void setVal(Id value);

  /**
   * Returns the value of the '<em><b>Accessor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accessor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accessor</em>' attribute.
   * @see #setAccessor(String)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIdRef_Accessor()
   * @model
   * @generated
   */
  String getAccessor();

  /**
   * Sets the value of the '{@link csep.coffeeScript.IdRef#getAccessor <em>Accessor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accessor</em>' attribute.
   * @see #getAccessor()
   * @generated
   */
  void setAccessor(String value);

  /**
   * Returns the value of the '<em><b>Prop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop</em>' containment reference.
   * @see #setProp(Id)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIdRef_Prop()
   * @model containment="true"
   * @generated
   */
  Id getProp();

  /**
   * Sets the value of the '{@link csep.coffeeScript.IdRef#getProp <em>Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' containment reference.
   * @see #getProp()
   * @generated
   */
  void setProp(Id value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Index)
   * @see csep.coffeeScript.CoffeeScriptPackage#getIdRef_Index()
   * @model containment="true"
   * @generated
   */
  Index getIndex();

  /**
   * Sets the value of the '{@link csep.coffeeScript.IdRef#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Index value);

} // IdRef
