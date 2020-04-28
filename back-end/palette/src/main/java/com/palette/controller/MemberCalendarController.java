package com.palette.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.palette.service.MemberCalendarService;

@CrossOrigin(origins = "*")
@RestController
public class MemberCalendarController {
	
	@Autowired
	MemberCalendarService service;
}
