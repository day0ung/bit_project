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

import com.palette.model.BoardDto;
import com.palette.model.GroupDto;
import com.palette.service.EmploymentService;
import com.palette.service.GroupService;


@CrossOrigin(origins = "*")
@RestController
public class EmploymentController {

    @Autowired
    EmploymentService employmentService;

// 	전체 리스트
    @GetMapping(value = "/getAllRecuritingInfo")
    public List<BoardDto> getAllRecuritingInfo() {
    	System.out.println("getAllRecuritingInfo 메소드 실행");
    	
    	List<BoardDto> list = employmentService.getAllRecuritingInfo();
//    		디데이 함수
			for (int i = 0; i < list.size(); i++) {
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		    	Calendar today = Calendar.getInstance(); // date
		    	String s_today = df.format(today.getTime());
		    	Date d_today = null;
		    	Date d_end_day = null;
		    	
		    	try {
					d_today = df.parse(s_today);
					System.out.println("오늘날짜(date) :" + d_today);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	String end_day = list.get(i).getCvEndDate(); // 엔드데이트string 
		    	try {
					d_end_day = df.parse(end_day);
					System.out.println(d_end_day);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		    	long calDate = d_end_day.getTime() - d_today.getTime();
		    	long calDateDay = calDate / (24*60*60*1000);
				list.get(i).setdDay(calDateDay);
			}
	    	
    	return list;
    }
    
    @PostMapping(value = "/getOneRecruit")
    public BoardDto getOneRecruit(int empBoardSeq){
        System.out.println("getOneRecruit() 실행");
        System.out.println("seq: "+ empBoardSeq);
//		readcount 증가
        employmentService.readCount(empBoardSeq);
        
        BoardDto dto =  employmentService.getOneRecruit(empBoardSeq);
        
//		디데이 함수      
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    	Calendar today = Calendar.getInstance(); // date
    	String s_today = df.format(today.getTime());
    	Date d_today = null;
    	Date d_end_day = null;
    	
    	try {
			d_today = df.parse(s_today);
			System.out.println("오늘날짜(date) :" + d_today);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String end_day = dto.getCvEndDate(); // 엔드데이트string 
    	try {
			d_end_day = df.parse(end_day);
			System.out.println(d_end_day);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	long calDate = d_end_day.getTime() - d_today.getTime();
    	long calDateDay = calDate / (24*60*60*1000);
    	dto.setdDay(calDateDay);

    	return dto;
    }
}
