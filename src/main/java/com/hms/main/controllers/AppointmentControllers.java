package com.hms.main.controllers;

import com.hms.main.models.Appointment;
import com.hms.main.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentControllers {
    @GetMapping
    public List<Appointment> getAllAppointment(){
        System.out.println("Fetching the Appointment");
        return null;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment){
        System.out.println("Creating Appointment");
        return appointment;
    }

    @GetMapping("/{id}")
    public Patient getAppointmentById(@PathVariable Long id){
        System.out.println("Fetching Appointment with Id : "+id);
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable Long id){

    }
}
