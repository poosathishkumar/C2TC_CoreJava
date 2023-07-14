package com.cg.day5Hierarchy;

public class It extends College{
	private String hodName;
	private int noOfStaff;
	private int noOfStudents;
	
	public String getHodName() {
		return hodName;
	}
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	public int getNoOfStaff() {
		return noOfStaff;
	}
	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	@Override
	public String toString() {
		return "It Details [hodName = " + hodName + ", noOfStaff = " + noOfStaff + ", noOfStudents = " + noOfStudents
				+ ", CollegeName = " + getCollegeName() + ", CollegeArea = " + getCollegeArea()
				+ ", CollegeCode = " + getCollegeCode() + "]";
	}

}
