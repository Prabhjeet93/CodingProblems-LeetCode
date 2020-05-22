package hashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class FindRestaurant {
	
	public String[] findRestaurant(String[] list1, String[] list2) {
        
        
		  //      ["Shogun","Tapioca Express","Burger King","KFC"]
		   //     ["KFC","Burger King","Tapioca Express","Shogun"]
		        
		        
		        ArrayList<String> lst = new ArrayList<>();
		        int sum = Integer.MAX_VALUE;
		        HashMap<String,Integer> hm =  new HashMap<>();
		        for(int i=0;i<list1.length;i++){
		            hm.put(list1[i],i);
		        }
		        //int i=0, j=0;
		        for(int i=0;i<list2.length;i++){
		            if(hm.containsKey(list2[i])){
		              int tmp = i + hm.get(list2[i]);//Current index and
		                if (tmp < sum) {//If the current index and smaller
		                    lst.clear();//Clear target array
		                    lst.add(list2[i]);//Add this element
		                    sum = tmp;// Refresh minimum index and
		                } else if (tmp == sum)//If index and are equal
		                    lst.add(list2[i]);//Add elements only
		            }
		        }
		        return lst.toArray(new String[lst.size()]);//Convert to string array
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
