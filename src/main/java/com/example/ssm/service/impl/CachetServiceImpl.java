package com.example.ssm.service.impl;

import com.example.ssm.entity.Cachet;
import com.example.ssm.entity.CachetType;
import com.example.ssm.entity.User;
import com.example.ssm.mapper.CachetMapper;
import com.example.ssm.service.CachetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CachetServiceImpl implements CachetService {
    @Autowired
    CachetMapper cachetMapper;
    @Override
    public int addCachet(Cachet cachet) {
        return cachetMapper.addCachet(cachet);
    }

    @Override
    public int selectUserIdByName(String name) {
        return cachetMapper.selectUserIdByName(name);
    }

    @Override
    public int selectCachetIdByName(String name) {
        return cachetMapper.selectCachetIdByName(name);
    }

    @Override
    public int selectdeptIdByName(String name) {
        return cachetMapper.selectdeptIdByName(name);
    }

    @Override
    public int selectRoleIdByName(String name) {
        return cachetMapper.selectRoleIdByName(name);
    }

    @Override
    public List<CachetType> selectCachetTypeList() {
        return cachetMapper.selectCachetTypeList();
    }

    @Override
    public List<User> selectAdminList(int roleid) {
        return cachetMapper.selectAdminList(roleid);
    }

    @Override
    public Cachet selectCachetByTaskid(int taskid) {
        return cachetMapper.selectCachetByTaskid(taskid);
    }
}
