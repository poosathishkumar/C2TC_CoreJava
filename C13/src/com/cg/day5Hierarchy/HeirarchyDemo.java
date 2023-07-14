package com.cg.day5Hierarchy;

public class HeirarchyDemo {

	public static void main(String[] args) {
		Cse cse = new Cse();
		Ece ece = new Ece();
		Eee eee = new Eee();
		It it = new It();
		Mech mech = new Mech();
		
		cse.setCollegeName("MSAJCE");
		cse.setCollegeArea("chennai");
		cse.setCollegeCode(1301);
		cse.setHodName("madhan");
		cse.setNoOfStaff(10);
		cse.setNoOfStudents(25);
		
		ece.setCollegeName("MSAJCE");
		ece.setCollegeArea("Siruseri");
		ece.setCollegeCode(1301);
		ece.setHodName("mani");
		ece.setNoOfStaff(10);
		ece.setNoOfStudents(34);
		
		eee.setCollegeName("MSAJCE");
		eee.setCollegeArea("Siruseri");
		eee.setCollegeCode(1301);
		eee.setHodName("sathish");
		eee.setNoOfStaff(10);
		eee.setNoOfStudents(50);
		
		it.setCollegeName("MSAJCE");
		it.setCollegeArea("Siruseri");
		it.setCollegeCode(1301);
		it.setHodName("kamal");
		it.setNoOfStaff(10);
		it.setNoOfStudents(45);
		
		mech.setCollegeName("MSAJCE");
		mech.setCollegeArea("Siruseri");
		mech.setCollegeCode(1301);
		mech.setHodName("gokul");
		mech.setNoOfStaff(10);
		mech.setNoOfStudents(40);
		
		System.out.println(cse);
		System.out.println("...............");
		System.out.println(ece);
		System.out.println("...............");
		System.out.println(eee);
		System.out.println("...............");
		System.out.println(it);
		System.out.println("...............");
		System.out.println(mech);
		
	}
	

}
