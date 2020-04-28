package com.palette.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.MemberCalendarDao;

@Service
@Transactional
public class MemberCalendarService {
	
	@Autowired
	MemberCalendarDao dao;

}
