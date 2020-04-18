package arrays;

public class Find_Numbers_with_Even_Number_of_Digits {
	
	 public int findNumbers(int[] nums) {
	        int max=0;
	        for(int a:nums){
	            int count=0;
	            while(!(a==0)){
	                a=a/10;
	                count++;
	            }
	            if(count%2==0){
	                max++;
	            }
	        }
	      return max;  
	    }

	public static void main(String[] args) {
		
	}

}
