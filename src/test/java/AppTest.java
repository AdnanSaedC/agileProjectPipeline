import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.App;

public class AppTest{
    @Test
    public void AppTest(){
        assertEquals(20,App.computePower(4, 5),0.001);
    }
}