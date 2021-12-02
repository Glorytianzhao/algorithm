package leetcode;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 我感觉是用贪心算法
 *
 */
public class LeetCode3 {

    public static void main(String[] args) {
        String str = "asdfasdgg";
        int length = getStr(str);


    }

    private static int getStr(String str) {

        int j = 1;
        int i = 0;
        int max = 0;
        char[] chars = str.toCharArray();

        int temp = 0;
        while (i < chars.length){


            if (chars[i] != chars[j]){
                j++;
            } else {
                temp = j - i;
                if (temp > )
                i++;
            }
        }

    }
}
