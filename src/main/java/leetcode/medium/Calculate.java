package leetcode.medium;

import java.util.Stack;
//3+4*5-3+2/4+2*3*9-8+7-6/6
//TODO
public class Calculate {
    public int calculate(String s) {
        Stack<String> tempStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            tempStack.push(s.charAt(i)+"");
        }
        int result = 0;
        while(!tempStack.isEmpty()){
            String pop = tempStack.pop();
            if("+".equals(pop)){
                result+=Integer.parseInt(tempStack.pop());
            }else if("-".equals(pop)){
                result+=Integer.parseInt(tempStack.pop());
            }else if("*".equals(pop)){
                result+=Integer.parseInt(tempStack.pop());
            }else if("/".equals(pop)){

            }else{
                result+=Integer.parseInt(pop);
            }
        }

        return result;
    }
}
