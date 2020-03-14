package string;

public class Validnumber {
//	 public int isValidNumeric(String s) 
//	    { 
//		 int i = 0;
//	        int n = s.length();
//	         
//	        // step 1: skip leading white spaces
//	        while (i < n && s.charAt(i) == ' ') {
//	            i++;
//	        }
//	         
//	        // step 2: Skip + or - sign
//	        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
//	            i++;
//	        }
//	         
//	        boolean isNumeric = false;
//	        
//	        // step 3: skip the first segement of numeric characters
//	        
//	        while (i < n && Character.isDigit(s.charAt(i))) {
//	            i++;
//	            isNumeric = true;
//	        }
//	         
//	        // step 4 and 5 skip the . character and the following numeric characters, if any
//	        if (i < n && s.charAt(i) == '.') {
//	            i++;
//	            while (i < n && Character.isDigit(s.charAt(i))) {
//	                i++;
//	                isNumeric = true;
//	                if(isNumeric) {
//	                	
//	                	return 1;
//	                }
//	            }
//	        }
//	        // step 6 and 7 and 8, exponent character and following numeric characters
//	        if (isNumeric && i < n && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
//	            i++;
//	            isNumeric = false;
//	            if(!isNumeric) {
//                	
//                	return 0;}
//	            if(!isNumeric) {
//                	
//                	return 0;}
////	            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
////	                i++;
////	            }
//	            while (i < n && Character.isDigit(s.charAt(i))) {
//	                i++;
//	                isNumeric = true;
//	                if(isNumeric) {
//	                	
//	                	return 1;}
//	            }
//	        }
//	        
//	        // step 9: Remove trailing white spaces
//	        while (i < n && s.charAt(i) == ' ') {
//	            i++;
//	        }
//	         
//	       // return isNumeric && i == n;
//	        return 1;
//	    }
	    
public int isNumber(final String str) {
        String A=str.trim();
        if(A.length()==0 || (A.length()==1 && !Character.isDigit(A.charAt(0))) )
        	return 0;
        if(!Character.isDigit(A.charAt(0)) && A.charAt(0)!='+' && A.charAt(0)!='-' &&
        A.charAt(0)!='.'){
            return 0;
        }
        
        boolean flag=false;
        
        for(int i=1;i<A.length();i++){
        	
            if(!Character.isDigit(A.charAt(i)) && A.charAt(i)!='+' 
                && A.charAt(i)!='-' && A.charAt(i)!='.' && A.charAt(i)!='e'){
                return 0;
            }
            
            if(A.charAt(i)=='.'){
                if(flag==true)
                	return 0;
                
                if(i+1>=A.length()) 
                	return 0;
                
                if(!Character.isDigit(A.charAt(i+1)))
                	return 0;
            }else if(A.charAt(i)=='e'){
                flag=true;
                
                if(i+1>=A.length()) 
                	return 0;
                
                if(!Character.isDigit(A.charAt(i-1)))
                	return 0;
                
                if(!Character.isDigit(A.charAt(i+1)) && A.charAt(i+1)!='+' 
                    && A.charAt(i+1)!='-')
                    return 0;
            }
        }
        
        return 1;
    }
	    /* Driver Function to test isValidNumeric function */
	    public static void main(String[] args) 
	    { 
	        String input = "31.5"; 
	        Validnumber x = new Validnumber(); 
	        System.out.println(x.isNumber(input)); 
	    } 


}
