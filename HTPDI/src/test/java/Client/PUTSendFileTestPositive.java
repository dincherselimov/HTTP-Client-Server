package Client;

import Config.Config;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class PUTSendFileTestPositive {


    @Test
    public void testPutSendFilePositive() throws IOException {

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        String actual_method =  put.getSend_file();
        String exp_method = "D:\\Manik\\HTPDI\\src\\main\\java\\files\\test1.xml";

        assertEquals(exp_method,actual_method);
        System.out.println("\n" + "The file paths are equal" + "\n");

    }
}
