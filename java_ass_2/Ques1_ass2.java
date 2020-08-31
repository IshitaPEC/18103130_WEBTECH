import java.util.*;
import java.lang.*;


public class Ques1_ass2{
	
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		String str1= s.nextLine();
		String str2= s.nextLine();
		int i=0;
		int n=0;
		if(str1.length()<str2.length()){
			n= str1.length();	
		}
		else
			n=str2.length();
		int flag=0;

		while(i<n){
		int first= str1.charAt(i);
		int second= str2.charAt(i);
			if(first<second){
				flag=-1;
				break;
			}
			else if(first>second){
				flag=1;
				break;
			}
			i=i+1;
		}
		
		if(flag==0){
			if(str1.length()<str2.length())
				System.out.println(" Smaller String is " + str1 + " Bigger String is " + str2);
			else if(str1.length()>str2.length())
				System.out.println(" Smaller String is " + str2 + " Bigger String is " + str1);
			else if(str1.length()==str2.length())
				System.out.println(" Both Strings are Equal ");
		}
		if(flag==-1) 
			System.out.println("Smaller String is " + str1 + " Bigger String is " + str2);
		else if(flag==1)
			System.out.println("Smaller String is " + str2 + " Bigger String is " + str1);
		
	}

} 