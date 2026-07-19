package Training;
import java.util.Arrays;
import java.util.Random;
public class Q24 {
    public static void main(String[] args) {
        int[] vote = getVote();
        System.out.println("候选人1号的得票率为："+getPercentage(vote[1])+"%");
        System.out.println("候选人1号的得票数为："+vote[1]);
        System.out.println("候选人2号的得票率为："+getPercentage(vote[2])+"%");
        System.out.println("候选人2号的得票数为："+vote[2]);
        System.out.println("候选人3号的得票率为："+getPercentage(vote[3])+"%");
        System.out.println("候选人3号的得票数为："+vote[3]);
        System.out.println("候选人4号的得票率为："+getPercentage(vote[4])+"%");
        System.out.println("候选人4号的得票数为："+vote[4]);
        System.out.println("候选人5号的得票率为："+getPercentage(vote[5])+"%");
        System.out.println("候选人5号的得票数为："+vote[5]);
        System.out.println("弃票数为："+vote[0]);
        System.out.println("弃票率为："+getPercentage(vote[5])+"%");
        System.out.println("得票最高的候选人为："+getMax(vote)+"号候选人");
    }

    private static int getMax(int[] vote) {
        int max=1;
        for (int i = 2; i < vote.length; i++) {
            max=vote[i]>vote[max]?i:max;
        }return max;
    }

    private static Double getPercentage(int vote) {
        return ((double) vote/10);
    }


    private static int[] getVote() {
        int[] total = new int[6];
        for (int i6 = 0; i6 < 1000; i6++) {
            int vote = new Random().nextInt(6);
            switch (vote){
                case 1: total[1]++;break;
                case 2: total[2]++;break;
                case 3: total[3]++;break;
                case 4: total[4]++;break;
                case 5: total[5]++;break;
                default: total[0]++;break;
            }
        }return total;
    }
}
