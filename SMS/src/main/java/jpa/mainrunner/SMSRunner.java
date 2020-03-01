package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	/*
	 * This method displays and prompt the user to select one of the following with
	 * the option: 1. Student: which allows the user to enter his/her email and
	 * password and check whether or not those credentials are valid, in order to
	 * log in. If the credentials are invalid the program should end with
	 * appropriate message to the student. If the credentials are valid, the student
	 * is logged in and all the classes the Student is registered to should be
	 * displayed. Displays and prompt the student to select one of the following two
	 * additional numeric (1 or 2) options that are available: 1) Register to Class:
	 * Which displays all the courses in the database and allows the student to
	 * select a course in which the student wished to be registered to. If the
	 * Student is already registered in that course, display the message
	 * "You are already registered in that course!", otherwise, register the student
	 * to that course and save this result in your database. Also show the updated
	 * registered courses list for that student. After that end the program with
	 * appropriate message. • 2) Logout: Which ends the program with appropriate
	 * message. 2. quit: which ends the program with appropriate message.
	 */

	public static void main(String[] args) {

// Req. 1 Create Tables.  Using these lines to run to create the database.

//		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "SMS" );
//		EntityManager entitymanager = emfactory.createEntityManager( );
//		//Starting Transaction
//		entitymanager.getTransaction( ).begin( );
//
//		// close the entity manager
//		entitymanager.close();
//		emfactory.close();

		System.out.println("Are you a(n)");
		System.out.println("1. Student");
		System.out.println("2. Quit");
		System.out.print("Answer: ");
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		if (answer == 1) {
			
			
			System.out.print("Enter your email: ");
			String email = in.next();
			System.out.print("Enter your password: ");
			String password = in.next();

			StudentService stu = new StudentService();
			
			// if valid student then list the courses.
			
			if (stu.validateStudent(email, password)==true) {
				stu.getStudentCourses(email);

				System.out.println("What would you like to do?");
				System.out.println("1. Register for a new Class");
				System.out.println("2. Log Out");
				System.out.print("Answer: ");
				answer = in.nextInt();

				if (answer == 1) {
					// Display a list of all Classes
					CourseService cou = new CourseService();
					List<Course> courseList = cou.getAllCourses();
					
					//Allows Registration

					System.out.print("Select Course by ID Number: ");
					int courseID = in.nextInt();
					System.out.println("Attempting to Register...");
					stu.registerStudentToCourse(email, courseID);
				} else {
					System.out.println("Logging Out...");
				}
			}

		}
		in.close();
		System.out.println("Closing Program. Goodbye.");
	}

}
