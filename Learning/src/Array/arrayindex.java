package Array;
import java.util.Scanner;
public class arrayindex {
/**public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[] num={5,7,10,4,6};
        int index = -1;
        for(int i=0;i<num.length;i++){
            if(target==num[i]){
                index = i;
                break;
            }
        }System.out.println(index);
    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        System.out.println(find(target));
    }
    public static int find(int x){
        int[] num={5,7,10,4,6};
        int index = -1;
        for(int i=0;i<num.length;i++) {
            if (x == num[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}
