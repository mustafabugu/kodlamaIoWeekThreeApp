package kodlamaIoWeekThreeApp.logging;

public class FİleLogger implements ILogger{
	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);
	}
}
