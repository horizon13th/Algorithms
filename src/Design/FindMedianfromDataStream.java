package Design;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianfromDataStream {
	public static void main(String []args){
		FindMedianfromDataStream f = new FindMedianfromDataStream();
		f.addNum(1);
		f.addNum(2);
		System.out.println(f.findMedian());
		f.addNum(4);
		System.out.println(f.findMedian());
		f.addNum(5);
		System.out.println(f.findMedian());
	}
	private PriorityQueue<Integer> minH= new PriorityQueue<Integer>();
	private PriorityQueue<Integer> maxH= new PriorityQueue<Integer>(Collections.reverseOrder());
	// Adds a number into the data structure.
	public void addNum(int num) {
		maxH.offer(num);
		minH.offer(maxH.poll());
		if(maxH.size()<minH.size())
			maxH.offer(minH.poll());
			//make maxH has more numbers
		System.out.println(num+","+maxH+" "+minH);
	}

	// Returns the median of current data stream
	public double findMedian() {
		return (maxH.size() == minH.size()? (double)(maxH.peek() + minH.peek()) / 2.0: maxH.peek() );
	}
}
// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();
