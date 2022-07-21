package condition.example;

public class Condition1 {
    public static void main(String [] args){
        double newPhone = 7988;
        double oldPhone = 1500;
        double result1 = newPhone - oldPhone;
        double result2 = newPhone * 0.8;
        if (result1 <= result2){
            System.out.println("不使用以旧换新更省钱，所需要花费" + result1 + "元");
        }else{
            System.out.println("使用以旧换新更省钱，所需要花费" + result2 + "元");
        }
    }
}
