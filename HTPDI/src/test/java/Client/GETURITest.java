package Client;

import Config.Config;
import Server.HttpServer212;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class GETURITest {

    @Test
   public void testGetRequestPositive() throws IOException {
        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(), Config.getInstance().getPort());
        server212.serverStart();

            GET get = new GET();
            String actual = get.getRequest(Config.getInstance().getURI());

            String expected = "http://localhost:9000/st";
            assertEquals(expected,actual);

            server212.stop();
        }

    @Test
    public void testGetRequestNegative() throws IOException {
        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(), Config.getInstance().getPort());
        server212.serverStart();

        GET get = new GET();
        String actual = get.getRequest(Config.getInstance().getURI());

        String expected = "http://localhost:9000/server";
        assertEquals(expected,actual);

        server212.stop();
    }
}
