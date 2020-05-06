package com.palette.service;

import java.util.List;
import java.util.Map;

import com.palette.dao.AdminStatisticsDao;
import com.palette.model.MemberDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class AdminStatisticsService {
	@Autowired
	AdminStatisticsDao adminStaticsdao;



	public List<MemberDto> getMemberGenderInfo(){
		return adminStaticsdao.getMemberGenderInfo();
	}
	

	public List<Map<String, Object>> receiveinterBigCountAll(){

		return adminStaticsdao.receiveinterBigCountAll();
	}




	
	
	

}// end of AdminStatisticsService class
