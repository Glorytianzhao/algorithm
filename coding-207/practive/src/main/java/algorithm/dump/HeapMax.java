package algorithm.dump;

import java.util.Arrays;

/**
 * Description:
 * date: 2020/11/24 5:05 下午
 *
 * @author vic.yang
 */
public class HeapMax {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 6, 8, 5, 9};
        topK(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    //简历大根堆
    public static void build(int[] nums, int len) {
        int last = len / 2 - 1;
        for (int i = last; i >= 0; i--) {
            adjustDown(nums, i, nums.length);
        }
    }

    //大根堆排序（递减）
    public static void sort(int[] nums) {
        build(nums, nums.length);
        for (int i = nums.length - 1; i >= 0; i--) {
            swap(nums, i, 0);
            adjustDown(nums, 0, i);
        }
    }

    //最小TopK问题
    public static void topK(int[] nums, int k) {
        if (nums.length <= k) return;
        build(nums, k);
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > nums[0]) continue;
            swap(nums, 0, i);
            adjustDown(nums, 0, k);
        }
    }

    //交换
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //向下调整
    public static void adjustDown(int[] nums, int i, int len) {
        int last = len / 2 - 1;
        if (i > last) return;
        int left = i * 2 + 1;
        int right = left + 1;

        int aim = left;
        if (right < len && nums[left] < nums[right]) {
            aim = right;
        }

        if (nums[aim] > nums[i]) {
            swap(nums, aim, i);
            adjustDown(nums, aim, len);
        }
    }

}
