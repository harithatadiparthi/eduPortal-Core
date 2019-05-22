package com.example.demo.customer;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer {
	 @Column(name = "Date_Entered_From")
	  private Date dateEnteredFrom;

	@Column(name = "Date_Entered_To")
	  private Date DateEnteredTo;
	 
	 @Column(name = "First_Name")
	  private String firstname ;
	 
	 @Column(name = "Last_Name")
	  private String lastname ;
	
	 @Column(name = "Company")
	  private String company;
	 
	 @Column(name = "Phone")
	  private String phone;
	
	 @Column(name = "Email")
	  private String email;
	 
	 @Column(name = "CFP_Registrant_ID")
	  private String cFPRegistrantID;
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "PTIN_ID")
	  private String pTINID;
	
	 @Column(name = "CTEC_Student_ID")
	  private String  cTECStudentID;
	 
	 @Column(name = "CCH_Account_Number")
	  private String  cCHAccountNumber;

	 @Column(name = "Course_Number")
	 private String  courseNumber;
	 
	 @Column(name = "Course_title")
	  private String  coursetitle;
	 
	 @Column(name = "Date_Of_Completion")
	  private Date  dateOfCompletion;
	 
	 
	 
	
	
	 public Date getDateEnteredFrom() {
		return dateEnteredFrom;
	}

	public void setDateEnteredFrom(Date dateEnteredFrom) {
		this.dateEnteredFrom = dateEnteredFrom;
	}

	public Date getDateEnteredTo() {
		return DateEnteredTo;
	}

	public void setDateEnteredTo(Date dateEnteredTo) {
		DateEnteredTo = dateEnteredTo;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String Firstname) {
		this.firstname = Firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String Lastname) {
		this.lastname = Lastname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCFPRegistrantID() {
		return cFPRegistrantID;
	}

	public void setCFPRegistrantID(String cFPRegistrantID) {
		this.cFPRegistrantID = cFPRegistrantID;
	}

	public String getPTINID() {
		return pTINID;
	}

	public void setPTINID(String pTINID) {
		this.pTINID = pTINID;
	}

	public String getCTECStudentID() {
		return cTECStudentID;
	}

	public void setCTECStudentID(String cTECStudentID) {
		this.cTECStudentID = cTECStudentID;
	}

	public String getCCHAccountNumber() {
		return cCHAccountNumber;
	}

	public void setCCHAccountNumber(String cCHAccountNumber) {
		this.cCHAccountNumber = cCHAccountNumber;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCoursetitle() {
		return coursetitle;
	}

	public void setCoursetitle(String coursetitle) {
		this.coursetitle = coursetitle;
	}

	public Date getDateOfCompletion() {
		return dateOfCompletion;
	}

	public void setDateOfCompletion(Date dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

	 @Override
	public String toString() {
		return "Customer [dateEnteredFrom=" + dateEnteredFrom + ", DateEnteredTo=" + DateEnteredTo + ", firstname="
				+ firstname + ", lastname=" + lastname + ", company=" + company + ", phone=" + phone + ", email="
				+ email + ", cFPRegistrantID=" + cFPRegistrantID + ", pTINID=" + pTINID + ", cTECStudentID="
				+ cTECStudentID + ", cCHAccountNumber=" + cCHAccountNumber + ", courseNumber=" + courseNumber
				+ ", coursetitle=" + coursetitle + ", dateOfCompletion=" + dateOfCompletion + "]";
	} 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
