package arrays;

public class RemoveDuplicates {
	
	  public int removeDuplicates(int[] nums) {
	        
	        int i=0;
	        int j=0;
	        // [0,0,1,1,1,2,2,3,3,4],
	       while(j<nums.length){
	           if(nums[i]!=nums[j]){
	               if(nums[i]<nums[j]){
	                 nums[i+1]=nums[j];
	               i++;  
	               }
	             
	           }
	           j++;  
	       } 
	      return i+1;  
	    } 

}
