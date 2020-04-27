package arrays;

import java.util.Arrays;

public class HeightChecker {

public int heightChecker1(int[] heights) {
        
        //find min of an array
        //replace with first element and thn find min of sub aaray
        
        int len=heights.length;
        
        int index=0;
        int j=0;
        int count=0;
        while(j<len){
            int min=101;
           for(int i=j;i<len;i++){
               
             if(heights[i]<min){
                min=heights[i];
                index=i;
                 System.out.println("i : "+i+"  min : "+min);
            }
              
          }
             if(heights[j]!=heights[index]){
                int temp=heights[j];
                heights[j]=heights[index];
                heights[index]=temp;
                count++;
            }
          
            j++;
            
            for(int p:heights)
                System.out.print(p+", ");
            System.out.println();
        }
        
       return count+1; 
    }
	

public int heightChecker2(int[] heights) {
    
    int[] a = Arrays.copyOfRange(heights, 0, heights.length);
       Arrays.sort(a);
       
       int count = 0;
       for (int i = 0; i < a.length; i++) {
           if (a[i] != heights[i]) {
               count++;
           }
       }
       return count;
   }
public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
