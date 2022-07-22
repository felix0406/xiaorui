package exercise4;
import java.util.Random;
public class ArrayDemo3 {
    public static void main(String[]args){
        int [] arr1 = new int [6];
        int sum = 0;
        Random random = new Random();
        for(int i = 0; i < 6; i++){
            arr1[i] = random.nextInt(100);
        }
        System.out.println("数组中元素分别为：");
        for(int j = 0; j < arr1.length; j++){
            System.out.println(arr1[j] + " ");
            sum += arr1[j];
        }
        System.out.println("");
        System.out.println("数组元素之和为" + sum);
    }
}
