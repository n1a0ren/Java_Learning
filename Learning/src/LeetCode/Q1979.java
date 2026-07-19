package LeetCode;
/*
 * Q1979 找出数组的最大公约数 简单
 * https://leetcode.cn/problems/find-greatest-common-divisor-of-array/
 * 已通关
 * 时间复杂度为O(N)，但空间复杂度略有不足
 * 可用欧几里得算法进行再次优化
 */

public class Q1979 {
    public int findGCD(int[] nums) {

        int max = nums[0];int min = nums[0];int gcd=1;

        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        }

        for(int i=2;i<=min;i++){
            if(!(min%i!=0 || max%i!=0)){
                gcd=i;
            }
        }
        return gcd;
    }
}
