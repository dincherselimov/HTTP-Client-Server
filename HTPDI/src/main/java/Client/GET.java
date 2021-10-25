package Client;

import Config.Config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * This class is used to send GET Request
 */
public class GET {

    public String getRequest(String url1) throws IOException {
        //Set the URI
         URL url = new URL(url1);
        //Open a connection
        HttpURLConnection http = (HttpURLConnection) url.openConnection();

        //Set the request method to GET,POST,HEAD,PUT,DELETE
        http.setRequestMethod(Config.getInstance().getGET());
        http.setRequestProperty("Content-type", "application/xml");

        //Read and print the response
        BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            System.out.println(inputLine);
        }
        in.close();
        return url1;
    }
}
