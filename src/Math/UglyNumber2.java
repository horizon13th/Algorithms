package Math;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class UglyNumber2 {
	public static void main(String []args){
		System.out.println(nthUglyNumber(10));
	}
	public static int nthUglyNumber(int n){
		int result =0;
		if(n==1)
			return result;
		Set<Integer> ts = new TreeSet<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		ts.add(1);
		q.add(1);
		while(q.peek()<=n){
			int tmp = q.remove();
			q.add(tmp*2);
			ts.add(tmp*2);
			q.add(tmp*3);
			ts.add(tmp*3);
			q.add(tmp*5);
			ts.add(tmp*5);			
		}
		Iterator it = ts.iterator();
		for(int i=0; i<n&&(it.hasNext()); i++){
			result=(int) it.next();
			System.out.println(result);
		}
		return result;
	}
}
