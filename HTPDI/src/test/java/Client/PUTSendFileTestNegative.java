package Client;

import Config.Config;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

public class PUTSendFileTestNegative {

    @Test
   public void testPutSendFileNegative() throws IOException {

        PUT put = new PUT(Config.getInstance().getPUT(), Config.getInstance().getSend_file());
        String actual_method =  put.getSend_file();
        String exp_method = "D:\\Manik\\HTPDI\\src\\main\\java\\files\\test2.xml";

        assertEquals(exp_method,actual_method);
        System.out.println("\n" + "The file paths are not equal" + "\n");

    }
}
