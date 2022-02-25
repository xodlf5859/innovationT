package com.innovationT.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.innovationT.member.vo.MemberVO;

@Mapper
public interface MemberMapper {

	//회원검색
	List<MemberVO> selectMember(MemberVO memberVO) throws Exception;
	
	//회원등록
	void insertMember(MemberVO memberVO) throws Exception;
	
}
