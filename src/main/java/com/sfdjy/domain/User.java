package com.sfdjy.domain;

import com.alibaba.excel.annotation.ExcelProperty;

import java.util.Date;

/**
 * @version 1.0.0
 * @ClassName User.java
 * @Author: SFDJY
 * @Description 用户实体类
 * @Date:Create in 22:13 2021/6/8
 * 声明：此源代码版权归SFDJY所有，任何人不得侵权。
 */
public class User {
    @ExcelProperty("用户编号")
    private Integer userId;

    @ExcelProperty("姓名")
    private String userName;

    @ExcelProperty("性别")
    private String gender;

    @ExcelProperty("工资")
    private Double salary;

    @ExcelProperty("入职时间")
    private Date hireDate;

    public User() {
    }

    public User(Integer userId, String userName, String gender, Double salary, Date hireDate) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.salary = salary;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
