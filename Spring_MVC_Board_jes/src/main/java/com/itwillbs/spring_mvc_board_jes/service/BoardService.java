package com.itwillbs.spring_mvc_board_jes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.spring_mvc_board_jes.mapper.BoardMapper;
import com.itwillbs.spring_mvc_board_jes.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardMapper mapper;

	// 글 등록 작업 요청
	// BoardMapper - insertBoard()
	public int registBoard(BoardVO board) {
		return mapper.insertBoard(board);
	}
	
}
