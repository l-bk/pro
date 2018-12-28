package com.example.pro.sys.entity;

import java.util.Date;


public class SysFuncInfo {
    private Integer funcId;
    private String funcName;
    private Integer funcParent;
    private String funcParentName;
    private String funcType;
    private Integer funcSort;
    private String funcUrl;
    private String funcIdentifying;
    private String funcLogo;
    private String menuLocation;
    private String isShow;
    private String newPage;
    private String funcRemark;
    private Date createDate;

    public Integer getFuncId() {
        return funcId;
    }

    public void setFuncId(Integer funcId) {
        this.funcId = funcId;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public Integer getFuncParent() {
        return funcParent;
    }

    public void setFuncParent(Integer funcParent) {
        this.funcParent = funcParent;
    }

    public String getFuncParentName() {
        return funcParentName;
    }

    public void setFuncParentName(String funcParentName) {
        this.funcParentName = funcParentName;
    }

    public String getFuncType() {
        return funcType;
    }

    public void setFuncType(String funcType) {
        this.funcType = funcType;
    }

    public Integer getFuncSort() {
        return funcSort;
    }

    public void setFuncSort(Integer funcSort) {
        this.funcSort = funcSort;
    }

    public String getFuncUrl() {
        return funcUrl;
    }

    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }

    public String getFuncIdentifying() {
        return funcIdentifying;
    }

    public void setFuncIdentifying(String funcIdentifying) {
        this.funcIdentifying = funcIdentifying;
    }

    public String getFuncLogo() {
        return funcLogo;
    }

    public void setFuncLogo(String funcLogo) {
        this.funcLogo = funcLogo;
    }

    public String getMenuLocation() {
        return menuLocation;
    }

    public void setMenuLocation(String menuLocation) {
        this.menuLocation = menuLocation;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getNewPage() {
        return newPage;
    }

    public void setNewPage(String newPage) {
        this.newPage = newPage;
    }

    public String getFuncRemark() {
        return funcRemark;
    }

    public void setFuncRemark(String funcRemark) {
        this.funcRemark = funcRemark;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


}
