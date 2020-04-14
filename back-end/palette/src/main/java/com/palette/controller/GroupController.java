package com.palette.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.BoardParams;
import com.palette.model.GroupBoardDto;
import com.palette.model.GroupDto;
import com.palette.model.GroupMemberDto;
import com.palette.model.GroupParams;
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
    	return list;
    }
    @PostMapping(value="/groupSearchList")
    public ArrayList<GroupDto> groupSearchList(GroupParams groupParams){
        ArrayList<GroupDto> list = null;
        if(groupParams.getInterBigSeq() == 0){
            list = (ArrayList)groupService.getAllGroup();
        }else{
            list = groupService.groupSearchList(groupParams);
        }
    	System.out.println("groupSearchList()실행 "+groupParams.toString()+ " / "+ list.size());
    	
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
        return list;
    }

    @PostMapping(value = "/getSmallIndex")
    public List<InterSmallDto> getSmallList(int interBigSeq){
        System.out.println("getSmallList");
        List<InterSmallDto> list = groupService.getSmallList(interBigSeq);
        return list;
    }

    @GetMapping(value="/getGroupMemberName")
    public List<GroupMemberDto> getGroupMemberName(int interGroupSeq){
    	System.out.println("getGroupMemberName()");
    	List<GroupMemberDto> list = groupService.getGroupMemberName(interGroupSeq);
	    	// for (int i = 0; i < list.size(); i++) {
	    	// 	System.out.println(list.get(i).toString());
			// }
    	return list;
    }
    
    @PostMapping(value="/groupPagingList")
    public ArrayList<GroupBoardDto> getGroupPagingList(BoardParams boardParams) {
    	boardParams.setStart( (boardParams.getPage()-1)*boardParams.getLimit() );
    	System.out.println(boardParams.toString());
    	ArrayList<GroupBoardDto> list =	groupService.getGroupPagingList(boardParams);
    	for (int j = 0; j < list.size(); j++) {
    		
    		System.out.println(list.get(j).toString());
    	}
    	return list;
    }
    
    @GetMapping(value="/groupBoardList")
    public ArrayList<GroupBoardDto> groupBoardList() {
        ArrayList<GroupBoardDto> list =	groupService.getGroupBoardList();
        for (int j = 0; j < list.size(); j++) {
			
        	System.out.println(list.get(j).toString());
		}
        return list;
    }

    @PostMapping(value="/groupBoardOne")
    public GroupBoardDto getGroupBoardOne(int boardSeq) {
        System.out.println("groupBoardOne");
        GroupBoardDto dto = groupService.groupBoardOne(boardSeq);
        System.out.println(dto.toString());
        return dto;
    }

    @GetMapping(value="/getInterListAll")
    public List<InterBigDto> getInterListAll() {
        System.out.println("getInterListAll()");
        List<InterBigDto> list = groupService.getInterListAll();
        return list;
    }
    
    
    

}
