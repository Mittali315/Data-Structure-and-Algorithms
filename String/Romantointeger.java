package string;
public class Romantointeger {
	 int value(char r) 
	    { 
	        if (r == 'I') 
	            return 1; 
	        if (r == 'V') 
	            return 5; 
	        if (r == 'X') 
	            return 10; 
	        if (r == 'L') 
	            return 50; 
	        if (r == 'C') 
	            return 100; 
	        if (r == 'D') 
	            return 500; 
	        if (r == 'M') 
	            return 1000; 
	        return -1; 
	    } 
		    int romanToDecimal(String str) 
	    { 
		    	int n=str.length();
	        int res = 0; 
//	        Split the Roman Numeral string into Roman Symbols (character).
//	        Convert each symbol of Roman Numerals into the value it represents.
//	        Take symbol one by one from starting from index 0: 
//	        If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
//	        else subtract this value by adding the value of next symbol to the running total.
	        for (int i=0; i<n; i++) 
	        { 
	            int s1 = value(str.charAt(i)); 
	            if (i <n-1) 
	            { 
	                int s2 = value(str.charAt(i+1)); 
	                if (s1 >= s2) 
	                { 
	                    res = res + s1; 
	                    
	                } 
	                else
	                { 
	                    res = res + s2 - s1; 
	                    i++; 
	                } 
	            } 
	            else
	            { 
	                res = res + s1; 
	                i++; 
	            } 
	        } 
		        return res; 
	    } 
	      public static void main(String args[]) 
	    { 
	    	Romantointeger ob = new Romantointeger(); 
	        String str = "MCMX"; 
	        System.out.println("Integer form of Roman Numeral" + 
                           " is " + ob.romanToDecimal(str)); 
	    } 
}
