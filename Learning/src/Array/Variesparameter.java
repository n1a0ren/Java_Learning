package Array;
import java.util.Arrays;
public class Variesparameter {
    public static void main(String[] args) {
        add(1,2,3,4,5);
    }
    public static void add(int... x){
        System.out.println(Arrays.toString(x));//自动将形参封装成数组
    }
}
