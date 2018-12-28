package com.example.pro.sys.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sys/user")
public class SysUserInfoController {
    protected Logger logger = LogManager.getLogger(SysUserInfoController.class);


}
