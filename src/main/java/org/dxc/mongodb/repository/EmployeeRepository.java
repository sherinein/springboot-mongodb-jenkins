package org.dxc.mongodb.repository;

import org.dxc.mongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
