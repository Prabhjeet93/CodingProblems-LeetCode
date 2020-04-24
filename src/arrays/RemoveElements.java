/**
 * 
 */
package arrays;


public class RemoveElements {

	//[1,0,2,3,0,4,5,0]
	public int removeElement(int[] A, int val) {
	 int i=0;
	    int j=0;
	 
	    while(j < A.length){
	        if(A[j] != val){
	            A[i] = A[j];
	            i++; 
	        }
	 
	        j++;
	    }
	 
	    return i;
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
