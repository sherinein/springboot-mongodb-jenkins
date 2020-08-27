package org.dxc.mongodb.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.dxc.mongodb.model.Employee;
import org.dxc.mongodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	private Logger logger = Logger.getLogger(getClass().getName());
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/saveEmployee")
	public void saveEmployee(@RequestBody List<Employee> employee) {
		logger.info("==========saveEmployee===========" + employee);
		employeeService.saveEmployee(employee);
	}

	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable(value="id") int empid, @RequestBody Employee employee) {
		logger.info("==========updateEmployee===========" + employee);
		employee.setEmpid(empid);
		employeeService.updateEmployee(employee);
		return "Employee Records Updated";
	}
	@GetMapping("/getAllEmployees")
	public Collection<Employee> getAllEmployees(){
		logger.info("==========getAllEmployees===========" );
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/getEmployee/{empid}")
	public Optional<Employee> getEmployee(@PathVariable("empid")int empid) {
		logger.info("==========getEmployee===========");
		return employeeService.findEmployeeById(empid);
	}

	@DeleteMapping("/deleteEmployee/{empid}")
	public void deleteEmployee(@PathVariable("empid")int empid) {
		employeeService.deleteEmployeeById(empid);
	}
}
