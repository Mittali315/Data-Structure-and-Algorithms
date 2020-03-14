package string;
import java.util.HashMap;
public class WordPattern {
	 public static boolean wordPattern(String pattern, String str) {
		  String a[] = str.split(" ");
		  if(a.length != pattern.length())
			  return false;
		  HashMap<Character,String> map = new HashMap<Character, String>(); 
		  
		  for(int i =0; i < pattern.length(); i++){
			  if(!map.containsKey(pattern.charAt(i))){
				  //case where patter = "abba" str = "dog dog dog dog" 
				  if(map.containsValue(a[i])){
					  return false;
				  }
				  map.put(pattern.charAt(i), a[i]);
			  }else{
				  String value = map.get(pattern.charAt(i));
				  if(!value.equals(a[i])){
					  return false;
				  }
			  } 
		  }  
		  return true;
	  }
	 public static void main (String[] args) 
		{ 
			String pattern="abba";
			String str="dog cat cat dog";
			wordPattern(pattern,str);
			System.out.print(wordPattern(pattern,str)); 
		}
}
