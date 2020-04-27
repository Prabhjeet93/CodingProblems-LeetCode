package arrays;

import java.awt.List;
import java.util.ArrayList;

public class FindDisappearedNumbers {
	
	 public ArrayList<Integer> findDisappearedNumbers(int[] nums) {
	        
	        //[4,3,2,7,8,2,3,1]
	        
	        ArrayList<Integer> result = new ArrayList<Integer>();

	 		for (int n : nums) {
	 			int index = (Math.abs(n)-1);
	 			if (nums[index] > 0) {
	 				nums[index] = -nums[index];
	 			}
	 		}
	       // -4, -3, -2, -7, 8, 2, -3, -1, 
	        for(int n:nums)
	            System.out.print(n+", ");
	        System.out.println();

	 		for (int i = 0; i < nums.length; i++) {
	 			if (nums[i] > 0) {
	 				result.add(i+1);
	 			}
	 		}
	 		
	 		return result;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
