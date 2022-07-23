package exercise5;

public class Phone {
    String brand;
    int price;
    String color;

    public void call() {
        System.out.println("正在使用价格为" + price + "黑色的" + brand + "手机打电话");
    }
    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "黑色的" + brand + "手机发送信息");
    }
}
