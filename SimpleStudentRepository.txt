package org.cse.springtute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

    public SimpleStudentRepository() {

    Student stu=new Student("tharindu","wijewardena",5632222,"16/gamapaha");
    studentsDb.put(5632222L, stu);
    }


	public void saveStudent(Student stu) {
		studentsDb.put(stu.getRegNumber(), stu);
                

	}

	
	public void deleteStudent(Long regNumber) {
		studentsDb.remove(regNumber);

	}


	public Student findStudent(long regNumber) {
		
		Student stu=studentsDb.get(regNumber);
                return stu;
	}

	
	public void updateStudent(Student stu) {
		studentsDb.remove(stu.getRegNumber());
                studentsDb.put(stu.getRegNumber(), stu);

	}

	
	public List<Student> findAllStudents() {
		
                Iterator iter=  studentsDb.keySet().iterator();
                List students=new ArrayList<Student>();
//                while(iter.hasNext()){
//
//                    Student stu=(Student)iter.next();
//                    students.add(stu);
//
//                }
                students.addAll(studentsDb.values());
                
              return students;
	}

}
