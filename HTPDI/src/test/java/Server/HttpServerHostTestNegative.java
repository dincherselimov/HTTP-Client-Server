package Server;

import Config.Config;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HttpServerHostTestNegative {


    @Test
   public void testServerHostNegative() throws IOException {

        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(),Config.getInstance().getPort());

        String actual_host = server212.getHost();
        String expected_host = "WROGN HOST";

        assertEquals(expected_host,actual_host);
        System.out.println("Hosts are not equal!");

    }
}