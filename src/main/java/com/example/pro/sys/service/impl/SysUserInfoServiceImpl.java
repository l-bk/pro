package com.example.pro.sys.service.impl;

import com.example.pro.sys.dao.SysUserInfoDao;
import com.example.pro.sys.service.SysUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserInfoServiceImpl implements SysUserInfoService {

    @Autowired
    private SysUserInfoDao sysUserInfoDao;
}
