package arrayAndStrings;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	 public List<Integer> spiralOrder1(int[][] matrix) {
	     int m = matrix.length;
	        int n = matrix[0].length;
	        List<Integer> list = new ArrayList<>();
	        
	        int i, k = 0, l = 0; 
	    	  
	        while (k < m && l < n) { 
	             
	            for (i = l; i < n; ++i) { 
	               list.add(matrix[k][i]);
	            } 
	            k++; 
	  
	          
	            for (i = k; i < m; ++i) { 
	                list.add(matrix[i][n - 1]);
	            } 
	            n--; 
	  
	           
	            if (k < m) { 
	                for (i = n - 1; i >= l; --i) { 
	                    list.add(matrix[m - 1][i]);
	                } 
	                m--; 
	            } 
	  
	          
	            if (l < n) { 
	                for (i = m - 1; i >= k; --i) { 
	                    list.add(matrix[i][l]);
	                } 
	                l++; 
	            } 
	        } 
	            
	      return list;
	        
	    }
	 public List<Integer> spiralOrder2(int[][] matrix) {
		    if (matrix == null || matrix.length <= 0) {
		            return new ArrayList<Integer>();
		        }
		        List<Integer> results = new ArrayList<Integer>();
		        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1, dir = 1;
		        int row = 0, col = 0;
		        
		        while (col >= left && col <= right && row >= up && row <= down) {
		            results.add(matrix[row][col]);
		            if (left == right && up == down) {
		                break;
		            }
		            if (dir == 1) {  // right
		                if (col == right) {
		                    dir = 2;
		                    up++;
		                    row++;
		                } else {
		                    col++;
		                }
		            } else if (dir == 2) {  // down
		                if (row == down) {
		                    dir = 3;
		                    right--;
		                    col--;
		                } else {
		                    row++;
		                }
		                
		            } else if (dir == 3) {  // left
		                if (col == left) {
		                    dir = 4;
		                    down--;
		                    row--;
		                } else {
		                    col--;
		                }
		            } else if (dir == 4) {  // up
		                if (row == up) {
		                    dir = 1;
		                    left++;
		                    col++;
		                } else {
		                    row--;
		                }
		            }
		        }
		        
		        return results;
		    
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
