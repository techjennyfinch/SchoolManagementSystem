package jpa.entitymodels;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Course.all", query = "Select c FROM Course c")
@Table (name= "Course")
public class Course {
	
	//Unique course Identifier

//	@Column(name = "id", nullable = false)
	
	@Id
	@Column (name = "id", nullable = false)
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int cId;
	
	//Provides the name of the course
	
	@Basic
	@Column(name = "name", nullable = false, length=50)
	private String cName;
	
	
	//Provides the name of the instructor
	
	@Basic
	@Column(name = "instructor", nullable = false, length=50)
	private String cInstructorName;

	
	
//constructors
	
	/**
	 * @param cId
	 * @param cName
	 * @param cInstructorName
	 */
	public Course(int cId, String cName, String cInstructorName) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}

	public Course() {
		
	}

	/**
	 * @return the cId
	 */
	
	
	public int getcId() {
		return cId;
	}

	/**
	 * @param cId the cId to set
	 */
	public void setcId(int cId) {
		this.cId = cId;
	}

	/**
	 * @return the cName
	 */
	
	public String getcName() {
		return cName;
	}

	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}

	/**
	 * @return the cInstructorName
	 */
	
	
	public String getcInstructorName() {
		return cInstructorName;
	}

	/**
	 * @param cInstructorName the cInstructorName to set
	 */
	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}
	
	//getters and setters
	
	
	
	
}
