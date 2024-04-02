package leetcode.honer;

//8.【40分】 标题：折纸问题 | 时间限制：2秒 | 内存限制：262144K
//        请把一张纸条竖着放在桌子上，然后从纸条的下边向上方对折1次，压出折痕后展开。此时折痕是凹下去的，即折痕突起的方向指向纸条的背面。如果从纸条的下边向上方连续对折2次，压出折痕后展开，此时有三条折痕，从上到下依次是下折痕、下折痕和上折痕。给定一个输入参数N，代表纸条都从下边向上方连续对折N次，请从上到下打印所有折痕的方向。
//https://www.nowcoder.com/practice/430180b66a7547e1963b69b1d0efbd3c?tpId=182&tqId=34763&ru=/exam/oj
public class Eight {
    //REMBER
    public static void main(String[] args) {
    
    }
    
    public static void printAllFolds(int N) {
        printProcess(1, N, true);
    }
    
    public static void printProcess(int i, int N, boolean down) {
        if (i > N) {
            return;
        }
        printProcess(i + 1, N, true);
        System.out.println(down ? "down" : "up");
        printProcess(i + 1, N, false);
    }
    
}
