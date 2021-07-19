package leetcode.easy;
//TODO error
public class IsHappy {
    public boolean isHappy(int n) {
        String str = n+"";
        int temp =0;
        int length = str.length();
        if(length>0){
            for (int i = 0; i < length; i++) {
                int i1 = Integer.parseInt(str.charAt(i) + "");
                temp+=(i1*i1);
            }
            if(temp!=1){
                isHappy(temp);
            }else{
                return true;
            }
        }

        return temp == 0;
    }

    public static void main(String[] args) {
        IsHappy isHappy = new IsHappy();
        System.out.println(isHappy.isHappy(19));
        System.out.println(isHappy.isHappy(2));
    }
}
