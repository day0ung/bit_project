package com.palette.service;

import java.util.List;

import com.palette.dao.MemberDao;
import com.palette.model.MemberDto;

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
		
		public boolean createMember(MemberDto dto) {
			int check = memberDao.createMember(dto);
			return check > 0? true: false;
		}
    
}