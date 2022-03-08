package com.cg.placement.repository;
import javax.persistence.EntityManager;

import com.cg.placement.entities.College;
//addCollege(College college) : College
//+updateCollege(College college) : College
//+searchCollege(long id): College
//+deleteCollege(long id):Boolean
public class CollegerepositoryImpl implements CollegeRepository{

	private EntityManager entityManager;
	
	
	public void CollegerepoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public College addCollege(College clg) {
		entityManager.persist(clg);
		
	}

	@Override
	public College updateCollege(College clg) {
		entityManager.merge(clg);
		
	}
	@Override
	public College searchCollegeById(int id) {
		College clg = entityManager.find(College.class, id);
		return clg;
	}


	@Override
	public boolean deleteCollege(int id) {
		Student student=entityManager.find(College.class,id);
		entityManager.remove(student);
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