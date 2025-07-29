package com.aloha.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aloha.board.domain.Boards;
import com.aloha.board.mapper.BoardMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired private BoardMapper boardMapper;

    @Override
    public List<Boards> list() {
        return boardMapper.list();
    }

    @Override
    public PageInfo<Boards> page(int page, int size) {
        PageHelper.startPage(page, size);
        List<Boards> list = boardMapper.list();
        return new PageInfo<>(list);
    }

    @Override
    public Boards select(int no) {
        return boardMapper.select(no);
    }

    @Override
    public Boards selectById(String id) {
        return boardMapper.selectById(id);
    }

    @Override
    public boolean insert(Boards boards) {
        return boardMapper.insert(boards) > 0;
    }

    @Override
    public boolean update(Boards boards) {
        return boardMapper.update(boards) > 0;
    }

    @Override
    public boolean updateById(Boards boards) {
        return boardMapper.updateById(boards) > 0;
    }

    @Override
    public boolean delete(int no) {
        return boardMapper.delete(no) > 0;
    }

    @Override
    public boolean deleteById(String id) {
        return boardMapper.deleteById(id) > 0;
    }
}
