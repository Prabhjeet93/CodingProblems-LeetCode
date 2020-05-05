package arrayAndStrings;

public class PivotIndex {
	
public int pivotIndex(int[] nums) {
        
        //[-1,-1,-1,-1,-1,-1]
        int sum=0;
        int leftSum=0;
       for(int i:nums){
           sum+=i;
       }
        
        for(int i=0;i<nums.length;i++){
            sum=sum-nums[i];
            if(leftSum==sum)
                return i;
            
            leftSum+=nums[i];
        }
       return -1;     
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
