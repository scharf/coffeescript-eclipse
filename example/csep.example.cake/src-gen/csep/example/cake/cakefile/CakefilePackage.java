/**
 */
package csep.example.cake.cakefile;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see csep.example.cake.cakefile.CakefileFactory
 * @model kind="package"
 * @generated
 */
public interface CakefilePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cakefile";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.example.csep/cake/Cakefile";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cakefile";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CakefilePackage eINSTANCE = csep.example.cake.cakefile.impl.CakefilePackageImpl.init();

  /**
   * The meta object id for the '{@link csep.example.cake.cakefile.impl.CakefileImpl <em>Cakefile</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.example.cake.cakefile.impl.CakefileImpl
   * @see csep.example.cake.cakefile.impl.CakefilePackageImpl#getCakefile()
   * @generated
   */
  int CAKEFILE = 0;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAKEFILE__TASKS = 0;

  /**
   * The number of structural features of the '<em>Cakefile</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAKEFILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link csep.example.cake.cakefile.impl.TaskDeclarationImpl <em>Task Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see csep.example.cake.cakefile.impl.TaskDeclarationImpl
   * @see csep.example.cake.cakefile.impl.CakefilePackageImpl#getTaskDeclaration()
   * @generated
   */
  int TASK_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__OPTIONS = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION__BODY = 3;

  /**
   * The number of structural features of the '<em>Task Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_DECLARATION_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link csep.example.cake.cakefile.Cakefile <em>Cakefile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cakefile</em>'.
   * @see csep.example.cake.cakefile.Cakefile
   * @generated
   */
  EClass getCakefile();

  /**
   * Returns the meta object for the containment reference list '{@link csep.example.cake.cakefile.Cakefile#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see csep.example.cake.cakefile.Cakefile#getTasks()
   * @see #getCakefile()
   * @generated
   */
  EReference getCakefile_Tasks();

  /**
   * Returns the meta object for class '{@link csep.example.cake.cakefile.TaskDeclaration <em>Task Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Declaration</em>'.
   * @see csep.example.cake.cakefile.TaskDeclaration
   * @generated
   */
  EClass getTaskDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link csep.example.cake.cakefile.TaskDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see csep.example.cake.cakefile.TaskDeclaration#getName()
   * @see #getTaskDeclaration()
   * @generated
   */
  EReference getTaskDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link csep.example.cake.cakefile.TaskDeclaration#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see csep.example.cake.cakefile.TaskDeclaration#getDescription()
   * @see #getTaskDeclaration()
   * @generated
   */
  EReference getTaskDeclaration_Description();

  /**
   * Returns the meta object for the containment reference '{@link csep.example.cake.cakefile.TaskDeclaration#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Options</em>'.
   * @see csep.example.cake.cakefile.TaskDeclaration#getOptions()
   * @see #getTaskDeclaration()
   * @generated
   */
  EReference getTaskDeclaration_Options();

  /**
   * Returns the meta object for the containment reference '{@link csep.example.cake.cakefile.TaskDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see csep.example.cake.cakefile.TaskDeclaration#getBody()
   * @see #getTaskDeclaration()
   * @generated
   */
  EReference getTaskDeclaration_Body();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CakefileFactory getCakefileFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link csep.example.cake.cakefile.impl.CakefileImpl <em>Cakefile</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.example.cake.cakefile.impl.CakefileImpl
     * @see csep.example.cake.cakefile.impl.CakefilePackageImpl#getCakefile()
     * @generated
     */
    EClass CAKEFILE = eINSTANCE.getCakefile();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAKEFILE__TASKS = eINSTANCE.getCakefile_Tasks();

    /**
     * The meta object literal for the '{@link csep.example.cake.cakefile.impl.TaskDeclarationImpl <em>Task Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see csep.example.cake.cakefile.impl.TaskDeclarationImpl
     * @see csep.example.cake.cakefile.impl.CakefilePackageImpl#getTaskDeclaration()
     * @generated
     */
    EClass TASK_DECLARATION = eINSTANCE.getTaskDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_DECLARATION__NAME = eINSTANCE.getTaskDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_DECLARATION__DESCRIPTION = eINSTANCE.getTaskDeclaration_Description();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_DECLARATION__OPTIONS = eINSTANCE.getTaskDeclaration_Options();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK_DECLARATION__BODY = eINSTANCE.getTaskDeclaration_Body();

  }

} //CakefilePackage
