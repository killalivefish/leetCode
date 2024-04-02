package leetcode.medium;

import java.util.*;

//TODO
public class MaxMoves {

    public int maxMoves(int[][] grid) {
        int result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int row = 0; row < grid.length; row++) {

        }

        return result;
    }

    private int bfs(int row, int col, int[][] grid,boolean[][] visited ) {
        int curTopMax = 0;
        int curRightMax = 0;
        int curBottomMax = 0;
        visited[row][col] =true;
        if (row - 1 >= 0 && col + 1 <= grid[row].length && grid[row][col] > grid[row - 1][col + 1]) {

            curTopMax = 1 + Math.max(curTopMax, bfs(row - 1,col + 1,grid,visited));
        }

        if (col + 1 <= grid[row].length && grid[row][col] > grid[row][col + 1]) {
            visited[row][col] =true;
            curRightMax = 1 + Math.max(curRightMax, bfs(row,col + 1,grid,visited));
        }

        if (row + 1 <= grid.length && col + 1 <= grid[row].length && grid[row][col] > grid[row + 1][col + 1]) {
            visited[row][col] =true;
            curBottomMax = 1 + Math.max(curBottomMax, bfs(row + 1,col + 1,grid,visited));
        }

         return Math.max(curTopMax, Math.max(curRightMax, curBottomMax));
    }

    private class Pos {
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
