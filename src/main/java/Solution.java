import javax.swing.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int beautifulSubsets(int[] nums, int k) {

        Set<Integer> counted = new HashSet<>();
        dfs(counted, nums, k, 0);
        return counted.size();
    }
    void dfs(Set<Integer> counted, int[] nums, int k, int mask) {
        for(int j = 0; j < nums.length; j++) {
            if((1 << j & mask) != 0) {
                break;
            }
            boolean flag = false;
            for(int i = 0; i < nums.length; i++) {
                if((mask & (1 << i)) != 0 && Math.abs(nums[i] - nums[j]) == k) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                continue;
            }
            counted.add(mask | 1 << j);
            dfs(counted, nums, k, mask | 1 << j);


        }
    }
}