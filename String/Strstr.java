package string;

public class Strstr {
	
	public int strStr(String haystack, String needle) {
	    if(haystack==null || needle==null)    
	        return 0;
	 
	    if(needle.length() == 0)
	        return 0;
	 
	    if(needle.length() > haystack.length())
            return -1;
	    for(int i=0; i<haystack.length(); i++){
	    	
	         int m = i;
	        for(int j=0; j<needle.length(); j++){
	        
	        	
	            if(needle.charAt(j)==haystack.charAt(m)){
	                if(j==needle.length()-1)
	                    return i;
	                m++; 
	            }else{
	                break;
	            } 
	 
	        }    
	    }    
	        return -1;
}
	 public static void main(String[] args) 
	    { 
	        String haystack = "hxlobo"; 
	        String needle = "xlob"; 
	        Strstr x = new Strstr(); 
	        System.out.println(x.strStr(haystack,needle)); 
	    } 
}
