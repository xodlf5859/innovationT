package com.innovationT.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.innovationT.board.service.BoardService;
import com.innovationT.board.vo.BoardVO;
import com.innovationT.member.vo.MemberVO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("/boardList")
	@ResponseBody
	public Map<String, Object> board(BoardVO boardVO) throws Exception{
		
		Map<String, Object> dataMap= new HashMap<String,Object>();
		
		List<BoardVO> boardList = boardService.selectBoard(boardVO);
		
		dataMap.put("boardList", boardList);
		
		return dataMap;
	}
}