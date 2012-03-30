/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cse.springtute.test;

import java.util.Iterator;
import java.util.List;
import org.cse.springtute.SimpleStudentRepository;
import org.cse.springtute.Student;
import org.junit.*;
/**
 *
 * @author chamath
 */
public class testSimpleStudentRepository {

    SimpleStudentRepository rep;
    @Before
    public void setUp(){
         rep=new SimpleStudentRepository();
    }

    @Test
    public void TestSaveStudent(){
        Student stu1=new Student("Isuru","Jayasinghe",1L,"Ragama");
        Student stu2=new Student("Tharindu","Gunasinghe",2L,"Gampaha");
        Student stu3=new Student("chamath","Sajeewa",3L,"Matara");
        rep.saveStudent(stu1);
        rep.saveStudent(stu2);
        rep.saveStudent(stu3);
        Student stu4=rep.findStudent(1L);
        Student stu5=rep.findStudent(2L);
        Student stu6;
        //we check whether the 2 student objects are properly saved in repository
        Assert.assertNotNull("object is null",stu3);
        Assert.assertNotNull("object is null",stu4);
    }

    @Test
    public void TestDeleteStudent(){

        rep.deleteStudent(2L);
        Student stu=rep.findStudent(2L);
        //we check whether the student with given registration number is deleted from repository
        Assert.assertNull(rep.findStudent(2L));


    }

    @Test
    public void TestFindStudent(){

        Student stu=rep.findStudent(3L);
       //we check whether the student with given registration number can be found usin this function
        Assert.assertNotNull(stu);
        

    }

    

    @Test
    public void TestFindAllStudent(){
        List students=rep.findAllStudents();
        Iterator iter=students.iterator();
        while(iter.hasNext())
        {
            Student stu=(Student)iter.next();
            System.out.println("My name is "+stu.getFirstName()+stu.getLastName());
        }

    }
    @After
    public void tearDown(){

    }


}
