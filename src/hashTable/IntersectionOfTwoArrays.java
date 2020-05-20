package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
	 public int[] intersection(int[] nums1, int[] nums2) {
	        
	        List<Integer> dup = new ArrayList<Integer>();
	        int i=0, j=0;
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        
	        while(i<nums1.length && j<nums2.length){
	            
	            if(nums1[i]>nums2[j]){
	                j++;
	            }
	            else if(nums1[i]<nums2[j]){
	                i++;
	            }
	            else{
	                dup.add(nums1[i]);
	                i++;
	                j++;
	            }
	        }
	        int[] arr = new int[dup.size()];
	         for (Integer k =0; k < dup.size(); k++) 
	            arr[k] = dup.get(k); 
	  
	        return arr;
	    }

	 public int[] intersection2(int[] nums1, int[] nums2) {
	        
	       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i: nums1){
	        if(map.containsKey(i)){
	            map.put(i, map.get(i)+1);
	        }else{
	            map.put(i, 1);
	        }
	    }
	 
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i: nums2){
	        if(map.containsKey(i)){
	            if(map.get(i)>1){
	                map.put(i, map.get(i)-1);
	            }else{
	                map.remove(i);
	            }
	            list.add(i);
	        }
	    }
	 
	    int[] result = new int[list.size()];
	    int i =0;
	    while(i<list.size()){
	        result[i]=list.get(i);
	        i++;
	    }
	 
	    return result;
	    }

	 public int[] intersection3(int[] nums1, int[] nums2) {
	        
	       HashSet<Integer> set1 = new HashSet<Integer>();
	    for(int i: nums1){
	        set1.add(i);
	    }
	 
	    HashSet<Integer> set2 = new HashSet<Integer>();
	    for(int i: nums2){
	        if(set1.contains(i)){
	            set2.add(i);
	        }
	    }
	 
	    int[] result = new int[set2.size()];
	    int i=0;
	    for(int n: set2){
	        result[i++] = n;
	    }
	 
	    return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
