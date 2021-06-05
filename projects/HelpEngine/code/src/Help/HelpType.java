package code.src.Help;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;

public class HelpType {
    public static final Logger logger = LogManager.getLogger( HelpType.class );

    public HelpTypeCode helpTypeCode;

    public static HashMap<String, HelpTypeCode> helpTypeMap = new HashMap<>();

    public  static void isSingleHelpTypeExist(String helpType)
    {
        logger.trace("Method to check whether the specified help type exist in the map");
    }

    public  static void isMultipleHelpTypeExist(HashMap<String, String> helpTypeSet)
    {
        logger.trace("Method to check whether the specified set of help type exist in the map");
    }

    public  static void setSingleHelpTypeData(String helpType, HelpTypeCode helpTypeCode)
    {
        logger.trace("Method to set help type data for specified type in the map");
    }

    public  static void setMultipleHelpTypeData(HashMap<String, HelpTypeCode> helpTypeDataSet)
    {
        logger.trace("Method to set help type data for specified set of types in the map");
    }

    public  static void getSingleHelpTypeData(String helpType)
    {
        logger.trace("Method to get help type data for specified type from the map");
    }

    public  static void getMultipleHelpTypeData(HashMap<String, String> helpTypeSet)
    {
        logger.trace("Method to get help type data for specified set of types from the map");
    }

    public  static void addSingleHelpType(String helpType)
    {
        logger.trace("Method to add new help type to the map");
    }

    public  static void addMultipleHelpType(HashMap<String, String> helpTypeSet)
    {
        logger.trace("Method to add specified set of new help types to the map");
    }

    public  static void deleteSingleHelpType(String helpType)
    {
        logger.trace("Method to delete help type from the map");
    }

    public  static void deleteMultipleHelpType(HashMap<String, String> helpTypeSet)
    {
        logger.trace("Method to delete specified set of help types from the map");
    }

    public  static void updateSingleHelpType(String helpType, HelpTypeCode newHelpTypeCode)
    {
        logger.trace("Method to update help type in the map");
    }

    public  static void updateMultipleHelpType(HashMap<String, HelpTypeCode> helpTypeDataSet)
    {
        logger.trace("Method to update specified set of help types from the map");
    }
}
