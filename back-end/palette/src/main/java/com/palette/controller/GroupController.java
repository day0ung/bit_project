package com.palette.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.GroupDto;
import com.palette.service.GroupService;


@CrossOrigin(origins = "*")
@RestController
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping(value = "/getAllGroup")
    public List<GroupDto> getAllGroup() {
    	System.out.println("getAllGroup 메소드 실행");
    	List<GroupDto> list = groupService.getAllGroup();
//    	System.out.println(list.size());
//    	System.out.println("list.size: "+list.get(0).toString());
    	return list;
    }
    
    
    @GetMapping(value = "/getOneGroup")
    public GroupDto getOneGroup(){
    	int seq = 2;	// 실제 프로젝트시 파라미터 추가해야함
    	System.out.println("getOneGroupo 메소듦ㄴㅇㄹ");
    	GroupDto dto = groupService.getOneGroup(seq);
    	System.out.println(dto.toString());
    	
    	
    	
    	return dto;
    }
}
