package Server;

import Config.Config;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HttpServerHostTestPositive {

    @Test
    public void testServerHostPositive() throws IOException {

        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(),Config.getInstance().getPort());

        String actual_host = server212.getHost();
        String expected_host = "localhost";

        assertEquals(expected_host,actual_host);
        System.out.println("Hosts are equal!");

    }
}
