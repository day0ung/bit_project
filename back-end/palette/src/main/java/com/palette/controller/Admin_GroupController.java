package com.palette.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.palette.service.AdminGroupService;
import com.palette.service.AdminMemberService;

@CrossOrigin(origins = "*")
@RestController
public class Admin_GroupController {
	@Autowired
	AdminGroupService adminGroupService;
	
	

}//end of Admin_GroupController class
