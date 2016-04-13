package DynamicProgramming;

public class CoinHeadTail {
	public static void main(String[] args){
		char[] arr = {'H','H','H','T','H','H','T','T','H'}; 
		System.out.println(coin(arr));
	}
	public static int coin(char[] arr){
		if(arr.length==0 ||arr.length==1)
			return arr.length;
		int curH=0,maxH=0;
		int curT=0,maxT=0;
		char pre=' ';
		for(int i=0; i<arr.length;i++){
			if(arr[i]=='H'){
				if(pre=='H'){
					curH+=1;
					maxH=Math.max(maxH, curH);
				}
				else{
					curH=1;
					maxH=Math.max(maxH, curH);
				}
				pre='H';
			}
			else{
				if(pre=='T'){
					curT+=1;
					maxT=Math.max(maxT, curT);
				}
				else{
					curT=1;
					maxT=Math.max(maxT, curT);
				}
				pre='T';
			}
			System.out.println(curH+""+maxH+""+curT+""+maxT);
		}
		return Math.max(maxT, maxH);
	}
}
