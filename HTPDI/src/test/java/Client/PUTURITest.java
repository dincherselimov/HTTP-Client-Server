package Client;

import Config.Config;
import Server.HttpServer212;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class PUTURITest {

    @Test
    public void testPutRequestPositive() throws IOException {
        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(), Config.getInstance().getPort());
        server212.serverStart();

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());

        String actual_uri = put.putRequest("http://localhost:9000/st");
        String exp_uri = "http://localhost:9000/st";

        assertEquals(exp_uri,actual_uri);
        System.out.println("The URI's are correct");

        server212.stop();
    }

    @Test
   public void testPutRequestNegative() throws IOException {
        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(), Config.getInstance().getPort());
        server212.serverStart();

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());

        String actual_uri = put.putRequest("http://localhost:9000/st");
        String exp_uri = "http://localhost:9000/server";

        System.out.println("The URI's are not correct");
        assertEquals(exp_uri,actual_uri);
        server212.stop();
    }
}