class Team{
    String name, city, division;
   void playGame(){
        name="Arif";
        city="Dinajpur";
        division="Rangpur";
       System.out.println(name + " " + city +" "+division);
	
    }
   void hireCoach(){
          System.out.println("Hire Coach");
   }
}
public class Player extends Team{
   public String name , position;
    public int jurseyNumber;
    public void playGame(){
        name="Arif";
        position="Mid";
        jurseyNumber=11;

    }
    void train(){
        System.out.println("Train journey");

    }
}
public class Team2{
    public static void main(String args[]){
        Player obj= new Player ();
        obj.playGame();
        obj.hireCoach();
        obj.train();
    }
}