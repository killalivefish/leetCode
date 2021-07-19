package leetcode.medium;

//TODO find simple method
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[i].length; i1++) {
                if(matrix[i][i1] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
