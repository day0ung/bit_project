package com.palette.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.GroupDao;
import com.palette.model.BoardParams;
import com.palette.model.CalendarDto;
import com.palette.model.GroupBoardDto;
import com.palette.model.GroupDto;
import com.palette.model.GroupMemberDto;
import com.palette.model.GroupParams;
import com.palette.model.GroupSchedule;
import com.palette.model.InterBigDto;

@Service
@Transactional
public class GroupService {
	
	@Autowired
    GroupDao groupDao;

	public List<GroupDto> getAllGroup() {
		return groupDao.getAllGroup();
	}
	public ArrayList<GroupDto> getMyGroup(GroupParams groupParams) {
		return groupDao.getMyGroup(groupParams);
	}
	public ArrayList<GroupDto> getMyOtherGroup(GroupParams groupParams) {
		return groupDao.getMyOtherGroup(groupParams);
	}

	public GroupDto getOneGroup(GroupDto insertDto) {
		return groupDao.getOneGroup(insertDto);
	}

	public List<GroupMemberDto> getGroupMemberName(int seq){
		return groupDao.getGroupMemberName(seq);
	}


	public List<InterBigDto> getInterListAll() {
		return groupDao.getInterListAll();
	}

	public ArrayList<GroupBoardDto> getGroupPagingList(BoardParams boardParams) {
		return groupDao.getgroupPagingList(boardParams);
	}
	public ArrayList<GroupBoardDto> getgroupPdsList(int groupSeq) {
		return groupDao.getgroupPdsList(groupSeq);
	}

	public ArrayList<GroupDto> groupSearchList(GroupParams groupParams) {
		return groupDao.groupSearchList(groupParams);
	}
	public void createGroup(GroupDto groupDto) {
		groupDao.createGroup(groupDto);
	}
	public void addSchedule(GroupSchedule groupSchedule) {
		groupDao.addSchedule(groupSchedule);
	}
	public int currGroupInfoSeq() {
		return groupDao.currGroupInfoSeq();
	}
	public int searchInterBigSeq(int interSmallSeq) {
		return groupDao.searchInterBigSeq(interSmallSeq);
	}
	public GroupBoardDto getGroupBoardDetail(int boardSeq) {
		return groupDao.getGroupBoardDetail(boardSeq);
	}
	public int getGroupBoardTotal(BoardParams boardParams) {
		
		return groupDao.getGroupBoardTotal(boardParams);
	}
	public List<CalendarDto> getGroupSchedule(GroupDto groupDto) {
		
		return groupDao.getGroupSchedule(groupDto);
	}
	
	public int getAttendGroup(String checkday, GroupSchedule groupSchedule) {
		int a = -1;
		if(checkday.equals("Sunday")) {
			a = groupSchedule.getSunday();
		}
		if(checkday.equals("Monday")) {
			a = groupSchedule.getMonday();
		}
		if(checkday.equals("Tuesday")) {
			a = groupSchedule.getTuesday();
		}
		if(checkday.equals("Wednesday")) {
			a = groupSchedule.getWednesday();
		}
		if(checkday.equals("Thursday")) {
			a = groupSchedule.getThursday();
		}
		if(checkday.equals("Friday")) {
			a = groupSchedule.getFriday();
		}
		if(checkday.equals("Saturday")) {
			a = groupSchedule.getSaturday();
		}
		
		if(a == 1) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        Calendar c1 = Calendar.getInstance();
	        String strToday = sdf.format(c1.getTime());
	        
	        groupSchedule.setNowDate(strToday);
			int b = groupDao.checkAttend(groupSchedule);
		
			if(b>0) {
				a = 2;
			}else {
				groupDao.insertAttendGroup(groupSchedule);
			}
		}
		return a;
	}
	public void groupBoardDelete(int boardSeq) {
		groupDao.groupBoardDelete(boardSeq);
	}

	public void insertGroupBoard(GroupBoardDto groupBoardDto) {
		groupBoardDto.setBoardAuth(2);
		groupDao.insertGroupBoard(groupBoardDto);
	}
	

	
}
