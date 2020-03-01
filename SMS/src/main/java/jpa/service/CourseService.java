package jpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;


public class CourseService implements CourseDAO{

	@Override
	
	//This method takes no parameter and returns every Course in the table.
	
public List<Course> getAllCourses() {
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("SMS");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		TypedQuery<Course> query = entitymanager.createNamedQuery("Course.all", Course.class);
		List <Course> courseList = query.getResultList();
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Available Classes: ");
        System.out.printf("%-5s|%-25s|%-25s\n", "#", "COURSE NAME", "INSTRUCTOR NAME");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      
	//	System.out.println(myCourses);
		
        for(Course course : courseList){
            System.out.printf("%-5s|%-25s|%-25s\n", course.getcId(), course.getcName(), course.getcInstructorName());
        }
	
        entitymanager.close();
		entitymanagerfactory.close();
		
		return courseList;
	}
	
//This is what is needed to print all students This should be in main or adapted into the method.  
//	May need a toString to print obj instead of location.
//	CourseService cou = new StudentService();
//	List<Course> courseList = new ArrayList<Course>();
//	courseList = cou.getAllCourses();
//	System.out.println(courseList);
	
}
