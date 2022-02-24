package com.innovationT.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.member.dao.MemberMapper;
import com.innovationT.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper memberDAO;

	//회원검색
	
	@Override
	public List<MemberVO> selectMember(MemberVO memberVO) throws Exception {
		
		return memberDAO.selectMember(memberVO);
	}
	
	
}
