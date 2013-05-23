/**
 */
package csep.example.cake.cakefile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see csep.example.cake.cakefile.CakefilePackage
 * @generated
 */
public interface CakefileFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CakefileFactory eINSTANCE = csep.example.cake.cakefile.impl.CakefileFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Cakefile</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cakefile</em>'.
   * @generated
   */
  Cakefile createCakefile();

  /**
   * Returns a new object of class '<em>Task Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Declaration</em>'.
   * @generated
   */
  TaskDeclaration createTaskDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CakefilePackage getCakefilePackage();

} //CakefileFactory
