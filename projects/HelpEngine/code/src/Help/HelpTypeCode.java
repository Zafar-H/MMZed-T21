package code.src.Help;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;

public class HelpTypeCode {
    public static final Logger logger = LogManager.getLogger( HelpTypeCode.class );

    public HelpMessage helpMessage;

    public static HashMap<String, HelpMessage> helpTypeCodeMap = new HashMap<>();

    public static void isSingleHelpTypeCodeExist(String helpTypeCode)
    {
        logger.trace("Method to check whether the specified help type code exist");
        // TODO -
        //  check whether the specified help type code exist
        //  return the boolean value accordingly
    }

    public static void isMultipleHelpTypeCodeExist(HashMap<String, String> helpTypeCodeSet)
    {
        logger.trace("Method to check whether the help type code in specified map exists in help type code map");
        // TODO -
        //  check whether the specified help type code set exist
        //  return the boolean value accordingly
        //  record the result in a map
    }

    public static void setSingleHelpTypeCodeData(String helpTypeCode, HelpMessage helpTypeCodeData)
    {
        logger.trace("Method to set data to specified help type code");
        // TODO -
        //  check whether the specified help type code exist
        //  if not present, throw code not found help
        //  if present, check whether the codes data is null
        //  if null set the specified data else give data already set message.

    }

    public static void setMultipleHelpTypeCodeData(HashMap<String, HelpMessage> helpTypeCodeSet)
    {
        logger.trace("Method to set data to specified help type code set");
        // TODO -
        //  check whether the help type code set specified exist
        //  if not present, throw code not found help
        //  if present, check whether the codes data is null
        //  if null set the specified data else give data already set message.
        //  record the result in a map.
    }

    public static void getSingleHelpTypeCode(String helpTypeCode)
    {
        logger.trace("Method to get data of specified help type code");
        // TODO -
        //  check whether the specified help type code exist
        //  if present, return the data of that code else throw code not found help
    }

    public static void getMultipleHelpTypeCode(HashMap<String, String> helpTypeCodeSet)
    {
        logger.trace("Method to get data of specified help type code set");
        // TODO -
        //  check whether the help type code set specified exist
        //  if present, return the data of that code set else throw code not found help
        //  record the result in a map
    }

    public static void addSingleHelpTypeCode(String helpTypeCode)
    {
        logger.trace("Method to add help type code to map");
        // TODO -
        //  check whether the specified help type code exist
        //  if not present, add the help type code to map else throw code already exist help
    }

    public static void addMultipleHelpTypeCode(HashMap<String, String> helpTypeCodeSet)
    {
        logger.trace("Method to add help type code set to map");
        // TODO -
        //  check whether the help type code set specified exist in the map
        //  if not present, add the help type code set to map else throw code already exist help
        //  record the result in a map
    }

    public static void deleteSingleHelpTypeCode(String helpTypeCode)
    {
        logger.trace("Method to delete help type code from map");
        // TODO -
        //  check whether the specified help type code exist
        //  if present, delete the help type code from map else throw code not found help
    }

    public static void deleteMultipleHelpTypeCode(HashMap<String, String> helpTypeCodeSet)
    {
        logger.trace("Method to delete help type code set from map");
        // TODO -
        //  check whether the help type code set specified exist in the map
        //  if present, delete the help type code set from map else throw code not found help
        //  record the result in a map
    }

    public static void updateSingleHelpTypeCode(String helpTypeCode, HelpMessage newHelpTypeCodeData)
    {
        logger.trace("Method to update help type code in the map");
        // TODO -
        //  check whether the specified help type code exist
        //  if present, update the help type code in the map else throw code not found help
    }

    public static void updateMultipleHelpTypeCode(HashMap<String, HelpMessage> helpTypeCodeDataSet)
    {
        logger.trace("Method to update help type code set from map");
        // TODO -
        //  check whether the help type code set specified exist in the map
        //  if present, update the help type code set from map else throw code not found help
        //  record the result in a map
    }
}
