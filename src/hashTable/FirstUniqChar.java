package hashTable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqChar {
	
	 public int firstUniqChar(String s) {
	        
	        char[] ch = s.toCharArray();
	        char c=' ';
	        Map<Character, Integer> hm = new LinkedHashMap<>();
	        for(int i=0;i<ch.length;i++){
	            if(hm.containsKey(ch[i])){
	                hm.put(ch[i],hm.get(ch[i])+1);
	            }
	            else{
	                 hm.put(ch[i],1);
	            }
	        }
	       // Iterator it = hm.iterator();
	        
	        for(Map.Entry<Character, Integer> mp: hm.entrySet()){
	            System.out.println(" Key : "+mp.getKey()+ " Value : "+mp.getValue());
	            
	          if(mp.getValue()==1)
	        {
	            c=mp.getKey();
	            System.out.println(c);
	            break;
	        }
	    }
	     for(int i=0;i<ch.length;i++)
	     {
	         if(ch[i]==c)
	         {
	             return i;
	         }
	         
	     }
	    
	    return -1;
	          
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
