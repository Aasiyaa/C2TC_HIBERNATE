package com.cg.placement.repository;
import com.cg.placement.entities.College;

public interface CollegeRepository {
		public abstract College addNewUser(College clg);
		public abstract College updateUser(College clg);
		public abstract College deleteUser(College clg);
		public abstract void commitTransaction();
		public abstract void beginTransaction();
		

		}
