package arrayAndStrings;

public class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        // /[1,0,0,3,12]
        while(j<nums.length){
            if((nums[i]==0) && (nums[j]!=0)){
                //swap(nums[i],nums[j]);
                 int temp=nums[i];
                   nums[i]=nums[j];
                    nums[j]=temp;
                i++;
            }
           else if(nums[i]!=0){
               i++;
           }
            j++;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
