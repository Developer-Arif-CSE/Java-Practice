class Animal5{
     int age;
     String gender;
        
        void isMammal(){

                age = "24";
		gender = "Male";
		System.out.println("isMammal: InsideisMammal");
		System.out.println(age + " " + gender);
       }
       
       void mate() {
      
       System.out.println("isMammal: InsideisMammal");

       }
}

public class Ducks extends Animal5{

    String beakColor ="yellow";
    
    void swim(){
   
         System.out.println("swim: Duck can swim");

    }
   
    void quack(){
   
          System.out.println("quack: quack quack");
   }

}



public class Fish extends Animal5{

       int sizeinFt;
       boolean canEat;
       

        void swim(){
   
         System.out.println("swim: Fish can swim");

    }

}


public class Fish extends Animal5{

        boolean isWild;


       void run(){
   
         System.out.println("run: zebra can run");

    }

}



public static void main(String[] args) {
		Animal5 a  = new Animal();
                a.isMammal();
		a.mate();
                a.swim();
                a.quack();
                a.run();
		
		
	}