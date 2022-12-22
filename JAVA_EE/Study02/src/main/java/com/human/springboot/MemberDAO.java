package com.human.springboot;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDAO {
	
	int getMemgetMemberCount(String loginId, String passcode);
	void insertMember(String loginId, String passcode, String name, String moblie);
}
