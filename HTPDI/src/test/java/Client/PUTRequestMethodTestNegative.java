package Client;

import Config.Config;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class PUTRequestMethodTestNegative {

    @Test
    public void testPutRequestMethodNegative() throws IOException {

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        String actual_method =  put.getRequestMethod();
        String exp_method = "GET";

        assertEquals(exp_method,actual_method);
        System.out.println("The required request method is correct");
    }
}
