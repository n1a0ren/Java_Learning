package Training;
//去除重复元素
import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,3,3};
        /*int temp1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==temp1){
                arr[i]=0;
            }else{
                temp1=arr[i];
            }
        }int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[temp]=arr[i];
                arr[i] = temp==i?arr[temp]:0;
                temp++;
            }
        }System.out.println(Arrays.toString(arr));*/
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[temp]){
                temp++;
                arr[temp]=arr[i];
            }
        }System.out.println(Arrays.toString(arr));




    }
}
