package com.palette.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.EmploymentDao;
import com.palette.model.EmploymentDto;

@Service
@Transactional
public class EmploymentService {
	
	@Autowired
    EmploymentDao employmentDao;

	public List<EmploymentDto> getAllRecuritingInfo() {
		return employmentDao.getAllRecuritingInfo();
	}

//	public GroupDto getOneGroup(int seq) {
//		return employmentDao.getOneGroup(seq);
//	}
}
