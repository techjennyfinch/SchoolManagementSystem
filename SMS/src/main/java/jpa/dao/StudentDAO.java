package jpa.dao;

import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	
	// method reads student table in database and returns the data as a List<Student>
	public List<Student> getAllStudents();
	
	//method takes student email and parses the student list for a Student 
	//with that email and returns a student Object.
	public Student getStudentByEmail(String sEmail);
	
	//method takes user email and password from user input and returns
	//if student is found or not
	public boolean validateStudent(String sEmail, String sPassword);
	
	//after successful student validation this method takes a student email and course id and checks
	// in the join table (Student_course) generated by JPA to find if a student is currently attending 
	// a course with that ID
	// if student is not attending that course register the student to that course, otherwise not
	public void registerStudentToCourse(String sEmail, int cId);
	
	// takes email and finds all courses a student is registered
	public List<Course> getStudentCourses(String sEmail);

}