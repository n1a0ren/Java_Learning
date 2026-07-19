package Class;

public class Student {
    String name;
    int classno;
    String sex;
    int score;
    public Student(String name, int classno, String sex, int score){
        this(name,classno,score);
        this.sex = sex;

    } //带参构造
    public Student(String name, int classno, int score){
        this.name = name;
        this.classno = classno;
        this.score = score;
    }
    public Student(){
    }//无参构造（如果没有带参构造，编译器会自动生成无参构造，不需要新加这一行）
    public void output(){
        System.out.println("Hi,"+name+" "+sex+"!\nYour class number is "+classno+" and your score is "+score);
    }
}
