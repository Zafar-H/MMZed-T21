package code.src.interfaces;

import code.src.Exceptions.KeyNotFoundException;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;

public interface IBaseHashMapString {
    static final HashMap<String, String> baseHash = new HashMap<>();

    String getValue(String key);
    String[] getKeys();
    void set(String value);
    void set(String key,String value) throws KeyNotFoundException;
    JSONObject getJSON(IBaseHashMapString object) throws ParseException;

    void delete(String key);

    Boolean isExists(String key) throws KeyNotFoundException;

}
