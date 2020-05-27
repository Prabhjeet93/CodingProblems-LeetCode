package arrays;

import java.util.Arrays;

public class Sum {
	
	public static boolean ArrayAdditionI(int[] arr) {
	    // code goes here 
	    Arrays.sort(arr);
	    for(int p:arr) {
	    	System.out.println(p);
	    }
	    int len = arr.length;
	    int largest = arr[len-1];
	    int sum=0;
	    Boolean res=false;

	    for(int i=0;i<len-1;i++){
	      sum=sum+arr[i];
	      for(int j=0;j<len-1;j++){
	        if(i!=j){
	          sum=sum+arr[j];
	          if(sum==largest){
	        	  res=true;
	            return res;
	          }
	        }
	      }
	      for(int k=0;k<len-1;k++) {
		    	if(i!=k) {
		    		sum=sum-arr[k];
		    		if(sum==largest) {
		    			res=true;
		    			return res;
		    		}
		    	}
		    }
	      System.out.println("sum : "+sum);
	      sum=0;
	    } 
	    
	    return res;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {5,7,16,1,2};
		System.out.println(ArrayAdditionI(arr));
	}

}
