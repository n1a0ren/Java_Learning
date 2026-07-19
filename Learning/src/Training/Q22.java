package Training;

import java.util.Random;

//红包问题
public class Q22 {
    public static void main(String[] args) {
        int m = 10000; int n = 10;
        for (int i = 0; i < 9; i++) {
            int temp =new Random().nextInt(1,m-(n-i));
            System.out.println("你的红包金额为："+temp);
            m=m-temp;
        }System.out.println("你的红包金额为："+m);
    }
}
