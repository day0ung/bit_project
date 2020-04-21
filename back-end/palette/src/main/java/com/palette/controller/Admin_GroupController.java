package com.palette.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.GroupDto;
import com.palette.service.AdminGroupService;


@CrossOrigin(origins = "*")
@RestController
public class Admin_GroupController {
	@Autowired
	AdminGroupService adminGroupService;
	
	//selfOutputTest 요청   
	
	@PostMapping(value = "/AdmingetAllGroup")
    public List<GroupDto> getAllGroup() {
    	System.out.println("getAllGroup 메소드 실행");
    	List<GroupDto> list = adminGroupService.selfOutputTest();
    	System.out.println("list 출력 : " + list );
    	return list;
	}

	@PostMapping(value = "/AdminAcceptCreateGroup")
    public boolean groupPermissionChange(GroupDto dto) {
		System.out.println("getAllGroup 메소드 실행");
		//acceptCreateGroup
    	boolean isS = adminGroupService.acceptCreateGroup(dto);
    	System.out.println("성공여부 체크 : " + isS );
    	return isS;
	}
	

	
	
	
	
}//end of Admin_GroupController class
