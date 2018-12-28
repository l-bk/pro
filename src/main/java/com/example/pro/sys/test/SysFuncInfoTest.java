package com.example.pro.sys.test;

import com.example.pro.base.baseTest;
import com.example.pro.sys.entity.SysFuncInfo;
import com.example.pro.sys.service.SysFuncInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class SysFuncInfoTest extends baseTest {

    @Resource
    private SysFuncInfoService sysFuncInfoService;

    @Test
    public void getListTest(){
        List<SysFuncInfo> list = sysFuncInfoService.getList();
        System.out.println("success");
    }
}
