package code.src.HttpRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class HttpRequest {

    public static final Logger logger = LogManager.getLogger( HttpRequest.class );

    public static void MyGETRequest() throws IOException {
        URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/1");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
        int responseCode = conection.getResponseCode();


        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            logger.info("JSON String Result " + response.toString());
            //GetAndPost.POSTRequest(response.toString());
        } else {
            logger.error("GET NOT WORKED");
        }

    }

    public static void POSTRequest() throws IOException {

        final String POST_PARAMS = "{\n" + "\"userId\": 101,\r\n" +
                "    \"id\": 101,\r\n" +
                "    \"title\": \"Test Title\",\r\n" +
                "    \"val\": \"tt Title\",\r\n" +
                "    \"body\": \"Test Body\"" + "\n}";
        logger.info(POST_PARAMS);
        URL obj = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");
        postConnection.setRequestProperty("userId", "a1bcdefgh");
        postConnection.setRequestProperty("Content-Type", "application/json");


        postConnection.setDoOutput(true);
        OutputStream os = postConnection.getOutputStream();
        os.write(POST_PARAMS.getBytes());
        os.flush();
        os.close();


        int responseCode = postConnection.getResponseCode();
        logger.info("POST Response Code :  " + responseCode);
        logger.info("POST Response Message : " + postConnection.getResponseMessage());

        if (responseCode == HttpURLConnection.HTTP_CREATED) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    postConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();

            // print result
            logger.info(response.toString());
        } else {
            logger.error("POST NOT WORKED");
        }
    }
}
