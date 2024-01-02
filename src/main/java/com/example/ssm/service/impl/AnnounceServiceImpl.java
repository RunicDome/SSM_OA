package com.example.ssm.service.impl;

import com.example.ssm.entity.Announce;
import com.example.ssm.mapper.AnnounceMapper;
import com.example.ssm.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnnounceServiceImpl implements AnnounceService {
    @Autowired
    AnnounceMapper announceMapper;
    @Override
    public List<Announce> queryAnnounceList(int start, int pageSize, Announce announce) {
        return announceMapper.queryAnnounceList(start,pageSize,announce);
    }

    @Override
    public int queryAnnounceCount(Announce announce) {
        return announceMapper.queryAnnounceCount(announce);
    }

    @Override
    public String queryUserNameById(int id) {
        return announceMapper.queryUserNameById(id);
    }
}
