package Object_Oriented_Train;

public class Worker {
    private String name;
    private int age;
    private int workage;
    public Worker(){}
    public Worker(String name, int age, int workage){
        setName(name);
        setAge(age);
        setWorkage(workage);
    }

    public void setWorker(String name, int age, int workage){
        setName(name);
        setAge(age);
        setWorkage(workage);
    }

    private void setName(String name){
        if(name.length()>1&&name.length()<5){
            this.name = name;
        }System.out.println(this.name==name? "姓名设置成功":"姓名设置失败");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWorkage() {
        return workage;
    }

    private void setAge(int age){
        if(age>=18&&age<=65){
            this.age = age;
        }System.out.println(this.age==age? "年龄设置成功":"年龄设置失败");
    }
    private void setWorkage(int workage){
        if(workage<this.age){
            this.workage = workage;
        }System.out.println(this.workage==workage? "工龄设置成功":"工龄设置失败");
    }
    public void showWorkerInfo(){
        System.out.println("姓名: "+this.name);
        System.out.println("年龄: "+this.age);
        System.out.println("工龄: "+this.workage);
    }
    public void work(){
        System.out.println(this.name+"正在工作");
    }


}
