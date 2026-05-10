import java.util.*;

public class InMemoryAttendanceRepository implements AttendanceRepository {

    private Map<String, Attendance> storage = new HashMap<>();

    @Override
    public void save(Attendance attendance) {
        storage.put(attendance.getAttendanceId(), attendance);
    }

    @Override
    public Optional<Attendance> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Attendance> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}