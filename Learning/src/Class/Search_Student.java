package Class;
import java.util.Scanner;
public class Search_Student {
    public static void main(String[] args){
        Student Sam = new Student("Sam",20,60);
        Student Bowen = new Student("Bowen",6,"Male",62); //带参构造
        Student Lucy = new Student(); //无参构造
        Lucy.name = "Lucy";
        Lucy.classno = 4;
        Lucy.sex = "F";
        Lucy.score = 58;

        String student = search();

        switch(student){
            case("Sam"):
                Sam.output();
                break;
            case("Bowen"):
                Bowen.output();
                break;
            case("Lucy"):
                Lucy.output();
                break;
            default:
                System.out.println("Cannot find your student data!");
        }
    }
    private static String search(){
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String target = input.nextLine();
        return target;
    }
}
