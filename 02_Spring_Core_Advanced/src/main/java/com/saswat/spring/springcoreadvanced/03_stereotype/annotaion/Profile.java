package com.saswat.spring.springcoreadvanced.stereotype.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	@Value("#{T(java.lang.Math).abs(-99)}")
	private int noOfCourses;
	@Value("#{T(java.lang.Integer).MAX_VALUE}")
	private int noOfVideos;
	@Value("#{new String('thought clan').toUpperCase()}")
	private String companyName;
	@Value("#{1>6?false:true}")
	private boolean isActive;

	public int getNoOfCourses() {
		return noOfCourses;
	}

	public void setNoOfCourses(int noOfCourses) {
		this.noOfCourses = noOfCourses;
	}

	public int getNoOfVideos() {
		return noOfVideos;
	}

	public void setNoOfVideos(int noOfVideos) {
		this.noOfVideos = noOfVideos;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Profile [noOfCourses=" + noOfCourses + ", noOfVideos=" + noOfVideos + ", companyName=" + companyName
				+ ", isActive=" + isActive + "]";
	}

}
