package Bit;

/**
 * Created by hanqingzhao on 6/13/18.
 * Leetcode #389
 */
public class FindTheDifference {
    public static void main(String[] args){
        String s="abbbe";
        String t="aebbbb";
        findTheDiff(s, t);
    }
    //Bitwise a^a=0 a^0=a
    public static char findTheDiff(String s, String t) {
        int result = 0;
        for(int i=0; i<s.length(); i++){
            result = result^s.charAt(i);
        }
        for(int j=0; j<t.length(); j++){
            result = result^t.charAt(j);
        }
        //System.out.print((char)result);
        return (char) result;
    }
}
