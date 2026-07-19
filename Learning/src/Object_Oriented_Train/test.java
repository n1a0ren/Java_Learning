package Object_Oriented_Train;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*Phone iphone = new Phone();
        iphone.brand = "apple";
        iphone.colour = "white";
        iphone.price = 10000;
        iphone.showPhoneInfo(iphone);*/

        Worker ricky = new Worker();
        ricky.setWorker("李嘉祺", 18, 0);
        Worker Peter = new Worker("Leo", 30, 18);
        ricky.showWorkerInfo(); Peter.showWorkerInfo();
        ricky.work();

        /*Student s1 = new Student();
        initInfo(s1);


        while(s1.getYear()<4){
            s1.study();
            System.out.println("你现在是Year "+s1.getYear());
            System.out.println("一年一度的体检到了！是否更新个人信息？(是/否)");
            if (new Scanner(System.in).next().equals("是")) {
                setInfo(s1);
            }
        }
        s1.study();
        System.out.println("大学毕业后");
        s1.showInfo();*/
    }








    private static void initInfo(Student student) {
        System.out.println("请登记个人信息");

        System.out.print("请输入姓名: ");
        student.setName(new Scanner(System.in).next());

        System.out.print("请输入年龄: ");
        boolean age = student.setAge(new Scanner(System.in).nextInt());
        while(!age){
            System.out.print("请重新输入年龄: ");
            age = student.setAge(new Scanner(System.in).nextInt());
        }

        System.out.print("请输入身高: ");
        boolean height = student.setHeight(new Scanner(System.in).nextDouble());
        while(!height){
            System.out.print("请重新输入年龄: ");
            height = student.setHeight(new Scanner(System.in).nextDouble());
        }

        System.out.print("请输入体重: ");
        boolean weight = student.setWeight(new Scanner(System.in).nextDouble());
        while(!weight){
            System.out.print("请重新输入年龄: ");
            weight = student.setWeight(new Scanner(System.in).nextDouble());
        }
    }


    private static void setInfo(Student student) {
        System.out.print("请输入身高: ");
        boolean height = student.setHeight(new Scanner(System.in).nextDouble());
        while(!height){
            System.out.print("请重新输入年龄: ");
            height = student.setHeight(new Scanner(System.in).nextDouble());
        }

        System.out.print("请输入体重: ");
        boolean weight = student.setWeight(new Scanner(System.in).nextDouble());
        while(!weight){
            System.out.print("请重新输入年龄: ");
            weight = student.setWeight(new Scanner(System.in).nextDouble());
        }
    }
}
