package arrayAndStrings;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	 public static List<List<Integer>> generate(int numRows) {
	        
	        List<List<Integer>> dl = new ArrayList<List<Integer>>();
	              
	       
	        //  [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
	         
	        for(int i=1;i<=numRows;i++){
	            
	            int T=1;
	            List<Integer> ll = new ArrayList<>();
	            for(int j=1;j<=i;j++){
	              // System.out.print(C+" "); 
	                ll.add(T);
	               T = T * (i - j) / j;
	                
	            //    
	        }
	            dl.add(ll);
	           // System.out.println(ll);
	             
	        }
	        //System.out.println(dl);
	    return dl;
	    }
	 public ArrayList<ArrayList<Integer>> generate2(int numRows) {
	 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (numRows <= 0)
			return result;
	 
		ArrayList<Integer> pre = new ArrayList<Integer>();
		pre.add(1);
		result.add(pre);
	 
		for (int i = 2; i <= numRows; i++) {
			ArrayList<Integer> cur = new ArrayList<Integer>();
	 
			cur.add(1); //first
			for (int j = 0; j < pre.size() - 1; j++) {
				cur.add(pre.get(j) + pre.get(j + 1)); //middle
			}
			cur.add(1);//last
	 
			result.add(cur);
			pre = cur;
		}
	 
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generate(5);

	}

}
