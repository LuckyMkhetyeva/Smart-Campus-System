import java.util.*;

public class DatabaseStudentRepository implements StudentRepository {

    @Override
    public void save(Student student) {
        System.out.println("Saving student to database...");
    }

    @Override
    public Optional<Student> findById(String id) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>();
    }

    @Override
    public void delete(String id) {
        System.out.println("Deleting from database...");
    }
}