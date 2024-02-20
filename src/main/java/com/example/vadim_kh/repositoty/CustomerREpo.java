package com.example.vadim_kh.repositoty;

import com.example.vadim_kh.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerREpo  extends JpaRepository<Customer,Long> {

}
