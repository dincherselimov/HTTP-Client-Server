package Client;

import Config.Config;

import java.io.IOException;

/**
 * This class is used to run PUT or GET requests
 */
public class RequestRunner {
    public static void main(String[] args) throws IOException {

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        put.putRequest(Config.getInstance().getURI());

        GET get = new GET();
        get.getRequest(Config.getInstance().getURI());
    }
}
