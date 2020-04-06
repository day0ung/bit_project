package com.palette.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.GroupDto;
import com.palette.model.InterBigDto;
import com.palette.model.InterSmallDto;
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
    
    @PostMapping(value = "/getOneGroup")
    public GroupDto getOneGroup(GroupDto insertDto){
        System.out.println("getOneGroup()");
        GroupDto outDto = groupService.getOneGroup(insertDto.getGroupInfoSeq());
        System.out.println(outDto.toString());
    	return outDto;
    }

    @PostMapping(value = "/getBigIndex")
    public List<InterBigDto> getBigList(){
        System.out.println("getBigList");
        List<InterBigDto> list = groupService.getBigList();
        System.out.println(list.size());
        return list;
    }

    @PostMapping(value = "/getSmallIndex")
    public List<InterSmallDto> getSmallList(int interBigSeq){
        System.out.println("getSmallList");
        List<InterSmallDto> list = groupService.getSmallList(interBigSeq);
        System.out.println(list.size());
        return list;
    }

}
