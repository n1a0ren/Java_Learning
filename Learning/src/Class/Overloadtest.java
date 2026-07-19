package Class;
public class Overloadtest {
    public static void main(String[] args){
        int a = 4;
        String b = "damn";
        test(a);
        test(b);
    }
    public static void test(int a){
        System.out.println("Hi!");
    }
    public static void test(String b){
        System.out.println("Fuck you!");
    }
}
