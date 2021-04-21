package code.src.classes.system;

import code.src.Exceptions.KeyNotFoundException;
import code.src.interfaces.IAttributes;
import code.src.interfaces.IBaseHashMapString;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Set;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SystemAttributes implements IAttributes
{
    //public static final Logger logger = LogManager.getLogger(SystemAttributes.class);
    public Boolean isExists(String key) throws KeyNotFoundException {
        if(baseHash.containsKey(key))
        {
            return true;
        }
        else
            throw new KeyNotFoundException("Key doesn't exist");
    }

    public String getValue(String key){
        Boolean  isPresent;
        try {
            isPresent = isExists(key);

            if(!isPresent)
            {
                // logger.error("Key doesn't exist ");
                System.exit(100);
            }
        } catch (KeyNotFoundException e) {
            e.printStackTrace();
        }
       return (String) baseHash.get(key);
    }


    public String[] getKeys()
    {
        String[] keys = new String[baseHash.keySet().size()];

        return keys;
    }

    public void set(String value)
    {

    }

    public void set(String key,String value)
    {
        try {
            if(!isExists(key))
            {
                System.exit(100);
            }
        } catch (KeyNotFoundException e) {
            e.printStackTrace();
        }
        baseHash.put(key,value);
    }

    public void delete(String key)
    {
        try {
            if(isExists(key))
            {
                System.exit(100);
            }
        } catch (KeyNotFoundException e) {
            e.printStackTrace();
        }
        baseHash.remove(key);
    }

    public JSONObject getJSON(IBaseHashMapString object) throws ParseException {
        Gson gson = new Gson();
        String jsonString = gson.toJson(object);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(jsonString);

        return jsonObject;
    }

}
