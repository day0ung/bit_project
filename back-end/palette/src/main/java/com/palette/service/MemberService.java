package com.palette.service;

import java.util.List;

import com.palette.dao.MemberDao;
import com.palette.model.InterSmallDto;
import com.palette.model.MemberDto;
import com.palette.model.MemberInterParam;
import com.palette.model.TodoListDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * MemberService
 */
@Service
public class MemberService {

        @Autowired
        MemberDao memberDao;

		public List<MemberDto> selectAll() {
            //System.out.println("service");
			return memberDao.selectAll();
		}

		public MemberDto getOneMember(MemberDto dto) {
			
			return memberDao.getOneMember(dto);
		}
		
		public int checkid(String memberId) {
			int is = memberDao.checkId(memberId);
			
			return is;
		}
		
		public boolean createMember(MemberDto dto) {
			int check = memberDao.createMember(dto);
			return check > 0? true: false;
		}
		
		//마이페이지용
		public MemberDto getDetailMember(int memberSeq) {
			return memberDao.getDetailMember(memberSeq);
		}
		
		//insert
		public void InterstingInsert(String interSmallSeqs, int memberSeq) {
			MemberInterParam param = new MemberInterParam(); 

			String arr[] = interSmallSeqs.split(",");
			int smallArr[] = new int[arr.length];
			int bigArr[] = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				smallArr[i] = Integer.parseInt(arr[i]); //smallseq
				bigArr[i] = memberDao.getBigSeq(smallArr[i]);//bigarr담을변수
				param.setMemberSeq(memberSeq);
				param.setSmallSeq(smallArr[i]);
				param.setBigSeq(bigArr[i]);
				memberDao.addInter(param);
			}
		}
		
		public void addInterArea(MemberDto dto) {
			memberDao.addInterArea(dto);
		}
		
		public int getSeq() {
			return memberDao.getSeq();
		}
		
		public boolean updateInfo(MemberDto dto) {
			int update = memberDao.updateInfo(dto);
			return update >0 ? true: false;
		}
		
		public boolean updateAddr(MemberDto dto) {
			int update = memberDao.updateAddr(dto);
			return update >0 ? true: false;
		}
		
		public int checkPass(MemberDto dto) {
			int pass = memberDao.checkPass(dto);
			return pass;
		}
		
		public boolean updatePass(MemberDto dto) {
			int update = memberDao.updatePass(dto);
			return update >0 ? true: false;
		}
		
		//todoList add 
		public boolean addTodoList(TodoListDto dto) {
			int add = memberDao.addTodoList(dto);
			return add > 0?  true: false;
		}
		
		public List<TodoListDto> selectTodoList(TodoListDto dto) {
			List<TodoListDto> todo = memberDao.selectTodoList(dto);
			return todo;
		}
		
		public TodoListDto selectOneList(TodoListDto dto) {
			TodoListDto todo = memberDao.selectOneList(dto);
			return todo;
		}
		
    
}