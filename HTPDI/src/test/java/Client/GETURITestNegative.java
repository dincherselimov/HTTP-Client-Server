package Client;

import Config.Config;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Negative test for URI address
 */
public class GETURITestNegative {

    @Test
    public void testGetRequestNegative() throws IOException {

        GET get = new GET();
        String actual = get.getRequest(Config.getInstance().getURI());

        String expected = "http://localhost:9000/server";

        assertEquals(expected,actual);

    }
}
