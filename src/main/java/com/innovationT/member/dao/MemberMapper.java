package com.innovationT.member.dao;

import org.apache.ibatis.annotations.Mapper;

import com.innovationT.member.vo.MemberVO;

@Mapper
public interface MemberMapper {

	//회원검색
	MemberVO selectMember(MemberVO memberVO) throws Exception;
}
