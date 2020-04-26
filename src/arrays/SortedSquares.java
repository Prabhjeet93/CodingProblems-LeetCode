package arrays;

public class SortedSquares {
	
public static int[] sortedSquares(int[] A) {
        
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        
        for (int x = 0 ; x < n; x++) 
            A[x] = result[x]; 

       return A;
        
      
}

public static int[] sortedSquares2(int[] arr) {
    
    int n=arr.length;
    //int[] arr = new int[len];
    //int j=len-1; 
   int mid;
   int k;
   if(n<2){
       arr[0]*=arr[0];
      // return arr
   }
   else{
    for(k=0;k<n;k++){
        //Find the mid element
        if((Math.abs(arr[k]))<(Math.abs(arr[k+1]))){
            mid=arr[k];
            break;
        }
    }
   
  int i = k-1;
    int j = k; 
    int ind = 0; 
      
    int[] temp = new int[n]; 
    while(i >= 0 && j < n)  
    { 
        if(arr[i] * arr[i] < arr[j] * arr[j]) 
        { 
            temp[ind] = arr[i] * arr[i]; 
            i--; 
        } 
        else{ 
              
            temp[ind] = arr[j] * arr[j]; 
            j++; 
              
        } 
        ind++; 
    } 
      
    while(i >= 0) 
    { 
        temp[ind++] = arr[i] * arr[i]; 
        i--; 
    } 
    while(j < n) 
    { 
        temp[ind++] = arr[j] * arr[j]; 
        j++; 
    } 
      
   
    for (int x = 0 ; x < n; x++) 
        arr[x] = temp[x]; 
   
   }
   return arr;
    
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
