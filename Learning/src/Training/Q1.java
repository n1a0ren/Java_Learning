package Training;
import java.util.Scanner;
//接收用户输入的3个整数,并将它们的最大值作为结果输出
public class Q1 {
    public static void main(String[] args){
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int max = a;
        if(max<b){
            max = b;
        }
        if(max<c){
            max = c;
        }
        System.out.println(max);
    }
}
