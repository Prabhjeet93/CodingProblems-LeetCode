package arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfDoubleExist {
	
	 public boolean checkIfExist_Solution1(int[] arr) {
	        
	        //[7,1,14,11]
	        int i=0;
	        int j=0;
	        boolean found=false;
	      while(i<arr.length){
	          if(arr[i]!=arr[j]){
	              
	            if((arr[i]==2*arr[j]) || ((arr[i]%2==0)&&(arr[i]/2==arr[j]))){
	                found=true;
	               break;
	            }
	            
	        }
	         
	          
	          if(j>=arr.length){
	              j=0;
	              i++;
	          }
	          
	    }
	     return found;   
	    }
	 
	 public boolean checkIfExist_Solution2(int[] arr) {
		    Set<Integer> set = new HashSet<>();
		    for (Integer p : arr) {
		      if (set.contains(p * 2) || (p % 2 == 0 && set.contains(p / 2))) {
		        return true;
		      }
		      set.add(p);
		    }
		    return false;
		  }


}
