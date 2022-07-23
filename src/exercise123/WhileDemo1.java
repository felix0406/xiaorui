package exercise123;

public class WhileDemo1 {
    public static void main(String [] args){
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum += i;
            i++;
        }
        System.out.println("1到10的和为" + sum);
    }
}
