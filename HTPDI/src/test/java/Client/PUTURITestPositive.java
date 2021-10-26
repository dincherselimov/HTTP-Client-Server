package Client;

import Config.Config;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Positive test for URI address
 */
public class PUTURITestPositive {
    @Test
    public void testPutRequestPositive() throws IOException {

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());

        String actual_uri = put.putRequest("http://localhost:9000/st");
        String exp_uri = "http://localhost:9000/st";

        assertEquals(exp_uri,actual_uri);
        System.out.println("The URI's are correct");

    }
}
