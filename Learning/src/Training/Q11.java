package Training;
//求最大最小值
public class Q11 {
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }System.out.println("最小值为："+min);
    }
}
