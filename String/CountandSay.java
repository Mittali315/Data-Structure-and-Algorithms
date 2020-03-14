package string;

public class CountandSay {
	
	public static String countAndSay(int n) {
        String[] arr = new String[n];
        arr[0] = "1";
        for(int i=1;i<arr.length;++i){
            String str = arr[i-1];
            int j=0;
            StringBuilder ans = new StringBuilder();
            while(j<str.length()){
                int count=1;
                char c = str.charAt(j);
                j++;
                while(j<str.length() && str.charAt(j)==c){
                    count++;
                    j++;
                }
                ans.append(new Integer(count).toString());
                ans.append(Character.toString(c));
            }
            arr[i] = ans.toString();
        }
        return arr[n-1];
    }
	 public static void main(String[] args) { 
	        String str = "ABEC";  
	        System.out.print(countAndSay(5));
	    }

}


