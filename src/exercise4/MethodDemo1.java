package exercise4;

public class MethodDemo1 {
    public static void main(String [] args){
        int max = getMax(10,50,30);
        System.out.println(max);
    }
    public static int getMax(int a,int b,int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }
}
