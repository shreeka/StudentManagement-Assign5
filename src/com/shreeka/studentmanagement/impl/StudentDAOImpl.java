/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.studentmanagement.impl;

import com.shreeka.studentmanagement.dao.StudentDAO;
import com.shreeka.studentmanagement.entity.Student;

/**
 *
 * @author Decode
 */
public class StudentDAOImpl implements StudentDAO {
    
    private int counter=0;
    private Student[] studentList=new Student[10];

    @Override
    public boolean insert(Student c) {
        if(counter<studentList.length)
        {
            studentList[counter]=c;
            counter++;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for(int i=0;i<studentList.length;i++)
        {
            Student c=studentList[i];
            if(c!=null && c.getId()==id)
            {
                c=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Student getById(int id) {
        for(int i=0;i<studentList.length;i++)
        {
            Student c= studentList[i];
            if(c!=null && c.getId()==id){
            return c;
            }
        }
        return null;  
    }

    @Override
    public Student[] getAll() {
        return studentList;
    }
    
}
