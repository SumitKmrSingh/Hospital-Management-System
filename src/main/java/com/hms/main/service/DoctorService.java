package com.hms.main.service;

import com.hms.main.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);
    public List<Doctor> getAllDoctor(){
        try {
            System.out.println("Into Service Layer");
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while fetching all doctor {}", e.getMessage());
            return null;
        }
    }
    public Doctor getDoctorById(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while fetching doctor with {} : {} ", id, e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while creating doctor {}", e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id){
        try {

        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while deleting doctor with ID {} : {}", id,  e.getMessage());

        }
    }

    public Doctor updateDoctor(Long id, Doctor doctor){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while update doctor {}", e.getMessage());
            return null;
        }
    }
}
