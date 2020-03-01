package jpa.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jpa.service.StudentService;

public class junit_studentservicetest {
	
	//This test checks to make sure a non-registered email returns false.
	@Test
	public void validateStudentTest() {
		
		StudentService stu = new StudentService();
		Boolean valid = stu.validateStudent("john@john.com", "johnnycake");
		Boolean expected=false;
		assertEquals(valid,expected);
	}
}
