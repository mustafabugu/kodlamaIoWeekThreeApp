package kodlamaIoWeekThreeApp.dataAccess;

import kodlamaIoWeekThreeApp.entities.Courses;

public class JdbcCoursesDao implements ICoursesDao {
	@Override
	public void add(Courses courses) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}

}
