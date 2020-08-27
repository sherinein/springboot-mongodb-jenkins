package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.mongodb.model.Employee;

public interface EmployeeService {
	public void saveEmployee(List<Employee> employee);
	public Collection<Employee> getAllEmployees();
	public Optional<Employee> findEmployeeById(int empid);
	public void deleteEmployeeById(int empid);
	public void updateEmployee(Employee employee);
	public void deleteAllEmployees();
}
