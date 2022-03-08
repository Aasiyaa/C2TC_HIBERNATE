package com.cg.placement.client;

import com.cg.placement.entities.*;
import com.cg.placement.service.*;
//import java.util.List;

import com.cg.placement.client.*;
import com.cg.placement.service.*;


public class Client {

	public static void main(String[] args) {

		CollegeService service = new CollegeServiceImpl();
		College clg = new College();
//		addCollege(College college) : College
//		+updateCollege(College college) : College
//		+searchCollege(long id): College
//		+deleteCollege(long id):Boolean
//		Clgadmin;
//		private String Clgname;
//		private String location;
//		
		clg.setId(101);
		clg.setClgadmin("myadmin");
		clg.setClgname("presidency");
		clg.setLocation("Bangalore");
		
		service.addCollege(clg);

		System.out.println("End of program/Life cycle completed...");
	}
}