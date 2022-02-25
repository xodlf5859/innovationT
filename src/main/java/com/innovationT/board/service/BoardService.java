package com.innovationT.board.service;

import java.util.List;

import com.innovationT.board.vo.BoardVO;
import com.innovationT.member.vo.MemberVO;

public interface BoardService {

	List<BoardVO> selectBoard(BoardVO boardVO);
	
}
