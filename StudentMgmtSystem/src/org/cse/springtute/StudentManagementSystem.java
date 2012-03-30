package org.cse.springtute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManagementSystem  {

	private SimpleStudentRepository repo;

        public void setRepo(SimpleStudentRepository repo) {
        this.repo = repo;
        }

        public SimpleStudentRepository getRepo() {
        return repo;
        }


	public void listAllStudents() {
		
                List students=repo.findAllStudents();
                Iterator iter=students.iterator();
                while(iter.hasNext()){
                    Student stu=(Student)iter.next();
                    System.out.println("My name is "+stu.getFirstName()+stu.getLastName());
                    System.out.println("My reg num is "+stu.getRegNumber());
                }
	}

	public void registerStudent(Student stu){
            
            repo.saveStudent(stu);
            
		
	}
}
