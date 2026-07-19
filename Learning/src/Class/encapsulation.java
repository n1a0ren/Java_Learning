package Class;
import java.util.Scanner;
public class encapsulation {
    public static void main(String[] args){
        noenc();
    }
    public static void enc(){
        Testclass x = new Testclass();
        Scanner input = new Scanner(System.in);
        x.setname(input.nextLine());
        System.out.println(x.getname());
    }
    public static void noenc(){
        Testclass x = new Testclass();
        Scanner input = new Scanner(System.in);
        x.test = input.nextLine();
        System.out.println(x.test);
    }
}
