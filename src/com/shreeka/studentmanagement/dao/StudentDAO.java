/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.studentmanagement.dao;

import com.shreeka.studentmanagement.entity.Student;


/**
 *
 * @author Decode
 */
public interface StudentDAO {
   
     boolean insert(Student s);
    boolean delete(int id);
    Student getById(int id);
    Student[] getAll();
    
}
