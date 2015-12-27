package Math;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public static void main(String args[]){
		System.out.println(generate(4));
		//Input number
	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> trilist = new ArrayList<List<Integer>>();
    for(int i = 0 ; i<numRows; i++){
        List<Integer> innlist = new ArrayList<Integer>();
        for(int j = 0; j<=i; j++){
            if( j==0 || j==(i) )
                innlist.add(j,1);
            else
                innlist.add(j,trilist.get(i-1).get(j-1)+trilist.get(i-1).get(j));
        }
        trilist.add(innlist);
    }
    return trilist;
}
}
