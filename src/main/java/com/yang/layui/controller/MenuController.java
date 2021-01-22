package com.yang.layui.controller;

import com.yang.layui.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/menu")
    public Map<String, Object> menu() {
        return menuService.menu();
    }
}
