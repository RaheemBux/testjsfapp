package com.test;

import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped;  

@ManagedBean(name = "studentMB")
@RequestScoped  
public class StudentManagedBean {
	
	private String studentName;
	
	
	
	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String show(){
		System.out.println("Here is Name : "+studentName);
		return "";
	}

}
