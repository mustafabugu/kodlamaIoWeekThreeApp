package kodlamaIoWeekThreeApp.bussines;

import java.util.logging.Logger;

import kodlamaIoWeekThreeApp.dataAccess.IInsructorDao;
import kodlamaIoWeekThreeApp.entities.Instructor;
import kodlamaIoWeekThreeApp.logging.ILogger;

public class InsructorManager {
	private IInsructorDao iInsructorDao;
	private ILogger[] loggers;

	public InsructorManager(IInsructorDao iInsructorDao, ILogger[] loggers) {
		this.iInsructorDao = iInsructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		iInsructorDao.add(instructor);
		System.out.println("Eğitmen eklendi.");

		for (ILogger logger : loggers) {
			logger.log(instructor.getNameSurname());
		}
	}
}
