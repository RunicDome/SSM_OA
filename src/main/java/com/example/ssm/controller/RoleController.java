package com.example.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.example.ssm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("/role")
public class RoleController {
//    @Autowired
//    RoleService roleService;
//    //跳转首页面
//    @RequestMapping
//    public String index(){
//        return "index";
//    }
//    //跳转首页面
//    @RequestMapping("/tolist")
//    public String tolist(){
//        System.out.println("跳转");
//        return "role/bootstraplist";
//    }
//    //查询列表
////    @RequestMapping("/list")
////    public  String  list(Map map){
////        //调用业务逻辑层
////        List<Role> roleList = roleService.queryRoleList();
////        map.put("roleList" , roleList);//把值放入map，model
////        return "role/list";//跳转的页面   /role/list.jsp
////    }
//
//    @ResponseBody
//    @RequestMapping("/ajaxList")
//    public String ajaxlist(Integer pageSize,Integer pageNumber) {
//        int start = (pageNumber-1)*pageSize;
//        List<Role> roles = roleService.queryRoleList(start,pageSize);
//        Map<String,Object> map = new HashMap<>();
//        map.put("total",roleService.queryRoleCount());
//        map.put("rows",roles);
//
//        String s = JSON.toJSONString(map);
//        return s;
//    }

}
