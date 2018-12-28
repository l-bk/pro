package com.example.pro.sys.web;

import com.alibaba.fastjson.JSONObject;
import com.example.pro.sys.entity.SysFuncInfo;
import com.example.pro.sys.service.SysFuncInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value="/sys/func")
public class SysFuncInfoController {

    protected static final Logger logger = LogManager.getLogger(SysFuncInfoController.class);

    @Autowired
    private SysFuncInfoService sysFuncInfoService;

    @RequestMapping(value = "/getList",method= RequestMethod.GET)
    public JSONObject getList(){
        JSONObject json = new JSONObject();
        List<SysFuncInfo> list =sysFuncInfoService.getList();
        return json;

    }
}
