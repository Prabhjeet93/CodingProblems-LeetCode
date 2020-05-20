package hashTable;

import java.util.ArrayList;
import java.util.List;

public class DesignHashMapUsingList {
	
	 /** Initialize your data structure here. */
    class Container{
		int key;
		int value;
		public void insert(int k, int v){
			this.key=k;
			this.value=v;
		}
	}
	
	private Container c;
	private List<Container> ll;
    
    public DesignHashMapUsingList() {
        this.ll=new ArrayList<Container>();
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        
        this.c=new Container();
		c.insert(key, value);
		//check for the same key before adding
		for(int i=0; i<ll.size(); i++){
			Container c1=ll.get(i);
			if(c1.key == key){
				//remove the existing object
				ll.remove(i);
				break;
			}
		}
		ll.add(c);
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        for(int i=0; i<this.ll.size(); i++){
			Container con = ll.get(i);
			if (key== con.key) {
				
				return con.value;
			}
			
		}
		return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        
       for(int i=0; i<this.ll.size(); i++){
			Container con = ll.get(i);
			
			if (key== con.key) {
				
				ll.remove(con);
			}
			
		}
		        
    }


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
