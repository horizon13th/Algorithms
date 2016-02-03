package DynamicProgramming;

public class UniqueBinarySearchTrees {
	public static void main(String args[]) {
		int number = 5;
		System.out.println(numTrees(number));
	}
	public static int numTrees(int n) {
        int res[]=new int[n+1];
        if(n==0)    return 1;
        if(n==1)    return 1;
        res[0]=1;
        res[1]=1;
        for(int i=2;i<res.length;i++){
            int count=0;
            int sum=0;
            while(count<i){
                sum+=res[count]*res[i-1-count];
                count++;
            }
            res[i]=sum;     
        }
        return res[n];
    }
}
