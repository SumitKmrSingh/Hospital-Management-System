package com.hms.main.repository;

import com.hms.main.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
