package Training;
//计算班级分数
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        int[] score = new int[10];
        for (int i = 0; i < score.length; i++) {
            score[i] = marking();
        }
        System.out.println("及格人数: "+findPassNum(score));
        System.out.println("及格率: "+findPassPer(score)+"%");
        System.out.println("总分: "+findTotal(score));
        System.out.println("平均分: "+findTotal(score)/score.length);
        System.out.println("最高分: "+findMax(score));
    }
    public static int findPassNum(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=60){count++;}
        }
        return count;
    }
    public static double findPassPer(int[] arr){
        return ((double) findPassNum(arr)/(double) arr.length)*100;
    }
    public static int findTotal(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total = total+arr[i];
        }
        return total;
    }
    public static int marking() {
        System.out.print("请输入分数: ");
        int score = new Scanner(System.in).nextInt();
        while (!checkScoreRange(score)) {
            System.out.println("成绩无效，请重新输入");
            System.out.print("请输入分数: ");
            score = new Scanner(System.in).nextInt();
        }
        return score;
    }
    public static boolean checkScoreRange(int score){
        return score <= 100 && score >= 0;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
}
