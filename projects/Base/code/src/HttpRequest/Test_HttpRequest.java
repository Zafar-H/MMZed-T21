package code.src.HttpRequest;

import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;

public class Test_HttpRequest {

    public static void main(String[] args) throws IOException {
        String log4jPropertiesFile = "../../../conf/log4j/log4j_HttpRequest.properties";
        PropertyConfigurator.configure(log4jPropertiesFile);
        HttpRequest.POSTRequest();
    }
}
