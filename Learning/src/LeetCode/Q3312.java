package LeetCode;

/*
* Q3312 查询排序后的最大公约数 困难
* https://leetcode.cn/problems/sorted-gcd-pair-queries/description/
* 未通关
* 逻辑测试通过，压力测试不通过
* Line37的公式在遇见大数字时会导致int溢出
*/

class Q3312 {

    public int[] gcdValues(int[] nums, long[] queries) {
        int[] gcdPairs = gcdPairs(nums);
        int[] answer = new int[queries.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = gcdPairs[(int) queries[i]];
        }
        return answer;
    }

    //Find the HCF
    public int gcd(int a, int b){

        int HCF = 1; //Initalize the value who is storing HCF

        for(int i=1;i<=(a<b?a:b);i++){
            //Try to find the largest common divisor
            if(!(a%i!=0 || b%i!=0)){
                HCF = i;
            }
        }
        return HCF;
    }

    public int[] gcdPairs(int[] arr){

        int index = (arr.length*(arr.length-1))/2;
        //Find the index number of gcdPairs(Using A.C. formula)
        int[] gcdPairs = new int[index];

        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                gcdPairs[(int) index-1] = gcd(arr[i],arr[j]);
                index--;
            }
        }
        return sort(gcdPairs);
    }

    public int[] sort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i;j<arr.length-1;j++){
                if(arr[min]>arr[j+1]){
                    min = j+1;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
}