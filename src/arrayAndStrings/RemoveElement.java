package arrayAndStrings;

public class RemoveElement {
	
	 public int removeElement(int[] A, int val) {
		    //int count=0;
		        
		        //[3,2,2,3]
		        
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
