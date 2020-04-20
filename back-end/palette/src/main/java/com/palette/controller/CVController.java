package com.palette.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.EmploymentBoardDto;
import com.palette.service.EmploymentService;


@CrossOrigin(origins = "*")
@RestController
public class CVController {

    @Autowired
//    EmploymentService employmentService;

// 	전체 리스트
    @PostMapping(value = "/singlefile")
    public String singlefile() {
    	System.out.println("파일 업로드");
    	return null;
    }
    
    
    
}