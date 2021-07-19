package leetcode.easy;

//todo error
public class PlusOne {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        boolean add = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if(add && i+1 != 10){
                sb.append((i+1)+"");
            }
        }


        return null;
    }

    public static void main(String[] args) {
        int[] digit = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        PlusOne plusOne = new PlusOne();
        System.out.println(plusOne.plusOne(digit));
    }
}
