package leetcode.easy;

//TODO
public class AddBinary {
    public String addBinary(String a, String b) {
        int max = Math.max(a.length(),b.length());
        char[] achars = a.toCharArray();
        if(achars.length<max){
           char[] temp = new char[max];
            for (int i = 0; i < max - achars.length; i++) {
                temp[i] = 0;
            }
        }
        char[] bchars = b.toCharArray();

        return "";
    }
}
