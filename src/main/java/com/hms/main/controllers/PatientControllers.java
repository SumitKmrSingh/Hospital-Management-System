package com.hms.main.controllers;

import com.hms.main.models.Patient;
import com.hms.main.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientControllers {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients(){
        System.out.println("Fetching the patients");
        return patientService.getAllPatient();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        System.out.println("Creating Patient");
        return patientService.createPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id){
        System.out.println("Fetching Patient with Id : "+id);
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id){
        patientService.deletePatient(id);
    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable Long id){
        patientService.updatePatient(id);
    }
}
