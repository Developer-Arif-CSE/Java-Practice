import java.util.Scanner;
       public class Mul{
             public static void main(String args[]){
                   int value1,value2,mul;
                   System.out.println("Enter Two Integers:");
                   Scanner input=new Scanner(System.in);
                   value1=input.nextInt();
                   value2=input.nextInt();
                   mul=value1*value2;
                   System.out.println("The Mul Of" + value1 + "&"  + value2 + "is" +mul);
             }
        }