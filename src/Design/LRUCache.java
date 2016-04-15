package Design;

import java.util.LinkedHashMap;

public class LRUCache {
	public static void main(String[] args){
		LRUCache l = new LRUCache(2);
		l.set(2,1);
		l.set(1,1);
		System.out.println(l.get(2));
		l.set(4,2);
		System.out.println(l.get(1));
		System.out.println(l.get(2));
	}
	private int capacity;
    private LinkedHashMap<Integer, Integer> hs;//record the keyvalue pair
    public LRUCache(int capacity) {
        this.capacity = capacity;
        hs = new LinkedHashMap(capacity);
    }
    public int get(int key) {
    	if(hs.containsKey(key)){
    		Integer value = hs.get(key);
    		hs.remove(key);
    		hs.put(key, value);
    		return hs.get(key);
    	}
    	else
    		return -1;
    }
    
    public void set(int key, int value) {
    	if(hs.containsKey(key)){
    		hs.remove(key);
    		hs.put(key, value);
    	}
    	//capcity is not full and key is not in hs
    	else if(!hs.containsKey(key) && capacity > hs.size()){
    		hs.put(key, value);
        }
        //capacity is full and key is not in hs
    	//remove the first one in the linkedhashmap
        else if (!hs.containsKey(key) && capacity == hs.size()){
        	System.out.println(hs.keySet().iterator().next());
        	hs.remove(hs.keySet().iterator().next());
        	hs.put(key, value);
        }
    }
}
