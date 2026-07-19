package Array;
import java.util.Arrays;
public class arraycall {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        add(a);
        System.out.println(Arrays.toString(a));
        a=expand(a);
        System.out.println(Arrays.toString(a));
        /*int b = 1;
        b=addint(b);
        System.out.println(b);**/
    }
    private static void add(int[] a){
        for(int i=0;i<a.length;i++){
            a[i]=addint(a[i]); //只对地址内的index进行赋值，并没有对地址进行赋值导致易位，与形参地址一致
        }System.out.println(Arrays.toString(a));
    }
    private static int addint(int x){
        x+=1; //x = x+1 也视为赋值，进行了地址易位
        return x;
    }
    private static int[] expand(int[] x){
        x = Arrays.copyOf(x,x.length*2); //进行了一次地址易位，与形参的地址不一致
        for(int i=0;i<x.length;i++){
            if(x[i]==0){
                x[i]=i+1;
            }
        }System.out.println(Arrays.toString(x));
        add(x);
        return x;
    }
}
