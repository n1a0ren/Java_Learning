package Training;
import java.util.Scanner;
//求平方根
public class Q7 {
    public static void main(String[] args) {
        System.out.println("请输入一个大于等于2的整数");
        int num = new Scanner(System.in).nextInt();
        int surd = 0;
        while(surd*surd<=num){
            surd++;
        }
        System.out.println(num+"的平方根是"+(surd-1));
    }
}
