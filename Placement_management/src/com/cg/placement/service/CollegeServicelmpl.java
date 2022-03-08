package com.cg.placement.service;

import com.cg.placement.entities.College;
import com.cg.placement.repository.CollegeRepository;
import com.cg.placement.repository.CollegerepositoryImpl;


//addCollege(College college) : College
//+updateCollege(College college) : College
//+searchCollege(long id): College
//+deleteCollege(long id):Boolean
//+schedulePlacement(Placement placement): boolean

public class CollegeServicelmpl implements CollegeService{

	private CollegeRepository repos;
	
	
	public CollegeServiceImpl() {
		repos=new CollegerepositoryImpl();
	}

	@Override
	public College addCollege(College clg) {
		repos.beginTransaction();
		repos.addStudent(clg);
		repos.commitTransaction();
	}

	@Override
	public College updateCollege(College clg) {
		repos.beginTransaction();
		repos.updateCollege(clg);
		repos.commitTransaction();
		
	}

	
	@Override
	public College searchCollegebyId(int id) {
		repos.beginTransaction();
		repos.searchCollegeById(id);
		repos.commitTransaction();
		return null;
	}

	@Override
	public boolean deleteCollege(int id) {
		repos.beginTransaction();
		repos.deleteStudent(id);
		repos.commitTransaction();
		
	}

	@Override
	public boolean schedulePlacement(Placement placement) {
		// TODO Auto-generated method stub
		
	}


}