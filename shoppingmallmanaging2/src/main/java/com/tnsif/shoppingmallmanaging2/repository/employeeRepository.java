package com.tnsif.shoppingmallmanaging2.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmallmanaging2.employee.employee;

public interface employeeRepository extends JpaRepository<employee, Integer>{

}
