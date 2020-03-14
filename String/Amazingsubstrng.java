package string;

public class Amazingsubstrng {
	 public static int solve(String A) {
	        int ans=0;
	        char[] ch = A.toCharArray();
	        for(int i=0;i<A.length();i++)
	        { 
	            if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' ||
	            		ch[i]=='O' || ch[i]=='U' || 
	            		ch[i]=='u' || ch[i]=='o' || 
	            		ch[i]=='i' || ch[i]=='e' || ch[i]=='a'  )
	            ans=ans+((A.length())-i);
	            
	            if(ans>10003)
	            ans=ans%10003;
	        }
	        return ans;
	    }
	 public static void main(String[] args) { 
	        String str = "ABEC";  
	        System.out.print(solve(str));
	    }
} 
