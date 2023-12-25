package com.example.ssm.service.impl;

import com.example.ssm.entity.Task;
import com.example.ssm.mapper.TaskMapper;
import com.example.ssm.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskMapper taskMapper;
    @Override
    public List<Task> queryTaskList(int start, int pageSize,Task task) {
        return taskMapper.queryTaskList(start,pageSize,task);
    }
    @Override
    public int queryTaskCount(Task task) {
        return taskMapper.queryTaskCount(task);
    }
}
