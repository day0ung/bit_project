package com.palette.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.EmploymentDto;
import com.palette.model.GroupDto;
import com.palette.service.EmploymentService;
import com.palette.service.GroupService;


@CrossOrigin(origins = "*")
@RestController
public class EmploymentController {

    @Autowired
    EmploymentService employmentService;

    @GetMapping(value = "/getAllRecuritingInfo")
    public List<EmploymentDto> getAllRecuritingInfo() {
    	System.out.println("getAllRecuritingInfo 메소드 실행");
    	
    	List<EmploymentDto> list = employmentService.getAllRecuritingInfo();
	    	Calendar today = Calendar.getInstance(); // date
	    	long l_today = today.getTimeInMillis() / (24*60*60*1000); // long
	    	System.out.println("지금 시각:" + l_today);  
	    	
	    	
	    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			
	    	
	    	String s_today = df.format(today.getTime());
	    	try {
				Date d_today = df.parse(s_today);
				System.out.println("오늘날짜(date) :" + d_today);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	String d_day = list.get(0).getCvEndDate(); // 엔드데이트string 
				
	    	System.out.println("오늘날짜 :" + s_today);
			System.out.println("엔드데이트 :" + d_day);
			
			
	    	
	    	
    	
    	System.out.println(list.size());
    	for(int i = 0 ; i < list.size(); i++) {
    		System.out.println("list.size: "+list.get(i).toString());
    	}
    	return list;
    }
    
//    @PostMapping(value = "/getOneGroup")
//    public GroupDto getOneGroup(GroupDto insertDto){
//        System.out.println("getOneGroupo()");
//        GroupDto outDto = employmentService.getOneGroup(insertDto.getGroupInfoSeq());
//        System.out.println(outDto.toString());
//    	return outDto;
//    }
}
