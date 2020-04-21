package arrays;

public class MergeTwosortedArrays {
	
public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
    
	while(m>0 && n>0) {
		//printArray(nums1);
		if(nums1[m-1]>nums2[n-1]) {
			nums1[m+n-1]=nums1[m-1];
			m--;
		}
		else {
			nums1[m+n-1]=nums2[n-1];
			n--;
		}
	}
      
        
        
    }

public static void printArray(int[] arr) {
	for(int i:arr)
		System.out.print(i+", ");
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,0,0,0};
				int[] arr2= {2,5,6};
				int len1=arr1.length;
				int len2=arr2.length;
		merge(arr1,len1, arr2, len2);
		
		System.out.println(arr1.toString());

	}

}
