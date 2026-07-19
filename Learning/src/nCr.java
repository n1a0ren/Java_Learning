import  java.util.Scanner;
public class nCr {
    public static void main(String[] args) {
        System.out.println("Please input n");
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        System.out.println("Please input r");
        Scanner input2 = new Scanner(System.in);
        int r = input2.nextInt();
        //array[x][0] and array[x][length-1] are 1

        int[][] array=new int[n+1][];
        for(int i=0;i<array.length;i++){
            array[i] = new int[i+1]; //将二维数组指数完善
        }

        //array[x][y]=array[x-1][y-1]+array[x-1][y]
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(i==0||j==0||j==array[i].length-1){
                    array[i][j] = 1;
                } else{
                    array[i][j] = array[i-1][j-1]+array[i-1][j];
                }
            }
        }
        System.out.println(array[n][r]);
    }


    public static void output(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
