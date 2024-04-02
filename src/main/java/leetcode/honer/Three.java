package leetcode.honer;

import java.util.PriorityQueue;
import java.util.Scanner;
//3.ACM编程题 【40分】 标题：分金条的最小花费 | 时间限制：2秒 | 内存限制：262144K
//        给定一个正数数组arr，arr的累加和代表金条的总长度，arr的每个数代表金条要分成的长度。规定长度为k的金条分成两块，费用为k个铜板。返回把金条分出arr中的每个数字需要的最小代价。
//https://www.nowcoder.com/practice/418d2fcdf7f24d6f8f4202e23951c0da
public class Three {
    // REMBER
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArray = scanner.nextLine().split(" ");
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < strArray.length; i++) {
            pq.offer(Long.parseLong(strArray[i]));
        }
        for (Long aLong : pq) {
            System.out.print(aLong+" ");
        }
        long cost = 0L;
        while (pq.size()>1){
            long temp = pq.poll()+pq.poll();
            cost +=temp;
            pq.offer(temp);
        }
        System.out.println(cost);
    }
}
