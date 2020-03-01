package jpa.entitymodels;

import java.util.List;

import javax.persistence.*;




@Entity
@NamedQuery(name="Student.all", query = "Select s FROM Student s")
@Table (name= "Student")
public class Student {
	
	
	//Student’s current school email, unique student identifier
	  
@Id
@Column(name = "email", nullable = false, length=50)  
	private String sEmail; 
	  
	//   The full name of the student
@Basic
@Column(name = "name", nullable = false, length=50)
	   private String sName;
	   
	   //Student’s password in order to login
	   @Basic
		@Column(name = "password", nullable = false, length=50)
	   private String sPass;

	   
	   @OneToMany( targetEntity=Course.class )
	   
	//   @ManyToMany(targetEntity=Course.class)
	//   private Set studentCourse;
	   
	   //All the courses that a student’s registered for
	   //List needs a parameter <String>
	   private List <Course> sCourses;

	/**
	 * @param sEmail
	 * @param sName
	 * @param password
	 */
	   
	   //constructors  
	   
	public Student(String sEmail, String sName, String sPass) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
	
	}
	
	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPass = sPass;
		this.sCourses = sCourses;
	}


	  public Student() {
		  
	  }

	/**
	 * @return the sEmail
	 */
	  
	
	  public String getsEmail() {
		return sEmail;
	}

	/**
	 * @param sEmail the sEmail to set
	 */
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	/**
	 * @return the sName
	 */
	
	public String getsName() {
		return sName;
	}

	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}

	/**
	 * @return the password
	 */
	
	public String getPassword() {
		return sPass;
	}

	/**
	 * @param password the password to set
	 */
	
	public void setPassword(String sPass) {
		this.sPass = sPass;
	}

	/**
	 * @return the sCourses
	 */
	public List<Course> getsCourses() {
		return sCourses;
	}

	/**
	 * @param sCourses the sCourses to set
	 */
	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}
	  
	  //getters and setters 
	
	public String toString() {
		return "\nEmail: " + sEmail + " Name:" + sName + " Password: " + sPass + " ";
		
		
	}
	  
	  
}
