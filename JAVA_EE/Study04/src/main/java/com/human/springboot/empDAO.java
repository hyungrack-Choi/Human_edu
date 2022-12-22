package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface empDAO {
	ArrayList<EmpDTO> list(); //반환값 메소드명(매개변수들)
	ArrayList<RoomtypeDTO> listRoomType();
	ArrayList<departDTO> listdepart();
	void insertRoomType(String typename);
	void updateRoomType(String typename, int typenum);
	void deleteRoomType(int typenum);
	ArrayList<RoomInfoDTO> listRoomInfo();
	void insertRoomInfo(String one,int two, int three, int four);
	void updateRoomInfo(int num,String name,int type,int howmany,int howmuch);
	void deleteRoomInfo(String num);
	
}
