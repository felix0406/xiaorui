package exercise123;

public class ContinueDemo1 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 20; i++){
            if(i == 4 && i == 14){
                continue;
            }
            sum += i;
        }
        System.out.println("结果为" + sum);
    }
}
