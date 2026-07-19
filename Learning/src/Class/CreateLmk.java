package Class;
public class CreateLmk {
    public static void main(String[] args){
        Lmk lmk = new Lmk();
        lmk.name = "梁明锦";
        lmk.age = 60;
        lmk.subject = "ICT";

        WPM wpm = new WPM();
        wpm.name = "黄佩文";
        wpm.age = 40;
        wpm.subject = "ENG";

        Lmk IsFool = new Lmk();

        IsFool.Say();
    }
}
