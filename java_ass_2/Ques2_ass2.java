import java.util.*;
import java.lang.*;

public class Ques2_ass2{
	public static void main(String[] args){
		System.out.println("Enter the number of elements you wish to insert");
		Scanner s= new Scanner(System.in);		
		int n= s.nextInt();
		int []arr= new int[n];
		System.out.println("Enter the elements (in range of 0 to 20)");
		for(int i=0;i<n;i++){
			arr[i]= s.nextInt();
		}
		int []freq= new int[21];
		for(int i=0;i<n;i++){
			freq[arr[i]]++;
		}
		int j=0;
		for(int i=0;i<21;i++){
			for(int k=0;k<freq[i];k++){
				arr[j]=i;
				j++;

			}	
		}
			
		System.out.print("Sorted array: ");
        	for(int i=0;i<n;i++){
            		System.out.print(arr[i]+" ");
        	}
	
	}

}