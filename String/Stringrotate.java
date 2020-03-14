package string;

public class Stringrotate {
	 static String leftrotate(String str, int d) 
	    { 
	            String ans = str.substring(d) ;
	            		ans+= str.substring(0, d); 
	            return ans; 
	    } 

	    static String rightrotate(String str, int d) 
	    { 
	          //  return leftrotate(str, str.length() - d); 
	    	String ans=str.substring(str.length()-d);
	    	ans=ans+str.substring(0,str.length()-d);
	    	return ans;
	    } 
	  
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	            String str1 = "GeeksforGeeks";  
	            System.out.println(leftrotate(str1, 2)); 
	  
	            String str2 = "GeeksforGeeks";  
	            System.out.println(rightrotate(str2, 4));  
	    } 
	} 

