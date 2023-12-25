package com.example.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.example.ssm.entity.Cachet;
import com.example.ssm.entity.Task;
import com.example.ssm.service.CachetService;
import com.example.ssm.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@RestController
@RequestMapping("/cachet")
public class CachetController {
    @Autowired
    TaskService taskService;
    @Autowired
    CachetService cachetService;
    @RequestMapping("/add")
    public String add(@RequestParam Map<String, String> formData){
        System.out.println(formData);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Cachet cachet = new Cachet();
        cachet.setUserid(cachetService.selectUserIdByName(formData.get("name")));
        LocalDateTime usetime =LocalDateTime.parse(formData.get("usetime"), formatter);
        LocalDateTime lauchtime =LocalDateTime.parse(formData.get("lauchtime"), formatter);
        cachet.setUsetime(Timestamp.valueOf(usetime));
        cachet.setDeptid(cachetService.selectdeptIdByName(formData.get("dept")));
        cachet.setLauchtime(Timestamp.valueOf(lauchtime));
        cachet.setTypeid(Long.parseLong(formData.get("type")));
        cachet.setRemark(formData.get("remark"));
        cachet.setAdminid(Long.parseLong(formData.get("role")));
        System.out.println(cachet.toString());
        int a1=cachetService.addCachet(cachet);
        System.out.println(cachet.getId());
        int a2=taskService.addTask(formData.get("name")+"用章申请", 4L,
                cachet.getId(), Long.valueOf(cachetService.selectUserIdByName(formData.get("name"))),
                Long.parseLong(formData.get("role")),Timestamp.valueOf(LocalDateTime.now().format(formatter)),0);
        if(a1==1&&a2==1){
            System.out.println("添加成功");
            return "success";
        }
        System.out.println("添加失败");
        return "error";
    }
    @RequestMapping("/getCachetType")
    public String cachetType(){
        return JSON.toJSONString(cachetService.selectCachetTypeList());
    }
    @RequestMapping("/getAdmin")
    public String admin(int roleid){
        return JSON.toJSONString(cachetService.selectAdminList(roleid));
    }
    @RequestMapping("/getCachetByTaskId")
    public String cachet(int taskid){
        Cachet cachet=cachetService.selectCachetByTaskid(taskid);
        return JSON.toJSONString(cachet);
    }

}
