package Client;

import Config.Config;
import Server.HttpServer212;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class PUTRequestMethodTest {

    @Test
    public void testPutRequestMethodPositive() throws IOException {
        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(), Config.getInstance().getPort());
        server212.serverStart();

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        String actual_method =  put.getRequestMethod();
        String exp_method = "PUT";

        assertEquals(exp_method,actual_method);
        System.out.println("The required request method is correct");


        server212.stop();
    }

    @Test
    public void testPutRequestMethodNegative() throws IOException {
        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(), Config.getInstance().getPort());
        server212.serverStart();

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        String actual_method =  put.getRequestMethod();
        String exp_method = "GET";

        assertEquals(exp_method,actual_method);
        System.out.println("The required request method is correct");

        server212.stop();
    }
}
