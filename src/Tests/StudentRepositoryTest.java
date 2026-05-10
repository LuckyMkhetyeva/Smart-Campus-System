import org.junit.Test;
import static org.junit.Assert.*;

public class StudentRepositoryTest {

    @Test
    public void testSaveStudent() {

        StudentRepository repository =
                new InMemoryStudentRepository();

        Student student =
                new Student("S1", "Lucky", "lucky@mail.com");

        repository.save(student);

        assertTrue(repository.findById("S1").isPresent());
    }

    @Test
    public void testDeleteStudent() {

        StudentRepository repository =
                new InMemoryStudentRepository();

        Student student =
                new Student("S1", "Lucky", "mail");

        repository.save(student);

        repository.delete("S1");

        assertFalse(repository.findById("S1").isPresent());
    }
}