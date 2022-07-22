package exercise4;

public class ArrayDemo1 {
    public static void main(String [] args){
        int [] arr = new int [] {90,100,98,99,91};
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            max = arr [i] > max ? arr [i] : max;
        }
        System.out.println("最高成绩为" + max);
    }
}
