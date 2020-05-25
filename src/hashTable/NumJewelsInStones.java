package hashTable;

import java.util.HashMap;

public class NumJewelsInStones {
	
	 public int numJewelsInStones(String J, String S) {
	        int counter=0;
	        
	        HashMap<Character,Integer> hm1 = new HashMap<>();
	     //   HashMap<Character,Integer> hm2 = new HashMap<>();
	        
	        for(int i=0;i<S.length();i++){
	            if(hm1.containsKey(S.charAt(i))){
	                hm1.put(S.charAt(i), hm1.get(S.charAt(i))+1);
	            }
	            else{
	                hm1.put(S.charAt(i), 1);
	            }
	        }
	        
	        for(int j=0;j<J.length();j++){
	            if(hm1.containsKey(J.charAt(j)))
	                counter+=hm1.get(J.charAt(j));
	        }
	        
	        return counter++;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
