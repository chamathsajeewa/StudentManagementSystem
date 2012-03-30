package org.cse.springtute;
import org.springframework.context.support.*;
public class SmsStarter {

	public static void main(String[] args) {
		StudentManagementSystem sms;//=new StudentManagementSystem() ;
                        
                        Student stu1=new Student("chamath","Sajeewa",5632632l,"32/sumanasara mawath/matara");
                        Student stu2=new Student("akila","anusari",232323,"32/sumanasara mawatha/colombo");

                        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("org/cse/springtute/spring-context.xml");
                        context.start();

                        sms=(StudentManagementSystem)context.getBean("sms");

                        System.out.println("1-----------------------------------1");
                        sms.listAllStudents();
                        System.out.println("1-----------------------------------1");

                        sms.registerStudent(stu1);
                        sms.registerStudent(stu2);
		        System.out.println("2-----------------------------------2");
                        sms.listAllStudents();
                        System.out.println("2-----------------------------------2");
	}
}
