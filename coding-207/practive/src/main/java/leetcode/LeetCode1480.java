package leetcode;


import java.util.Arrays;

public class LeetCode1480 {


    /**
     * 一维度数组的动态和
     */

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            res[i] = sum;
        }
        return res;
    }


    public static void main(String[] args) {
        //
        int[] test = {1,2,4,6};
        int[] ints = runningSum(test);
        System.out.println(Arrays.toString(ints));
    }
}
