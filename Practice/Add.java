import java.util.Scanner;
      public class Add{
            public static void main(String args[]){
            int value1,value2,sum;
            System.out.println("Enter Two Integers:");
            Scanner input=new Scanner(System.in);
            value1=input.nextInt();
            value2=input.nextInt();
            sum=value1+value2;
            System.out.println("The sum is:"+sum);
            }
      }