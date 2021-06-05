package Init;

import Input.FormInput;
import classes.Controller;
import classes.ProcessMap;
import classes.ResultMap;
import classes.SystemErrors;
import code.src.BaseAttributes.system.SystemAttributes;
import code.src.interfaces.IInit;
import converter.JSONToHashmap.JSONToHashmap;
import methods.ReusableMethods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class Initiator implements IInit {
    private static final Logger logger = LogManager.getLogger( Initiator.class );
    private SystemAttributes systemAttributes = new SystemAttributes();
    private Controller controller = new Controller();
    private ProcessMap processMap = new ProcessMap();
    private SystemErrors systemErrors = new SystemErrors();
    private ResultMap resultMap = new ResultMap();
    private FormInput formInput = new FormInput();
    private JSONToHashmap hashmapOfObject = new JSONToHashmap();
    private static String _apiLinkForFormInput;
    private static URL apiUrl;
    private static HttpURLConnection apiConnection;
    private String requestType = "GET";
    private Integer apiResponseCode;
    private Scanner scanner;
    private String apiData = "";
    private JSONParser jsonDataParser = new JSONParser();
    private JSONObject apiDataObject = new JSONObject();
    private HashMap<String, Object> hashmapOfJSONObject = new HashMap<>();
    private HashMap<String, Boolean> mandatoryDataCheckResult = new HashMap<>();

    public Initiator(String apiLinkForFormInput)
    {
        set_apiLinkForFormInput(apiLinkForFormInput);
    }

    public static String get_apiLinkForFormInput()
    {
        return _apiLinkForFormInput;
    }

    public static void set_apiLinkForFormInput(String _apiLinkForFormInput) {
        Initiator._apiLinkForFormInput = _apiLinkForFormInput;
    }

    public void getApiData() throws IOException, ParseException {
        logger.trace("Getting API data from the end point...");
        logger.trace("Initializing the api url...");
        apiUrl = new URL(get_apiLinkForFormInput());
        logger.info("The specified url is : [ " + apiUrl + " ] ");

        logger.trace("Initiating the http url connection...");
        apiConnection = (HttpURLConnection) apiUrl.openConnection();
        logger.trace("Http url connection initiated.");

        logger.trace("Setting the request type...");
        apiConnection.setRequestMethod(requestType);
        logger.info("The request type is : [ " + requestType + " ] ");

        logger.trace("Connecting to the API...");
        apiConnection.connect();
        logger.trace("API connection established.");

        //Getting the response code
        logger.trace("Getting the response code...");
        apiResponseCode = apiConnection.getResponseCode();
        logger.info("The response code is : [ " + apiResponseCode + " ] ");

        if (apiResponseCode != 200) {
            throw new RuntimeException("APIResponseCode: " + apiResponseCode);
        }
        else
        {
            logger.trace("Initializing the scanner...");
            scanner = new Scanner(apiUrl.openStream());
            logger.trace("scanner initialized...");

            logger.trace("Writing all the JSON data into a string...");
            while (scanner.hasNext()) {
                apiData += scanner.nextLine();
            }
            logger.trace("All the JSON data is written into a string successfully.");

            logger.trace("Closing the scanner...");
            scanner.close();
            logger.trace("Scanner closed...");

            logger.trace("Parsing the string into a json object...");
            apiDataObject = (JSONObject) jsonDataParser.parse(apiData);
            logger.info("Json object obtained after parsing the string is : \n " + apiDataObject);

            logger.trace("Converting JSON object data to hashmap format...");
            hashmapOfJSONObject = hashmapOfObject.convertJSONToHashmap(apiDataObject);
            logger.trace("JSON object data is Converted to hashmap.");

            logger.trace("Storing input data from API in form input hashmap...");
            formInput.setMap(hashmapOfJSONObject);
            logger.trace("Input data from API is stored in form input hashmap.");
        }
    }

    public HashMap<String, Boolean> isMandatoryDataPresent() {
        logger.trace("Method to check whether expected mandatory data is present in the input data");
        if(!formInput.getMap().keySet().contains("__FORM_NAME__"))
        {
            logger.error(systemErrors.getSingleKey("-3"));
            mandatoryDataCheckResult.put("isFormNameKeyExist", false);
        }
        mandatoryDataCheckResult.put("isFormNameKeyExist", true);
        if(formInput.getSingleKey("__FORM_NAME__").isEmpty())
        {
            logger.error(systemErrors.getSingleKey("-4"));
            mandatoryDataCheckResult.put("isFormNameExist", false);
        }
        mandatoryDataCheckResult.put("isFormNameExist", true);

        return  mandatoryDataCheckResult;
    }

}
