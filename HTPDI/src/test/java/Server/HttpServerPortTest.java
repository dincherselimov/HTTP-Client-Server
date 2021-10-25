package Server;

import Config.Config;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpServerPortTest {

    @Test
    public void testServerPortPositive() throws IOException {

        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(),Config.getInstance().getPort());
        server212.serverStart();

        int actual_port = server212.getPort();
        int expected_host = 9000;

        assertEquals(expected_host,actual_port);
        System.out.println("Ports are equal!");
        server212.stop();

    }

    @Test
    public void testServerPortNegative() throws IOException {

        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(),Config.getInstance().getPort());
        server212.serverStart();

        int actual_port = server212.getPort();
        int expected_host = 8000;

        assertEquals(expected_host,actual_port);
        System.out.println("Ports are not equal!");

    }
}
