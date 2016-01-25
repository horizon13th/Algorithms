package Bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {
	public static void main(String args[]) {
		int[] numbers = { 1, 2, 3, 4 };
		System.out.println(subsets(numbers));
	}

	public static List<List<Integer>> subsets(int[] nums) {
		int n = nums.length;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < (1 << n); i++) {
			List<Integer> subset = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) == 1)
					subset.add(nums[j]);
			}
			Collections.sort(subset);
			result.add(subset);
		}
		return result;
	}
}

// Number of subsets for {1 , 2 , 3 } = 2^3 .
// why ?
// case possible outcomes for the set of subsets
// 1 -> Take or dont take = 2
// 2 -> Take or dont take = 2
// 3 -> Take or dont take = 2
//
// therefore , total = 2*2*2 = 2^3 = { { } , {1} , {2} , {3} , {1,2} , {1,3} ,
// {2,3} , {1,2,3} }
//
// Lets assign bits to each outcome -> First bit to 1 , Second bit to 2 and
// third bit to 3
// Take = 1
// Dont take = 0
//
// 0) 0 0 0 -> Dont take 3 , Dont take 2 , Dont take 1 = { }
// 1) 0 0 1 -> Dont take 3 , Dont take 2 , take 1 = {1 }
// 2) 0 1 0 -> Dont take 3 , take 2 , Dont take 1 = { 2 }
// 3) 0 1 1 -> Dont take 3 , take 2 , take 1 = { 1 , 2 }
// 4) 1 0 0 -> take 3 , Dont take 2 , Dont take 1 = { 3 }
// 5) 1 0 1 -> take 3 , Dont take 2 , take 1 = { 1 , 3 }
// 6) 1 1 0 -> take 3 , take 2 , Dont take 1 = { 2 , 3 }
// 7) 1 1 1 -> take 3 , take 2 , take 1 = { 1 , 2 , 3 }
//
// In the above logic ,Insert S[i] only if (j>>i)&1 ==true { j E {
// 0,1,2,3,4,5,6,7 } i = ith element in the input array }
//
// element 1 is inserted only into those places where 1st bit of j is 1
// if( j >> 0 &1 ) ==> for above above eg. this is true for sl.no.( j )= 1 , 3 ,
// 5 , 7
//
// element 2 is inserted only into those places where 2nd bit of j is 1
// if( j >> 1 &1 ) == for above above eg. this is true for sl.no.( j ) = 2 , 3 ,
// 6 , 7
//
// element 3 is inserted only into those places where 3rd bit of j is 1
// if( j >> 2 & 1 ) == for above above eg. this is true for sl.no.( j ) = 4 , 5
// , 6 , 7
//
// Time complexity : O(n*2^n) , for every input element loop traverses the whole
// solution set length i.e. 2^n
