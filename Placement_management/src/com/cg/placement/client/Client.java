package com.cg.placement.client;

public class Client {

	public static void main(String[] args) {
		import com.cg.placement.entities.College;
		import com.cg.placement.services.CollegeService;
		import com.cg.placement.services.CollegeServiceImpl;

		public class Client {

			public static void main(String[] args) {
			 CollegeService service = new CollegeServiceImpl();
			 College clg=new College();
			clg.setId(20);
			clg.setName("sharath");
			clg.setType("shj");
			clg.setPassword("sjsjkk");
			service.addNewUser(clg);
			}

		}
	}

}
