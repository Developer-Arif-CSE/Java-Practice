public class Multiplication{
       private int var1,var2;

       Multiplication(){
       var1=0;
       var2=0;
       }

       Multiplication(int var1,int var2){
              this.var1=var1;
              this.var2=var2;
       }

       void putVar1(int var1){
              this.var1 = var1;
       }

       void putVar2(int var2){
              this.var2 = var2;
       }

       int getMultiplication(){
              return var1*var2;
       }

       public static void main(String args[]){
              Multiplication obj1=new Multiplication();
              obj1.putVar1(10);
              obj1.putVar2(20);
              int Multiplication=obj1.getMultiplication();
              System.out.println("The first object returned" + Multiplication);

              Multiplication obj2=new Multiplication(20,30);
              Multiplication=obj2.getMultiplication();
              System.out.println("The Second object returned" + Multiplication);
       }
}
