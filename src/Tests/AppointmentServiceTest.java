package com.smartcampus.services;

import com.smartcampus.model.Appointment;
import com.smartcampus.repositories.inmemory
        .InMemoryAppointmentRepository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentServiceTest {

    @Test
    public void testApproveAppointment() {

        InMemoryAppointmentRepository repository =
                new InMemoryAppointmentRepository();

        Appointment appointment =
                new Appointment(
                        "A1",
                        "2026-06-01",
                        "Pending");

        repository.save(appointment);

        AppointmentService service =
                new AppointmentService(repository);

        Appointment updated =
                service.approveAppointment("A1");

        assertEquals(
                "Approved",
                updated.getStatus());
    }
}