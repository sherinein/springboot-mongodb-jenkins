package org.dxc.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="employee")
public class Employee {
	@Id
	private  int empid;
	private String firstName;
	private String lastName;
	private String jobTitle;
	private double salary;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", jobTitle="
				+ jobTitle + ", salary=" + salary + "]";
	}

}
