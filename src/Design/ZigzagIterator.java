package Design;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/*
* create an iterator class that will iterate across a set of iterators by rotating across them. 
* This means that you will take the first ele from each itrator before taking the second ele from each iterator
* and so on until all iterators are empty
* 
* Example:
* I1:[1,2,3]
* I2:[4,5,6]
* I3:[7,8,9]
* 
* result:[1,4,7,2,5,8,3,6,9]
* 
* next()
* hasNext()
* remove()
*/
public class ZigzagIterator<T> implements Iterator<T>{
	List<Iterator<Integer>> itlist;
	Iterator last;
	
	public ZigzagIterator(List<Iterator<Integer>> inputList){
		for(Iterator<Integer> i: inputList){
			if(i.hasNext())
					itlist.add(i);
		}
	}
	public void forEachRemaining(Consumer<? super T> arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return !itlist.isEmpty();
	}

	public T next() {
		// TODO Auto-generated method stub
		Iterator cur = itlist.poll();
		last = cur;
		T value = cur.next();
		if(cur.hasNext())
				itlist.add(cur);
		return value;
	}

	public void remove() {
		// TODO Auto-generated method stub
	}
}
