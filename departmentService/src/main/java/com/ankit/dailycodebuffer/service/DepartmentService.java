package com.ankit.dailycodebuffer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.dailycodebuffer.entity.Department;
import com.ankit.dailycodebuffer.repository.DepartmentRepository;

@Service
public class DepartmentService {
	private Logger log = LoggerFactory.getLogger(DepartmentService.class);
	@Autowired
	private  DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("department : "+department);
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentByID(Long id) {
		log.info("Id : "+id);
		return departmentRepository.findByDepartmentId(id);
	}

}
