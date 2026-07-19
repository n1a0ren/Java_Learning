package Training;
//评委打分
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        int total=0;
        int[] score = new int[5];
        for (int i = 0; i < score.length; i++) {
            score[i] = marking();
            total=score[i]+total;
        }
        System.out.println("五名评委的总分是: "+total);
        System.out.println("选手的平均分是: "+((total-findMax(score)-findMin(score))/(score.length-2)));
    }
    public static boolean checkScoreRange(int score){
        return score <= 100 && score >= 0;
    }
    public static int marking() {
        System.out.print("请打分：");
        int score = new Scanner(System.in).nextInt();
        while (!checkScoreRange(score)) {
            System.out.println("invalid input!");
            System.out.print("请打分：");
            score = new Scanner(System.in).nextInt();
        }
        return score;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=arr[i]>max?arr[i]:max;
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min=arr[i]<min?arr[i]:min;
        }
        return min;
    }

}
