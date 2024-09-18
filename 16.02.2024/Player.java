class Team {
	public String name, city, division;

	void playGame() {
		name = "A";
		city = "B";
		division = "C";
		System.out.println("PlayGame: Inside Team");
		System.out.println(name + " " + city +" "+division);
	}

	void hireCoach() {
		System.out.println("Hire Coach");
	}
}

public class Player extends Team{
	public String name, position;
	public int jerseyNumber;

	public void playGame() {
		name = "E";
		position = "B";
		jerseyNumber = 7;
		System.out.println("PlayGame: Inside Player");
		System.out.println(name + " " + position +" "+jerseyNumber);
	}

	void train() {
		System.out.println("Training");
	}

	public static void main(String[] args) {
		Player p  = new Player();
		p.playGame();
		p.train();
		p.hireCoach();
	}
}




/*interface Animal {
  public void animalSound();
  public void sleep();
}

e
class Pig implements Animal {
  public void animalSound() {

    System.out.println("The pig says: wee wee");
  }
  public void sleep() {

    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.sleep();
  }
}
