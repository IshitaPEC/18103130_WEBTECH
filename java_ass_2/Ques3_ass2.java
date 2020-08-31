import java.util.*;
import java.lang.*;

public class Ques3_ass2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str= s.nextLine();

		//Convert to character arrays
		char []temp = str.toCharArray();
		
		//Sort this temp array
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				int first= temp[i];
				int second= temp[j];
				if(first>second){
					char t= temp[i];
					temp[i]= temp[j];
					temp[j]= t;
				}
			}
		
		}
		
		//Convert Back to String
		str= new String(temp);
		System.out.println(str);		
		
	}
}