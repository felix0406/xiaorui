package exercise4;

public class OverrideDemo1 {
    public static void main(String[] args) {
        compare((byte)1,(byte)1);
        compare((short)1,(short)1);
        compare(1,1);
        compare(1L,1L);
    }
    public static boolean compare(byte a , byte b){
        System.out.println("方法形参为byte");
        return a == b;
    }
    public static boolean compare(short a , short b){
        System.out.println("方法形参为 short");
        return a == b ;
    }
    public static boolean compare(int a , int b){
        System.out.println("方法形参为 int");
        return a == b ;
    }
    public static boolean compare(long a , long b){
        System.out.println("方法形参为 long");
        return a == b ;
    }
}
