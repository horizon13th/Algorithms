package Math;

public class LuckyNumber {
	public static void main(String[] args){
		System.out.println(isLucky(99));
	}
	public static boolean isLucky(int n){
		boolean[] arr = new boolean[n+1];
		for(int i=0; i<arr.length;i++)
			arr[i]=true;
		for(int i=2;i<n;i++){
			delete(arr,i);
			print(arr);
		}
		return arr[n];
	}
	public static boolean[] delete(boolean[]nums, int x){
		int count=1;
		for(int i=1; i<nums.length; i++){
			if(nums[i]==false)
				continue;
			if(count%x==0)
				nums[i]=false;
			count++;
		}
		return nums;
	}
	public static void print(boolean[] arr){
		for(int i=1; i<arr.length; i++){
			System.out.print(i);
			if(arr[i]==true)
				System.out.print("v ");
			if(arr[i]==false)
				System.out.print("x ");
		}
		System.out.print("\n");
		for(int i=1; i<arr.length; i++){
			if(arr[i]==true)
				System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}
