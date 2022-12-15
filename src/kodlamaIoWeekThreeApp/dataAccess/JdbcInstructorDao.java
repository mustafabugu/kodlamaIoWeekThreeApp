package kodlamaIoWeekThreeApp.dataAccess;

import kodlamaIoWeekThreeApp.entities.Instructor;

public class JdbcInstructorDao implements IInsructorDao {
	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi.");

	}

}
