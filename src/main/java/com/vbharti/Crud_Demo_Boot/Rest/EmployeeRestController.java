package com.vbharti.Crud_Demo_Boot.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vbharti.Crud_Demo_Boot.DAO.EmployeeDAO;
import com.vbharti.Crud_Demo_Boot.entiy.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeRestController(EmployeeDAO theEmployeeDAO)
	{
		employeeDAO=theEmployeeDAO;
	}
	
	@RequestMapping("/employees")
	List<Employee> findAll()
	{
		return employeeDAO.findAll();
	}
	@RequestMapping("/db")
	public String test()
	{
		return "It is Working";
	}

}
