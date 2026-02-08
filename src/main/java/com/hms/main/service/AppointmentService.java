package com.hms.main.service;

import com.hms.main.models.Appointment;
import com.hms.main.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    public Appointment getAppointmentById(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public List<Appointment> getAllAppointment(){
        try {
            System.out.println("Into Service Layer");
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id){
        try {

        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());

        }
    }

    public Patient updateAppointment(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }
}
