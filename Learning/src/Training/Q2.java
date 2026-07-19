package Training;
import java.util.Scanner;
//练习题2: BMI 指数测试 BMI = 体重 (kg) / 身高² (m)
public class Q2 {
    public static void main(String[] args){
        System.out.println("请输入你的身高（m）");
        float height = new Scanner(System.in).nextFloat();
        System.out.println("请输入你的体重（kg）");
        float weight = new Scanner(System.in).nextFloat();
        float bmi = weight/height/height;
        System.out.println("您的bmi是 "+bmi);
        if(bmi<18.5){
            System.out.println("您属于过轻");
        }else if (bmi<23){
            System.out.println("您属于正常");
        }else if (bmi<25){
            System.out.println("您属于偏胖");
        }else if (bmi<30){
            System.out.println("您属于肥胖");
        }else if (bmi<40){
            System.out.println("您属于重度肥胖");
        }else{
            System.out.println("您属于极度肥胖");
        }
    }
}
