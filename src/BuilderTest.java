import static org.junit.Assert.*;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void testBuilder() {
        Appointment a = new AppointmentBuilder()
                .setId("A1")
                .setDate("2026")
                .setStatus("Pending")
                .build();

        assertEquals("A1", a.getId());
    }
}