package com.darshan.employee;

import java.util.Scanner;

import com.darshan.employee.model.EmployeeModel;

public class EmployeeMain {

	EmployeeModel employeemodel = new EmployeeModel();
	
	public void setEmployee()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee ID :");
		employeemodel.setEmpId( scanner.nextInt());
		System.out.println("Enter the Employee Name :");
		employeemodel.setEmpName( scanner.next());
		System.out.println("Enter the Employee Mobile Number:");
        employeemodel.setEmpMobNo( scanner.next());
		System.out.println("Enter the Emplyee Salary :");
		employeemodel.setEmpSalary( scanner.nextDouble());
	}
	
	public void getEmployee()
	{
		System.out.println("Employee ID :"+ employeemodel.getEmpId());
		System.out.println("Employee Name :"+employeemodel.getEmpName());
		System.out.println("Employee Mobile Number :"+employeemodel.getEmpMobNo());
		System.out.println("Employee Salary :"+employeemodel.getEmpSalary());
	}

	public static void main(String[] args) {		
		
		EmployeeMain employeemain = new EmployeeMain();
		employeemain.setEmployee();
		employeemain.getEmployee();
	}

}