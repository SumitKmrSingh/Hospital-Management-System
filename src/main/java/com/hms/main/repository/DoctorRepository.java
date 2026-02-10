package com.hms.main.repository;

import com.hms.main.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
