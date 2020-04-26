package arrays;

public class ValidMountainArray {
	
	 public static boolean validMountainArray(int[] A) {
	        
	        //[0,3,2,1] - true
	        //[3,5,5] - False
	        
	        if(A.length>=3){
	            int i=0;
	            int j=1;
	              boolean swich=true;  
	           // for(int i=0;i<A.length-1;i++){
	            while(j<A.length){
	                if(A[i]!=A[j]){
	                    if(A[i]<A[j] && swich){
	                        i++;
	                    }
	                    else if(A[i]>A[j] ){
	                        i++;
	                        swich=false;
	                    }
	                    else{
	                        return false;
	                    }
	                }
	                else {
	                    return false;
	                }
	            j++;
	            }
	       return true;     
	      }
	        return false;
	 }
	 
	 public boolean validMountainArray2(int[] A) {
	        int i = 0;
	        int j = A.length - 1;
	        int n = A.length - 1;
	        while (i + 1 < n && A[i] < A[i+1]) {
	            i++;
	        }
	        
	        while (j > 0 && A[j] < A[j-1]) {
	            j--;
	        }
	        
	        return i > 0 && i == j && j < n;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a={3,2,1,0};
		
		
		boolean q=validMountainArray(a);
		System.out.println(q);

	}

}
