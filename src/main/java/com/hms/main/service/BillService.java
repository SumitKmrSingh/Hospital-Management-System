package com.hms.main.service;

import com.hms.main.models.Bill;
import com.hms.main.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    public List<Bill> getAllBill(){
        try {
            System.out.println("Into Service Layer");
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

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
