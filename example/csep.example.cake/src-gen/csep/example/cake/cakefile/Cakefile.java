/**
 */
package csep.example.cake.cakefile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cakefile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.example.cake.cakefile.Cakefile#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.example.cake.cakefile.CakefilePackage#getCakefile()
 * @model
 * @generated
 */
public interface Cakefile extends EObject
{
  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link csep.example.cake.cakefile.TaskDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see csep.example.cake.cakefile.CakefilePackage#getCakefile_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<TaskDeclaration> getTasks();

} // Cakefile
