package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	public static void main(String []args){
		List<List<Integer>> grid = new ArrayList<List<Integer>>();
		List<Integer> level = new ArrayList<Integer>();
		level.add(0);
		grid.add(new ArrayList(level));
		level.add(1);
		grid.add(new ArrayList(level));
		level.add(2);
		grid.add(new ArrayList(level));
		System.out.println(grid);
		System.out.println(minimumTotal(grid));
	}
	public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0||triangle==null)
            return 0;
        List<Integer> result= triangle.get(triangle.size()-1);
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0; j<triangle.get(i).size();j++){
                result.set(j,Math.min(result.get(j),result.get(j+1))+triangle.get(i).get(j));
            }
            //System.out.println(result);
        }
        return result.get(0);
    }
}
