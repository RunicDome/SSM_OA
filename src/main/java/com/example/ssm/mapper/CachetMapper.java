package com.example.ssm.mapper;

import com.example.ssm.entity.Cachet;
import com.example.ssm.entity.CachetType;
import com.example.ssm.entity.User;

import java.util.List;

public interface CachetMapper {
    int addCachet(Cachet cachet);
    int selectUserIdByName(String name);
    int selectCachetIdByName(String name);
    int selectdeptIdByName(String name);
    int selectRoleIdByName(String name);
    List<CachetType> selectCachetTypeList();
    List<User> selectAdminList(int roleid);
    Cachet selectCachetByTaskid(int taskid);
}
