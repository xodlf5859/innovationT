package com.innovationT.member.service;

import com.innovationT.member.vo.MemberVO;

public interface MemberService {


	//회원검색
	MemberVO selectMember(MemberVO memberVO) throws Exception;
}
