package string;
public class Minimumcharpalindromic {
	static int lcs( String X, String Y, int m, int n ) 
    { 
        int L[][] = new int[n+1][n+1]; 
        int i, j;   
        for (i=0; i<=m; i++) 
        {  
            for (j=0; j<=n; j++) 
            { 
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
  
                else if (X.charAt(i-1) == Y.charAt(j-1)) 
                    L[i][j] = L[i-1][j-1] + 1; 
  
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
            } 
        }   
        return L[m][n]; 
    } 	
	 static int findMinInsertionsLCS(String str, int n) 
	    { 
	        
	       StringBuffer sb = new StringBuffer(str); 
		 //StringBuilder sb= new StringBuilder(str);
	        sb.reverse();  
	        String revString = sb.toString(); 
	  
	        // The output is length of string minus 
	        // length of lcs of str and it reverse 
	        return (n - lcs(str, revString , n, n)); 
	    } 
	 
    public static void main(String[] args) { 
        String str = "ABCB";  
        System.out.print(findMinInsertionsLCS(str, str.length()));
    }
}