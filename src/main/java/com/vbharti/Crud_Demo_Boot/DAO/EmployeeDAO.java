package com.vbharti.Crud_Demo_Boot.DAO;

import java.util.List;

import com.vbharti.Crud_Demo_Boot.entiy.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);

}
