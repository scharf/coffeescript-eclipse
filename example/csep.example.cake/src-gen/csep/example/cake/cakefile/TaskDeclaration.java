/**
 */
package csep.example.cake.cakefile;

import csep.coffeeScript.Block;
import csep.coffeeScript.Id;
import csep.coffeeScript.StringLiteral;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.example.cake.cakefile.TaskDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link csep.example.cake.cakefile.TaskDeclaration#getDescription <em>Description</em>}</li>
 *   <li>{@link csep.example.cake.cakefile.TaskDeclaration#getOptions <em>Options</em>}</li>
 *   <li>{@link csep.example.cake.cakefile.TaskDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.example.cake.cakefile.CakefilePackage#getTaskDeclaration()
 * @model
 * @generated
 */
public interface TaskDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(StringLiteral)
   * @see csep.example.cake.cakefile.CakefilePackage#getTaskDeclaration_Name()
   * @model containment="true"
   * @generated
   */
  StringLiteral getName();

  /**
   * Sets the value of the '{@link csep.example.cake.cakefile.TaskDeclaration#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(StringLiteral value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(StringLiteral)
   * @see csep.example.cake.cakefile.CakefilePackage#getTaskDeclaration_Description()
   * @model containment="true"
   * @generated
   */
  StringLiteral getDescription();

  /**
   * Sets the value of the '{@link csep.example.cake.cakefile.TaskDeclaration#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(StringLiteral value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference.
   * @see #setOptions(Id)
   * @see csep.example.cake.cakefile.CakefilePackage#getTaskDeclaration_Options()
   * @model containment="true"
   * @generated
   */
  Id getOptions();

  /**
   * Sets the value of the '{@link csep.example.cake.cakefile.TaskDeclaration#getOptions <em>Options</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Options</em>' containment reference.
   * @see #getOptions()
   * @generated
   */
  void setOptions(Id value);

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
   * @see csep.example.cake.cakefile.CakefilePackage#getTaskDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  Block getBody();

  /**
   * Sets the value of the '{@link csep.example.cake.cakefile.TaskDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Block value);

} // TaskDeclaration
