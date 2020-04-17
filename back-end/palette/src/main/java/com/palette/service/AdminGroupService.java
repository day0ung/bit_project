package com.palette.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.AdminGroupDao;

@Service
@Transactional
public class AdminGroupService {
	@Autowired
	AdminGroupDao admingroupdao;
	
	
	
	

}//end of adminMemberGroup class
