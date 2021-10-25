package Client;

import Config.Config;
import Server.HttpServer212;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class PUTSendFileTest {

    @Test
    public void testPutSendFilePositive() throws IOException {
        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(), Config.getInstance().getPort());
        server212.serverStart();

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        String actual_method =  put.getSend_file();
        String exp_method = "D:\\Manik\\HTPDI\\src\\main\\java\\files\\test1.xml";

        assertEquals(exp_method,actual_method);
        System.out.println("\n" + "The file paths are equal" + "\n");

        server212.stop();
    }

    @Test
   public void testPutSendFileNegative() throws IOException {
        HttpServer212 server212 = new HttpServer212(Config.getInstance().getHost(), Config.getInstance().getPort());
        server212.serverStart();

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        String actual_method =  put.getSend_file();
        String exp_method = "D:\\Manik\\HTPDI\\src\\main\\java\\files\\test2.xml";

        assertEquals(exp_method,actual_method);
        System.out.println("\n" + "The file paths are not equal" + "\n");

        server212.stop();
    }
}
