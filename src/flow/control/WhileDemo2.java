package flow.control;
import java.util.Scanner;
public class WhileDemo2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入学生成绩");
            sc.nextInt();
        }
    }
}
