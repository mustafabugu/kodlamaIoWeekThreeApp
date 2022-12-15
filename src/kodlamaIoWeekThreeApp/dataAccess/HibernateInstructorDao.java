package kodlamaIoWeekThreeApp.dataAccess;

import kodlamaIoWeekThreeApp.entities.Instructor;

public class HibernateInstructorDao implements IInsructorDao {
	@Override
	public void add(Instructor instructor) {
		
		System.out.println("Hibernate ile veritabanına eklendi.");
		
	}

}
