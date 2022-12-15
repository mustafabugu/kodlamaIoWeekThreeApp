package kodlamaIoWeekThreeApp.bussines;

import java.util.List;

import kodlamaIoWeekThreeApp.dataAccess.ICoursesDao;
import kodlamaIoWeekThreeApp.entities.Courses;
import kodlamaIoWeekThreeApp.logging.ILogger;

public class CoursesManager {
	private ICoursesDao coursesDao;
	private ILogger[] loggers;
	private List<Courses> courses;

	public CoursesManager(ICoursesDao coursesDao, ILogger[] loggers) {
		this.coursesDao = coursesDao;
		this.loggers = loggers;
	//	this.courses = courses;
	}

	public void add(Courses course) throws Exception {

		for (Courses courses2 : courses) {

			if (courses2.getName() == course.getName()) {
				throw new Exception("Bu isimde bir kurs zaten mevcut!");
			}

			if (courses2.getPrice() < 0) {
				throw new Exception("Kurs fiyatı 0'dan küçük olamaz!");
			}
			coursesDao.add(courses2);
			courses.add(courses2);
		}

	}
}
