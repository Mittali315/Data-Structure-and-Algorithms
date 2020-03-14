package string;

public class MultiplyStrings {
	
	public static String multiply(String a, String b) {
        int[] res = new int[a.length() + b.length()];
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
            	int x=a.charAt(i) - '0';
            	int y=b.charAt(j) - '0';
                res[i + j + 1] += (x) * (y);
            }
        }
        int carry = 0;
        for (int i = res.length-1; i >= 0; i--) {
            int val = res[i] + carry;
            res[i] = val % 10;
            carry = val / 10;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < res.length-1 && res[i] == 0) {
            i++;
        }
        while (i < res.length) {
            sb.append( (char) (res[i] + '0') );
            i++;
        }
        return sb.toString();
    }
		
		
	
	
	 public static void main(String[] args) { 
	        String str = "190";  
	        String str1 = "9"; 
	        System.out.print(multiply(str, str1));
	    }

}
