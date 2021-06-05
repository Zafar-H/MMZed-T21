package code.src.BaseAttributes.system;

import code.src.BaseAttributes.exceptions.KeyNotFoundException;
import code.src.BaseAttributes.interfaces.IAttributes;
import code.src.BaseAttributes.interfaces.IBaseHashMapString;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SystemAttributes implements IAttributes
{
    //Checks if key exists in hashmap or not
    public Boolean isExistsKey(String key) throws KeyNotFoundException
    {
        if(baseHash.containsKey(key))
        {
            return true;
        }
        return  false;
    }

    //get the key and value for a particular key
    public String getKeyValue(String key) throws KeyNotFoundException
    {
        Boolean  isPresent;
        try {
            isPresent = isExistsKey(key);
            if(!isPresent)
            {
                KeyNotFoundException.logger.error("Key is not found!!!");
                System.exit(100);
            }
        }
        catch (KeyNotFoundException e)
        {
            e.printStackTrace();
        }
        return (String) baseHash.get(key);
    }

    //Gets all the keys in the hashmap
    public String[] getKeys()
    {
        String[] keys = new String[baseHash.keySet().size()];

        return keys;
    }

    //Adds new Key Value pair
    public void setKeyValue(String key,String value)
    {
        try {
            if(!isExistsKey(key))
            {
                baseHash.put(key,value);
            }
        }
        catch (KeyNotFoundException e)
        {
            e.printStackTrace();
        }
        baseHash.put(key,value);
    }

    public void deleteKey(String key)
    {
        try {
            if(isExistsKey(key))
            {
                //  System.exit(100);
            }
        } catch (KeyNotFoundException e) {
            e.printStackTrace();
        }
        baseHash.remove(key);
    }

    public JSONObject getJSON(IBaseHashMapString object)  {
        Gson gson = new Gson();
        String jsonString = gson.toJson(object);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            jsonObject = (JSONObject) parser.parse(jsonString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    public SystemAttributes()
    {
        this.setKeyValue("__STATE__","INPUT");
        this.setKeyValue("__MODE__","TEST");
    }

}
