package com.rudecrab.demo.common.suan;

/**
 * @author liutianzi
 * @version 1.0
 * @Description TODO
 * @date 2021/4/25 15:13
 **/
public class Lk_27 {
    public int removeElement(int[] nums, int val) {
        Integer index = 0;
        Integer newLength = 0;
        while (index < nums.length) {
            if (nums[index] != val) {
                nums[newLength++] = nums[index];
            }
            index++;
        }
        return newLength;
    }
}
