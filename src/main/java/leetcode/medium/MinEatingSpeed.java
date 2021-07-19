package leetcode.medium;

import java.util.Arrays;

//TODO error
public class MinEatingSpeed {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        if (h == piles.length) {
            return piles[piles.length - 1];
        }

        Integer minSpeed = null;
        for (int speed = 1; speed < piles[piles.length - 1]; speed++) {
            if (minSpeed != null) {
                break;
            }
            int count = 0;
            for (int i = 0; i < piles.length; i++) {
                count += (piles[i] / speed + (piles[i] % speed == 0 ? 0 : 1));
                if (count > h) {
                    break;
                }
                if (i == piles.length - 1 && count == h) {
                    if (minSpeed == null) {
                        minSpeed = speed;
                    } else {
                        minSpeed = Math.min(minSpeed, speed);
                    }
                }
            }
        }

        return minSpeed;
    }
}
