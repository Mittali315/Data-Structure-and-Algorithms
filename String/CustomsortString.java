package string;
public class CustomsortString {
	
	public static String customSortString(String S, String T) {
		
        if(S==null || T==null || S.length()==0 || T.length()==0) 
        	return null;
        
        int[] tDict = new int[26];        
        for(int i=0;i<T.length(); i++){
            tDict[T.charAt(i)-'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<S.length();i++){
        	int x=tDict[S.charAt(i)-'a'];
            if(tDict[S.charAt(i)-'a']>0){
                for(int j=0;j<tDict[S.charAt(i)-'a'];j++){
                    sb.append(S.charAt(i));
                }
                tDict[S.charAt(i)-'a'] = 0;
            }
        }
        
        for(int i=0; i<26;i++){
            if(tDict[i]>0){
                for(int j=0; j<tDict[i];j++){
                    sb.append((char)('a'+i));
                }
            }
        }
        return sb.toString();
    }
	
	
	public static void main(String args[]) 
	{ 
		
		//int  maxLetters = 2, minSize = 3, maxSize = 4;
		String S = "cba";
		String 	T = "abcd";
		customSortString(S,T);
		
		System.out.print(customSortString(S,T));
		
		
	}	

}
