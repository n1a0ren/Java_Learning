package Training;
import java.util.Scanner;
//练习题3: 手机选号:根据用户输入的手机号来确认用户实际支付的价格
public class Q3 {
    public static void main(String[] args){
        System.out.println("请输入你的手机号码");
        String num = new Scanner(System.in).nextLine();
        char c = num.charAt(10);
        int price = 0;
        switch (c){
            case '8': price = 50; break;
            case '4': break;
            default: price = 20;
        }
        System.out.println("您所需要交付的话费为"+price+"元");
    }
}