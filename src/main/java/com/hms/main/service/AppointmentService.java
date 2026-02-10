package com.hms.main.service;

import com.hms.main.models.Appointment;
import com.hms.main.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Appointment> getAllAppointment(){
        try {
            System.out.println("Into Service Layer");
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while fetching all appointment {}", e.getMessage());
            return null;
        }
    }
    public Appointment getAppointmentById(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while fetching appointment with {} : {} ", id, e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while creating appointment {}", e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id){
        try {

        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while deleting appointment with ID {} : {}", id, e.getMessage());
        }
    }

    public Patient updateAppointment(Long id, Appointment appointment){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while update appointment {}", e.getMessage());
            return null;
        }
    }
}
