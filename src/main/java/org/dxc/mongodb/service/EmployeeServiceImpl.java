package org.dxc.mongodb.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	private Logger logger = Logger.getLogger(getClass().getName());
	@Override
	public void saveEmployee(List<Employee> employee) {
		logger.info("==========saveEmployee -EmployeeServiceImpl ===========");
		 employeeRepository.saveAll(employee);                          //    [ { "empid":101,"empname":"sherine" },{ "empid":102,"empname":"ram" },{ "empid":103,"empname":"arun" } ]  , { "empid":101,"empname":"sherine"}
	}
	@Override
	public Collection<Employee> getAllEmployees() {
	
		return employeeRepository.findAll();
	}
	@Override
	public Optional<Employee> findEmployeeById(int empid) {
		
		return employeeRepository.findById(empid);
		
	}
	@Override
	public void deleteEmployeeById(int empid) {
		employeeRepository.deleteById(empid);
		
	}
	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}
	@Override
	public void deleteAllEmployees() {
		employeeRepository.deleteAll();
		
	}

	

}
