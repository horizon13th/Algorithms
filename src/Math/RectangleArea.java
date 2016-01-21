package Math;

public class RectangleArea {
	public static void main(String args[]){
		int[] n = {-2,-2,2,2,-2,-2,2,2};
		System.out.println(computeArea(n[0],n[1],n[2],n[3],n[4],n[5],n[6],n[7]));
	}
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sq1 = (C-A)*(D-B);
        int sq2 = (G-E)*(H-F);
        
        int left = Math.max(A,E);
        int top = Math.min(D,H);
        int right = Math.min(C,G);
        int bottom = Math.max(B,F);
        
        int overlap = 0;
        if(left<right && bottom<top)
            overlap = (top-bottom)*(right-left);
        
        return (sq1+sq2-overlap);
    }
}
