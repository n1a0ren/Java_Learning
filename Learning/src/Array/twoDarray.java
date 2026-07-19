package Array;
public class twoDarray {
    /**
     -------------------------------------
     I i/j I  0  I  1  I  2  I  3  I  4  I
     -------------------------------------
     I  0  I  9  I  0  I  0  I  0  I  0  I
     -------------------------------------
     I  1  I  0  I  0  I  6  I  0  I  0  I
     -------------------------------------
     I  2  I  0  I  0  I  0  I  0  I  3  I
     -------------------------------------


     */
    public static void main(String[] args) {
        //int[][] a={{1,2,3},{1,2,3,4},{1,2,3,4,5}};

        int[][] a = new int[3][];
        for(int i=0;i<a.length;i++){
            a[i] = new int[3+i];
        }
        a[0][0] = 9;
        a[1][2] = 6;
        a[2][4] = 3;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
