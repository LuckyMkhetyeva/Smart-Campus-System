@Test
public void testApproveAppointment() {

    InMemoryAppointmentRepository repository =
        new InMemoryAppointmentRepository();

    Appointment appointment =
        new Appointment("A1","2026-06-01","Pending");

    repository.save(appointment);

    AppointmentService service =
        new AppointmentService(repository);

    Appointment updated =
        service.approveAppointment("A1");

    assertEquals("Approved", updated.getStatus());
}