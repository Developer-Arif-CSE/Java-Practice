package com.javatpoint;  
import java.io.FileWritter;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\testout.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e) { 
                 System.out.println(e);
           }    
           System.out.println("Success...");    
     }    
}  