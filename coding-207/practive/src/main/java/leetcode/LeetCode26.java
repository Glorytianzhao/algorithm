package leetcode;

import java.util.Arrays;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class LeetCode26 {

    public static void main(String[] args) {
        //
        int[] arr = {2, 3, 5,5, 7};
        int i = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("1234");
    }

    private static int removeDepuliate(int[] nums) {
        //使用双指针 数据是有序的
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int m = 0, n = 1;
        while (n < nums.length) {
            if (nums[m] == nums[n]) {
                //不放到新的数组中
                n++;
            } else {
                m++;
                nums[m] = nums[n];
                n++;
            }
        }
        return m + 1;

    }

    /**
     * 解题思路：
     * 解法： 双指针
     *
     * 首先注意数组是有序的，那么重复的元素一定会相邻。
     *
     * 要求删除重复元素，实际上就是将不重复的元素移到数组的左侧。
     *
     * 考虑用 2 个指针，一个在前记作 p，一个在后记作 q，算法流程如下：
     *
     * 1.比较 p 和 q 位置的元素是否相等。
     *
     * 如果相等，q 后移 1 位
     * 如果不相等，将 q 位置的元素复制到 p+1 位置上，p 后移一位，q 后移 1 位
     * 重复上述过程，直到 q 等于数组长度。
     *
     * 返回 p + 1，即为新数组长度。
     *
     * 画个图理解一下
     *
     *
     *
     * 代码：
     *
     * Java
     *
     *  public int removeDuplicates(int[] nums) {
     *     if(nums == null || nums.length == 0) return 0;
     *     int p = 0;
     *     int q = 1;
     *     while(q < nums.length){
     *         if(nums[p] != nums[q]){
     *             nums[p + 1] = nums[q];
     *             p++;
     *         }
     *         q++;
     *     }
     *     return p + 1;
     * }
     * 复杂度分析：
     *
     * 时间复杂度：O(n)O(n)。
     * 空间复杂度：O(1)O(1)。
     *
     * 优化：
     *
     * 这是大部分题解都没有提出的，在这里提一下。
     *
     * 考虑如下数组：
     *
     *
     *
     * 此时数组中没有重复元素，按照上面的方法，每次比较时 nums[p] 都不等于 nums[q]，因此就会将 q 指向的元素原地复制一遍，这个操作其实是不必要的。
     *
     * 因此我们可以添加一个小判断，当 q - p > 1 时，才进行复制。
     *
     * 代码：
     *
     * Java
     *
     * public int removeDuplicates(int[] nums) {
     *     if(nums == null || nums.length == 0) return 0;
     *     int p = 0;
     *     int q = 1;
     *     while(q < nums.length){
     *         if(nums[p] != nums[q]){
     *             if(q - p > 1){
     *                 nums[p + 1] = nums[q];
     *             }
     *             p++;
     *         }
     *         q++;
     *     }
     *     return p + 1;
     * }
     *
     * 作者：max-LFszNScOfE
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shuang-zhi-zhen-shan-chu-zhong-fu-xiang-dai-you-hu/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */

    public static int removeDuplicates(int[] nums) {
        //使用双指针 数组是有序的
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[cur] != nums[i]) {
                nums[cur + 1] = nums[i];
                cur++;
            }
        }
        return cur + 1;
    }

}
