package com.innovationT.member.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.innovationT.member.service.MemberService;
import com.innovationT.member.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping("/selectMember")
	@ResponseBody
	public Map<String, Object> member(MemberVO memberVO) throws Exception{
		
		Map<String, Object> dataMap= new HashMap<String,Object>();
		
		List<MemberVO> memberList = memberService.selectMember(memberVO);
		
		dataMap.put("memberList", memberList);
		
		return dataMap;
	}
}
