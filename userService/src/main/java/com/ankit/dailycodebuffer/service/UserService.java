package com.ankit.dailycodebuffer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ankit.dailycodebuffer.VO.Department;
import com.ankit.dailycodebuffer.VO.ResponseTemplateVO;
import com.ankit.dailycodebuffer.entity.User;
import com.ankit.dailycodebuffer.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		
		Department department = restTemplate.getForObject("http://department/departments/"+user.getDepartmentId(), 
															Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}

}
