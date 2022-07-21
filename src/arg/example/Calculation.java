package arg.example;
import java.util.Scanner;
public class Calculation {
    public static void main(String[] args){
        double p = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆柱体的底面半径");
        double r = sc.nextDouble();
        System.out.println("请输入圆柱体的高");
        double h = sc.nextDouble();
        double s = p * r * r;
        System.out.println("圆柱体底面的面积为：" + s);
        double v = s * h;
        System.out.println("圆柱体的题记为" + v);
    }
}
