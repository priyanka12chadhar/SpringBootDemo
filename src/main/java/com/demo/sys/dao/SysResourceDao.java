package com.demo.sys.dao;

import com.demo.base.dao.BaseDao;
import com.demo.sys.entity.SysResource;
import com.demo.sys.entity.SysResourceExample;

import java.util.List;
import java.util.Map;

public interface SysResourceDao extends BaseDao<SysResource, SysResourceExample> {

    List<SysResource> selectByUsername(Map<String, Object> param);

}