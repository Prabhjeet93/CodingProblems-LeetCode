package arrays;

import java.util.TreeSet;

public class ThirdMax {
	
public int thirdMax1(int[] nums) {
        
        int max1=nums[0];
        int max2=0;
        int max3=0;
        
      
       for(int i=1;i<nums.length;i++){
            
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }
           else if(nums[i]>max2){
               max3=max2;
               max2=nums[i];
           }
           else if(nums[i]>max3){
              
               max3=nums[i];
           }
        }
        System.out.println(max1);
        System.out.println(max2);
        System.out.println(max3);
        
    return max3;
    }

	


public int thirdMax(int[] nums) {
    
    TreeSet<Integer> set = new TreeSet<>();
    for(int num : nums) {
        set.add(num);
        if(set.size() > 3) {
            set.remove(set.first());
        }
    }
    return set.size() == 3 ? set.first() : set.last();
}
public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
