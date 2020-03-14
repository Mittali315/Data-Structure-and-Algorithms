package string;
public class Removeadjacentstring {
	public static String removeDuplicates(String s, int k) {
	    StringBuilder sb = new StringBuilder(s);
	    int count[] = new int[sb.length()];
	    for (int i = 0; i < sb.length(); i++) {
	        if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
	            count[i] = 1;
	        } else {
	            count[i] = count[i - 1] + 1;
	            if (count[i] == k) {
	                sb.delete(i - k + 1, i + 1);
	             
	                i = i - k;
	            }
	        }
//	        if(sb.charAt(i)==sb.charAt(i-1)) {
//                //sb.delete(i - k + 1, i + 1);
//    		k=i-1;
//    		sb.delete(i-1, i+1);
//             
//                i = k ;}
//            }
	    }
	    return sb.toString();
	}
	    public static void main(String[] args)  
	    {  
	    	String str="abbbcccde";
	    	int k=2;
	    	removeDuplicates(str,k);
	    	System.out.println(removeDuplicates(str,k));	
	    }
} 