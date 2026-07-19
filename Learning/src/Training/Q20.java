package Training;

import java.util.Scanner;

//计算快递邮费
public class Q20 {
    public static void main(String[] args) {
        int mass = getMass();
        System.out.println("您所需支付的运费为："+getPrice(mass)+"元");
    }

    private static double getPrice(int mass) {
        double price=10;
        mass--;
        while(mass>5){
            mass--;
            price=price+1.5;
        }
        while(mass>0&&mass<=5){
            mass--;
            price=price+2;
        }
        return price;
    }

    private static int getMass() {
        int mass;
        System.out.print("请输入重量: ");
        double temp_mass =new Scanner(System.in).nextDouble();
        while(temp_mass<=0){
            System.out.println("重量无效，请重新输入！");
            System.out.print("请输入重量: ");
            temp_mass =new Scanner(System.in).nextDouble();
        }
        if(temp_mass>(int) temp_mass){
            mass=(int) temp_mass +1;
        }else{mass =(int) temp_mass;}
        return mass;
    }

}
