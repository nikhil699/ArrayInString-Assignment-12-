package com.ArrayinEmail;
import java.util.ArrayList;
import java.util.*;
public class ArrayMail
{
    public static void main(String[] args) 
    {
   
   	 Scanner scan = new Scanner(System.in);
   	 String[] Student = {"abc@g.com","dfg@g.com","ert@g.com","qaz@g.com","tgh@g.com"};
   	 for(int i=0;i<5;i++)
   	 {
   		 System.out.println(Student[i]);
   	 }
   	 System.out.println("Enter Your Mail Which You Want To Search !!!!!");
   	 String Mail = scan.nextLine();
   	 int c=0;
	 for(int i=0;i<5;i++)
	 {
		 if(Student[i].equals(Mail))
		 {
			 c=c+1;
		 }
		 
	 }
	 if(c>0)
	 {
		 System.out.println("Your Given Mail Present Here !!!!");
		 
	 }
	 else
	 {
		 System.out.println("Sorry Your Given Mail Is Not Here !!!!!!!");
		 		
	 }
    }
}
