package classes;

import Input.CommonValidation;
import Interfaces.ICommonHashmap;
import code.src.BaseAttributes.system.SystemAttributes;
import methods.ReusableMethods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.HashMap;

public class Controller implements ICommonHashmap {
    private static final Logger logger = LogManager.getLogger( Controller.class );
    private HashMap<String, Object> controllerMap = new HashMap<>();


    public HashMap<String, Object> getMap() {
        return null;
    }

    public void setMap(HashMap<String, Object> map) {

    }

    public Boolean isSingleKeyExist(String key) {
        return controllerMap.keySet().contains(key.toString());
    }

    public HashMap<String, Boolean> isMultipleKeyExist(HashMap<String, String> keySetMap)
    {
        // Method to check whether the key set specified are present in the map.
        return ReusableMethods.isMultipleKeyExist(keySetMap, controllerMap);
    }

    public String getSingleKey(String key) {
        return controllerMap.get(key).toString();
    }

    public HashMap<String, Object> getMultipleKey(HashMap<String, String> keySetMap) {
        return controllerMap;
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
