package leetcode.easy.stack;

import java.util.LinkedList;
import java.util.Stack;

public class CountStudents {
    public int countStudents(int[] students, int[] sandwiches) {
        LinkedList<Integer> sandQueue = new LinkedList<>();
        for (int sandwich : sandwiches) {
            sandQueue.add(sandwich);
        }

        LinkedList<Integer> stuQueue = new LinkedList<>();
        for (int student : students) {
            stuQueue.add(student);
        }

        int i = 0;
//        while (!stuQueue.isEmpty() && !sandQueue.isEmpty() && hasLike(stuQueue.getFirst(), sandQueue)) {
        while (true) {
            if (stuQueue.getFirst().equals(sandQueue.getFirst())) {
                stuQueue.removeFirst();
                sandQueue.removeFirst();
            } else {
                stuQueue.add(stuQueue.getFirst());
                stuQueue.removeFirst();
                i++;
            }
            if(i>=stuQueue.size() || stuQueue.isEmpty()){
                break;
            }
        }

        return sandQueue.size();
    }

    private boolean hasLike(int type, LinkedList<Integer> sandQueue) {
        for (int sandtype : sandQueue) {
            if (type == sandtype) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CountStudents students = new CountStudents();
        System.out.println(students.countStudents(new int[]{1,1, 1, 0, 0,1}, new int[]{1,0,0,0, 1, 1}));
    }
}
