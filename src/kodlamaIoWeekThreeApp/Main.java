package kodlamaIoWeekThreeApp;

import kodlamaIoWeekThreeApp.bussines.CategoryManager;
import kodlamaIoWeekThreeApp.bussines.CoursesManager;
import kodlamaIoWeekThreeApp.bussines.InsructorManager;
import kodlamaIoWeekThreeApp.dataAccess.HibernateCategoryDao;
import kodlamaIoWeekThreeApp.dataAccess.HibernateCoursesDao;
import kodlamaIoWeekThreeApp.dataAccess.JdbcInstructorDao;
import kodlamaIoWeekThreeApp.entities.Category;
import kodlamaIoWeekThreeApp.entities.Courses;
import kodlamaIoWeekThreeApp.entities.Instructor;
import kodlamaIoWeekThreeApp.logging.ILogger;

public class Main {

	public static void main(String[] args) throws Exception {
		ILogger[] loggers = {};
		
		Courses courses1 = new Courses(1,"Java",100);
		Courses courses2 = new Courses(2, "C#", 75);
		Courses courses3 = new Courses(2, "C#", 75);

		
		Category category1 = new Category(1,"Programlama");
		Category category2 = new Category(2,"Programlama2");
		
		CoursesManager coursesManager = new CoursesManager(new HibernateCoursesDao(),loggers);
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category1);
		
		Instructor instructor = new Instructor (1,"Engin DEMİROĞ");
		InsructorManager insructorManager = new InsructorManager(new JdbcInstructorDao(), loggers);
		insructorManager.add(instructor);
		
//		Instructor instructor = new Instructor (2,"Engin DEMİROĞ");
//		InsructorManager insructorManager = new InsructorManager(new JdbcInstructorDao(), loggers);
//		insructorManager.add(instructor);
	}

}
