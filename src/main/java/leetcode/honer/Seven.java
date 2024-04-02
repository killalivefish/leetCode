package leetcode.honer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//7.【40分】 标题：排成一条线的纸牌博弈问题 | 时间限制：2秒 | 内存限制：262144K
//        给定一个整型数组arr，代表数值不同的纸牌排成一条线，玩家A和玩家B依次拿走每张纸牌，规定玩家A先拿，玩家B后拿，但是每个玩家每次只能拿走最左和最右的纸牌，玩家A和玩家B绝顶聪明。请返回最后的获胜者的分数。
//https://www.nowcoder.com/practice/7036f62c64ba4104a28deee98a6f53f6?tpId=182&tqId=34746&ru=/exam/oj
public class Seven {
    // REMBER
    public static void main(String[] args) {
    
    }
    public boolean predictTheWinner(int[] nums) {
        return total(nums, 0, nums.length - 1) >= 0;
    }
    
    public int total(int[] nums, int start, int end) { //去掉turn参数。不管当前是A玩家选还是B玩家选，我们都返回一个分数，代表当前玩家得分，减去另一玩家的得分。
        
        if (start == end) {
            return nums[start];
        }
        int scoreStart = nums[start] - total(nums, start + 1, end); //这里第二项从加号改为减号。
        int scoreEnd = nums[end] - total(nums, start, end - 1); //这里第二项从加号改为减号。
        return Math.max(scoreStart, scoreEnd); //直接返回最大值就好了，不需要知道当前玩家是谁。
    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int arrayLength = Integer.parseInt(in.nextLine());
//        String b = in.nextLine();
//        String[] numArray = b.split(" ");
//        LinkedList<Integer> numList = new LinkedList<>();
//        for (String s : numArray) {
//            numList.add(Integer.parseInt(s));
//        }
//        int resultA = 0;
//        int resultB = 0;
//        int n = 1;
//
//        while (!numList.isEmpty()) {
//            if (n % 2 == 0) {
//                if (numList.getFirst() >= numList.getLast()) {
//                    resultA += numList.getFirst();
//                    numList.removeFirst();
//                } else {
//                    resultA +=  numList.getLast();
//                    numList.removeLast();
//                }
//            } else {
//                if (numList.getFirst() >= numList.getLast()) {
//                    resultB += numList.getFirst();
//                    numList.removeFirst();
//                } else {
//                    resultB += numList.getLast();
//                    numList.removeLast();
//                }
//            }
//
//            n++;
//        }
//        System.out.println(Math.max(resultA, resultB));
//    }
    
}
