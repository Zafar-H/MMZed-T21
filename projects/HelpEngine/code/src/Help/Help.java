package code.src.Help;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;

public class Help {

    public static final Logger logger = LogManager.getLogger( Help.class );

    public HelpType helpType;

    public static HashMap<String, HelpType> helpMap = new HashMap<>();

    public Help(){}

    public static void isSingleHelpCodeExist(String helpCode)
    {
        logger.trace("Method to check whether help code exists in help map - under construction");
        // TODO -
        //  Check whether the specified help is present in the help map
        //  return boolean value accordingly
    }

    public static void isMultipleHelpCodeExist(HashMap<String, String> helpCodeSet)
    {
        logger.trace("Method to check whether help code set exists in help map - under construction");
        // TODO -
        //  Check whether the specified help code set is present in the help map
        //  return map of boolean values accordingly
    }

    public static void setSingleHelpCodeType (String helpCode, HelpType helpType)
    {
        logger.trace("Method to set help code type in help map - under construction");
        // TODO -
        //  Check whether the specified help is present in the help map
        //  if present, set the help type else throw code not found help
    }

    public static void setMultipleHelpCodeType ()
    {
        logger.trace("Method to set an help types in help map - under construction");
        // TODO -
        //  Check whether the specified help code set is present in the help map
        //  if present set the help code types else throw key not found help
        //  record the set result of help code types in map
    }

    public static void getSingleHelpCode(String helpCode)
    {
        logger.trace("Method to get an help code from help map - under construction");
        // TODO -
        //  Check whether the specified help code is present in the help map
        //  if present return the help code else throw key not found help
    }

    public static void getMultipleHelpCode(HashMap<String, String> helpCodeSet)
    {
        logger.trace("Method to get an help code set from help map - under construction");
        // TODO -
        //  Check whether the specified help code set is present in the help map
        //  if present return the help code set as a map else throw key not found help
        //  record the get result of help code set in map
    }

    public static void addSingleHelpCode(String helpCode)
    {
        logger.trace("Method to add help code to the help map - under construction");
        // TODO -
        //  Check whether the specified help code is present in the help map
        //  if not present add the new help code to the help map else throw key already exist help
    }

    public static void addMultipleHelpCode(HashMap<String, String> helpCodeSet)
    {
        logger.trace("Method to add help code set to the help map - under construction");
        // TODO -
        //  Check whether the help codes specified in help code set is present in the help map
        //  if not present add the new help code to the help map else throw key already exist help
        //  record the add result in a map
    }

    public static void deleteSingleHelpCode(String helpCode)
    {
        logger.trace("Method to delete help code from the help map - under construction");
        // TODO -
        //  Check whether the help code specified is present in the help map
        //  if present delete the help code from the help map else throw key not found help
    }

    public static void deleteMultipleHelpCode(HashMap<String, String> helpCodeSet)
    {
        logger.trace("Method to delete help code set from the help map - under construction");
        // TODO -
        //  Check whether the help codes specified in help code set is present in the help map
        //  if present delete the help codes from the help map else throw key not found help
        //  record the delete result in a map
    }

    public static void updateSingleHelpCode(String helpCode)
    {
        logger.trace("Method to update help code in the help map - under construction");
        // TODO -
        //  Check whether the help code specified is present in the help map
        //  if present update the help code in the help map else throw key not found help
    }

    public static void updateMultipleHelpCode(HashMap<String, String> helpCodeSet)
    {
        logger.trace("Method to update help code set in the help map - under construction");
        // TODO -
        //  Check whether the help codes specified in help code set is present in the help map
        //  if present update the help codes in the help map else throw key not found help
        //  record the update result in a map
    }

}