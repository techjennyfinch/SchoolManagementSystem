/**
 * 
 */
package jpa.mainrunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

/**
 * @author Jenny
 *
 */

//This class is for testing main method.
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	String email = "tattwool4@biglobe.ne.jp";
		//String email = "jen@jen.com";
	//	String email = "bad@email.com";
	//	String name = "";
	//	String password = "jen";
	//	Boolean valid = false;
		//Student student = new Student(email, name, password);
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter email");
		String email = input.next();
		System.out.println("enter pass");
		String password = input.next();
		
		
		
		
// Req. 1 Create Tables.  Using these lines to run to create the database.
		
//		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "SMS" );
//		EntityManager entitymanager = emfactory.createEntityManager( );
		//Starting Transaction
//		entitymanager.getTransaction( ).begin( );
//
		// close the entity manager
//		entitymanager.close();
//		emfactory.close();
		
		
		
		//this works for getStudentByEmail
//		StudentService stu = new StudentService();
//		Student student = new Student();
//		student = stu.getStudentByEmail(email);
//		System.out.println(student.getsName());   
		// TODO Auto-generated method stub
		
		//if valid user then print my classes. 		
		StudentService stu = new StudentService();
	Boolean valid = stu.validateStudent(email, password);
	System.out.println("Is Valid? " + valid);
	
		
		//this is to test and print allstudents query and result.
//	StudentService stu = new StudentService();
//		List<Student> studentList = new ArrayList<Student>();
//		studentList = stu.getAllStudents();
//		System.out.println(studentList);
//		
		CourseService cou = new CourseService();
	List<Course> courseList = new ArrayList<Course>();
		courseList = cou.getAllCourses();
	//	System.out.println( "printing" + courseList);
		
		//this is to test getting list of student classes
		
	//	StudentService stu = new StudentService();
		//List<Course> myCourses= 
	//			stu.getStudentCourses(email);
				
			//	int courseId = 4;  int cID;
				
	//			stu.registerStudentToCourse(email, 7);
				
				
	}

}
