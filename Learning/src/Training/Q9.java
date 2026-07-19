package Training;
import java.util.Random;
import java.util.Scanner;
//猜数字小游戏
public class Q9 {
    public static void main(String[] args) {
        int goal = new Random().nextInt(1,100);
        int num;
        do{num = input(goal);}while(num!=goal);
    }
    public static int input(int goal){
        System.out.println("请输入猜测: ");
        int num = new Scanner(System.in).nextInt();
        check(num, goal);
        return num;
    }
    public static void check(int num, int goal){
        if(num>goal){
            System.out.println("大了！");
        }else if(num<goal){
            System.out.println("小了！");
        }else{
            System.out.println("对了！");
        }
    }
}
