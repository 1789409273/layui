package com.yang.layui.dao;

import com.yang.layui.bean.Menu;

import java.util.List;

public interface MenuDao {
    List<Menu> findAllByStatusOrderBySort();
}
