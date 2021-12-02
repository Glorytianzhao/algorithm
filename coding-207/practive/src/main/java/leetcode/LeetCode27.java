package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class LeetCode27 {

    public static void main(String[] args) {
        //调用该方法

        //
        int[] arr = {3, 20, 23, 101};
        int i = removeElement(arr, 23);
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
    }

    private static int removeElement(int[] nums,int val){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }



}
