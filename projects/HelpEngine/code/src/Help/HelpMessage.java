package code.src.Help;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;

public class HelpMessage {
    public static final Logger logger = LogManager.getLogger( HelpMessage.class );

    public static HashMap<String, String> helpMessageMap = new HashMap<>();

    public HelpMessage()
    {
        logger.trace("Initialize the help message map with default keys and empty value");
        // TODO -
        //  initialize the map with two keys default and custom and value as empty string
    }

    public static void isHelpMessageTypeExist(String helpType)
    {
        logger.trace("Method to check whether the specified help message type exist");
        // TODO -
        //  check whether the specified help message type exist
        //  return the boolean value accordingly
    }

    public static void isHelpMessageTypeSetExist(HashMap<String, String> helpMessageTypeSet)
    {
        logger.trace("Method to check whether the help message type in specified map exists in help message map");
        // TODO -
        //  check whether the specified help message type set exist in help message map
        //  return the boolean value accordingly
        //  record the result in a map
    }

    public static void setSingleHelpMessage(String helpMessageType, String helpMessage)
    {
        logger.trace("Method to set a help message to specified help type");
        // TODO -
        //  check whether the specified help type exist in the help message map
        //  if present, set the specified message to it
    }

    public static void setMultipleHelpMessage(HashMap<String, String> helpMessageSet)
    {
        logger.trace("Method to set a multiple help message to specified help type set");
        // TODO -
        //  check whether the help type in specified map exist in the help message map
        //  if present, set the specified message to it else throw type not found help
        //  record the result in a map
    }

    public static void getSingleHelpMessage(String helpMessageType)
    {
        logger.trace("Method to get an help message from help message map");
        // TODO -
        //  check whether the specified help type exist in the help message map
        //  if present, return the help message accordingly else throw type not found help
    }

    public static void getMultipleHelpMessage(HashMap<String, String> helpMessageTypeSet)
    {
        logger.trace("Method to get an help message set from help message map for specified help message type set");
        // TODO -
        //  check whether the help type in specified set exist in the help message map
        //  if present, return the help message accordingly else throw type not found help
        //  record result in a map
    }

    public static void addSingleHelpMessageType(String helpMessageType)
    {
        logger.trace("Method to add an help message to help message map");
        // TODO -
        //  check whether the specified help type exist in the help message map
        //  if not present, add the help message type else throw type already exist help
    }

    public static void addMultipleHelpMessageType(HashMap<String, String> helpMessageTypeSet)
    {
        logger.trace("Method to add an help message set to help message map for specified help message set");
        // TODO -
        //  check whether the help type in specified set exist in the help message map
        //  if nor present, add the help message type else throw type already exist help
        //  record result in a map
    }

    public static void deleteSingleHelpMessage(String helpMessageType)
    {
        logger.trace("Method to delete an help message from help message map for specified help message type");
        // TODO -
        //  check whether the specified help type exist in the help message map
        //  if present, delete the help message else throw type not found help
    }

    public static void deleteMultipleHelpMessage(HashMap<String, String> helpMessageTypeSet)
    {
        logger.trace("Method to delete an help message set from help message map for specified help message set");
        // TODO -
        //  check whether the help type in specified set exist in the help message map
        //  if present, delete the help message type and messages else throw type not found help
        //  record result in a map
    }

    public static void updateSingleHelpMessage(String helpMessageType, String newHelpMessage)
    {
        logger.trace("Method to update an help message in help message map for specified help message type");
        // TODO -
        //  check whether the specified help type exist in the help message map
        //  if present, update the help message else throw type not found help
    }

    public static void updateMultipleHelpMessage(HashMap<String, String> helpMessageDataSet)
    {
        logger.trace("Method to update an help message set from help message map for specified help message set");
        // TODO -
        //  check whether the help type in specified set exist in the help message map
        //  if present, update the help messages else throw type not found help
        //  record result in a map
    }

}
