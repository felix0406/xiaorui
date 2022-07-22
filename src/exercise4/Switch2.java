package exercise4;
import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        doExercise();
    }
        public static void doExercise(){
            Boolean bool = true;
            while(bool){
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入星期数");
                String str = sc.nextLine();
                switch(str){
                    case"周一":
                        System.out.println("跑步");
                    bool = false;
                            break;
                    case "周二":
                        System.out.println("游泳");
                        bool = false;
                        break;
                    default :
                        System.out.println("错误");
                        break;

                }
            }
        }
    }


