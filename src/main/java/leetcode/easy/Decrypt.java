package leetcode.easy;

import java.util.Arrays;

/**
 * @author HuBo
 */
public class Decrypt {
    
    //    + i +1+2+...+n if n == arr.length i=0
    //    - i -1-2-...-n if n == 0 i=arr.length
    public static int[] decrypt(int[] code, int k) {
        int length = code.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int curVal = 0;
            int tempIndex = i;
            for (int j = 1; j <= Math.abs(k); j++) {
                tempIndex += k > 0 ? 1 : -1;
                if (tempIndex < 0) {
                    tempIndex = length - 1;
                }
                if (tempIndex >= length) {
                    tempIndex = 0;
                }
                curVal += code[tempIndex];
            }
            
            result[i] = curVal;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {5, 7, 1, 4};
        System.out.print("arr = " + Arrays.toString(decrypt(arr1, 3)));
        int[] arr2 = {1, 2, 3, 4};
        System.out.print("arr = " + Arrays.toString(decrypt(arr2, 0)));
        int[] arr3 = {2, 4, 9, 3};
        System.out.print("arr = " + Arrays.toString(decrypt(arr3, -2)));
    }
    
}
