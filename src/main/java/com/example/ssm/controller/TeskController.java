package com.example.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.example.ssm.entity.Task;
import com.example.ssm.entity.TaskType;
import com.example.ssm.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/task")
public class TeskController {
    @Autowired
    TaskService taskService;
    @ResponseBody
    @RequestMapping("/taskList/")
    public String taskList(int pageNumber,int pageSize,String taskTypeName,Task task) {
        TaskType taskType = new TaskType();
        taskType.setName(taskTypeName);
        task.setTaskType(taskType);
        List<Task> taskList = taskService.queryTaskList((pageNumber-1)*pageSize, pageSize,task);
        int totalCount = taskService.queryTaskCount(task);
        Map<String, Object> result = new HashMap<>();
        result.put("total", totalCount);
        result.put("rows", taskList);
        return JSON.toJSONString(result);
    }
}
