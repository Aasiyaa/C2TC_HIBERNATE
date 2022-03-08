package com.cg.placement.service;
import com.cg.placement.entities.College;
import com.cg.placement.repository.CollegeRepository;
import com.cg.placement.repository.CollegeRepositoryImpl;




//+updateCollege(College college) : College
//+searchCollege(long id): College
//+deleteCollege(long id):Boolean
//+schedulePlacement(Placement placement): boolean


public class CollegeServiceImpl implements CollegeService {
	private CollegeRepository repo;
	

	public CollegeServiceImpl() {
		repo=new UserRepositoryImpl();
	}

	//addCollege(College college) : College
	@Override
	public College addCollege(College clg) {
		repo.beginTransaction();
		repo.addNewUser(clg);
		repo.commitTransaction();
	}
	//+updateCollege(College college) : College
	@Override
	public void updateCollege(College clg) {
		repo.beginTransaction();
		repo.updateUser(clg);
		repo.commitTransaction();
	}
	//+searchCollege(long id): College
	@Override
	public  College searchCollege(int id) {
		// TODO Auto-generated method stub
		
	}
	//+deleteCollege(long id):Boolean
	@Override
	public  Boolean deleteCollege(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	//+schedulePlacement(Placement placement): boolean
	
	@Override
	public boolean schedulePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return false;
	}
}
	