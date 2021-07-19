package leetcode.easy;

public class IsHappy {
    public boolean isHappy(int n) {
        String str = n+"";
        int temp =0;
        for (int i = 0; i < str.length(); i++) {
            int i1 = Integer.parseInt(str.charAt(i) + "");
            temp+=(i1*i1);
        }
        if(temp!=1){
            
        }
    }
}
