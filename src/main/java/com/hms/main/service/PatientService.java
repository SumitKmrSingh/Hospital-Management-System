package com.hms.main.service;

import com.hms.main.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    public Patient getPatientById(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public Patient createPatient(Patient patient){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public List<Patient> getAllPatient(){
        try {
            System.out.println("Into Service Layer");
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public void deletePatient(Long id){
        try {

        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());

        }
    }

    public Patient updatePatient(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }
}
