import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        DatabaseConnection d1 = DatabaseConnection.getInstance();
        DatabaseConnection d2 = DatabaseConnection.getInstance();

        assertEquals(d1, d2);
    }
}