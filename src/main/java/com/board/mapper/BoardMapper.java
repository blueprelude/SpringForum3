package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.BoardDTO;

@Mapper
public class BoardMapper {
	List<BoardDTO> getBoardList;
}
