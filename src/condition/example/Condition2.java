package condition.example;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄");
        int age = sc.nextInt();
        if (age > 0 && age < 5) {
            System.out.println("您是婴幼儿");
        } else if (age >= 5 && age < 10) {
            System.out.println("您是儿童");
        } else if (age >= 10 && age < 18) {
            System.out.println("您是青少年");
        } else if (age >= 18 && age < 30) {
            System.out.println("您是青少年");
        } else if (age >= 30 && age < 40) {
            System.out.println("您是青壮年");
        } else if (age >= 40 && age < 50) {
            System.out.println("您是中年人");
        } else if (age >= 50 && age < 70) {
            System.out.println("您是中老年人");
        } else if (age >= 70 && age < 100) {
            System.out.println("您是老年人");
        } else if (age >= 100 && age < 140) {
            System.out.println("您是长寿老人");
        } else {
            System.out.println("您应该记错了");
        }
    }
}
