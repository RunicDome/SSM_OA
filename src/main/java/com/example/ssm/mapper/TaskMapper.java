package com.example.ssm.mapper;

import com.example.ssm.entity.Task;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskMapper {
    List<Task> queryTaskList(@Param("start")int start, @Param("pageSize")int pageSize,@Param("task")Task task);

    int queryTaskCount(Task task);
    int addTask(Task task);
}
