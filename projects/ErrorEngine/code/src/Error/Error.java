import classes.Controller;
import classes.ProcessMap;
import classes.ResultMap;
import classes.SystemErrors;
import code.src.BaseAttributes.system.SystemAttributes;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import Interfaces.ICommonHashmap;

import java.util.HashMap;

public class Error implements ICommonHashmap{

    private static final Logger logger = LogManager.getLogger( Error.class );
    private SystemAttributes systemAttributes = new SystemAttributes();
    private Controller controller = new Controller();
    private ProcessMap processMap = new ProcessMap();
    private SystemErrors systemErrors = new SystemErrors();
    private ResultMap resultMap = new ResultMap();
    private HashMap<String, String> errorMap = new HashMap<>();



    public HashMap<String, String> getMap() {
        return null;
    }


    public void setMap(HashMap<String, String> map) {

    }


    public Boolean isKeyExist(HashMap<String, String> key) {
        return null;
    }


    public HashMap<String, String> getKey(HashMap<String, String> key) {
        return null;
    }


    public void setKey(HashMap<String, String> key) {

    }


    public void setDefaultKey() {

    }


    public void deleteKey(HashMap<String, String> key) {

    }


    public void updateKey(HashMap<String, String> key) {

    }
}