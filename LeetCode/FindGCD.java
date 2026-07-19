class Solution {
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