package leetcode.easy;

public class CheckPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if(num==1){
            return false;
        }
        int temp = 1;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                temp += i;
            }
        }
        return temp == num;
    }

    public static void main(String[] args) {
        CheckPerfectNumber check = new CheckPerfectNumber();
        System.out.println(check.checkPerfectNumber(28));
        System.out.println(check.checkPerfectNumber(6));
        System.out.println(check.checkPerfectNumber(496));
        System.out.println(check.checkPerfectNumber(8128));
        System.out.println(check.checkPerfectNumber(2));
    }
}
