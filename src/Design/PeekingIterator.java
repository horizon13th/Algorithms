package Design;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
    private Integer next = null;
    private Iterator<Integer> it;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    it = iterator;
	    if(it.hasNext())
	        next = it.next();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	public Integer next() {
	    Integer res = next;
	    next = it.hasNext()?    it.next():null;
	    return res;
	}

	public boolean hasNext() {
	    return next!=null;
	}
}
