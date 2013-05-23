/**
 */
package csep.example.cake.cakefile.impl;

import csep.coffeeScript.CoffeeScriptPackage;

import csep.example.cake.cakefile.Cakefile;
import csep.example.cake.cakefile.CakefileFactory;
import csep.example.cake.cakefile.CakefilePackage;
import csep.example.cake.cakefile.TaskDeclaration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CakefilePackageImpl extends EPackageImpl implements CakefilePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cakefileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskDeclarationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see csep.example.cake.cakefile.CakefilePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CakefilePackageImpl()
  {
    super(eNS_URI, CakefileFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CakefilePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CakefilePackage init()
  {
    if (isInited) return (CakefilePackage)EPackage.Registry.INSTANCE.getEPackage(CakefilePackage.eNS_URI);

    // Obtain or create and register package
    CakefilePackageImpl theCakefilePackage = (CakefilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CakefilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CakefilePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    CoffeeScriptPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCakefilePackage.createPackageContents();

    // Initialize created meta-data
    theCakefilePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCakefilePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CakefilePackage.eNS_URI, theCakefilePackage);
    return theCakefilePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCakefile()
  {
    return cakefileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCakefile_Tasks()
  {
    return (EReference)cakefileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskDeclaration()
  {
    return taskDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDeclaration_Name()
  {
    return (EReference)taskDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDeclaration_Description()
  {
    return (EReference)taskDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDeclaration_Options()
  {
    return (EReference)taskDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTaskDeclaration_Body()
  {
    return (EReference)taskDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CakefileFactory getCakefileFactory()
  {
    return (CakefileFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cakefileEClass = createEClass(CAKEFILE);
    createEReference(cakefileEClass, CAKEFILE__TASKS);

    taskDeclarationEClass = createEClass(TASK_DECLARATION);
    createEReference(taskDeclarationEClass, TASK_DECLARATION__NAME);
    createEReference(taskDeclarationEClass, TASK_DECLARATION__DESCRIPTION);
    createEReference(taskDeclarationEClass, TASK_DECLARATION__OPTIONS);
    createEReference(taskDeclarationEClass, TASK_DECLARATION__BODY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    CoffeeScriptPackage theCoffeeScriptPackage = (CoffeeScriptPackage)EPackage.Registry.INSTANCE.getEPackage(CoffeeScriptPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(cakefileEClass, Cakefile.class, "Cakefile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCakefile_Tasks(), this.getTaskDeclaration(), null, "tasks", null, 0, -1, Cakefile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskDeclarationEClass, TaskDeclaration.class, "TaskDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTaskDeclaration_Name(), theCoffeeScriptPackage.getStringLiteral(), null, "name", null, 0, 1, TaskDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskDeclaration_Description(), theCoffeeScriptPackage.getStringLiteral(), null, "description", null, 0, 1, TaskDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskDeclaration_Options(), theCoffeeScriptPackage.getId(), null, "options", null, 0, 1, TaskDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTaskDeclaration_Body(), theCoffeeScriptPackage.getBlock(), null, "body", null, 0, 1, TaskDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //CakefilePackageImpl
