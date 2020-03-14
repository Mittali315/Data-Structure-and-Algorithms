package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindandReplacePattern {
	
	 public static List<String> findAndReplacePattern(String[] words, String pattern) {       
		 List<String> ans = new ArrayList<String>();
	        for (String word: words)
	            if (match(word, pattern))
	                ans.add(word);
	        return ans;
	    }

	    public static boolean match(String word, String pattern) {
	        Map<Character, Character> m1 = new HashMap<Character, Character>();
	        Map<Character, Character> m2 = new HashMap<Character, Character>();

	        for (int i = 0; i < word.length(); ++i) {
	            char w = word.charAt(i);
	            char p = pattern.charAt(i);
	            if (!m1.containsKey(w))
	            	m1.put(w, p);
	            if (!m2.containsKey(p))
	            	m2.put(p, w);
	            if (m1.get(w) != p || m2.get(p) != w)
	            	
	                return false;
	        } return true;
	        }
	    
	 public static void main(String args[]) 
	    { 	
		 
		 String[] words= {"abb","deq","mee","aqq","dkd","ccc"} ;
		 String pattern="abb";
		 findAndReplacePattern(words,pattern);
		 System.out.print(findAndReplacePattern(words,pattern));
		 }
	
	
	

}
