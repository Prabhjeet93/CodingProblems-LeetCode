package hashTable;

import java.util.HashMap;

public class FourSumCount {
	
	 public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
	        
	        HashMap<Integer, Integer> map = new HashMap<>();
	        int count = 0;
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < B.length; j++) {
	                int sum = A[i] + B[j];
	                map.put(sum, map.getOrDefault(sum, 0) + 1);
	            }
	        }

	        for (int k = 0; k < C.length; k++) {
	            for (int l = 0; l < D.length; l++) {
	                int sum = (C[k] + D[l]);
	                count += map.getOrDefault(-sum, 0);
	            }
	        }

	        return count;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
