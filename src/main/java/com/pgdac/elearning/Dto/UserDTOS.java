package com.pgdac.elearning.Dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDTOS {
	private int User_id;
	
	@NotEmpty
	@Size(max = 20, message = "name is not valid")
	@Column(name = "Fname")
	private String fName;
	
	
	@Size(max = 20, message = "name is not valid")
	@NotEmpty
	@Column(name = "Lname")
	private String lName;

	@Email
	@Column(name = "email")
	private String email;



	@Temporal(TemporalType.DATE)
	private Date registrationDate = new Date();

	@NotEmpty
	@Size(max = 10)
	@Column(name = "Qualification")
	private String qualification;

	@NotEmpty
	@Size(max = 10)
	@Column(name = "num_Of_Published_Courses", nullable = false)
	private String publishedCourses;

	@Column(name = "avg_Rating")
	private int avgRting;

	@NotEmpty
	@Size(max = 10, message = "Number is Not valid")
	@Column(name = "contact")
	private String contact;

	private String adharNo;

	@NotEmpty
	@Size(max = 10)
	@Column(name = "role")
	private String role;

	public UserDTOS() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public UserDTOS(int user_id, @NotEmpty @Size(max = 20, message = "name is not valid") String fName,
			@Size(max = 20, message = "name is not valid") @NotEmpty String lName, @Email String email,
			 Date registrationDate, @NotEmpty @Size(max = 10) String qualification,
			@NotEmpty @Size(max = 10) String publishedCourses, int avgRting,
			@NotEmpty @Size(max = 10, message = "Number is Not valid") String contact, String adharNo,
			@NotEmpty @Size(max = 10) String role) {
		super();
		User_id = user_id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
				this.registrationDate = registrationDate;
		this.qualification = qualification;
		this.publishedCourses = publishedCourses;
		this.avgRting = avgRting;
		this.contact = contact;
		this.adharNo = adharNo;
		this.role = role;
	}



	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPublishedCourses() {
		return publishedCourses;
	}

	public void setPublishedCourses(String publishedCourses) {
		this.publishedCourses = publishedCourses;
	}

	public int getAvgRting() {
		return avgRting;
	}

	public void setAvgRting(int avgRting) {
		this.avgRting = avgRting;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserDTOS [User_id=" + User_id + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				 + ", registrationDate=" + registrationDate + ", qualification="
				+ qualification + ", publishedCourses=" + publishedCourses + ", avgRting=" + avgRting + ", contact="
				+ contact + ", adharNo=" + adharNo + ", role=" + role + "]";
	}

}
