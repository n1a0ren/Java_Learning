package Training;
//打印九九乘法表
public class Q17 {
    public static void main(String[] args) {
        for (int i=1; i < 10; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }System.out.println();
        }
    }
}
