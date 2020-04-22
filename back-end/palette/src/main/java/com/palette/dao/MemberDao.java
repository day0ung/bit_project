package com.palette.dao;

import java.util.List;

import com.palette.model.MemberDto;
import com.palette.model.MemberInterParam;
import com.palette.model.TodoListDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberDao {

	List<MemberDto> selectAll();

	MemberDto getOneMember(MemberDto dto); //session
	
	int checkId(String memberId); //id check
	
	int createMember(MemberDto dto);//register
	
	MemberDto getSelectMember(int memberSeq); //info
	
	//my page interest info
	MemberDto getDetailMember(int memberSeq); 
	
	// interest add
	int getBigSeq(int interSmallSeq); 
	
	int addInter(MemberInterParam param);
	
	int addInterArea(MemberDto dto);
	
	//mypage 수정
	int getSeq();
	
	int updateInfo(MemberDto dto);
	
	int updateAddr(MemberDto dto);
	
	int checkPass(MemberDto dto);
	
	int updatePass(MemberDto dto);
	
	//todolist add after select todolist
	int addTodoList(TodoListDto dto);
	
	List<TodoListDto> selectTodoList(TodoListDto dto);
	
	//add하고나서 하나만
	TodoListDto selectOneList(TodoListDto dto);

}
