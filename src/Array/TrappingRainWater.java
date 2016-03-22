package Array;

import java.util.Arrays;

public class TrappingRainWater {
	public static void main(String args[]) {
		int water[] = { 1, 1, 2, 2, 0, 2, 0, 3, 3, 4 };
		System.out.println(trap(water));
	}
	public static int trap(int[] height) {
        int water=0;
        if(height.length==0 ||height.length==1)
            return water;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        int tempmax = 0;
        for(int i=0; i<height.length; i++){
            leftmax[i]= tempmax>height[i]? tempmax:height[i];
            tempmax=leftmax[i];
        }
        tempmax = 0;
        for(int i=height.length-1; i>=0; i--){
            rightmax[i]=tempmax>height[i]? tempmax:height[i];
            tempmax=rightmax[i];
        }
        System.out.println(Arrays.toString(leftmax));
        System.out.println(Arrays.toString(rightmax));
        for(int i=0; i<height.length; i++){
            water+=Math.min(leftmax[i],rightmax[i])-height[i];
        }
        return water;
    }
}
