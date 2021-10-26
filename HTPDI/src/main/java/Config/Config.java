package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class uses Singleton pattern for accessing values of keys in the config.properties file
 */
public class Config {
    private final String URI;
    private final String GET;
    private final String PUT;
    private final String content_type;
    private static Config instance = null;
    private static String send_file;
    private final int port;
    private final String host;

    FileInputStream FIS;

    {
        try {
            FIS = new FileInputStream("D:\\Manik\\HTPDI\\src\\main\\java\\Config\\config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    Properties properties;

    public Config() throws IOException {
        properties = new Properties();
        properties.load(FIS);
        FIS.close();

         URI =  properties.getProperty("URI");
         GET = properties.getProperty("GET_METHOD");
         PUT = properties.getProperty("PUT_METHOD");
         content_type = properties.getProperty("content_type");
         send_file = properties.getProperty("send_file");
         port = Integer.parseInt(properties.getProperty("port"));
         host = properties.getProperty("host");
    }
    public static Config getInstance() throws IOException {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }


    public String getURI() {
        return URI;
    }
    public String getGET() {
        return GET;
    }
    public String getContent_type() {
        return content_type;
    }
    public String getPUT() {
        return PUT;
    }
    public String getSend_file(){return send_file;}
    public int getPort() {
        return port;
    }
    public String getHost() {
        return host;
    }
}
