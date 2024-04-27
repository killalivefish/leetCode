package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

/**
 * @author HuBo  超出内存限制  TreeMap和二分
 */
//TODO
public class SnapshotArray {
    
    int snapId = -1;
    
    Map<Integer, List<Integer>> snaps = new HashMap<>();
    
    List<Integer> array =new ArrayList<>();
    
    public SnapshotArray(int length) {
        for (int i = 0; i < length; i++) {
            this.array.add(0);
        }
    }
    
    public void set(int index, int val) {
        this.array.set(index, val);
    }
    
    public int snap() {
        this.snapId += 1;
        snaps.put(this.snapId,  new ArrayList<>(this.array));
        return this.snapId;
    }
    
    public int get(int index, int snap_id) {
        return this.snaps.get(snap_id).get(index);
    }
    
    public static void main(String[] args) {
        SnapshotArray snapshotArray = new SnapshotArray(3);
        snapshotArray.set(0, 5);
        snapshotArray.snap();
        snapshotArray.set(0, 6);
        snapshotArray.get(0, 0);
    }
}
