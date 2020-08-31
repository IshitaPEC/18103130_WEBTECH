import java.util.*;
import java.lang.*;

public class Ques4_ass2{
	
	static int calculatesum(int n){
		int i=0;
		int sum=0;
		for(int j=1;j<=n;j++){
			sum=sum+j;
		}
		return sum;
	}

	public static void main(String []args){
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int val= 0;
		for(int i=1;i<=n;i++){
			int sumval= calculatesum(i);
			int sumofsquares= i*i;
			if(sumval == sumofsquares){
				val=i;
				break;	
			}	
		}
		System.out.println(val);
	
	}

}