/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cse.springtute.test;
import org.cse.springtute.SimpleStudentRepository;
import org.cse.springtute.Student;
import org.cse.springtute.StudentManagementSystem;
import org.junit.*;
/**
 *
 * @author chamath
 */
public class testStudentManagementSystem {

    StudentManagementSystem sms;
    @Before
    public void setUp(){

     sms=new StudentManagementSystem();
     SimpleStudentRepository rep=new SimpleStudentRepository();
     sms.setRepo(rep);
    }
    
    @Test
    public void testRegisterStudent(){
               Student stu=new Student("chamath","Sajeewa",34L,"Matara");
               sms.registerStudent(stu);
               Student stu1=sms.getRepo().findStudent(34L);
              //check whether the student with registration number 34L is exist in the repository
               Assert.assertNotNull(stu1);

    }

    @Test
    public void TestListAllStudent(){

    }

    @After
    public void tearDown(){

    }

}
