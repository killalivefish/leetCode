package leetcode.easy;

//TODO
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int cheng = cheng(n);
        StringBuilder sb = new StringBuilder(cheng+"");
        String s = sb.reverse().toString();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                result+=1;
                continue;
            }else{
                break;
            }
        }
        return result;
    }

    private int cheng(int n){
        if(n>1){
            return n * cheng(n-1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        TrailingZeroes trailingZeroes = new TrailingZeroes();
        System.out.println(trailingZeroes.trailingZeroes(5));
        System.out.println(trailingZeroes.trailingZeroes(3));
    }
}
