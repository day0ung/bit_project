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
	  
	 @PostMapping(value="/groupSchedule")
	    public List<CalendarDto> getGroupSchedule(GroupDto groupDto) {
	    	System.out.println("getGroupSchedule()");
	    	List<CalendarDto> list = groupService.getGroupSchedule(groupDto);
	    	
	    	return list;
	    }
}
