package Math;

public class AddDigits {
	public static void main(String args[]){
		int number = 58;
		//89, 1, 0
		System.out.println(addDigits(number));
	}
	public static int addDigits(int num) {
        int result = num;
        while(result>=10){
            result =0;
            while(num>0){
                result += num%10;
                num = num/10;
            }
            num = result;
            System.out.println(result);
        }
        return result;
    }
}
