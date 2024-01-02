package com.example.ssm.service;

import com.example.ssm.entity.Announce;

import java.util.List;

public interface AnnounceService {
    List<Announce> queryAnnounceList(int start,int pageSize,Announce announce);
    int queryAnnounceCount(Announce announce);
    String queryUserNameById(int id);
}
