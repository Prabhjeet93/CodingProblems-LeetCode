package hashTable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DesignHashSetUsingList {
	
	 
    List<Integer> al;
    public DesignHashSetUsingList() {
         al = new ArrayList<>();
        
    }
    
    public void add(int key) {
        if(!al.contains(key))
            al.add(key);
    }
    
    public void remove(int key) {
        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            int val=it.next();
           if(val==key){
               it.remove();
               return;
           }
         }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return al.contains(key);
        }
    


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
