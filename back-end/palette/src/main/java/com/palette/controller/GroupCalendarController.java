package com.palette.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.CalendarDto;
import com.palette.model.GroupDto;
import com.palette.service.GroupService;

@CrossOrigin(origins = "*")
@RestController
public class GroupCalendarController {

	 @Autowired
	 GroupService groupService;
	  
	 @PostMapping(value="/getGroupSchedule")
	    public List<CalendarDto> getGroupSchedule(GroupDto groupDto) {
	    	System.out.println("getGroupSchedule() seq: "+groupDto.toString());
	    	List<CalendarDto> list = groupService.getGroupSchedule(groupDto);
	    	for (int i = 0; i < list.size(); i++) {
	    		String str = list.get(i).toString();
	    		System.out.println(str);
	    		
	    		
			}
	    	System.out.println(list.toString());
	    	return list;
	    }
}
