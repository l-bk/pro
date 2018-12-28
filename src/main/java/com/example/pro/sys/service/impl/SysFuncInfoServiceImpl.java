package com.example.pro.sys.service.impl;

import com.example.pro.sys.dao.SysFuncInfoDao;
import com.example.pro.sys.entity.SysFuncInfo;
import com.example.pro.sys.service.SysFuncInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysFuncInfoServiceImpl implements SysFuncInfoService{
    @Resource
    private SysFuncInfoDao sysFuncInfoDao;
    @Override
    public List<SysFuncInfo> getList() {
        return sysFuncInfoDao.getList();
    }
}
