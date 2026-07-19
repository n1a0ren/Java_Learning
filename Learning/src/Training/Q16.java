package Training;

import java.util.Arrays;

//合并数列并排序
public class Q16 {
    public static void main(String[] args) {
        int[] arr1 = {34,234,423,5};
        int[] arr2 = {5,5,5};
        int[] arr = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i+arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }System.out.println(Arrays.toString(arr));
    }
}
