package kodlamaIoWeekThreeApp.dataAccess;

import kodlamaIoWeekThreeApp.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {

		System.out.println("Hinernate ile veritabanına eklendi.");

	}

}
