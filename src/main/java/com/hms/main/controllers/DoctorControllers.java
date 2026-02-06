package com.hms.main.controllers;

import com.hms.main.models.Doctor;
import com.hms.main.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorControllers {
    @GetMapping
    public List<Doctor> getAllPatients(){
        System.out.println("Fetching the doctors");
        return null;
    }

    @PostMapping
    public Doctor createPatient(@RequestBody Doctor doctor){
        System.out.println("Creating doctors");
        return doctor;
    }

    @GetMapping("/{id}")
    public Doctor getPatientById(@PathVariable Long id){
        System.out.println("Fetching doctors with Id : "+id);
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable Long id){

    }
}
