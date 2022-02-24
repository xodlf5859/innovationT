package com.innovationT.member.service;

import java.util.List;

import com.innovationT.member.vo.MemberVO;

public interface MemberService {


	//회원검색
	List<MemberVO> selectMember(MemberVO memberVO) throws Exception;
}
