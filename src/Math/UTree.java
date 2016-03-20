package Math;

public class UTree {
	public static void main(String []args){
		int[] arr = {0,1,3,4,5};
		for(int i=0; i<arr.length; i++)
			System.out.println(uTree(arr[i]));
	}
	public static int uTree(int n){
		return (n%2==1)?((1<<(n/2+2))-2):((1<<(n/2+1))-1);
	}
	public static int height(int N){
        int h = 1;
        if(N==0) return h;
        while(N>0){
            if(N>0){
                h = h*2;
                N--;
            }
            if(N>0){
                h = h+1;
                N--;
            }
        }
        return h;
    }
	
}
