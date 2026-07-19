package Object_Oriented_Train;

public class Phone {
    String brand;
    String colour;

    public Phone(double price) {
        this.price = price;
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public Phone() {
    }

    public Phone(String brand, String colour, double price) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    double price;

    /*public static void main(String[] args) {
        Phone iphone20promax = new Phone();
        iphone20promax.brand = "apple";
        iphone20promax.colour = "black";
        iphone20promax.price = 10000.0;

        showPhoneInfo(iphone20promax);
    }*/

    public void showPhoneInfo(Phone phone) {
        System.out.println(phone.brand);
        System.out.println(phone.colour);
        System.out.println(phone.price);
    }


}
