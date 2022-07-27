package org.example.day8.collection;
import com.sun.xml.internal.ws.api.model.CheckedException;
import java.util.Random;
public class ExceptionStudy {
    public static void main(String[] args)  {
        double a = 10.0;
        for (int i = 0;i<10;i++){
            try{
                a = 1/0;
            }catch (ArithmeticException e){
                System.out.println("error");
            }catch (Exception e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }finally {
                System.out.println("finally");
            }
        }
        if (a == 0){
            //throw new RuntimeException("error");
            throw new ArithmeticException("error");
        }
        System.out.println(a);
    }
}
