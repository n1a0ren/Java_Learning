package Training;

import java.util.Arrays;

//二路归并找中位数
public class Q23 {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6,8,9};
        int[] arr= new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i+arr1.length]=arr2[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = min+1; j < arr.length; j++) {
                if(arr[min]>arr[j]){min=j;}
            }
            if(arr[i]>arr[min]){
                int temp=arr[i];
                arr[i] = arr[min];
                arr[min]=temp;}
        }System.out.println(Arrays.toString(arr));
        double mid;
        if(arr.length%2==0){
            mid= ((double) (arr[arr.length/2-1] + arr[arr.length/2])) /2;
        }else{
            mid=(arr[arr.length/2 + 1]);
        }System.out.println(mid);
        System.out.println(arr[arr.length/2]);
        System.out.println(arr[arr.length/2+1]);


    }

}
