package leetcode.medium;

import java.util.*;

public class CircularArrayLoop {
    public boolean circularArrayLoop(int[] nums) {
//        List<Stack<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            Stack<Integer> temp = new Stack<>();
            isOk(i,nums,temp);
            if(temp.peek()==temp.firstElement()){
                return true;
            }
        }

        return false;
    }

    private void isOk(int curIndex, int[] nums, Stack<Integer> temList){
        temList.add(curIndex);
        int nextIndex = curIndex+nums[curIndex];

        while(!temList.contains(nextIndex) || (nextIndex>0 &&nextIndex<=nums.length)){
            temList.add(nextIndex);
            nextIndex = nextIndex+nums[curIndex];
        }

    }
}
