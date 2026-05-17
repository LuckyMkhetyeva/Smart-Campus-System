package com.smartcampus.api;

import com.smartcampus.model.Appointment;
import com.smartcampus.services.AppointmentService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(
            AppointmentService service) {

        this.service = service;
    }

    @GetMapping
    public List<Appointment> getAllAppointments() {
        return service.getAllAppointments();
    }

    @PostMapping
    public String createAppointment(
            @RequestBody Appointment appointment) {

        service.createAppointment(appointment);

        return "Appointment created successfully";
    }

    @PostMapping("/{id}/approve")
    public Appointment approveAppointment(
            @PathVariable String id) {

        return service.approveAppointment(id);
    }
}