package com.palette.controller;

import java.util.List;

import com.palette.model.MemberDto;
import com.palette.service.AdminStatisticsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class Admin_StatisticsController {
    @Autowired
    AdminStatisticsService adminstatisticsservice;

    // @PostMapping(value = "/changeAuthCompanyMember")
    // public boolean changeAuthCompanyMemberStatus(MemberDto dto) {
    // 	System.out.println("changeAuthCompanyMemberStatus Method execute Now..");
    	
    // 	boolean isS = adminCompanyService.changeAUTHforCompanyMember(dto);
    // 	System.out.println("changeAuthCompanyMemberStatus RESULT : \n" + isS );
    // 	return isS;
    // }
    

    // getMemberGenderInfo

    
    @PostMapping(value = "/getMemberGenderInfo")
    public List<MemberDto> getMemberGenderInfo() {
    	System.out.println("getMemberGenderInfo Method execute Now..");
    	
    	List<MemberDto> genderInfoList = adminstatisticsservice.getMemberGenderInfo();
        System.out.println("getMemberGenderInfo RESULT : \n" + genderInfoList );
        
        
    	return genderInfoList;
    }

    



}//end of  Admin_StatisticsController class


    
    


