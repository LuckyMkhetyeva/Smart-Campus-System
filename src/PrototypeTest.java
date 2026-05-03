import static org.junit.Assert.*;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void testPrototype() throws Exception {
        AppointmentPrototype original = new AppointmentPrototype("A1");
        AppointmentPrototype clone = (AppointmentPrototype) original.clone();

        assertEquals(original.getId(), clone.getId());
    }
}