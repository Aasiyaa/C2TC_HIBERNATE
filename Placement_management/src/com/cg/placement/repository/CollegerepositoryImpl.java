package com.cg.placement.repository;
import javax.persistence.EntityManager;

import com.cg.placement.entities.College;


public class CollegeRepositoryImpl implements CollegeRepository {
	private EntityManager entityManager;
	


	public CollegeRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	
	}

//	addCollege(College college) : College
	@Override
	public  College addCollege(College clg) {
		entityManager.persist(clg);
		return clg;
		
		
		
	}



//	+updateCollege(College college) : College
	
	@Override
	public College updateCollege(College clg) {
		  entityManager.merge(clg);
		return clg;
	}
//	+searchCollege(long id): College

	@Override
	public College searchCollege(College clg) {
		  entityManager.search(clg);
		return clg;
	}
	
//	+deleteCollege(long id):Boolean
	@Override
	public Boolean deleteUser(int id) {
	entityManager.remove(id);
	return true;
	
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	

}