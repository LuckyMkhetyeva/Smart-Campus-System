import java.util.*;

public class InMemoryAppointmentRepository implements AppointmentRepository {

    private Map<String, Appointment> storage = new HashMap<>();

    @Override
    public void save(Appointment appointment) {
        storage.put(appointment.getId(), appointment);
    }

    @Override
    public Optional<Appointment> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Appointment> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}