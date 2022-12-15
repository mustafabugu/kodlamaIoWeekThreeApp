package kodlamaIoWeekThreeApp.entities;

public class Instructor {
	private int id;
	private String nameSurname;
	
	public Instructor() {
	}

	public Instructor(int id, String nameSurname) {
		this.id = id;
		this.nameSurname = nameSurname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}
	
	
}
