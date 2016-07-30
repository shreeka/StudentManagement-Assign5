/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.studentmanagement.entity;

/**
 *
 * @author Decode
 */
public class Student {
    
    private int id;
    private String name,college;
    private int contactNo;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }
    
    
    
    
}
