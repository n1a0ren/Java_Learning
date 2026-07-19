package Training;
//两数之和
public class Q15 {
    public static void main(String[] args) {

        int[] arr = {2,7,2,5,4};
        System.out.println("打印全部");
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("组合为："+i+"+"+j);
                    break;
                }
            }
        }
        System.out.println("打印第一个");
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("组合为："+i+"+"+j);
                    flag = true;
                    break;
                }
            }if(flag){break;}
        }
    }
}
