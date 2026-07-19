package Training;
//逢七过 数字包含7或者是7的倍数时都要说过，打印出1-100符合过的数
public class Q6 {
    public static void main(String[] args) {
        int temp = 0;
        for(int i=1;i<100;i++){
            if(i%7==0||(i%10==7||((int) i/10)==7)){
                System.out.println(i);
                temp++;
            }
        }System.out.println("总数为："+temp);
    }
}
