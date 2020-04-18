package arrays;

public class Duplicate_Zeros {

	
public void duplicateZeros(int[] arr) {
        
        //[1,0,2,3,0,4,5,0]
        
        int len=arr.length;
        for(int i=0;i<len-1;i++){
            //System.out.println("Result Array at "+k+" loop and j: "+j);
        	
            if((arr[i]==0) ){
                
                shiftArray(arr, i+1,len);
                arr[i+1]=0;
                i++;
            }
         }
    }
    public static void shiftArray(int[] a, int start, int size){
           
           for(int i=size-2;i>=start;i--){
               a[i+1]=a[i];
               
           }
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
