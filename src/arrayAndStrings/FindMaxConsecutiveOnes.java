package arrayAndStrings;

public class FindMaxConsecutiveOnes {
	 public int findMaxConsecutiveOnes(int[] nums) {
	        
	        int count=0;
	        int max=0;
	        boolean ones=true;
	        
	        
	        
	        for(int i=0;i<nums.length;i++){
	            
	            if((nums[i]==1)){
	                  count++;
	              }
	            else{
	               count=0;
	                //ones=false;
	            }
	            if(count>max)
	                max=count;        }
	        
	        return max;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
