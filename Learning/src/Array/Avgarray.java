package Array;
public class Avgarray {
    public static void main(String[] args) {
        int[] a={5,6,34,85,20};
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }System.out.println(sum/a.length);
    }
}
