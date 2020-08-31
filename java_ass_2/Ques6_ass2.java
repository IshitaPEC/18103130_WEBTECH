import java.util.*;
import java.lang.*;
public class Ques6_ass2{
    public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	int n=  s.nextInt();
	int c=0;
	while(n!=1){
		if(c==Integer.MAX_VALUE)
			break;	
		if(n==Integer.MAX_VALUE)
			break;	
		if(n<=0)
			break;
		if(n%2!=0){
			n*=3;
			n++;
		}
		else{
			n=n/2;
		}

            System.out.println(n);
            c++;
	} 
        if(n==1){
            System.out.println("No of steps: "+c);
        }
        else if(n==Integer.MAX_VALUE || n<0){
            System.out.println("Integer overflow reached");
        }
        else{
            System.out.println("No of steps maxed out.");
        }     
    }
}

