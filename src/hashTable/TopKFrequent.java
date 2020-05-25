package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
	
	 public int[] topKFrequent(int[] nums, int k) {
	        
	       List<Integer> res=new ArrayList<>();
	        if(nums==null||nums.length==0) return new int[]{};
	        Map<Integer,Integer> map=new HashMap<>();
	        for(int num:nums){                  //count frequency
	            map.put(num,map.getOrDefault(num,0)+1);
	        }
	        //maxHeap, Comparator:map.value 
	        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
	        for(int key:map.keySet()){
	            pq.offer(key);
	            if(pq.size()>map.size()-k)
	                res.add(pq.poll()); //k in res,(n-k)in pq
	        } 
	        int[] arr = new int[res.size()];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=res.get(i);
	        }
	       
	        return arr;
	        
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
