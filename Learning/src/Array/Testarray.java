package Array;
public class Testarray {
    public static void main(String[] args){
        int[] a = new int[40000];
        a[39888] = 1;
        int[] b = {1,2,3,4,5};
        for(int i=0;i<=39999;i++) {
            System.out.println(a[i]+""+i);
        }
    }
}
