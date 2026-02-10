package com.hms.main.service;

import com.hms.main.models.Bill;
import com.hms.main.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);
    public List<Bill> getAllBill(){
        try {
            System.out.println("Into Service Layer");
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while fetching all bill {}", e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while fetching bill with  {} : {} ", id, e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while creating bill {}", e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id){
        try {

        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while deleting bill with ID {} : {}", id,  e.getMessage());

        }
    }

    public Patient updateBill(Long id, Bill bill){
        try {
            return null;
        }
        catch (Exception e){
            System.out.println("Error message : "+e.getMessage());
            logger.error("An error occurred while updating bill {}", e.getMessage());
            return null;
        }
    }
}
