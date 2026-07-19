package Training;

import java.util.Arrays;

//移除元素
public class Q21 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2; int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val){count++;}
        }int[] temp = new int[nums.length-count];
        int j=0;
        for (int i = 0; i < nums.length;i++) {
            if(nums[i]!=val){
                temp[j]=nums[i];
                j++;
            }
        }nums = temp;
        System.out.println(Arrays.toString(nums));
    }
}
