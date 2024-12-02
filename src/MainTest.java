
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void mirorString() {
        String check = "hello!!";
        String check2 = "ans";
        assertEquals(Main.mirorString(check) , "!!olleh") ;
        assertEquals(Main.mirorString(check2) , "sna") ;


    }
}