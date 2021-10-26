package Client;

import Config.Config;
import Server.HttpServer212;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class GETURITestNegative {

    @Test
    public void testGetRequestNegative() throws IOException {
        GET get = new GET();
        String actual = get.getRequest(Config.getInstance().getURI());

        String expected = "http://localhost:9000/server";
        assertEquals(expected,actual);

    }
}
