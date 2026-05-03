interface AppointmentFactory {
    Appointment createAppointment();
}

class StudentAppointmentFactory implements AppointmentFactory {
    public Appointment createAppointment() {
        return new Appointment("A1", "2026-01-01", "Pending");
    }
}