package com.example.domain;

public class Company {
	
	public String companyName;
	
	public String salary;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", salary=" + salary + "]";
	}
	
}
