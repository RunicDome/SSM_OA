package com.example.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.example.ssm.entity.Announce;
import com.example.ssm.entity.Task;
import com.example.ssm.entity.User;
import com.example.ssm.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/announce")
public class AnnounceController {
    @Autowired
    AnnounceService announceService;
    @RequestMapping("/list")
    public String queryList(int pageNumber, int pageSize,Announce announce){
        List<Announce> announces=announceService.queryAnnounceList((pageNumber-1)*pageSize,pageSize,announce);
        for (Announce announce1 : announces) {
            User user=new User();
            String a=announceService.queryUserNameById(announce1.getUserid());
            user.setLoginname(a);
           announce1.setUser(user);
        }
        int totalCount=announceService.queryAnnounceCount(announce);
        Map<String, Object> result = new HashMap<>();
        result.put("total", totalCount);
        result.put("rows", announces);
        return JSON.toJSONString(result);
    }
}
