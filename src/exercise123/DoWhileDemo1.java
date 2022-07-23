package exercise123;

public class DoWhileDemo1 {
    public static void main(String [] args){
        int i = 1;
        int sum = 0;
           do{
            sum += i;
            i ++;
        }while(i <= 9);{
            i++;
        }
        System.out.println("1 到 10的和为：" + sum);
    }
}