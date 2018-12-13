
public class Athlete {

	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		nextBibNumber = bibNumber + 1;
		changeBibNumber();
	}

	public static void main(String[] args) {
		Athlete Gregorny = new Athlete("Gregorny",1000);
		System.out.println(Gregorny.name + " has the bib number " + nextBibNumber + " and is racing in " + raceLocation + ".");
		Athlete Lilliam = new Athlete("Lilliam",0);
		System.out.println(Lilliam.name + " has the bib number " + nextBibNumber + " and is racing in " + raceLocation + ".");
	}
	
	void changeBibNumber() {
		bibNumber++;
	}
}