package flow.control;

public class BreakDemo1 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            if (i == 4){
                break;
            }
            sum += i;
        }
        System.out.println("1+2+3的结果是" + sum);
    }
}
