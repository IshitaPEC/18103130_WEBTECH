import java.util.*;

class ques1{ 
      
    public static String sortstring(String inputString) 
    { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
	
    static int countFreq(String patt, String str) {         
        int res = 0; 
	patt= sortstring(patt);	
	int strlength = str.length();         
        int pattlength = patt.length();         
        for (int i = 0; i <= strlength - pattlength; i++) { 
  		//Create substring from i to i+pattlength
		String substr= str.substring(i,i+pattlength);
		
		//Sort substr
		substr= sortstring(substr);

		//Check if the pattern and substring are equal
		if(Objects.equals(patt,substr))
			res++;		
	}
        
        return res;         
    } 
  
    /* Driver program to test above function */
    static public void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
    	String st1 = sc.next();
    	String st2 = sc.next();
        System.out.println(countFreq(st2, st1));    
 	
    } 
} 
  