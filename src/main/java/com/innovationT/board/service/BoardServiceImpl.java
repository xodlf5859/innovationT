package com.innovationT.board.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.innovationT.board.dao.BoardMapper;
import com.innovationT.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardMapper boardDAO;

	@Override
	public List<BoardVO> selectBoard(BoardVO boardVO) {
		return null;
	}

	//회원검색
	

}
