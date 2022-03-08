package com.cg.placement.repository;
import com.cg.placement.entities.College;
//addCollege(College college) : College
//+updateCollege(College college) : College
//+searchCollege(long id): College
//+deleteCollege(long id):Boolean

public interface CollegeRepository {
		public abstract College addCollege(College clg);
		public abstract College updateCollege(College clg);
		public abstract College searchCollege(int id);
		public abstract College deleteUser(int id);
		public abstract void commitTransaction();
		public abstract void beginTransaction();
		

		}
