package leetcode.honer;

//OK
//标题：小红的ABC | 时间限制：1秒 | 内存限制：262144K
//小红拿到了一个只包含 'a' , 'b' , 'c' 三种字符的字符串。
//小红想知道，这个字符串最短的、长度超过 1 的回文子串的长度是多少？
//子串定义：字符串取一段连续的区间。例如"abcca"的子串有"ab"、"bcca"等，但"aca"则不是它的子串。
//回文的定义：一个字符串正着读和倒着读都是相同的，那么定义它的回文的。
//https://ac.nowcoder.com/acm/contest/11218/B
import java.util.Scanner;

public class Fiveteen {
    
    //REMBER
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
    
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)){
                result =Math.min(result,2);
            }
        }
        for (int i = 0; i < str.length()-2; i++) {
            if(str.charAt(i)==str.charAt(i+2)){
                result =Math.min(result,3);
            }
        }
        System.out.println(result==Integer.MAX_VALUE?-1:result);
    }

    public static boolean is(String str){
        int head=0;
        int end =str.length()-1;
        while (head<end){
            if(str.charAt(head)==str.charAt(end)){
                head++;
                end--;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
    public static int getResult(String str){
        if(str.charAt(0)==str.charAt(1)){
            return 2;
        }
        int result =-1;
        int length = str.length();
        if(length>3){
            for (int i = 2; i < length; i++) {
                if(str.charAt(i)==str.charAt(i-1)){
                    result=2;
                    return result;
                }
                if(str.charAt(i)==str.charAt(i-2)){
                    result=3;
                }
                
            }
        }
        return result;
    }
}
