package com.hms.main.controllers;

import com.hms.main.models.Bill;
import com.hms.main.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bill")
public class BillControllers {
    @GetMapping
    public List<Bill> getAllBill(){
        System.out.println("Fetching the bill");
        return null;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating bill");
        return bill;
    }

    @GetMapping("/{id}")
    public Patient getBillById(@PathVariable Long id){
        System.out.println("Fetching bill with Id : "+id);
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable Long id){

    }
}
