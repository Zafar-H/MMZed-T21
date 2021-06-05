package code.src.BaseAttributes.interfaces;

import code.src.BaseAttributes.exceptions.KeyNotFoundException;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.HashMap;

public interface IBaseHashMapString {
    static final HashMap<String, String> baseHash = new HashMap<>();

    String getKeyValue(String key) throws KeyNotFoundException;
    String[] getKeys();
    void setKeyValue(String key,String value) ;
    JSONObject getJSON(IBaseHashMapString object) ;

    void deleteKey(String key);

    Boolean isExistsKey(String key) throws KeyNotFoundException;

}
