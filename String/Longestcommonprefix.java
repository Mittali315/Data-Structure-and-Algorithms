package string;

import java.util.Arrays;

public class Longestcommonprefix {
	public String longestCommonPrefix(String[] a) 
    { 
        StringBuilder sb=new StringBuilder();
		int size = a.length; 
        if (size == 0) 
            return "";  
        if (size == 1) 
            return a[0]; 
        Arrays.sort(a); 
        int end = Math.min(a[0].length(), a[size-1].length()); 
        int i = 0; 
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) ) 
        	if(a[0].charAt(i) == a[size-1].charAt(i))
          i++; 
        	
        sb.append(a[0].substring(0, i));
       // String pre = a[0].substring(0, i); 
      
        return sb.toString(); 
    } 
	
    public static void main(String[] args) 
    {  
    	Longestcommonprefix gfg = new Longestcommonprefix(); 
        String[] input = {"abc", "ade", "abcf"}; 
        System.out.println( "The longest Common Prefix is : " + 
                                   gfg.longestCommonPrefix(input)); 
    } 
} 


