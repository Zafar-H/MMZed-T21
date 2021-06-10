#MMZed-T21
##Introduction
##Illustrations
###Directory Structure
* MMZed-T21
   * projects
      * common
      * ValidationEngine
      * Base
      * ErrorEngine
      * HelpEngine
      * Application
   * Utils
##Examples of use


###COMMON
####Directory Structure
* common
   * interfaces
   * AttributeControllers
   * code
      * compiled_classes
      * jars
      * src
   * conf
   * data
   * logs
   * test
####Interfaces
1. ICommonHashmap
   * definition : Specifies common methods used for hashmaps
   * path : common -> interface
   * Attributes
   * methods
      * isKeyExist()
      * getMap()
      * setMap()
      * getKey()
      * setKey()
      * deleteKey()
      * updateKey()
2. ICommonAttributes
   * definition : Specifies common attributes used for tracking information about processes.
   * path : common -> AttributeControllers
   * Attributes
      * systemAttributes of type SystemAttributes
      * controller of type Controller
      * processMap of type ProcessMap
      * responseMap of type ResponseMap
      * resultMap of type ResultMap
      * systemErrors of type SystemErrors
   * methods
####Classes
1. SystemAttributes
2. Controller
3. ProcessMap
4. ResponseMap
5. ResultMap
6. SystemErrors
7. JSONFileReader

###ValidationEngine
####Introduction
   * The Engine is used to validate the form input data taken from the end point using data driven approach.
####Illustrations
####Directory Structure
* ValidationEngine
   * code
      * AttributeControllers
      * jars
      * src
         * exceptions
         * interfaces
         * scripts
         * Validation
         * FormValidator.Validator
            * Input
            * Init
            * PreProcess
            * Process
            * PostProcess
      * conf
      * data
      * logs
      * test
####Interfaces
1. IProcessFlow
   * Definition : Specifies methods to indicate the flow of processes during validation.
   * Path : ValidationEngine -> code -> src -> interfaces
   * Attributes
   * methods
      * init()
      * preProcess()
      * process()
      * postProcess()
2. IInit
   * Definition : Specifies method needed in initialization stage
   * Path : ValidationEngine -> code -> src -> interfaces
   * Attributes
   * methods
      * getApiData()
      * isObjectExist()
      * isMandatoryDataPresent()
3. IPreProcess
   * Definition : Specifies attributes and methods needed in pre-process stage
   * Path : ValidationEngine -> code -> src -> interfaces
   * Attributes
      * form input map
      * common validation
      * dynamic validation
   * methods
      * override()
####Classes
1. ValidationEngine
   * Definition : Validates the form input taken from the end point.
   * Path : ValidationEngine -> code -> src
   * Attributes
      * Initiator
      * PreProcessor
      * Processor
      * PostProcessor
   * Constructor
   * methods
      * methods specified in IProcessFlow interface
2. FormValidator.Validator
   * Definition : Checks whether given string matches specified pattern
   * Path : ValidationEngine -> code -> src -> FormValidator.Validator
   * Attributes
      * Attributes specified in ICommonAttributes interface
      * Hashmap of Patterns
   * Constructor
      * setDefaultKey()
   * methods
      * methods specified in ICommonHashmap interface
3. FormInput
   * Definition : Stores form input data from api in hashmap
   * Path : ValidationEngine -> code -> src -> Input
   * Attributes
      * Attributes specified in ICommonAttributes interface
      * Hashmap of form input
   * Constructor
   * methods
      * methods specified in ICommonHashmap interface
4. CommonValidation
   * Definition : Stores common validation data in hashmap
   * Path : ValidationEngine -> code -> src -> Input
   * Attributes
      * Attributes specified in ICommonAttributes interface
      * Hashmap of common validation
   * Constructor
   * methods
      * methods specified in ICommonHashmap interface
5. DynamicValidation
   * Definition : Stores dynamic validation data in hashmap
   * Path : ValidationEngine -> code -> src -> Input
   * Attributes
      * Attributes specified in ICommonAttributes interface
      * Hashmap of dynamic validation
   * Constructor
   * methods
      * methods specified in ICommonHashmap interface
6. Initiator
   * Definition : Takes link of the api and extracts the object from it and stores in hashmap
   * Path : ValidationEngine -> code -> src -> Init
   * Attributes
      * form input map
      * api link
      * Attributes specified in ICommonAttributes interface
   * Constructor
      * Takes api link as parameter and stores in attribute 
   * methods
      * methods specified in IInit interface
7. PreProcessor
   * Definition : Validates the form input against the validation rule specified.
   * Path : ValidationEngine -> code -> src -> PreProcess
   * Attributes
      * Attributes specified in ICommonAttributes interface
      * Attributes specified in IPreProcess interface
   * Constructor
   * methods
      * methods specified in IPreProcess interface
8. Processor
   * Definition : Does the logical correlation with the validated data.
   * Path : ValidationEngine -> code -> src -> Process
   * Attributes
   * Constructor
   * methods
9. PostProcessor
   * Definition : Provides the response of the validation process
   * Path : ValidationEngine -> code -> src -> PostProcess
   * Attributes
      * response map
   * Constructor
   * methods
###Examples of use

