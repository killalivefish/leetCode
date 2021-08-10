package leetcode.medium;

public class RemoveKdigits {
    public String removeKdigits(String num, int k) {
//        110200
//        10233
        int length = num.length();
        if(length == k){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (index == k){
                break;
            }
            char curChar = num.charAt(i);
            if(sb.length() == 0){
                sb.append(curChar);
            }else{
                if(curChar< sb.charAt(sb.length()-1) && (length-i>=k-index)){
                    sb.deleteCharAt(sb.length()-1);
                    sb.append(curChar);
                    index++;
                }
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveKdigits removeKdigits = new RemoveKdigits();
        System.out.println(removeKdigits.removeKdigits("1432219",3));
        System.out.println(removeKdigits.removeKdigits("10200",1));
        System.out.println(removeKdigits.removeKdigits("10200",2));
    }
}
