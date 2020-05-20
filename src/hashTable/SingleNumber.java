package hashTable;

public class SingleNumber {
	 public int singleNumber1(int[] nums) {
	        
	       int res = nums[0]; 
	        for (int i = 1; i <nums.length; i++) 
	            res = res ^ nums[i]; 
	      
	        return res; 
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
