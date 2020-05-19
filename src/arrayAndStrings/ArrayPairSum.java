package arrayAndStrings;

import java.util.Arrays;

public class ArrayPairSum {
	
public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int size=nums.length;
        int sum=0;
        
        for(int i=0;i<size;i++){
            // find min
            
          sum+=min(nums[i],nums[i++]);  
            
        }
        return sum;
        
    }
    public static int min(int i, int j){
        int min=i;
        if(i>j){
            min=j;
            
        }
        return min;
    }
    
 public int arrayPairSum2(int[] nums) {
        
        Arrays.sort(nums);
               
        int size=nums.length;
        int sum=0;
        
        for(int i=0;i<size;i++){
         sum+=nums[i];
            i++;
            
        }
        return sum;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
