package code.src.interfaces;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

public interface IInit {
    String apiLinkForFormInput = null;

    public void getApiData() throws IOException, ParseException;
    public HashMap<String, Boolean> isMandatoryDataPresent();
}
