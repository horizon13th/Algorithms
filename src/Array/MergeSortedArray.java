package Array;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String args[]){
		int[] numbers = new int[]{1,2,2,3,0,0,0};
		int[] numbers2 = new int[]{1,5,6};
		merge(numbers,4,numbers2,3);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        while(n>0){
            if(m==0){
                nums1[m+n-1]=nums2[n-1];
                n--;
                
            }
            else if(nums1[m-1]<nums2[n-1]){
                nums1[m+n-1]=nums2[n-1];
                n--;
                
            }
            else{
                nums1[m+n-1]=nums1[m-1];
                m--;            
            }
            System.out.println(m+""+n+Arrays.toString(nums1)); 
        }
    }

}
