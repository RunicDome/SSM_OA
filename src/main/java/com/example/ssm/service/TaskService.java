package com.example.ssm.service;

import com.example.ssm.entity.Task;

import java.sql.Timestamp;
import java.util.List;

public interface TaskService {
    List<Task> queryTaskList(int start, int pageSize,Task task);
    int queryTaskCount(Task task);
    int addTask(String name, Long typeid, Long taskid, Long userid, Long adminid, Timestamp lauchtime, int state);
}
