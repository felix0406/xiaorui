package exercise4;

public class MethodDemo4 {
    public static void main(String[] args) {
        for(int i = 0; i < 20;i++){
            for(int j = 0; j < 33;j ++){
                int k = 100 - j - i;
                if(i * 5 + j * 3 + k / 3 == 100){
                    System.out.println("三种鸡数量分别为" + i + "," + j +"," + k);
                }
            }
        }
    }
}
