package exercise5;

public class PhoneTest {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.brand = "华为";
        phone.price = 3998;
        phone.color = "黑色";
        phone.call();
        phone.sendMessage();
    }
}
