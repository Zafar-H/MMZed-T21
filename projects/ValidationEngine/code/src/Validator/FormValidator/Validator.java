package FormValidator;

import Interfaces.ICommonAttributes;
import Interfaces.ICommonHashmap;
import classes.Controller;
import classes.ProcessMap;
import classes.ResultMap;
import classes.SystemErrors;
import code.src.BaseAttributes.system.SystemAttributes;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;

public class Validator implements ICommonHashmap, ICommonAttributes
{
    private static final Logger logger = LogManager.getLogger( Validator.class );
    private SystemAttributes systemAttributes = new SystemAttributes();
    private Controller controller = new Controller();
    private ProcessMap processMap = new ProcessMap();
    private SystemErrors systemErrors = new SystemErrors();
    private ResultMap resultMap = new ResultMap();
    private static HashMap<String, String> patternMap = new HashMap<>();

    public Validator()
    {
        logger.trace("Initializing pattern map with default key-value pair");
        setDefaultKey();
    }

    public void setDefaultKey()
    {
        logger.trace("Adding default keys to pattern map.");
        patternMap.put("isNumeric", "^\\d+$");
        patternMap.put("isAlphabetic", "/^[A-Z]+$/i");
        patternMap.put("isNotEmpty", "/^$|\s+/");
    }

    public HashMap<String, Object> getMap() {
        return null;
    }

    public void setMap(HashMap<String, Object> map) {

    }

    public Boolean isSingleKeyExist(String key) {
        return null;
    }

    public HashMap<String, Boolean> isMultipleKeyExist(HashMap<String, String> keySetMap) {
        return null;
    }

    public String getSingleKey(String key) {
        return null;
    }

    public HashMap<String, Object> getMultipleKey(HashMap<String, String> keySetMap) {
        return null;
    }

    public void setSingleKey(String key, Object value) {

    }

    public void setMultipleKey(HashMap<String, Object> keySetMap) {

    }

    public void deleteSingleKey(String key) {

    }

    public void deleteMultipleKey(HashMap<String, String> keySetMap) {

    }

    public void updateSingleKey(String key, Object value) {

    }

    public void updateMultipleKey(HashMap<String, Object> keySetMap) {

    }
}
