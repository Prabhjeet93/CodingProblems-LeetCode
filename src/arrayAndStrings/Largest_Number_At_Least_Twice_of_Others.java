package arrayAndStrings;

public class Largest_Number_At_Least_Twice_of_Others {
	
	public int dominantIndex(int[] nums) {
        //int sum=0;
        int max1=0;
        int max2=0;
        int index=0;
        boolean status=false;
        
          // [3, 6, 1, 0]
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
                max2=max1;
                max1=nums[i];
                index=i;
            }
            else if(nums[i]>max2){
                max2=nums[i];
            }
        }
         return max1>=2*max2?index:-1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
