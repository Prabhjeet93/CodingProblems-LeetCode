package arrays;

public class ReplaceElements {
	
	 public static int[] replaceElements(int[] arr) {
	        
		 int i=0;
	        int j=1;
	        int max=0;
	        
	        while((i<arr.length)&&(j<arr.length)){
	        //	System.out.println("1st - j : "+j+", i : "+i);
	            if(arr[j]>max){
	                max=arr[j];
	            }
	           j++;
	            if(j==arr.length){
	            	
	                   arr[i]=max;
	                //   System.out.println("2nd - j :"+j+", i : "+i+", and Arr[i] = "+arr[i]);
	                    i++;   
	                    max=0;
	                    j=i+1;
	                   // System.out.println("Max : "+max);
	            }
	        }
	        arr[arr.length-1]=-1;
	    
	        return arr;
	        
	    }
	 
	 public static int[] replaceElements2(int[] arr) {
		 
//		 /a={17,18,5,4,6,1};
		 int len=arr.length;
		// int j=len-1;
		 int max=arr[len-1];
		 arr[len-1]=-1;
		 
		 for(int i=len-2;i>=0;i--) {
			 
			 int temp=arr[i];
			 arr[i]=max;
			 
			 if(max<temp) {
				 max=temp;
			 }
		 }
				 
		 
		 
		 return arr;
	 }
	 

	public static void main(String[] args) {
		 int[] a={17,18,5,4,6,1};
			
			
			int[] q=replaceElements2(a);
			
			for(int p:q)
			System.out.println(p);

	}

}
