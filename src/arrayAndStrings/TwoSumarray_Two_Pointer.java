package arrayAndStrings;

public class TwoSumarray_Two_Pointer {
	
public int[] twoSum(int[] numbers, int target) {
        
        
        int i=0;
        int j=numbers.length-1;
        
        while(i<j){
            int x= numbers[i]+numbers[j];
            
            if(x<target){
                i++;
            }
            else if (x>target){
                j--;
            }
            else 
                return new int[] {i+1,j+1};
        }
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
