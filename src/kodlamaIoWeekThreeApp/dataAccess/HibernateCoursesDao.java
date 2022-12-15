package kodlamaIoWeekThreeApp.dataAccess;

import kodlamaIoWeekThreeApp.entities.Courses;

public class HibernateCoursesDao implements ICoursesDao {
	@Override
	public void add(Courses courses) {

		System.out.println("Hibernate ile veritabanına eklendi.");

	}

}
