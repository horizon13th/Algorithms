package Bit;

public class ReverseBits {
	public static void main(String args[]){
		int number = 4;
		//0,1,2
		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toBinaryString(reverseBits(number)));
	}
	public static int reverseBits(int n) {
        int result = 0;
        for(int i=0;i<32;i++){
        	result = (result << 1)|(n&1);
        	n = n>>>1;
        }
        return result;
    }
}
