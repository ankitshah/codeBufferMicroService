package com.ankit.dailycodebuffer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankit.dailycodebuffer.entity.Department;
import com.ankit.dailycodebuffer.service.DepartmentService;

@RestController
@RequestMapping("/departments")

public class DepartmentController {
	
	private Logger log = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Department received : "+department);

		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{Id}")
	public Department findDepartment(@PathVariable("Id") Long id) {
		log.info("Id "+id);
		return departmentService.findDepartmentByID(id);
	}
}
