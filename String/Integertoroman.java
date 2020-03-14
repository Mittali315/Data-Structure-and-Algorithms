package string;

public class Integertoroman {
	
	
	public static String intToRoman(int A) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0;i<values.length;i++){
            while (A >= values[i])
            {
                A = A - values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
	
	 public static void main(String []args) 
	    { 
	        int number = 3549; 
	        System.out.println(intToRoman(number)); 
	          
	    } 

}
