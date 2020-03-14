package string;

public class Addbinarystring {
	public static String addBinary(String A, String B) {
		
        StringBuilder sb = new StringBuilder();
        int len = Math.max(A.length(), B.length());
        
        int carry = 0;
        for (int i = 1; i <= len; i++) {
            int indA = A.length() - i;
            int indB = B.length() - i;
            
            int aDigit = indA >= 0  ? (A.charAt(indA) - '0') : 0;
            int bDigit = indB >= 0  ? (B.charAt(indB) - '0') : 0;
            
            int sum = aDigit + bDigit + carry;
            sb.insert(0, String.valueOf(sum % 2));
            carry = sum > 1 ? 1 : 0;
            
        }
        if(carry == 1) {
            sb.insert(0,"1");
        }
        
        return sb.toString();
    }
	
	 public static void main(String args[]) 
	    { 
	        String a = "1101", b="100"; 
	          
	        System.out.print(addBinary(a, b)); 
	    } 
}
