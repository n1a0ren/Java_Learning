package Class;

public class Testclass {

    private String name;
    String test;

    public void setname(String name){
        if(name.length()<=6){
            this.name = name;
        }else{
            this.name = "Fuckyou";
        }
    }
    public String getname(){
        return this.name;
    }
}
