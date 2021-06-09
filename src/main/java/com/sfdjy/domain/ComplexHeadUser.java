package com.sfdjy.domain;

import com.alibaba.excel.annotation.ExcelProperty;

import java.util.Date;

/**
 * @version 1.0.0
 * @ClassName ComplexHeadUser.java
 * @Author: SFDJY
 * @Description 复杂头用户实体类
 * @Date:Create in 9:34 2021/6/9
 * 声明：此源代码版权归SFDJY所有，任何人不得侵权。
 */
public class ComplexHeadUser {
    @ExcelProperty({"用户主题1","用户编号"})
    private Integer userId;

    @ExcelProperty({"用户主题2","用户名称"})
    private String userName;

    @ExcelProperty({"用户主题3","入职时间"})
    private Date hireDate;

    public ComplexHeadUser() {
    }

    public ComplexHeadUser(Integer userId, String userName, Date hireDate) {
        this.userId = userId;
        this.userName = userName;
        this.hireDate = hireDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "ComplexHeadUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
