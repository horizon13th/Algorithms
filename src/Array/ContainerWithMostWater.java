package Array;

public class ContainerWithMostWater {
	public static void main(String args[]) {
		int water[] = { 1, 1, 2, 2, 0, 2, 0, 3, 3, 4 };
		System.out.println(maxArea(water));
	}
	public static int maxArea(int[] height) {
        if(height.length==0 || height.length==1)
            return 0;
        int maxWater=0;
        int curWater=0;
        int left = 0; 
        int right = height.length-1;
        while(left<right){
            curWater = Math.min(height[left], height[right]) * (right-left);
            maxWater = (curWater>maxWater)? curWater:maxWater;
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}
