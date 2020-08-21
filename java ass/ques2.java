import java.util.*;
public class ques2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter size of word vector:\n");
    		int n = sc.nextInt();
		Vector<String> vec = new Vector<String>();
		//Adding elements using add() method of List.
		System.out.println("Enter the words that you want us to reduce"); 
		for(int i=0;i<n;i++){
			String word=sc.next();
			vec.add(word);}
		
		//Now we input the paragraph, input until we find the end keyword
		String para="";
		String curr="";
		while(true){
			curr=sc.next();
			if(curr.equals("end"))
				break;
			for(int i=0;i<vec.size();i++){
				if(vec.get(i).equals(curr)){
					String newcurr="";
					newcurr= newcurr + curr.charAt(0);
					for(int j=1;j<curr.length();j++)
						newcurr=newcurr + "*";	
					curr=newcurr;						
				}	
			}
			para= para + curr;
			para = para + " ";
		}
		System.out.println(para);
	}

}