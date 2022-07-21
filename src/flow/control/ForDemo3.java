package flow.control;

public class ForDemo3 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 2 ; i <= 100 ; i +=2){
            sum += i;
        }
        System.out.println("1-100的偶数和是" + sum);
    }
}
