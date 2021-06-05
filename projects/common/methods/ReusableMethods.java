package methods;

import classes.SystemErrors;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.HashMap;

public class ReusableMethods {

    private static final Logger logger = LogManager.getLogger( ReusableMethods.class );
    private static HashMap<String, Boolean> isExistResultMap = new HashMap<>();
    private static HashMap<String, Object> getResultMap = new HashMap<>();
    private static SystemErrors systemErrors = new SystemErrors();

    public static HashMap<String, Boolean> isMultipleKeyExist(HashMap<String, String> keysToCheck, HashMap<String, Object> targetMap)
    {
        // Method to check whether the key set specified are present in the map.
        logger.trace("Checking whether key set specified are present in the map...");
        for(String key : keysToCheck.keySet())
        {
            if(!targetMap.keySet().contains(key))
            {
                isExistResultMap.put(key, false);
            }
            isExistResultMap.put(key, true);
        }
        return isExistResultMap;
    }

    public static HashMap<String, Object> getMultipleKey(HashMap<String, String> keysToGet, HashMap<String, String> targetMap)
    {
        // Method to check whether the key set specified are present in the map.
        logger.trace("Checking whether key set specified are present in the map...");
        for(String key : keysToGet.keySet())
        {
           if(!targetMap.keySet().contains(key))
           {
               systemErrors.getSingleKey("-1");
           }
           getResultMap.put(key, targetMap.get(key));
        }
        return getResultMap;
    }

    public static void configureLog4j(String propertyFilePath, String propertyFileName)
    {
        //Specifying log4j properties file.
        String log4jPropertiesFile = propertyFilePath + "/" + propertyFileName;
        //PropertyConfigurator.configure(log4jPropertiesFile);
        BasicConfigurator.configure();
    }

    public static <T> void printHashmapData(HashMap<String, T> hashMap)
    {
        logger.trace("Printing the value of hashmap : [ " + hashMap.getClass().getName() + " ] ");
        for(String key : hashMap.keySet())
        {
            logger.info("Key : [ " + key + " ], Value : [ " + hashMap.get(key) + " ] ");
        }
    }
}
