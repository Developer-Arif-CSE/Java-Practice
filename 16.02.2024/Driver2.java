interface Animal {
      void bark () ;
      void height () ;
}

class Tiger implements Animal {
      public void bark () {
            System.out.println ("Roar");
      }

      public void height () {
            System.out.println ("Height");
      }
}
class Driver2 {
    public static void main (String args[]) {
          Tiger obj = new Tiger (  );
          obj.bark ();
   } 
}    