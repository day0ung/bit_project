package com.palette.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.adminMemberDao;
import com.palette.model.MemberDto;

@Service
@Transactional
public class adminMemberService {
	@Autowired
	adminMemberDao adminmemberdao;
	
	public List<MemberDto> getMemberListAll(){
		return adminmemberdao.getMemberListAll();
	}
	
	

}//end of adminMemberService class
