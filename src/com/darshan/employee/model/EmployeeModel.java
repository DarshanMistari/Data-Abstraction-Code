package com.darshan.employee.model;

public class EmployeeModel {
	
	private int empId;
	private String empName;
	private String empMobNo;
	private double empSalary;
	
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	
	public void setEmpMobNo(String empMobNo)
	{
		this.empMobNo = empMobNo;
	}
	
	public void setEmpSalary(double empSalary)
	{
		this.empSalary = empSalary;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	
	public String getEmpMobNo()
	{
		return empMobNo;
	}
	
	public double getEmpSalary()
	{
		return empSalary;
	}

}
