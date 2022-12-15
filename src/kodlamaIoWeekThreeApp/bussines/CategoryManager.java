package kodlamaIoWeekThreeApp.bussines;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoWeekThreeApp.dataAccess.ICategoryDao;
import kodlamaIoWeekThreeApp.entities.Category;
import kodlamaIoWeekThreeApp.logging.ILogger;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	private List<Category> categories;

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = new ArrayList<Category>();
	}

	public void add(Category category) throws Exception {

		for (Category category2 : categories) {
			if (category.getName() == category2.getName()) {
				throw new Exception("Bu isimde bir kategori zaten mevcut!");
			}
			categoryDao.add(category2);
			categories.add(category2);
		}

		for (ILogger logger : loggers) {
			logger.log(category.getName());
		}
	}
}