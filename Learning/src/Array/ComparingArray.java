package Array;

import java.util.ArrayList;

public class ComparingArray {
    public static void main(String[] args) {
        ArrayList<Integer> _1 = new ArrayList<>();
        _1.add(1);
        _1.add(2);
        _1.add(3);
        ArrayList<Integer> _2 = new ArrayList<>();
        _2.add(3);
        _2.add(2);
        _2.add(1);
        System.out.println(_1.equals(_2));
    }
}
