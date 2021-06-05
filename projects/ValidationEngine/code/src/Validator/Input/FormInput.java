package Input;

import Interfaces.ICommonHashmap;
import classes.Controller;
import classes.ProcessMap;
import classes.ResultMap;
import classes.SystemErrors;
import code.src.BaseAttributes.system.SystemAttributes;
import converter.JSONToHashmap.JSONToHashmap;
import methods.ReusableMethods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;

public class FormInput implements ICommonHashmap {
    public static final Logger logger = LogManager.getLogger( FormInput.class );
    private SystemAttributes systemAttributes = new SystemAttributes();
    private Controller controller = new Controller();
    private ProcessMap processMap = new ProcessMap();
    private SystemErrors systemErrors = new SystemErrors();
    private ResultMap resultMap = new ResultMap();
    private JSONToHashmap convertJSONToHashmap = new JSONToHashmap();
    private HashMap<String, Object> formInputMap = new HashMap<>();


    public HashMap<String, Object> getMap() {
        return null;
    }

    public void setMap(HashMap<String, Object> map) {

    }

    public Boolean isSingleKeyExist(String key) {
        return formInputMap.keySet().contains(key);
    }

    public HashMap<String, Boolean> isMultipleKeyExist(HashMap<String, String> keySetMap) {
        return ReusableMethods.isMultipleKeyExist(keySetMap,formInputMap);
    }

    public String getSingleKey(String key)
    {
        if (!isSingleKeyExist(key))
            return systemErrors.getSingleKey("-1");
        return formInputMap.get(key).toString();
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
