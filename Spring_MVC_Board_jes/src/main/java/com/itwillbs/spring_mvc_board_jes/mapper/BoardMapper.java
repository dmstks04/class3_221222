package com.itwillbs.spring_mvc_board_jes.mapper;

import com.itwillbs.spring_mvc_board_jes.vo.BoardVO;

public interface BoardMapper {

	// 글 쓰기
	int insertBoard(BoardVO board);

}
