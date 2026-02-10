package com.hms.main.controllers;

import com.hms.main.models.Patient;
import com.hms.main.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientControllers {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public Page<Patient> getAllPatients(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "2") int size) {
        System.out.println("Fetching the patients");
        return patientService.getAllPatient(page, size);
    }

    @PostMapping("/addPatient")
    public ResponseEntity<?> createPatient(@RequestBody Patient patient) {

        try {
            System.out.println("Creating Patient");

            Patient savedPatient = patientService.createPatient(patient);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(savedPatient);

        } catch (Exception e) {

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Patient creation not success: " + e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPatientById(@PathVariable Long id) {

        System.out.println("Fetching Patient with Id : " + id);

        Patient patient = patientService.getPatientById(id);

        if (patient != null) {
            return ResponseEntity.ok(patient);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Patient not found with id: " + id);
        }
    }


    @DeleteMapping("/removePatient/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable Long id) {

        boolean isDeleted = patientService.deletePatient(id);

        if (isDeleted) {
            return ResponseEntity.ok("Patient removed successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Patient not found with id: " + id);
        }
    }

//    @PutMapping("/{id}")
//    public void updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
//        patientService.updatePatient(id, patient);
//    }

    @PutMapping("updatePatient/{id}")
    public ResponseEntity<?> updatePatient(@PathVariable Long id,
                                           @RequestBody Patient patient) {

        Patient updatedPatient = patientService.updatePatient(id, patient);

        if (updatedPatient != null) {
            return ResponseEntity.ok(updatedPatient);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Patient not found with id: " + id + ". Update failed.");
    }

}
