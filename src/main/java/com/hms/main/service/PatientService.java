package com.hms.main.service;

import com.hms.main.models.Patient;
import com.hms.main.repository.PatientRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    @Autowired
    private PatientRepository patientRepository;

    public Page<Patient> getAllPatient(int page, int size) {
        try {
            System.out.println("Into Service Layer");
            Pageable pageable = PageRequest.of(page, size);
            return patientRepository.findAll(pageable);

        } catch (Exception e) {
            System.out.println("Error message : " + e.getMessage());
            logger.error("An error occurred while fetching all patient {}", e.getMessage());
            return null;
        }
    }

//    public Optional<Patient> getPatientById(Long id) {
//        return patientRepository.findById(id);
//    }

    public Patient getPatientById(Long id) {
        try {
            Optional<Patient> patient = patientRepository.findById(id);
            return patient.orElse(null);
        } catch (Exception e) {
            System.out.println("Error message : " + e.getMessage());
            logger.error("An error occurred while fetching patient with  {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
//            patientRepository.save(patient);
//            return patient;
//            return patientRepository.save(patient);

            // Save first to get auto increment id
            Patient savedPatient = patientRepository.save(patient);

            Long id = savedPatient.getId();

            String year = String.valueOf(java.time.Year.now().getValue());

            String formattedNumber = String.format("%04d", id);

            String patientId = "PAT-" + year + "-" + formattedNumber;

            savedPatient.setPatientId(patientId);

            patientRepository.save(savedPatient);
            return savedPatient;
        } catch (Exception e) {
            System.out.println("Error message : " + e.getMessage());
            logger.error("An error occurred while creating patient {}", e.getMessage());
            return null;
        }
    }

    public boolean deletePatient(Long id) {

        logger.info("Deleting patient with id : {}", id);

        if (patientRepository.existsById(id)) {
            patientRepository.deleteById(id);
            logger.info("Patient deleted successfully");
            return true;
        } else {
            logger.warn("Patient not found with id : {}", id);
            return false;
        }
    }

    public Patient updatePatient(Long id, Patient updatedPatient) {
        try {
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if (existingPatient.isPresent()) {
                Patient p = new Patient();
                p.setName(updatedPatient.getName());
                p.setAge(updatedPatient.getAge());
                p.setGender(updatedPatient.getGender());
                p.setAddress(updatedPatient.getAddress());
                p.setMobileNo(updatedPatient.getMobileNo());

                patientRepository.save(p);
                return updatedPatient;
            } else {
                logger.error("Patient with ID {} not", id);
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error message : " + e.getMessage());
            logger.error("An error occurred while update all patient {}", e.getMessage());
            return null;
        }
    }

//    public Patient updatePatient(Long id, Patient updatedPatient) {
//
//        Patient existing = patientRepository.findById(id)
//                .orElseThrow(() ->
//                        new ResourceNotFoundException("Patient not found with id: " + id));
//
//        existing.setName(updatedPatient.getName());
//        existing.setAge(updatedPatient.getAge());
//        existing.setGender(updatedPatient.getGender());
//        existing.setAddress(updatedPatient.getAddress());
//        existing.setMobileNo(updatedPatient.getMobileNo());
//
//        return patientRepository.save(existing);
//    }

}


