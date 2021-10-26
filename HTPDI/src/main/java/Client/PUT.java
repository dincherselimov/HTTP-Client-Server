package Client;

import Config.Config;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 * This class is used to send PUT Request
 */
public class PUT {

    private String requestMethod;
    private String send_file;

    /**
     * Create a constructor with parameters
     * @param requestMethod
     * @param send_file
     */
    public PUT(String  requestMethod,String send_file) {
        this.requestMethod = requestMethod;
        this.send_file = send_file;
    }

    /**
     * This method is used to handle the incoming put request
     * @param url1
     * @return
     * @throws IOException
     */
    public String putRequest(String url1) throws IOException {

        //Set the URI
        URL url = new URL(url1);

        //Open a connection
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        //Set request method to PUT,POST,GET,HEAD,DELETE
        requestMethod = Config.getInstance().getPUT();
        connection.setRequestMethod(requestMethod);
        connection.setDoOutput(true);

        //Set request property content-type(as we choose what type we will use)
        connection.setRequestProperty("Content-Type", Config.getInstance().getContent_type());
        connection.setRequestProperty("Accept", Config.getInstance().getContent_type());

        OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());

        //Read the content of file and write it to the outputStream
        send_file = Config.getInstance().getSend_file();
        FileInputStream fis = new FileInputStream(send_file);

        // reads a byte at a time, if it reached end of the file, returns -1
        int content;
        while ((content = fis.read()) != -1) {
            osw.write(content);
            osw.flush();
        }

        //close the connection
        osw.close();
        System.err.println(connection.getResponseCode());
        return url1;
    }

    public String getRequestMethod() {
        return requestMethod;
    }
    public String getSend_file(){
        return this.send_file;
    }
}