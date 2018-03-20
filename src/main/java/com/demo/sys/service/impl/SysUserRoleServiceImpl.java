package com.demo.sys.service.impl;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.demo.base.dao.BaseDao;
import com.demo.base.service.impl.BaseServiceImpl;
import com.demo.base.exception.DaoException;
import com.demo.sys.dao.SysUserRoleDao;
import com.demo.sys.entity.SysUserRole;
import com.demo.sys.entity.SysUserRoleExample;
import com.demo.sys.service.SysUserRoleService;

@Service("SysUserRoleService")
public class SysUserRoleServiceImpl extends BaseServiceImpl<SysUserRole, SysUserRoleExample> implements SysUserRoleService{

    @Resource
    private SysUserRoleDao dao;

    @Override
    public BaseDao<SysUserRole, SysUserRoleExample> getDao() throws DaoException {
        return dao;
    }
    
    
}
