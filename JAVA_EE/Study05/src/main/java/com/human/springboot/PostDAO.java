package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostDAO {
	
	void InsertPosting(String title,String content,String wname);
	ArrayList<PostingDTO> listPosting();
	viewDTO getPostview(int post_id);
	void updatePosting(int post_id,String title,String content,String userid);
	void deleteview(int one);
}