package FormValidator;

import Hashmap.CommonHashmap;
import JSONFileReader.JSONFileReader;
import converter.JSONToHashmap.JSONToHashmap;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Validator extends CommonHashmap
{
    private JSONToHashmap convertJsonToHashmap = new JSONToHashmap();
    private String patternMapJson = "/Users/zafarabba/MMZed-T21/projects/ValidationEngine/data/json/SK_MMZed_Validator.json";
    private String inputString;
    private List<String> validationRules;
    private HashMap<String, Boolean> successMap = new HashMap<>();
    private HashMap<String, Boolean> validatorResultMap = new HashMap<>();


    public Validator() throws IOException, ParseException {
        super.hashmapName = "PatternMap";
        setMap(convertJsonToHashmap.convertJSONToHashmap(JSONFileReader.readJsonFile(patternMapJson)));
    }


    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public List<String> getValidationRules() {
        return validationRules;
    }

    public void setValidationRules(List<String> validationRule) {
        this.validationRules = validationRule;
    }

    public HashMap<String, Boolean> validate(HashMap<String, Object> validatorHash)
    {
        logger.trace("Validate the input string for given rule specified...");
        setInputString(validatorHash.get("inputString").toString());
        setValidationRules((List<String>) validatorHash.get("rules"));
        validatorResultMap = validateAgainstThePattern();
        return validatorResultMap;
    }

    public HashMap<String, Boolean> validateAgainstThePattern()
    {
        logger.trace("Validating the string against the pattern specified for the rule...");
        for(String rule : getValidationRules())
        {
            if(!inputString.matches(getSingleKey(rule).toString()))
            {
                successMap.put(rule, false);
            }
            else
            {
                successMap.put(rule, true);
            }
        }
        return successMap;
    }
}
