/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shreeka.studentmanagement;

import com.shreeka.studentmanagement.dao.StudentDAO;
import com.shreeka.studentmanagement.entity.Student;
import com.shreeka.studentmanagement.impl.StudentDAOImpl;
import java.util.Scanner;

/**
 *
 * @author Decode
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        StudentDAO studentDAO=new StudentDAOImpl();
        while(true)
        {
            System.out.println("");
        System.out.println("1.Add Student");
        System.out.println("2.Delete Student");
        System.out.println("3.Show All");
        System.out.println("4.Search by ID");
            System.out.println("5. Update a student");
        System.out.println("6.Exit");
        System.out.print("Enter your choice [1-5]: ");
        
        switch(input.nextInt())
        {
            case 1:
                Student c=new Student();
                System.out.println("Add new student");
                System.out.print("Enter student Id: ");
                c.setId(input.nextInt());
                System.out.print("Enter student name: ");
                c.setName(input.next());
                System.out.print("Enter college name: ");
                c.setCollege(input.next());
                System.out.print("Enter contact no: ");
                c.setContactNo(input.nextInt());
                               
                
                if(studentDAO.insert(c))
                {
                    System.out.println("Inserted successfully");
                }else
                    System.out.println("Data full");
                
                break;
                
            case 2:
                System.out.print("Enter student id to be deleted: ");
                if(studentDAO.delete(input.nextInt()))
                {
                    System.out.println("Student deleted.");   
                }else
                    System.out.println("Null student id. Cannot be deleted. ");
                break;
                
            case 3:
                System.out.println("Display all students");
                Student[] studentList= studentDAO.getAll();
                for(int i=0;i<studentList.length;i++)
                {   if(studentList[i]!=null)
                {
                    System.out.println("Student id: "+studentList[i].getId());
                    System.out.println("Student name: "+studentList[i].getName());
                    System.out.println("College name: "+studentList[i].getCollege());
                    System.out.println("Student contact no: "+studentList[i].getContactNo());
                    System.out.println("");
                }
                }
                break;
                
            case 4:
                System.out.print("Enter student id to be searched: ");
                Student student= studentDAO.getById(input.nextInt());
                if(student!=null){
                System.out.println("Student id: "+student.getId());
                System.out.println("Student name: "+student.getName());
                System.out.println("College name: "+student.getCollege());
                System.out.println("Student contact no: "+student.getContactNo());
                }else
                    System.out.println("Student could not be found.");
                break;
                
            case 5:
                System.out.print("Enter student id to be updated: ");
                int id=input.nextInt();
                Student cupdate=studentDAO.getById(id);
                if(cupdate!=null){

                System.out.println("1. Update student id");
                System.out.println("2. Update student name");
                System.out.println("3. Update college name");
                    System.out.println("4.Update contact no");
                System.out.print("Enter your choice: ");
                switch(input.nextInt())
                {
                    case 1:
                        System.out.print("Enter new student id: ");
                        cupdate.setId(input.nextInt());
                        break;
                    case 2:
                        System.out.print("Enter new student name: ");
                        cupdate.setName(input.next());
                        break;
                    case 3:
                        System.out.print("Enter new college name: ");
                        cupdate.setCollege(input.next());
                        break;
                    case 4:
                        System.out.print("Enter new contact no: ");
                        cupdate.setContactNo(input.nextInt());
                        break;
                }
                    System.out.println("Updated successfully");
                }else
                System.out.println("Student could not be found.");
                break;
                
            case 6:
                System.out.print("Do you really want to exit?(y/n)");
                if((input.next()).equalsIgnoreCase("y")){
                System.exit(0);
                }
                break;
                    
        }
        }
    }
   
    
}
