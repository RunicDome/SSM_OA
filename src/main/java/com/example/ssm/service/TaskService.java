package com.example.ssm.service;

import com.example.ssm.entity.Task;

import java.util.List;

public interface TaskService {
    List<Task> queryTaskList(int start, int pageSize,Task task);
    int queryTaskCount(Task task);
}
