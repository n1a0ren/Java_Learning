package Training;
import java.util.Scanner;
//查找数据
public class Q10 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println("请输入你想查找的数字: ");
        int num = new Scanner(System.in).nextInt();
        boolean index = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                System.out.println("索引为: "+i);
                index=true;break;
            }
        }if(!index){
            int min = 0;boolean flag = false;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>num){min=i;flag=true;break;}
            }
            System.out.println(flag?"索引为: "+min:"索引为: "+arr.length);
        }
    }
}
