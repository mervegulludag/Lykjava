package tr.org.linux.kamp.student;

public class student {
	private String name;
	private double average;

	public student(String name, double average) {
		this.name = name;
		if (average >= 0.0) {
			if (average <= 100) {
				this.average = average;
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		if (average >= 0.0) {
			if (average <= 100) {
				this.average = average;
			}
		}
	}

	public String getLEtterGrade() {
		String letterGrade="";
		if(average>=90.0) {
			letterGrade="A";
		}
		
		else if(average>=90.0){
		letterGrade = "A";
		}

		else if(average>=80.0){
		letterGrade = "B";
		}
		else if(average>=70.0){
		letterGrade = "C";
		}
		else if(average>=60.0){
		letterGrade = "D";
		}
		else letterGrade="F";
		
		return letterGrade; 
	}
}
