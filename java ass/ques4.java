import java.util.*;
public class ques4{

    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Strings:\n");
        String str1= sc.next();
	String str2= sc.next();
	char str1_char[]= str1.toCharArray();
	char str2_char[]= str2.toCharArray();
        Arrays.sort(str1_char);
        Arrays.sort(str2_char);
        if(Arrays.equals(str1_char,str2_char))
		System.out.println("Yes, they are anagrams");
	else
		System.out.println("No, they are not anagrams");
    }   
                             
}