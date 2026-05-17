package com.smartcampus.services;

import com.smartcampus.model.Appointment;
import com.smartcampus.repositories.AppointmentRepository;

import java.util.List;

public class AppointmentService {

    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public void createAppointment(Appointment appointment) {

        if(appointment.getStatus().equalsIgnoreCase("Approved")) {
            throw new IllegalArgumentException("New appointment cannot already be approved");
        }

        repository.save(appointment);
    }

    public Appointment approveAppointment(String id) {

        Appointment appointment = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));

        appointment.approve();

        repository.save(appointment);

        return appointment;
    }

    public List<Appointment> getAllAppointments() {
        return repository.findAll();
    }
}