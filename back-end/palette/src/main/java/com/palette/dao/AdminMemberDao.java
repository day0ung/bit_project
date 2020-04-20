package com.palette.dao;



import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.MemberDto;

@Mapper
@Repository
public interface AdminMemberDao {

    public MemberDto idpwcheck(MemberDto memdto);
	

}//end of adminMemberDao interface
