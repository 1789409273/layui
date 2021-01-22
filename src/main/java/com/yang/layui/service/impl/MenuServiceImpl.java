package com.yang.layui.service.impl;

import com.yang.layui.dao.MenuDao;
import com.yang.layui.service.MenuService;
import com.yang.layui.util.TreeUtil;
import com.yang.layui.bean.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;
    @Override
    public Map<String, Object> menu() {
        //构造前端需要的树
        Map<String, Object> map = new HashMap<>();
        Map<String,Object> home = new HashMap<>();
        Map<String,Object> logo = new HashMap<>();
        List<Menu> menuList = menuDao.findAllByStatusOrderBySort();

        home.put("title","首页");
        home.put("href","page/welcome-1.html?t=1");
        logo.put("title","川融");
        logo.put("image","images/logo.png");
        map.put("homeInfo", home);
        map.put("logoInfo", logo);
        map.put("menuInfo", TreeUtil.toTree(menuList, 0L));
        return map;
    }
}
