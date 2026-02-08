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

    public Bill getBillById(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id){
        try {

        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());

        }
    }

    public Patient updateBill(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            return null;
        }
    }
}
