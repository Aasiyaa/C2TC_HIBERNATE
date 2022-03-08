package com.cg.placement.service;
import com.cg.placement.entities.College;
//addCollege(College college) : College
//+updateCollege(College college) : College
//+searchCollege(long id): College
//+deleteCollege(long id):Boolean
//+schedulePlacement(Placement placement): boolean

public interface CollegeService {
	
	public College addCollege(College clg);
	public College updateCollege(College clg);
	public College searchCollege(long id);
	public boolean deleteCollege(long id);
	
	public boolean schedulePlacement(Placement placement);
	
}