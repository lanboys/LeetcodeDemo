//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31, 2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学

package com.bing.lan.leetcode.editor.cn;

public class ReverseInteger {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Solution solution = new ReverseInteger().new Solution();
        int maxValue = Integer.MAX_VALUE;
        int reverse = solution.reverse(-494651650);
        System.out.println("main(): " + reverse);
        System.out.println("耗时(ms)：" + (System.currentTimeMillis() - start));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public int reverse(int x) {
            long rst = 0;
            while (x != 0) {
                int i = x % 10;
                rst = rst * 10 + i;
                x /= 10;
                if (rst > Integer.MAX_VALUE || rst < Integer.MIN_VALUE) {
                    return 0;
                }
            }
            return (int) rst;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}