package com.hms.main.controllers;

import com.hms.main.models.Doctor;
import com.hms.main.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorControllers {
    @GetMapping
    public List<Doctor> getAllDoctor(){
        System.out.println("Fetching the doctors");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Creating doctors");
        return doctor;
    }

    @GetMapping("/{id}")
    public Doctor getPatientById(@PathVariable Long id){
        System.out.println("Fetching doctors with Id : "+id);
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id){

    }
}
