package com.example.ssm.controller;

import com.example.ssm.entity.Announce;
import com.example.ssm.entity.Task;
import com.example.ssm.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/announce")
public class AnnounceController {
    @Autowired
    AnnounceService announceService;
    @RequestMapping("/list")
    public String queryList(int pageNumber, int pageSize,Announce announce){
        return "";
    }
}
