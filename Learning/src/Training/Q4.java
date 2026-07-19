package Training;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        System.out.println("请输入第一只老虎的体重（kg）");
        double tiger1 = new Scanner(System.in).nextDouble();
        System.out.println("请输入第二只老虎的体重（kg）");
        double tiger2 = new Scanner(System.in).nextDouble();
        System.out.println("两只老虎的体重"+findTigerMax(tiger1, tiger2));
        System.out.println("请输入第一名和尚的体重（int）");
        int mock1 = new Scanner(System.in).nextInt();
        System.out.println("请输入第二名和尚的体重（int）");
        int mock2 = new Scanner(System.in).nextInt();
        System.out.println("请输入第三名和尚的体重（int）");
        int mock3 = new Scanner(System.in).nextInt();
        System.out.println("三个和尚的最高身高为"+findMockMax(mock1,mock2,mock3)+"cm");
    }
    private static String findTigerMax(double tiger1, double tiger2){
        return tiger1==tiger2? "相同":"不相同";
    }
    private static int findMockMax(int mock1, int mock2, int mock3){
        return mock1>mock2?(mock1>mock3?mock1:mock3):(mock2>mock3?mock2:mock3);
    }
}