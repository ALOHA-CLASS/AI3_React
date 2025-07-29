package com.aloha.board.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

public interface BaseService<E> {
    List<E> list();
    PageInfo<E> page(int page, int size);
    E select(int no);
    E selectById(String id);
    boolean insert(E boards);
    boolean update(E boards);
    boolean updateById(E boards);
    boolean delete(int no);
    boolean deleteById(String id);
}
