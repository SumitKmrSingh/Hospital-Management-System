package com.hms.main.service;

import com.hms.main.models.Doctor;
import java.util.List;

public class DoctorService {
    public Doctor getDoctorById(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public List<Doctor> getAllDoctor(){
        try {
            System.out.println("Into Service Layer");
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id){
        try {

        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());

        }
    }

    public Doctor updateDoctor(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }
}
