package string;

public class PeakElement {	
	public static int findPeakElement(int[] num) {
        int max = num[0];
        int index = 0;
        
        for(int i=1; i<=num.length-2; i++){
            int prev = num[i-1];
            int curr = num[i];
            int next = num[i+1];
 
            if(curr > prev && curr > next && curr > max){
                index = i;// return index
                max = curr;
            }
        }
        
        if(num[num.length-1] > max){
            return num.length-1;
        } 
        return index;
    }	
	public static void main (String[] args) 
	{
		int[] nums= {1,2,1,3,5,6,4};
		findPeakElement(nums);
		System.out.print(findPeakElement(nums));	
	}
}
