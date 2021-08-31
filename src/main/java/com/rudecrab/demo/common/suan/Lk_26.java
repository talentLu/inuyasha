package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/4/25 15:00
 **/
public class Lk_26 {
    public int removeElement(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        Integer slow = 0;
        Integer fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
