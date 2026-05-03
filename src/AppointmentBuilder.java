public class AppointmentBuilder {
    private String id;
    private String date;
    private String status;

    public AppointmentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public AppointmentBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public AppointmentBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public Appointment build() {
        if (id == null) throw new IllegalStateException("ID required");
        return new Appointment(id, date, status);
    }
}