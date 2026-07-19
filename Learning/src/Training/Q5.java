package Training;
import java.util.Scanner;
//鸡兔同笼问题(穷举法)
//已知:鸡兔共35只,共94只脚,那么鸡和兔各几只?
public class Q5 {
    public static void main(String[] args){
        int animal_total = new Scanner(System.in).nextInt();
         int foot_total = new Scanner(System.in).nextInt();
        finding(animal_total,foot_total);
        }
    private static void finding(int animal_total, int foot_total) {
        int chick = animal_total; int rabit = 0; int foot_num = animal_total*2; int i = 0;
        while(foot_num != foot_total && chick>0){
            chick--;
            rabit++;
            foot_num = foot_num+2;
        }
        System.out.println("鸡的数量为: "+chick+"兔的数量为："+rabit);
    }
}
