package leetcode.easy;

//TODO error
public class Reverse {
    public int reverse(int x) {
        if(x>Integer.MAX_VALUE){
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        if(x<0){
            sb.append(-1*x);
            sb.reverse();
            sb.insert(0,'-');
        }else{
            sb.append(x+"");
            sb.reverse();
        }
        if(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        if(sb.charAt(0) == '-' && sb.charAt(1) == '0'){
            sb.deleteCharAt(1);
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverse(-123));
        System.out.println(reverse.reverse(-120));
        System.out.println(reverse.reverse(0));
//        System.out.println(reverse.reverse(9646324351));
    }
}
