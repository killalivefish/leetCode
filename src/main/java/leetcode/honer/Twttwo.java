package leetcode.honer;

import java.util.*;


//22.【40分】 标题：数组中两个字符串的最小距离 | 时间限制：2秒 | 内存限制：262144K
//        给定一个字符串数组strs，再给定两个字符串str1和str2，返回在strs中str1和str2的最小距离，如果str1或str2为null，或不在strs中，返回-1。
//https://www.nowcoder.com/questionTerminal/2c6a0a8e1d20492f92941400036e0890?commentTags=C
public class Twttwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] aimStrs = in.nextLine().split(" ");
        String[] targetStrs = new String[n];
        for (int i = 0; i < n; i++) {
            targetStrs[i] = in.nextLine();
        }
        for (String aimStr : aimStrs) {
            System.out.print(aimStr+" ");
        }
        System.out.println("===========");
        for (String targetStr : targetStrs) {
            System.out.println(targetStr+" ");
        }
        
//
//        List<Integer> str1 = new ArrayList<>();
//        List<Integer> str2 = new ArrayList<>();
//        for (int i = 0; i < targetStrs.length; i++) {
//            if(targetStrs[i]==aimStrs[0]){
//                str1.add(i);
//            }
//            if(targetStrs[i]==aimStrs[1]){
//                str2.add(i);
//            }
//        }
//        int result=Integer.MAX_VALUE;
//        for (Integer integer : str1) {
//            for (Integer integer1 : str2) {
//                result = Math.min(Math.abs(integer-integer1),result);
//            }
//        }
//        System.out.println(result);
//        String[] targetStrs= new String[] {"QWER","1234","qwe","666","QWER"};
//        String[] aimStrs = new String[]{"QWER","666"};
        cc(targetStrs,aimStrs);
//        if (aimStrs[0] == null || aimStrs[1] == null) {
//            System.out.println(-1);
//        } else if (aimStrs[0] == aimStrs[1]) {
//            System.out.println(0);
//        } else {
//            int last1 = -1;
//            int last2 = -1;
//            int result = Integer.MAX_VALUE;
//            for (int i = 0; i < n; i++) {
//                if (targetStrs[i].equals(aimStrs[0])) {
//                    result = Math.min(result, last2 == -1 ? result : i - last2);
//                    last1 = i;
//                }
//                if (targetStrs[i].equals(aimStrs[1])) {
//                    result = Math.min(result, last1 == -1 ? result : i - last1);
//                    last2 = i;
//                }
//
//            }
//            System.out.println(result == Integer.MAX_VALUE ? -1 : result);
//        }
    }
    public static void cc(String[] targetStrs,String[] aimStrs){
        List<Integer> str1 = new ArrayList<>();
        List<Integer> str2 = new ArrayList<>();
        for (int i = 0; i < targetStrs.length; i++) {
            if(targetStrs[i].equals(aimStrs[0])){
                str1.add(i);
            }
            if(targetStrs[i].equals(aimStrs[1])){
                str2.add(i);
            }
        }
        System.out.println(str1.toString());
        System.out.println(str2.toString());
        int result=Integer.MAX_VALUE;
        for (Integer integer : str1) {
            for (Integer integer1 : str2) {
                result = Math.min(Math.abs(integer-integer1),result);
            }
        }
        System.out.println(result==Integer.MAX_VALUE?-1:result);
    }
}
