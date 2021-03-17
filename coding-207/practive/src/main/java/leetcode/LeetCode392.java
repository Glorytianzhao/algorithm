package leetcode;

/**
 * tag : 贪心算法
 * Description:
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * <p>
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 * <p>
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * <p>
 * date: 2020/11/27 6:00 下午
 *
 * @author vic.yang
 */
public class LeetCode392 {

    public static boolean contains(String s, String t) {

        int m = s.length();
        int n = t.length();

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == m;
    }


    public static void main(String[] args) {
        System.out.println(contains( "gsg","aadsgfadsg"));
        System.out.println(contains("sda","aadsgfadsg"));
        System.out.println(contains( "daf","aadsgfadsg"));
    }
}
