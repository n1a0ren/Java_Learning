package Object_Oriented_Train;

public class Student {
    private String name;
    private int age;
    private double height;
    private double weight;
    private int year = 1;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setAge(int age) {
        if(age>6&&age<30){this.age = age;}
        System.out.println(this.age==age?"年龄设置成功":"年龄设置失败");
        return this.age == age;
    }

    public int getAge() {
        return age;
    }

    public boolean setHeight(double height) {
        if(height>1.0&height<3.0){this.height = height;}
        System.out.println(this.height==height?"身高设置成功":"身高设置失败");
        return this.height == Student.this.height;
    }

    public double getHeight() {
        return height;
    }

    public boolean setWeight(double weight) {
        if(weight>0.0){this.weight = weight;}
        System.out.println(this.weight==weight?"体重设置成功":"体重设置失败");
        return this.weight == weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }
    public void study(){
        System.out.println(this.name+"正在学习");
        this.age++;
        this.year++;
    }
    public void showInfo(){
        System.out.println("姓名: "+name);
        System.out.println("年龄: "+age);
        System.out.println("身高: "+height);
        System.out.println("体重: "+weight);
    }
}
