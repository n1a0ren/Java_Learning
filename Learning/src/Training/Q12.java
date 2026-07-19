package Training;
import java.util.Arrays;
import java.util.Random;
//打乱数组
public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int random;int temp;
        for (int i = 0; i < arr.length; i++) {
            random = new Random().nextInt(0,arr.length);
            temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }System.out.println(Arrays.toString(arr));
    }
}
