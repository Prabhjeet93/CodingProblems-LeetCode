package arrays;

public class SortArrayByParity {
	
public int[] sortArrayByParity(int[] A) {
        
        int i=0;
        int j=1;
       //[3,1,2,4]
        
        while(j<A.length){
            if(A[i]%2!=0){
                int tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
            if(A[i]%2==0) 
                i++;
            j++;
        }
     return A;   
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
