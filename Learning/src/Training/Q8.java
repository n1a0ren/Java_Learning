package Training;
import java.util.Scanner;
//检测是否质数
public class Q8 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        int num = new Scanner(System.in).nextInt();
        boolean prime = false;
        for(int i=2;i<num;i++){
            if(num%i==0){prime=true;break;}
        }System.out.println(prime? num+"不是一个质数":num+"是一个质数");
    }
}