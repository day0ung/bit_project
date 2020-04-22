package com.palette.controller;

import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import com.palette.model.MemberDto;
import com.palette.model.TodoListDto;
import com.palette.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MemberController
 */
@CrossOrigin(origins = "*")
@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    
    @GetMapping(value = "/register")
    public String member(){
        System.out.println("register()");
        List<MemberDto> list = memberService.selectAll();
        System.out.println(list.size());
        return "";
    }
    
    @PostMapping(value= "/getOneMember")
    public MemberDto getOneMember(MemberDto dto) {
    	System.out.println("getOneMember() 실행"+ dto.toString());
    	MemberDto member = memberService.getOneMember(dto);
    	return member;
    }
    
    @PostMapping(value="/createMember")
    public boolean createMember(MemberDto dto, HttpServletRequest request)throws Exception {
    	System.out.println("createMember" + dto.toString());
    	boolean check = memberService.createMember(dto);
    	System.out.println(" 추가 성공: " + check);
    	return check;
    }
    
    @PostMapping(value="/checkid")
    public boolean checkId(String memberId) {
    	System.out.println("checkid"  + memberId);
    	int is = memberService.checkid(memberId);
    	return is > 0? false: true;
    	
    }
    
    @PostMapping(value= "/selectMember")
    public MemberDto selectMember(int memberSeq) {
    	System.out.println("selectMember() 실행");
    	System.out.println("======"+ memberSeq);
    	MemberDto member = memberService.getDetailMember(memberSeq);
    	return member;

    }
    
    @PostMapping(value="/intersting")
    public String intersting(String interSmallSeqs, MemberDto dto) {
    	System.out.println("interesting!!!"+interSmallSeqs + dto.getInterArea());
    	int memberSeq = memberService.getSeq();
    	dto.setMemberSeq(memberSeq);
    	memberService.addInterArea(dto);
    	memberService.InterstingInsert(interSmallSeqs, memberSeq);
    	return "perfect";
    }
    
    @PostMapping(value="/updateInfo")
    public boolean updateInfo(MemberDto dto) {
    	System.out.println("udpateinfo"+ dto.toString());
    	boolean check = memberService.updateInfo(dto);
    	
    	return check;
    }
    
    @PostMapping(value="/updateAddr")
    public boolean updateAddr(MemberDto dto) {
    	System.out.println("updateADdre"+ dto.getMemberSeq()+ dto.getAddress());
    	boolean check = memberService.updateAddr(dto);
    	return check;
    }
    
    @PostMapping(value="/checkPass")
    public boolean checkPass(MemberDto dto) {
    	System.out.println("checkPass" + dto.getMemberSeq()+ dto.getPwd());
    	int check = memberService.checkPass(dto);
    	return check >0? true: false;
    }
    
    @PostMapping(value="/updatePass")
    public boolean updatePass(MemberDto dto) {
    	System.out.println("updatePass" + dto.getMemberSeq()+ dto.getPwd());
    	boolean pass = memberService.updatePass(dto);
    	return pass;
    }
    
    @PostMapping(value="/addTodoList")
    public boolean addTodoList(TodoListDto dto) {
    	System.out.println("addTodoList"+ dto.getMemberSeq()+ dto.getTitle());
    	boolean add = memberService.addTodoList(dto);
    	return add;
    }
    
    @PostMapping(value="/selectTodoList")
    public List<TodoListDto> selectTodoList(TodoListDto dto) {
    	System.out.println("selectTodoLsit"+ dto.getMemberSeq());
    	List<TodoListDto> todo = memberService.selectTodoList(dto);
    	return todo;
    }
    
    @PostMapping(value="/selectOneList")
    public TodoListDto selectOneList(TodoListDto dto) {
    	System.out.println("selectOneList"+ dto.getMemberSeq()+ dto.getTitle());
    	TodoListDto todo = memberService.selectOneList(dto);
    	System.out.println("++++++++++++++"+todo.toString());
    	return todo;
    }
    
}