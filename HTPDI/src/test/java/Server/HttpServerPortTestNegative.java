package Server;

import Config.Config;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpServerPortTestNegative {


    @Test
    public void testServerPortNegative() throws IOException {

        HttpServer server212 = new HttpServer(Config.getInstance().getHost(),Config.getInstance().getPort());

        int actual_port = server212.getPort();
        int expected_host = 8000;

        assertEquals(expected_host,actual_port);
        System.out.println("Ports are not equal!");

    }
}
