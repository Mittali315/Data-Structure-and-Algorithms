package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaximumnumberofOCcurencsubstring {
	public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
		
        int n=s.length();
	      HashMap<String, Integer> count = new HashMap<> ();        
	      for(int i = 0; i + minSize <=n; i++) 
	      {
	        String temp = s.substring(i, i + minSize);
	        HashSet<Character> letter = new HashSet<>();
	        char[] xy=temp.toCharArray();
	        for(char c: xy) {
	        		letter.add(c);
	        }
	        if(letter.size() > maxLetters)
	            continue;
	        Integer k=count.getOrDefault(temp, 0);
	        count.put(temp, k + 1);
	    } 
	      
	    int max = 0;
	    for(Map.Entry<String, Integer> entry: count.entrySet())
	        max = max > entry.getValue()? max : entry.getValue();         
	    return max;
	            }
	
	public static void main(String args[]) 
	{ 
		
		int  maxLetters = 2, minSize = 3, maxSize = 4;
		String sent ="aababcaab";
		maxFreq(sent,maxLetters,minSize,maxSize);
		
		System.out.print(maxFreq(sent,maxLetters,minSize,maxSize));
		
		
	}	
	
	

}
