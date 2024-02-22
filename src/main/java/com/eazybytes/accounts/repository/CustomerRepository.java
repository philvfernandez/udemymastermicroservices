package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
//the second param represents the data type of the primary key of the table defined in the schema.
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //JPA will fetch the records by the mobileNumber column.
    //The method name should match the column name defined in the Customer object.  It's not case-sensitive.
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
