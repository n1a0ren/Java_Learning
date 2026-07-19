package Training;
import java.util.Arrays;
import java.util.Random;
//随机生成无重复数组
public class Q13 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]==0){
                int r = new Random().nextInt(1,100);
                if(!checkConsist(arr, r)){
                    arr[i]=r;
                }
            }
        }System.out.println(Arrays.toString(arr));
    }
    //checkConsist() 检查目标元素是否与数组内元素有重复
    public static boolean checkConsist(int[] arr, int goal) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            flag = (arr[i] == goal);
            if(flag){break;}
        }
        return flag;
    }
}
