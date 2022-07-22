package exercise4;
import java.util.Scanner;
public class Switch1 {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch(month){
            case 3 :
            case 4 :
            case 5 :
                System.out.println("spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("autumn");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("winter");
                break;
            default:
                System.out.println("error");
        }
    }

}
