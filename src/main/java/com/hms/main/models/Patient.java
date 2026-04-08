package com.hms.main.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Patient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    @Column(unique = true, nullable = true)
    private String patientId;  // Business ID
    private String gender;
    private int age;
    private String mobileNo;
    private String address;

}
