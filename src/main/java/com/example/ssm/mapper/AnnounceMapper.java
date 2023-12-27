package com.example.ssm.mapper;

import com.example.ssm.entity.Announce;
import com.example.ssm.entity.Task;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnnounceMapper {
    List<Announce> queryAnnounceList(@Param("start")int start, @Param("pageSize")int pageSize, @Param("announce") Announce announce);
    int queryAnnounceCount(Announce announce);
}
