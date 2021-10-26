package Client;

import Config.Config;
import Server.HttpServer212;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PUTRequestMethodTestPositive {

    @Test
    public void testPutRequestMethodPositive() throws IOException {

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        String actual_method =  put.getRequestMethod();
        String exp_method = "PUT";

        assertEquals(exp_method,actual_method);
        System.out.println("The required request method is correct");

    }

}