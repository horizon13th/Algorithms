package BinarySearch;

public class SearchInsertPosition {
	public static void main(String args[]){
		int[]number ={1,3,5,8};
		//{1},2
		System.out.println(searchInsert(number, 4));
	}
	public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int mid = start;
        while(start<=end){
            mid=start+(end-start)/2;
            System.out.println(mid+","+start+","+end);
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return start;
    }
}
