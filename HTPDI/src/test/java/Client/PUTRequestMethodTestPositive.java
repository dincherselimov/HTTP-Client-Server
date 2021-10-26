package Client;

import Config.Config;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

/**
 * Positive Test for testing the request method
 */
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
