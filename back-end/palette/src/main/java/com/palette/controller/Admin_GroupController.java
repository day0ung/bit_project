package com.palette.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.GroupDto;
import com.palette.service.AdminGroupService;


@CrossOrigin(origins = "*")
@RestController
public class Admin_GroupController {
	@Autowired
	AdminGroupService adminGroupService;
	
	
	//selfOutputTest 요청   

	@PostMapping(value = "/AdmingetTESTAllGroup")
    public List<GroupDto> getAlTESTGroup() {
    	System.out.println("getAlTESTGroup 메소드 실행");
    	List<GroupDto> list = adminGroupService.selfOutputTest();
    	System.out.println("list 출력 : " + list );
    	return list;
	}

	@PostMapping(value = "/AdmingetAllStudyGroup")
    public List<GroupDto> getAllGroup11() {
    	System.out.println("getAllGroup 메소드 실행");
    	List<GroupDto> list = adminGroupService.getAllStudyGroup();
    	System.out.println("getAllGroup의 결과 list 출력 : " + list );
    	return list;
	}


	
	// Create group : GROUP_INFO.PERMISSION = 0 -> 1
	// remove group : GROUP_INFO.PERMISSION = 1 -> 0
	// groupInfoSeq, memberSeq, permission values ​​are required.
	// GROUP_INFO_SEQ=#{groupInfoSeq}
	// MEMBER_SEQ=#{memberSeq}
	@ResponseBody
	@PostMapping(value = "/AdminAcceptCreateGroup")
    public Map<String, String> groupPermissionChange(GroupDto dto) {
		Map<String, String> resmap = new HashMap<>();
		System.out.println("getAllGroup 메소드 실행");
		System.out.println("dto1111출력");
		System.out.println(dto);

		//groupinfo change (permission 0<=>1)
		boolean isS = adminGroupService.acceptCreateGroup(dto);
		System.out.println("성공여부 체크 : " + isS );

		//check insert data(memberId, groupId) from `GROUP_MEMBER` tabel
		GroupDto createcheck = adminGroupService.checkExistGroupMember(dto);
		System.out.println("기존 등록 여부 : " + createcheck);

		//change Auth 0->1 from `Member` Tabel


		/*
		그룹 개설시 바뀔것들.
		1. Groupinfo의 Permission이 0->1로 변경,(그룹개설요청0, 그룹개설수락1)
		2. Member의 AUTH를 0->1로     (일반회원0, 그룹리더1)
		3. GROUP_MEMBER에 GROUP_INFO_SEQ, MEMBER_SEQ 를 insert 해준다. 

		*/



		resmap.put("checkPermission", String.valueOf(isS));
		resmap.put("checkRegistGroupMember", String.valueOf(createcheck));
		
		
    	return resmap;
	}



	// checkExistGroupMember
	

	
	
	
	
}//end of Admin_GroupController class
