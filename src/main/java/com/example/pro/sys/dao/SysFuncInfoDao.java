package com.example.pro.sys.dao;

import com.example.pro.sys.entity.SysFuncInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
public interface SysFuncInfoDao {

    public List<SysFuncInfo> getList();
}
